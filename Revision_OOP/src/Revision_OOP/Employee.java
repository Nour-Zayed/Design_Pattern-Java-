/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;


enum Gender {Male,Female};


public abstract class Employee {
    private String Name;
    private String Address;
    private int SSN;
    private Gender gen;
    
    
    public Employee(){
        
    }
    
     public Employee(String Name,String Address,int SSN,Gender gen  ){
         this.Name = Name;
         this.Address=Address;
         this.SSN=SSN;
         this.gen= gen;
        
    }
     
     public void setName(String Name){
         this.Name = Name;
     }
     
     public String getName(){
         return Name;
     }
     
     public void setAddress(String Address){
         this.Address = Address;
     }
     
     public String getAddress(){
         return Address;
     }
     
     public void setSSN(int SSN){
         this.SSN = SSN;
     }
     
     public int getSNN(){
         return SSN;
     }
     
     public void setGender(Gender gen){
         this.gen = gen;
     }
     
     public Gender getGender(){
         return gen;
     }
     
     
     public abstract double Earning ();

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", Address=" + Address + ", SSN=" + SSN + ", gen=" + gen + '}';
    }
     
     
}
