package com.rst.customers.adapter.web.controller.request;


import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Validated
public class CustomerCreateRequest {
    @Email
    String email;
}
