/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisiesto;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_22_BISIESTO {

    public static void main(String[] args) {
     Scanner captu = new Scanner(System.in);
     int year, resi4, resi100, resi400;
     System.out.print("Año a verificar: ");
     year = captu.nextInt();
     resi4 = year % 4;
     resi100 = year % 100;
     resi400 = year % 400;
     if (resi4 == 0){//DIVISION EXACTA ENTRE 4
         if (resi100 == 0){ 
             if (resi400 == 0){ 
             System.out.print("El año " + year + " es año bisiesto");    
             }else{  
             System.out.print("El año " + year + " no es año bisiesto");   
             }
         }else{ 
         System.out.print("El año " + year + " es año bisiesto");
         }
             
      }else{  
         System.out.print("El año " + year + " no es año bisiesto");
     }
    }
}
