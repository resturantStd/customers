package com.rst.customers.usecase;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersDatasource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetCustomerUseCase {

    private final CustomersDatasource customersDatasource;

    public GetCustomerUseCase(CustomersDatasource customersDatasource) {
        this.customersDatasource = customersDatasource;
    }

    public Customers getById(Long id) {
        log.info("Getting customer with id {}", id);
        return customersDatasource
                .getCustomer(id)
                .orElseThrow();
    }
}
