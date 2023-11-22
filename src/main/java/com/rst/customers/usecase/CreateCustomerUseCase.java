package com.rst.customers.usecase;

import com.rst.customers.adapter.web.controller.request.CustomerCreateRequest;
import com.rst.customers.usecase.port.CustomersRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Slf4j
public class CreateCustomerUseCase {

    private final CustomersRepository customersRepository;
    public CreateCustomerUseCase(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Long createCustomer(CustomerCreateRequest request) {
        log.info("Creating customer");
       val id = customersRepository.createCustomer(request.getEmail());
         log.info("Created customer with id {}", id);
       return id;
    }
}
