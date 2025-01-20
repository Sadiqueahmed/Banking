package com.example.Banking.Service;

import com.example.Banking.DTO.CustomersRequestDTO;
import com.example.Banking.DTO.CustomersResponseDTO;

public interface CustomersService {

    CustomersResponseDTO createCustomer(CustomersRequestDTO dto);

    CustomersResponseDTO getCustomer(Long id);


}
