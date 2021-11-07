package guru.spring.brewery.services;

import guru.spring.brewery.models.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(@RequestBody CustomerDto customerDTO) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDTO) {

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting a customer...");
    }
}
