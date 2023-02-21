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
}
