/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;
import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA1_18_ACCESO {
    //CONSTANTES: identificadores que no pueden
    // cambiar de vaalor. Es con la palabra final
    //static: es para que no puedan usar el main
   final static String USUARIO = "Laura";
   final static String PWD = "1234";        

    public static void main(String[] args) {
       String usuario, contraseña;
       Scanner captu = new Scanner(System.in);
       System.out.println("    BIENVENIDO   ");
       System.out.println("Sistema de venta de restaurante X");
       System.out.print("Usuario: ");
       usuario = captu.nextLine();
       System.out.print("Contraseña: ");
       contraseña = captu.nextLine();
       
       if(usuario.equals(USUARIO)){ //COMPARAR CADENAS
           if (contraseña.equals(PWD)){
            System.out.println("ACCESO CORRECTO");
           }else{ //contraseña incorrecta
               System.out.println("ACCESO DENEGADO");
           }
           
       }else{ //usuario incorrecto
          System.out.println("ACCESO DENEGADO");
          }
     
       
    }
    
}
