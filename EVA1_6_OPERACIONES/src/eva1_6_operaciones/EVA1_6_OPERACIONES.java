/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author Ana y Lau
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi, radio, area; //todas son doubles
        // ES LO MISMO QUE:
        //double pi;
        //double radio;
        //double area;
        //inicialización:
        pi = 3.1416;
        radio = 10;
        //OPERACIÓN:
        area = pi * radio * radio;
        //SALIDA DE DATOS:
        System.out.println("El área de un círculo de radio 10 es:");
        System.out.println(area);       
    }
    
}
