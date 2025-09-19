/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner captu = new Scanner(System.in);
     int calificación;
     System.out.println("Introduce tu calificación: ");
     calificación = captu.nextInt();
     if ((calificación <= 100) && (calificación >= 90 )){
       System.out.println ("Tu calificación es A"); 
       }else if ((calificación <= 89) && (calificación >= 80 )){
        System.out.println ("Tu calificación es B"); 
        }else if ((calificación <= 79) && (calificación >= 70 )){
        System.out.println ("Tu calificación es C");
        }else if ((calificación <= 69) && (calificación >= 60 )){
        System.out.println ("Tu calificación es D");
        }else if ((calificación <= 59) && (calificación >= 0 )){
        System.out.println ("Tu calificación es F");
        
        
       }
         
    
    }
}
    

