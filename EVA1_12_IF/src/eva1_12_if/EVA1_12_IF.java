/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce la calificaión: ");
    califa = captu.nextInt();
    //ESTRUCTURA DE CONTROL IF
    if (califa >= 70){//bloque verdero
        System.out.println("ACERTADO!!");
        }else{//bloque falso --> opcional SI-NO
        System.out.println("NO ACREDITADO!!");
    }
    }
    
}
