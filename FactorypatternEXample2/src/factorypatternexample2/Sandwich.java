/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypatternexample2;

/**
 *
 * @author NooR
 */
public class Sandwich {
    
    private String name ;
    private int calories ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    

    @Override
    public String toString() {
        return "Sandwich{" + "name=" + name + ", calories=" + calories + '}';
    }
}
