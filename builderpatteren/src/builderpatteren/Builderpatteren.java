/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderpatteren;

/**
 *
 * @author NooR
 */
public class Builderpatteren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//create first object
/*
       Carbuilder builder = new Carbuilder(); 
       builder.ID(200).Brand("Verna").Weight(2000);
       Car C = builder.build();
       System.out.println(C.getId());
       System.out.println(C.getWeight());
       System.out.println(C.getBrand());
       System.out.println(C.getColor());
       C.setId(300);
       System.out.println(C.getId());

        
        
       Carbuilder builder2 = new Carbuilder(); 
       builder2.ID(10).Nbrodoors(4).Height(16);
       Car C1 = builder2.build();
       
       System.out.println(C1.getId());
       System.out.println(C1.getHeight());
       System.out.println(C1.getNbrodoors());

*/

        Director D  = new Director();
        Carbuilder  CB  = new  Carbuilder();
        
        D.buildchevolet(CB);
        CB.ID(200);
        Car C = CB.build();
        System.out.println(C.getId());
        System.out.println(C.getBrand());
        System.out.println(C.getScreentype());
        System.out.println(C.getWeight());
        System.out.println(C.getHeight());
        
    }
    
  
    
    
}
