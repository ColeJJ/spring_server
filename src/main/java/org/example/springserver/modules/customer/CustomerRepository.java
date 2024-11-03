package org.example.springserver.modules.customer;

import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository<Customer, Integer> {
    Customer findByFirstName(String firstName);

    Customer findByLastName(String lastName);
}
