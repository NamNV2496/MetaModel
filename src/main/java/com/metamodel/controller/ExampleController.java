package com.metamodel.controller;

import com.metamodel.domain.Role_;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/role")
    public String getRole() {
        return Role_.NAME + Role_.APPROVE_DATE + Role_.TERMINATE_DATE;
    }
}
