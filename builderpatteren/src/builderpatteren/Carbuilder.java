/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpatteren;

/**
 *
 * @author NooR
 */
public class Carbuilder {
    private int id ;
    private String brand;
    private String model;
    private String color;
    private int nbrodoors;
    private String Screentype;
    private int weight;
    private int height;
    
    
    public Carbuilder ID (int id){
        this.id = id;
        return this ;

    }
    
    public Carbuilder Brand (String brand){
        this.brand = brand;
        return this ;

    }
 
    public Carbuilder Model (String model){
        this.model = model;
        return this ;

    } 
      
    public Carbuilder Color (String color){
        this.color = color;
        return this ;

    }
      
    public Carbuilder Screentype (String Screentype){
        this.Screentype = Screentype;
        return this ;

    }
     
    public Carbuilder Weight (int weight){
        this.weight = weight;
        return this ;

    } 
     
    
    public Carbuilder Nbrodoors(int nbrodoors){
        this.nbrodoors = nbrodoors;
        return this ;

    } 
  
    
    public Carbuilder Height(int height){
        this.height = height;
        return this ;

    } 
    
    
 
         
    public Car build(){
         return new Car(id,brand,model,color,nbrodoors,Screentype,weight,height);
}
    
}
