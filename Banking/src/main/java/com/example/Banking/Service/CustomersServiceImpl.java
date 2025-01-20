package com.example.Banking.Service;

import com.example.Banking.DTO.CustomersRequestDTO;
import com.example.Banking.DTO.CustomersResponseDTO;
import com.example.Banking.Entity.Customers;
import com.example.Banking.Repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    CustomersRepository customersRepository;

    @Override
    public CustomersResponseDTO createCustomer(CustomersRequestDTO request){
        CustomersResponseDTO response = new CustomersResponseDTO();

        response.setCustomerName(request.getCustomerName());
        response.setCustomerAddress(request.getCustomerAddress());
        response.setPhoneNumber(request.getPhoneNumber());
        response.setCustomerEmail(request.getCustomerEmail());
        response.setPassword(request.getPassword());

        Customers entity = new Customers();
        entity.setCustomerName(request.getCustomerName());
        entity.setCustomerAddress(request.getCustomerAddress());
        entity.setPhoneNumber(request.getPhoneNumber());
        entity.setCustomerEmail(request.getCustomerEmail());
        entity.setPassword(request.getPassword());

        customersRepository.save(entity);

        return response;
    }

    @Override
    public CustomersResponseDTO getCustomer(Long id){
        CustomersResponseDTO response = new CustomersResponseDTO();

        Customers entity =customersRepository.getById(id);
        response.setCustomerName(entity.getCustomerName());
        response.setCustomerAddress(entity.getCustomerAddress());
        response.setPhoneNumber(entity.getPhoneNumber());
        response.setCustomerEmail(entity.getCustomerEmail());
        response.setPassword(entity.getPassword());

        return response;
    }
}
