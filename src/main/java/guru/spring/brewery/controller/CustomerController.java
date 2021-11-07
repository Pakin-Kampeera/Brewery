package guru.spring.brewery.controller;

import guru.spring.brewery.models.CustomerDto;
import guru.spring.brewery.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlerPost(@Valid @RequestBody CustomerDto customerDTO) {
        CustomerDto savedDto = customerService.saveNewCustomer(customerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handlerUpdate(@PathVariable("customerId") UUID customerId, @Valid @RequestBody CustomerDto customerDTO) {
        customerService.updateCustomer(customerId, customerDTO);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handlerDelete(@PathVariable("customerId") UUID customerId) {
        customerService.deleteCustomer(customerId);
    }
}
