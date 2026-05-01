import javax.swing.*;
import java.util.InputMismatchException;

public class Captura {
   public static void Capturar(String[] nombres, float[] promedios, int[] status){
      
      boolean banderaCaptura = true;
      boolean esValido = false;
      boolean flag = true;
      int veces = 0;
      int contador = 3;
      
      while (banderaCaptura) {
         esValido = false;
         while (!esValido) {   
            try {
               veces = Integer.parseInt(JOptionPane.showInputDialog("\n¿Cuántos registros desea realizar? ")); 
               
               veces = veces + contador;
               esValido = true;
               
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Ingresa un numero entero válido.\n\n");
            }
         }   
         
         esValido = false; 
         
             while (!esValido) {   
                try { 
                for (int i = contador; i < veces; i++) { 
                     nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre de la posición " + i + ": ");
                     nombres[i] = nombres[i].toUpperCase().trim();
                     while (flag) {     
                        promedios[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el promedio de la posición " + i + "(incluye al menos una posición decimal ej. 9.0 o 7.5): "));
                        flag = false;
                        if (promedios[i] < 0.0 || promedios[i] > 10.0) {
                           JOptionPane.showMessageDialog(null, "Promedio inválido, solo entre 0.0 y 10.0\n\n");
                           flag = true;

                        }
                     }
                     flag= true;
                     while (flag) {   
                        status[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el status de la posición " + i + "(1 para activo, 0 para inactivo): "));
                        flag = false;
                        if (status[i] != 0 && status[i] != 1) {
                           JOptionPane.showMessageDialog(null, "Status inválido, solo 0 o 1.\n\n");
                           flag = true;
                        }
                     }
                     flag = true;
                     contador++;
                }
                  esValido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa un valor válido\n\n");
                }
             }
             
           String otroMas =  JOptionPane.showInputDialog("¿Te gustaría hacer más registros (Si / No?");
           
           otroMas = otroMas.toUpperCase().trim();
           
           if (otroMas.equals("NO")) {
            banderaCaptura = false;
           }  
         }
      }
   }
