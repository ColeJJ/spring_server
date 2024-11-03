package org.example.springserver.modules.account;


import org.springframework.data.repository.ListCrudRepository;

public interface AccountRepository extends ListCrudRepository<Account, Integer> {
}
