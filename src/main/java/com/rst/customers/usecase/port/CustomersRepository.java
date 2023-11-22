package com.rst.customers.usecase.port;

import com.rst.customers.core.model.Customers;

import java.util.Optional;

public interface CustomersRepository {

    Optional <Customers> getCustomer(Long customerId);

    boolean updateCustomer(Customers customer);

    Long createCustomer(String email);
}
