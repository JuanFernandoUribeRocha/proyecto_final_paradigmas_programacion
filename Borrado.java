// BORRADO
// Nombres: Flores Hernandez Jesus Javier,Uribe Rocha Juan Fernando,Palacios Sanchez Luis Fernando.
// Fecha: 30/04/2026
// Grupo: 2-2 LI
// Descripción: Módulo para eliminar registros de alumnos.
//              Ofrece dos tipos de eliminación: física (borra datos) y lógica (cambia status a 0).
import javax.swing.*;
import java.util.InputMismatchException;

public class Borrado {
   public static void Borrar (String[] nombres, float[] promedios, int[] status, int opcionBorrado){
     // Advertencia de que la acción es irreversible
     JOptionPane.showMessageDialog(null, "**ALERTA**\n¡Esta acción es irreversible!");
     String seBorrara = JOptionPane.showInputDialog("¿Deseas continuar? (Si/No):");
     seBorrara = seBorrara.toUpperCase().trim();
     boolean bandera = (seBorrara != null && seBorrara.equals("SI"))?true:false;
     
     // Proceso de eliminación si el uruario confirmo
       while (bandera) {         
         try {  
                  // se ingresa el nombre del alumno a eliminar
                  String nombreEstudiante = JOptionPane.showInputDialog("Ingresa el nombre del alumno que desea eliminar:");
                  nombreEstudiante= nombreEstudiante.toUpperCase().trim();
                  // Borrado físico (se borran los datos del alumno)
                  if (opcionBorrado == 1) {
                     for (int i=0; i < nombres.length; i++){
                        if(nombres[i] != null && nombres[i].equals(nombreEstudiante)){
                           nombres[i] = "";
                           promedios[i] = 0;
                           JOptionPane.showMessageDialog(null, "Se ha borradó físicamente al alumno " + nombreEstudiante);
                           break;
                        }
                     }
                     // Borrado logico (status del alumno cambia a 0)
                  } else if (opcionBorrado == 2){
                        for (int i=0; i < nombres.length; i++){
                           if(nombres[i] != null && nombres[i].equals(nombreEstudiante)){
                              status[i] = 0;
                              JOptionPane.showMessageDialog(null, "Se ha borradó logicamente al alumno " + nombres[i]);
                              break;
                           }
                        }
                  } 
                  // Sale del bucle tras completa el borrado
                  bandera = false;
          } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Ingresa una cadena de texto\n\n");
          }
          // Se pregunta si desea eliminar otro registro
          String otroMas = JOptionPane.showInputDialog("¿Deseas eliminar algún otro registro? (Si/No)");
          otroMas= otroMas.toUpperCase().trim();
          bandera = (otroMas.equals("SI"))?true:false;
       }
     
     } 
}


