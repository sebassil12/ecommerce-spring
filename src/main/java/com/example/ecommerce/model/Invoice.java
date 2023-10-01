package com.example.ecommerce.model;

public class Invoice {
    private Integer id;
    private String name;
    private double quantity;
    private double price;
    private double total;

    public Invoice(){

    }

    public Invoice(Integer id, String name, double quantity, double price,
                   double total){
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;

    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getQuantity(){
        return quantity;
    }
     public void setQuantity(double quantity){
        this.quantity = quantity;
     }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
