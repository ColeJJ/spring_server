package org.example.springserver.modules.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private double iban;

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getIban() {
        return iban;
    }

    public void setIban(final double iban) {
        this.iban = iban;
    }
}
