package com.example.ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receiveDate;
    private double total;
    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "purchase")
    private Invoice invoice;
    public  Purchase(){

    }

    public Purchase(Integer id, String number, Date creationDate, Date receiveDate,
                    double total, User user, Invoice invoice) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receiveDate = receiveDate;
        this.total = total;
        this.user = user;
        this.invoice = invoice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser(){
        return user;
    }

    public void getUser(User user){
        this.user = user;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
