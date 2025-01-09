/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observepattern;

/**
 *
 * @author NooR
 */
public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }  
    @Override
    public void update(String message) {
        System.out.println(name + "has a new notification : " + message);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
