package org.example.springserver.modules.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  final CustomerRepository customerRepository;

  public CustomerController(final CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping("/customers")
  public List<Customer> getCustomers() {
    return customerRepository.findAll();
  }
}
