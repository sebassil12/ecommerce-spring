package com.example.ecommerce.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String direction;
    private String telephone;
    private String rol;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Product> products;
    @OneToMany(mappedBy = "user")
    private List<Purchase> purchases;
    public User(){

    }
    public User(Integer id, String name, String username, String email, String direction, String telephone, String rol,
                String password, List<Product> products, List<Purchase> purchases) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.direction = direction;
        this.telephone = telephone;
        this.rol = rol;
        this.password = password;
        this.products = products;
        this.purchases = purchases;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Purchase> getPurchases(){
        return purchases;
    }

    public void getPurchases(List<Purchase> purchases){
        this.purchases = purchases;
    }
}

