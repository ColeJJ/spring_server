package org.example.springserver.modules.account;

import org.example.springserver.modules.customer.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private int id;
    private String iban;
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public void setId(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(final String iban) {
        this.iban = iban;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }
}
