/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego_aguila_sol;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class EVA1_24_JUEGO_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int usuario;
        double eleccion;
        //System.out.println("Aguila o sello? (1/0): ");
        
        System.out.println("Aguila o sello? (1/0): ");
        usuario = captu.nextInt();
        //System.out.println(Math.random());
        eleccion = Math.random();
        // 
        //eleccion = (int)(Math.random() * 2);
        
        if (eleccion <= 0.5) {
            System.out.println("Salió sello");
        } else {
            System.out.println("Salió águila");
        }
        
        //
        if (usuario  >= eleccion) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste...");
        
        }
        
    }
    
}
