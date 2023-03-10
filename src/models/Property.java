
/*
* File: Property.java
* Author: Balogh Csenge
* Copyright: 2023, Balogh Csenge
* Group: Szoft_II_N
* Date: 2023-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/


package models;

public class Property {
    public Property(String city, String address, double price, double size) {
        this.city = city;
        this.address = address;
        this.price = price;
        this.size = size;
    }
    String city;
    String address;
    double price;
    double size;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
}
