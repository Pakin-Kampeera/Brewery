package guru.spring.brewery.services;

import guru.spring.brewery.models.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDTO);

    void updateCustomer(UUID customerId, CustomerDto customerDTO);

    void deleteCustomer(UUID customerId);
}
