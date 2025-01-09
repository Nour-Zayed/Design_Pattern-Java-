/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author NooR
 */
public abstract class Vehicle {

    private String brand;
    private String model;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle() {
    }

    public Vehicle(Vehicle car) {
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
    }
    @Override
    public abstract Vehicle clone();
}



