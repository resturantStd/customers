package com.rst.customers.core.config;

import com.rst.customers.usecase.CreateCustomerUseCase;
import com.rst.customers.usecase.GetCustomerUseCase;
import com.rst.customers.usecase.port.CustomersDatasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateCustomerUseCase createCustomerUseCase(CustomersDatasource customersDatasource) {
        return new CreateCustomerUseCase(customersDatasource);
    }

    @Bean
    public GetCustomerUseCase getCustomerUseCase(CustomersDatasource customersDatasource) {
        return new GetCustomerUseCase(customersDatasource);
    }
}
