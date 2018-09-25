/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA1_6_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INTRODUCE TU NOMBRE");
        String sNombre; //DECLARACION
        Scanner sInput= new Scanner (System.in) ; 
        
        sNombre = sInput.nextLine();
        System.out.println("TU NOMBRE ES "  +    sNombre);
    }
    
}
