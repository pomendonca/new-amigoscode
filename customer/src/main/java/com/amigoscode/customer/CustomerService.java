package com.amigoscode.customer;

public record CustomerService() {

    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();
    }

    //todo: check if email valid
    //todo: check if email not taken
    //todo: store customer in db

}
