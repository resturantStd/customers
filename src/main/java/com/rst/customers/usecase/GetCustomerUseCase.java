package com.rst.customers.usecase;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersRepository;

public class GetCustomerUseCase {

    private final CustomersRepository customersRepository;

    public GetCustomerUseCase(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Customers getById(Long id) {
        return customersRepository.getCustomer(id).orElseThrow();
    }
}
