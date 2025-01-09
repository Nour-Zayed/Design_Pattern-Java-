/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypepattern;

/**
 *
 * @author NooR
 */
public class Bus extends Vehicle {

    private int doors;
    public Bus() {}
    
    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.getDoors();
    }
    @Override
    public Bus clone() {
        return new Bus(this);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
