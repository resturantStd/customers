package com.rst.customers.infrastructure.port.db.memory;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryCustomerRepository implements CustomersRepository {

    Map<Long, Customers> customers = new ConcurrentHashMap<>();

    @Override
    public Optional<Customers> getCustomer(Long customerId) {
        return Optional.ofNullable(customers.get(customerId));
    }

    @Override
    public boolean updateCustomer(Customers customer) {
        if (customers.containsKey(customer.getId())) {
            customers.put(customer.getId(), customer);
            return true;
        }
        return false;
    }

    @Override
    public Long createCustomer(String email) {
        Customers customer = new Customers();
        customer.setEmail(email);
        customer.setId(customers.size() + 1L);
        customers.put(customer.getId(), customer);
        return customer.getId();
    }
}
