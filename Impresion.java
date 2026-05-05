// IMPRESION
// Nombres: Flores Hernandez Jesus Javier,Uribe Rocha Juan Fernando,Palacios Sanchez Luis Fernando.
// Fecha: 30/04/2026
// Grupo: 2-2 LI
// Descripción: Módulo para mostrar registros de alumnos.
//              Permite imprimir un alumno específico por nombre o todos los registros existentes.
import javax.swing.*;
import java.util.InputMismatchException;

public class Impresion {
   public static void Imprimir(String[] nombres, float[] promedios, int[] status, int opcionImpresion){
       
       // Controla si se repite la impresión
     boolean bandera = true;
     
       while (bandera) {         
         try {  
                    // Imprime el alumno mediante el nombre escrito                
                  if (opcionImpresion == 1) {
                     String nombreEstudiante = JOptionPane.showInputDialog("Ingresa el nombre del alumno que desea mostrar:");
                     nombreEstudiante= nombreEstudiante.toUpperCase().trim();
                     boolean esEncontrado = false;
                     // Si se encuntra el alumno muestra sus datos
                     for (int i=0; i < nombres.length; i++){
                        if(nombres[i] != null && nombreEstudiante.equals(nombres[i])){
                           JOptionPane.showMessageDialog(null, 
                              "Nombre: " + nombres[i] + "," +
                              "\nPromedio: " + promedios[i] + "," +
                              "\nStatus: " + status[i] + ".");
                              esEncontrado = true;        
                        }                      
                     }
                     // Validacion cuando no se encontro el alumno
                     if (!esEncontrado){
                        JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
                     }
                     // Imprime todos los alumnos registrados
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
                  // Sale del bucle cuando se completa la impresión
                  bandera = false;
          } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
          }
          // Pregunta si desea imprimir otro registro
          String otroMas = JOptionPane.showInputDialog("¿Deseas imprimir otro registro? (Si/No)");
          otroMas = otroMas.toUpperCase().trim();
          bandera = (otroMas.equals("SI"))?true:false;
       }
     
     } 
}
