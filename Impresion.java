import javax.swing.*;
import java.util.InputMismatchException;

public class Impresion {
   public static void Imprimir(String[] nombres, float[] promedios, int[] status, int opcionImpresion){
       
     boolean bandera = true;
     
       while (bandera) {         
         try {  
                                    
                  if (opcionImpresion == 1) {
                     String nombreEstudiante = JOptionPane.showInputDialog("Ingresa el nombre del alumno que desea mostrar:");
                     nombreEstudiante= nombreEstudiante.toUpperCase().trim();

                     for (int i=0; i < nombres.length; i++){
                        if(nombres[i] == nombreEstudiante){
                           JOptionPane.showMessageDialog(null, 
                              "Nombre: " + nombres[i] + "," +
                              "\nPromedio: " + promedios[i] + "," +
                              "\nStatus: " + status[i] + ".");
                        }
                     }
                  } else if (opcionImpresion == 2){
                        for (int i=0; i < nombres.length; i++){
                           if (nombres[i] != null) {
                              JOptionPane.showMessageDialog(null, 
                                 "Nombre: " + nombres[i] + "," +
                                 "\nPromedio: " + promedios[i] + "," +
                                 "\nStatus: " + status[i] + ".");
                           }
                        }
                  } else if (opcionImpresion == 3){
                        bandera = false;
                        break;
                  }
                  
                  bandera = false;
          } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
          }
          
          String otroMas = JOptionPane.showInputDialog("¿Deseas imprimir otro registro? (Si/No)");
          otroMas= otroMas.toUpperCase().trim();
          bandera = (otroMas.equals("SI"))?true:false;
       }
     
     } 
}
