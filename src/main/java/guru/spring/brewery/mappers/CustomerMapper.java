package guru.spring.brewery.mappers;

import guru.spring.brewery.domains.Customer;
import guru.spring.brewery.models.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDTO);
}
