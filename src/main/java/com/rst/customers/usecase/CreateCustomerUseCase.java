package com.rst.customers.usecase;

import com.rst.customers.adapter.web.controller.request.CustomerCreateRequest;
import com.rst.customers.usecase.port.CustomersDatasource;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Slf4j
public class CreateCustomerUseCase {

    private final CustomersDatasource customersDatasource;

    public CreateCustomerUseCase(CustomersDatasource customersDatasource) {
        this.customersDatasource = customersDatasource;
    }

    public Long createCustomer(CustomerCreateRequest request) {
        log.info("Creating customer");
        val id = customersDatasource.createCustomer(request.getEmail());
        log.info("Created customer with id {}", id);
        return id;
    }
}
