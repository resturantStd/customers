package com.rst.customers.adapter.web.controller;

import com.rst.customers.adapter.web.controller.request.CustomerCreateRequest;
import com.rst.customers.adapter.web.controller.response.CustomerResponse;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {


    public Mono<CustomerResponse> createCustomer(CustomerCreateRequest request) {
        //TODO: implement
        return Mono.empty();
    }

    public Mono<CustomerResponse> getCustomer() {
        //TODO: implement
        return Mono.empty();
    }

    public void updateCustomer() {
        //TODO: implement
    }

    public void deleteCustomer() {
        //TODO: implement
    }

    public void getCustomerTable() {
        //TODO: implement
    }

}
