/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
        int numeroUno, numeroDos;
    System.out.println("Introduce el numero uno: ");
     numeroUno= captu.nextInt();
     System.out.println("Introduce el numero dos: ");
     numeroDos= captu.nextInt();
     
     if(numeroUno > numeroDos){
      System.out.println("El numero mayor es: ");
      System.out.println(numeroUno);
      }else{
         if(numeroDos >numeroUno){
      System.out.println("El numero mayor es: ");
      System.out.println(numeroDos);
      }else{
             System.out.println("Los valores son iguales");
         }
      
     }
        
    }
    
}
