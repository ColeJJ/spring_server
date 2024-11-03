package org.example.springserver.modules.customer;

import org.example.springserver.modules.account.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(final Account account) {
        this.account = account;
    }
}
