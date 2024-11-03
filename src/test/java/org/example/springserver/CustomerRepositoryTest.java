package org.example.springserver;

import org.example.springserver.modules.account.AccountRepository;
import org.example.springserver.modules.customer.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testFindById() {
        // todo: auskommentiert, weil die persistenz hier nicht wieder rollbacked wird -> recherchieren
        // final Customer customer = new Customer();
        // customer.setName("Torben");
        // customerRepository.save(customer);

        customerRepository.findById(1);
    }

    @Test
    public void testLoadingAllCustomers() {
        customerRepository.findAll();
    }
}