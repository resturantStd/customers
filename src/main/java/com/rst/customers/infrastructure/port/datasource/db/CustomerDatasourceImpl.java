package com.rst.customers.infrastructure.port.datasource.db;

import com.rst.customers.core.model.Customers;
import com.rst.customers.usecase.port.CustomersDatasource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Qualifier("jdbc")
@Primary
public class CustomerDatasourceImpl implements CustomersDatasource {

    private final JdbcCustomerRepository jdbcCustomerRepository;

    public CustomerDatasourceImpl(JdbcCustomerRepository jdbcCustomerRepository) {
        this.jdbcCustomerRepository = jdbcCustomerRepository;
    }


    @Override
    public Optional<Customers> getCustomer(Long customerId) {
        return jdbcCustomerRepository.findById(customerId);
    }

    @Override
    public boolean updateCustomer(Customers customer) {
        jdbcCustomerRepository.save(customer);
        return true;
    }

    @Override
    public Long createCustomer(String email) {
        return jdbcCustomerRepository
                .save(new Customers(null, email))
                .getId();
    }
}
