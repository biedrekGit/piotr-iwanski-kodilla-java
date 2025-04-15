package com.kodilla.hibernate.invoice;

import java.util.List;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String numer) {
        this.number = number;
    }
}
