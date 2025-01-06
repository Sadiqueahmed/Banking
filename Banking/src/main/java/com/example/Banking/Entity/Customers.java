package com.example.Banking.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

public class Accounts {

}

public class Transactions {

}
