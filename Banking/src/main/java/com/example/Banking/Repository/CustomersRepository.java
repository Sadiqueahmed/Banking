package com.example.Banking.Repository;

import com.example.Banking.Entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;


public interface CustomersRepository extends JpaRepository<Customers, Long> {
     //Optional<Customers> findById(Long id);

}
