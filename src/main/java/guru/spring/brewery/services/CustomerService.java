package guru.spring.brewery.services;

import guru.spring.brewery.models.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
