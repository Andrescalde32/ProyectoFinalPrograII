/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prograiifinal;

/**
 *
 * @author diego
 */
import java.util.ArrayList;

public class addMaterial {
    
    ArrayList<String> registroMat=new ArrayList();
    
    public void addMat(String titulo, String autor, int fecha){
        System.out.println("Agregando un Libro");
        this.registroMat.add("{"+titulo+", "+autor+", "+fecha+"}");
    }
    public void addMat(String titulo, int fecha, int paginas){
        System.out.println("Agregando una Revista");
        this.registroMat.add("{"+titulo+", "+fecha+", "+paginas+"}");
    }
    public void addMat(String titulo, String autor, String pais){
        System.out.println("Agregando una Tesis");
        this.registroMat.add("{"+titulo+", "+autor+", "+pais+"}");
    }
    
    public void confirmacionMat(){
        System.out.println("Material Agregado correctamente!");
    }
    
    public class Libro extends addMaterial{
        @Override
        public void confirmacionMat(){
            addLibro setMsg=new addLibro();          
            System.out.println("Libro agregado con exito!");
        }
    }
    
    public class Revista extends addMaterial{
        @Override
        public void confirmacionMat(){
            System.out.println("Revista agregada con exito!");
        }
    }
    
    public class Tesis extends addMaterial{
        @Override
        public void confirmacionMat(){
            System.out.println("Tesis agregada con exito!");
        }
    }
}

    
