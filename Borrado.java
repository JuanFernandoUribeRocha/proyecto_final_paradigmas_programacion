import javax.swing.*;
import java.util.InputMismatchException;

public class Borrado {
   public static void Borrar (String[] nombres, float[] promedios, int[] status, int opcionBorrado){
     
     JOptionPane.showMessageDialog(null, "**ALERTA**\n¡Esta acción es irreversible!");
     String seBorrara = JOptionPane.showInputDialog("¿Deseas continuar? (Si/No):");
     seBorrara = seBorrara.toUpperCase().trim();
       
     boolean bandera = (seBorrara == "SI")?true:false;
     
       while (bandera) {         
         try {  
                  String nombreEstudiante = JOptionPane.showInputDialog("Ingresa el nombre del alumno que desea eliminar:");
                  nombreEstudiante= nombreEstudiante.toUpperCase().trim();
                  
                  if (opcionBorrado == 1) {
                     for (int i=0; i < nombres.length; i++){
                        if(nombres[i] == nombreEstudiante){
                           nombres[i] = "";
                           promedios[i] = 0;
                           break;
                        }
                     }
                  } else if (opcionBorrado == 2){
                        for (int i=0; i < nombres.length; i++){
                           if(nombres[i] == nombreEstudiante){
                              status[i] = 0;
                              break;
                           }
                        }
                  } else if (opcionBorrado == 3){
                        bandera = false;
                        break;
                  }
                  bandera = false;
          } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
          }
          
          String otroMas = JOptionPane.showInputDialog("¿Deseas eliminar algún otro registro? (Si/No)");
          otroMas= otroMas.toUpperCase().trim();
          bandera = (otroMas == "SI")?true:false;
       }
     
     } 
}

