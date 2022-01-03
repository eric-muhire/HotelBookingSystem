package com.hotelBookingSystem.group.models;

import java.time.DateTimeException;

public class Booking {

    private Long id;
    private String hotelName;
    private String customerName;
    private String checkIN;
    private String checkOUT;
    private String price;
    private String city;
    private String zipCode;
    private String Country;

    public Booking() {
    }

    public Booking(
            Long id,
            String hotelName,
            String customerName,
            String checkIN,
            String checkOUT,
            String price,
            String city,
            String zipCode,
            String country) {
        this.id = id;
        this.hotelName = hotelName;
        this.customerName = customerName;
        this.checkIN = checkIN;
        this.checkOUT = checkOUT;
        this.price = price;
        this.city = city;
        this.zipCode = zipCode;
        Country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCheckIN() {
        return checkIN;
    }

    public void setCheckIN(String checkIN) {
        this.checkIN = checkIN;
    }

    public String getCheckOUT() {
        return checkOUT;
    }

    public void setCheckOUT(String checkOUT) {
        this.checkOUT = checkOUT;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", hotelname='" + hotelName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", checkIN='" + checkIN + '\'' +
                ", checkOUT='" + checkOUT + '\'' +
                ", price='" + price + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
