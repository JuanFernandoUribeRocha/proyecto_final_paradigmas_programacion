// CAPTURA
// Nombres: Flores Hernandez Jesus Javier,Uribe Rocha Juan Fernando,Palacios Sanchez Luis Fernando.
// Fecha: 30/04/2026
// Grupo: 2-2 LI
// Descripción: Módulo para capturar nuevos registros de alumnos.
//              Permite ingresar nombre, promedio (0.0-10.0) y status (0=activo, 1=inactivo).
//              Valida entradas y permite realizar múltiples registros consecutivos.
import javax.swing.*;
import java.util.InputMismatchException;

public class Captura {
   public static void Capturar(String[] nombres, float[] promedios, int[] status){
      
      // Declarado de variables 
      boolean banderaCaptura = true;
      boolean esValido = false;
      boolean flag = true;
      int veces = 0;
      int contador = 3;
      
      // Se solicita cuántos registros desea hacer
      while (banderaCaptura) {
         esValido = false;
         while (!esValido) {   
            try {
               veces = Integer.parseInt(JOptionPane.showInputDialog("\n¿Cuántos registros desea realizar? ")); 
               veces = veces + contador;
               esValido = true;
               
               // Validacion tiene que ser un numero
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Ingresa un numero entero válido.\n\n");
            }
         }   
         
         esValido = false; 
         
         // Se piden los datos del alumno a capturar
             while (!esValido) {   
                try { 
                for (int i = contador; i < veces; i++) { 
                     nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre de la posición " + i + ": ");
                     nombres[i] = nombres[i].toUpperCase().trim();
                     while (flag) {     
                     // Se valida que el promedio sea entre 0.0 y 10.0
                        promedios[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el promedio de la posición " + i + "(incluye al menos una posición decimal ej. 9.0 o 7.5): "));
                        flag = false;
                        if (promedios[i] < 0.0 || promedios[i] > 10.0) {
                           JOptionPane.showMessageDialog(null, "Promedio inválido, solo entre 0.0 y 10.0\n\n");
                           flag = true;

                        }
                     }
                     // Se pide el estado del alumno
                     flag= true;
                     while (flag) {   
                        status[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el status de la posición " + i + "(1 para activo, 0 para inactivo): "));
                        flag = false;
                        // Se valida que el status sea 0 o 1
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
             
             // Pregunta si desea hacer más registros
           String otroMas =  JOptionPane.showInputDialog("¿Te gustaría hacer más registros (Si / No?");
           otroMas = otroMas.toUpperCase().trim();
           if (otroMas.equals("NO")) {
            banderaCaptura = false;
           }  
         }
      }
   }
