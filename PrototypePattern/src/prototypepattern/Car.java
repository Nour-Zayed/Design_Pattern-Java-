/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author NooR
 */
public class Car extends Vehicle {

    private int topspeed;
    
    public Car () {}
    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }
    public Car(Car car) {
        super(car);
        this.topspeed = car.getTopspeed();
    }
    @Override
    public Car clone() {
        return new Car(this);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

