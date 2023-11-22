package com.rst.customers.adapter.web.controller;

import com.rst.customers.adapter.web.controller.response.CustomerResponse;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TableCustomerController {

        public Mono<CustomerResponse> getCustomerByTableId(Long tableId) {
         //TODO: implement
            return Mono.empty();
        }

        public void reserveTable(Long tableId, Long customerId) {
        //TODO: implement
        }
}
