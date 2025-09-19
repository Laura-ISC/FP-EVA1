/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_19_ANTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner captu = new Scanner(System.in);
        int edad;
        boolean credencial;
        
        System.out.println ("¿Qué edad tienes? ");
        edad = captu.nextInt();
        
        System.out.println ("¿Tienes credencial para votar? ");
        credencial = captu.nextBoolean();
         //USAMOS  AND &&
         // mayor de edad y tener credencial
         // (edad >= 18) && (credencial == true)
         if ((edad >= 18) && (credencial == true)){
          System.out.println ("Puedes pasar");
           }else{
          System.out.println ("No puedes pasar");
          
         }
            
    }
    
}
