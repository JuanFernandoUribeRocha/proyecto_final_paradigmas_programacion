import javax.swing.*;
import java.util.InputMismatchException;

public class Captura {
   public static void Capturar(String[] nombres, float[] promedios, int[] status){
      
      boolean banderaCaptura = true;
      boolean esValido = false;
      int veces = 0;
      
      while (banderaCaptura) {
         while (!esValido) {   
            try {
               veces = Integer.parseInt(JOptionPane.showInputDialog("\n¿Cuántos registros desea realizar? ")); 
               esValido = true;
            } catch (InputMismatchException e) {
               JOptionPane.showMessageDialog(null, "Ingresa un numero entero válido.\n\n");
            }
         }   
         
         esValido = false; 
         
         for (int i=0; i < veces; i++) {
         
             while (!esValido) {   
                try {  
                  nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre de la posición " + i + ": ");
                  nombres[i] = nombres[i].toUpperCase().trim();
                  esValido = true;
                } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
                }
             }
             
             esValido = false; 

             while (!esValido) {   
                try {  
                  promedios[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el promedio de la posición " + i + "(incluye al menos una posición decimal ej. 9.0 o 7.5): "));
                  esValido = true;
                } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa un número decimal válido.\n\n");
                }
             }
             
             esValido = false; 

             while (!esValido) {   
                try {  
                  status[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el status de la posición " + i + "(1 para activo, 0 para inactivo): "));
                  esValido = true;
                } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa un status válido.\n\n");
                }
             }
             
           String otroMas =  JOptionPane.showInputDialog("¿Te gustaría hacer más registros (Si / No?");
           
           otroMas = otroMas.toUpperCase().trim();
           
           if (otroMas == "NO") {
               banderaCaptura = false;
           }  
         }
      }
   }
}