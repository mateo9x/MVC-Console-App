package com.mateo9x;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Phone {

    //declatarion of variables
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }



    //getters & setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
