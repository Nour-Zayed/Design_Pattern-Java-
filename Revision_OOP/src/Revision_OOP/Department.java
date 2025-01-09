/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision_OOP;

import java.util.ArrayList;

/**
 *
 * @author NooR
 */
public class Department {
    private int idno;
    private String Name;
    private ArrayList <Employee> Emp;

  
    @Override
    public String toString() {
        return "Department{" + "idno=" + idno + ", Name=" + Name + ", Emp=" + Emp + '}';
    }

    public Department(int idno, String Name) {
        this.idno = idno;
        this.Name = Name;
        this.Emp = new ArrayList<Employee>();
    }
    
    public Department() {
  
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Employee> getEmp() {
        return Emp;
    }

    public void setEmp(ArrayList<Employee> Emp) {
        this.Emp = Emp;
    }
    
    public void addEmployee (Employee E){
        Emp.add (E);
    }
    public void removeEmployee (int index){
        Emp.remove(index);
        
        
    }
    
    
    
 
    public int  countemployee (){
        return Emp.size();
    }
    
    
    
    public void printEmpbasicdetails (){
        for(int i=0;i<Emp.size();i++){
            System.out.println(Emp.get(i).getName() + " " 
            + Emp.get(i).getSNN() + " " 
            + Emp.get(i).getAddress() + " " 
            + Emp.get(i).getGender());
        }
    }
    
    public void printallEmpdetails(){
        for (Employee E:Emp){
           
            if(E instanceof SalariedEmployee){
                ((SalariedEmployee) E).displayAlldetails();
            }

            if (E instanceof HourlyEmployee ){
                ((HourlyEmployee) E).displayAlldetails();
            }
            
            
            if (E instanceof CommissionEmployee ){
                ((CommissionEmployee) E).displayAlldetails();
            }
        }
    }

    }