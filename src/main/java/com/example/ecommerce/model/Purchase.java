package com.example.ecommerce.model;

import java.util.Date;

public class Purchase {
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receiveDate;
    private double total;

    public  Purchase(){

    }

    public Purchase(Integer id, String number, Date creationDate, Date receiveDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receiveDate = receiveDate;
        this.total = total;
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
}
