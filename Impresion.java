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
                     boolean esEncontrado = false;

                     for (int i=0; i < nombres.length; i++){
                        if(nombres[i] != null && nombreEstudiante.equals(nombres[i])){
                           JOptionPane.showMessageDialog(null, 
                              "Nombre: " + nombres[i] + "," +
                              "\nPromedio: " + promedios[i] + "," +
                              "\nStatus: " + status[i] + ".");
                              esEncontrado = true;        
                        }                      
                     }
                     if (!esEncontrado){
                        JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
                     }
                     
                  } else if (opcionImpresion == 2){
                        for (int i=0; i < nombres.length; i++){
                           if (nombres[i] != null && !nombres[i].equals("")) {
                              JOptionPane.showMessageDialog(null, 
                                 "Nombre: " + nombres[i] + "," +
                                 "\nPromedio: " + promedios[i] + "," +
                                 "\nStatus: " + status[i] + ".");
                           }
                        }
                  } 
                  
                  bandera = false;
          } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
          }
          
          String otroMas = JOptionPane.showInputDialog("¿Deseas imprimir otro registro? (Si/No)");
          otroMas = otroMas.toUpperCase().trim();
          bandera = (otroMas.equals("SI"))?true:false;
       }
     
     } 
}
