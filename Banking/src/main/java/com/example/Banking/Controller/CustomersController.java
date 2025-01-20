package com.example.Banking.Controller;

import com.example.Banking.DTO.CustomersRequestDTO;
import com.example.Banking.DTO.CustomersResponseDTO;
import com.example.Banking.Service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    CustomersService customersService;

    @PostMapping("create")
    public CustomersResponseDTO createCustomer(@RequestBody CustomersRequestDTO dto){
        return customersService.createCustomer(dto);
    }

    @GetMapping("retrieve/{id}")
    public CustomersResponseDTO getCustomer(@PathVariable Long id){
        return customersService.getCustomer(id);
    }

}
