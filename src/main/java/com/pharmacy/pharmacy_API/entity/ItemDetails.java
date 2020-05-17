/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pharmacy.pharmacy_API.entity;

import java.math.BigDecimal;

/**
 *
 * @author User
 */
public class ItemDetails {
    
    private int serial;
    private String name;
    private BigDecimal price;
    private double qty;

    public ItemDetails(){}
    public ItemDetails(int serial, String name, BigDecimal price, double qty) {
        this.serial = serial;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ItemDetails{" + "serial=" + serial + ", name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
    
    
    
}
