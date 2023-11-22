package com.rst.customers.adapter.web.controller;

import com.rst.customers.adapter.web.controller.request.CustomerCreateRequest;
import com.rst.customers.adapter.web.controller.response.CustomerResponse;
import com.rst.customers.usecase.CreateCustomerUseCase;
import com.rst.customers.usecase.GetCustomerUseCase;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CreateCustomerUseCase createCustomerUseCase;
    private final GetCustomerUseCase getCustomerUseCase;

    public CustomerController(CreateCustomerUseCase createCustomerUseCase, GetCustomerUseCase getCustomerUseCase) {
        this.createCustomerUseCase = createCustomerUseCase;
        this.getCustomerUseCase = getCustomerUseCase;
    }

    @PostMapping()
    public Mono<Long> createCustomer(CustomerCreateRequest request) {
        return Mono.just(createCustomerUseCase.createCustomer(request));
    }

    @GetMapping("/{id}")
    public Mono<CustomerResponse> getCustomer(@PathVariable Long id) {
        return Mono.just(getCustomerUseCase.getById(id))
                .map(customer -> new CustomerResponse(customer.getId(), customer.getEmail()));
    }

    @PatchMapping()
    public void updateCustomer(@RequestBody CustomerCreateRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
