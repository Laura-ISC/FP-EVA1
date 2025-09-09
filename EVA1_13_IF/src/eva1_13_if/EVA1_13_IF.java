/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        int dia;
        int mes;
        int año;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce el dia de nacimiento: ");
    dia = captu.nextInt();
    System.out.println("Introduce el mes de nacimiento: ");
    mes = captu.nextInt();
    System.out.println("Introduce el año de nacimiento: ");
    año = captu.nextInt();
    System.out.println("Introduce tu edad: "); 
    edad = captu.nextInt();
    
    //ESTRUCTURA DE CONTROL IF
    if (edad >= 18){//bloque verdero
        System.out.println("Puedes comprar bebidas alcoholicas");
        }else{//bloque falso --> opcional SI-NO
        System.out.println("No puedes comprar bebidas alcoholicas");
     }   
    } 
    
}
