package com.example.Banking.Entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name="customers")
@Getter
@Setter
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

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCustomerName(String customerName){
    this.customerName = customerName;}
}



