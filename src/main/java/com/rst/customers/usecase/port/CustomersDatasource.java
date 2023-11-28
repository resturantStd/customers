package com.rst.customers.usecase.port;

import com.rst.customers.core.model.Customers;

import java.util.Optional;

public interface CustomersDatasource {

    Optional <Customers> getCustomer(Long customerId);

    boolean updateCustomer(Customers customer);

    Long createCustomer(String email);
}
