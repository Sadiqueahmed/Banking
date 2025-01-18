package com.example.Banking.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
public class CustomersResponseDTO {

    @JsonProperty("name")
    private String customerName;

    @JsonProperty("address")
    private String customerAddress;

    @JsonProperty("number")
    private String phoneNumber;

    @JsonProperty("email")
    private String customerEmail;

    @JsonProperty("password")
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

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

}
