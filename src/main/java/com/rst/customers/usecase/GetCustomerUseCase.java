package com.rst.customers.usecase;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetCustomerUseCase {

    private final CustomersRepository customersRepository;

    public GetCustomerUseCase(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Customers getById(Long id) {
        log.info("Getting customer with id {}", id);
        return customersRepository
                .getCustomer(id)
                .orElseThrow();
    }
}
