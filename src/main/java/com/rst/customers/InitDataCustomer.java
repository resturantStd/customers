package com.rst.customers;

import com.rst.customers.usecase.port.CustomersDatasource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class InitDataCustomer implements CommandLineRunner {
    private final CustomersDatasource customersDatasource;

    public InitDataCustomer(CustomersDatasource customersDatasource) {
        this.customersDatasource = customersDatasource;
    }

    @Override
    public void run(String... args) throws Exception {
/*
        customersRepository.deleteAll();
        customersRepository.saveAll(
                CustomersData.getCustomers()
        ).subscribe();
*/
    }
}
