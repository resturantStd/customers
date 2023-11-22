package com.rst.customers.core.config;

import com.rst.customers.usecase.CreateCustomerUseCase;
import com.rst.customers.usecase.GetCustomerUseCase;
import com.rst.customers.usecase.port.CustomersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateCustomerUseCase createCustomerUseCase(CustomersRepository customersRepository) {
        return new CreateCustomerUseCase(customersRepository);
    }

    @Bean
    public GetCustomerUseCase getCustomerUseCase(CustomersRepository customersRepository) {
        return new GetCustomerUseCase(customersRepository);
    }
}
