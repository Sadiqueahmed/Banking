package com.example.Banking.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalTime;

@Table(name="customers")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String customerAddress;

    private String phoneNumber;

    private String customerEmail;

    private String password;


}

@Table (name="accounts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long accountId;

    private String status;

    private String type;

    private Long balance;



}

@Table (name="transactions")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long accountId;


    private Long transactionId;

    private String type;

    private Long amount;

    private LocalTime createdAt;


}
