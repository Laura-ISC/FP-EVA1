/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VELOCIDAD = DISTANCIA / TIEMPO
        //m / s
        Scanner captu = new Scanner (System.in);
        double velocidad, distancia, tiempo;
        
        System.out.println("Introduce la distancia: ");
        distancia = captu.nextDouble();
        System.out.println("Introduce el tiempo: ");
        tiempo = captu.nextDouble();
        //CÁLCULO:
        velocidad = distancia / tiempo;
        System.out.print("La velocidad es: ");
        System.out.print(velocidad);
        System.out.print("m/s");
    }
    
}
