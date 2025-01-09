/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Revision_OOP;

/**
 *
 * @author NooR
 */
public class Revision_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department D1 = new Department(1,"Information System");
        SalariedEmployee se = new SalariedEmployee(3000,500,50,"Ahmed",1200,"Alex",443, Gender.Male);
        D1.addEmployee(se);
        
        
        HourlyEmployee He = new  HourlyEmployee("Nour","Menf",512,Gender.Female,200,6);
        D1.addEmployee(He);
        
        
        CommissionEmployee Ce = new CommissionEmployee("Mohemmed","Sadat",123,Gender.Male,.25,500);
        D1.addEmployee(Ce);

        
        System.out.println(D1.countemployee());
        D1.printEmpbasicdetails();
        D1.printallEmpdetails();

    }
    
}
