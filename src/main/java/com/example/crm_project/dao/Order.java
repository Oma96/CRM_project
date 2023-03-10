package com.example.crm_project.dao;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;

    @Column(name="type_presta")
    private String typePresta;
    private String designation;
    @Column(name="nb_days")
    private Integer nbDays;
    @Column(name="unitprice")
    private Integer unitPrice;
    private Integer state;

    @ManyToOne
    private Client client;

    public Order() {
    }
    public Order(String typePresta, String designation, Integer nbDays,
                 Integer unitPrice, Integer state, Client client) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
        this.state = state;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getNbDays() {
        return nbDays;
    }

    public void setNbDays(Integer nbDays) {
        this.nbDays = nbDays;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", typePresta=" + typePresta + ", designation=" + designation + ", nbDays=" + nbDays + ", unitPrice=" + unitPrice + ", state=" + state + '}';
    }
}