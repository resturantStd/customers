package com.rst.customers.infrastructure.port.datasource.db;

import com.rst.customers.core.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JdbcCustomerRepository extends CrudRepository<Customers, Long> {


}
