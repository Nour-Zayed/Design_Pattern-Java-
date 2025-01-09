/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpatteren;

/**
 *
 * @author NooR
 */
public class Car {
    
    private int id ;
    private String brand;
    private String model;
    private String color;
    private int nbrodoors;
    private String Screentype;
    private int weight;
    private int height;


    public Car(int id, String brand, String model, String color, int nbrodoors, String Screentype, int weight, int height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrodoors = nbrodoors;
        this.Screentype = Screentype;
        this.weight = weight;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getNbrodoors() {
        return nbrodoors;
    }

    public void setNbrodoors(int nbrodoors) {
        this.nbrodoors = nbrodoors;
    }

    public String getScreentype() {
        return Screentype;
    }

    public void setScreentype(String Screentype) {
        this.Screentype = Screentype;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
}
