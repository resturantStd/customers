package com.rst.customers.infrastructure.port.datasource.memory;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersDatasource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
@Qualifier("inMemory")
public class InMemoryCustomerRepository  implements CustomersDatasource {

    Map<Long, Customers> customers = new ConcurrentHashMap<>();

    public Optional<Customers> getCustomer(Long customerId) {
        return Optional.ofNullable(customers.get(customerId));
    }

    public boolean updateCustomer(Customers customer) {
        if (customers.containsKey(customer.getId())) {
            customers.put(customer.getId(), customer);
            return true;
        }
        return false;
    }

    public Long createCustomer(String email) {
        Customers customer = new Customers();
        customer.setEmail(email);
        customer.setId(customers.size() + 1L);
        customers.put(customer.getId(), customer);
        return customer.getId();
    }
}
