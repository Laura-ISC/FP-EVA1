/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_anidado;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_16_ANIDADO {

   
    public static void main(String[] args) {
        int dia; 
    Scanner captu = new Scanner(System.in);
    System.out.println("Capturar número de día (1 a 7)");
    dia = captu.nextInt();
    
    if (dia == 1){
       System.out.println("Domingo");
    }else if(dia ==2 ) {
        System.out.println("Lunes");
     }else if(dia ==3 ) {
        System.out.println("Martes");
     }else if(dia ==4 ) {
        System.out.println("Miercoles"); 
      }else if(dia ==5 ) {
        System.out.println("Juves");
       }else if(dia ==6 ) {
        System.out.println("Viernes");
       }else if(dia ==7 ) {
        System.out.println("Sábado"); 
       }else{ //opcional
         System.out.println("Número no válido");
    }
    }
    
}
