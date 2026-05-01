import javax.swing.*;
import java.util.InputMismatchException;

public class Menu {
   public static void main (String a[]){
   
   //Declarando las variables
      int opcion = 0;
      boolean bandera = true;
      
      String[] nombres = new String[30];
      float[] promedios = new float[30];
      int[] status = new int[30];
      
   //Se alimentan los arreglos para poder mostrar datos desde el arranque del programa
      nombres[0] = "JESUS";
      nombres[1] = "FERNANDO";
      nombres[2] = "LUIS";
      
      promedios[0] = 9.5f;
      promedios[1] = 10.0f;
      promedios[2] = 9.0f;
      
      status[0] = 1;
      status[1] = 1;
      status[2] = 1;
      
      JOptionPane.showMessageDialog(null, "Bienvenido al programa de gestión de alumnos.\n\n");
      
      while (bandera) {
         try {
            if (opcion == 0){   
            
    //Se muestra el menú principal y se alimenta la variable 'opcion' con la que ejecutaremos el switch
               opcion = Integer.parseInt(JOptionPane.showInputDialog(
                  "    ***MENU***    " +
                  "\n1. Capturar\n" +
                  "2. Modificación\n" +
                  "3. Borrar\n" +
                  "4. Imprimir\n" +
                  "5. Finalizar el programa\n\nElige una de las opciones disponibles: "));
            } else {
    //Mensaje de error si ingresa una opcion fuera del rango 1 a 5
               opcion = Integer.parseInt(JOptionPane.showInputDialog("\nIntentalo de nuevo con una opción válida entre 1 y 5: "));   
            }
            switch (opcion) {
            
    //En cada 'case' se invoca el método correspondiente a ejecutar según la opción seleccionada por el usuario
               case 1 : Captura Uno = new Captura();
                        Uno.Capturar(nombres, promedios, status);
                        opcion = 0;
                        break;
               case 2 : Modificacion Dos = new Modificacion();
                        Dos.Modificar(nombres, promedios, status);
                        opcion = 0;
                        break; 
               case 3 : int opcionBorrado = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones:\n\n1.- Borrado físico.\n2. Borrado lógico\n3. Regresar."));
                        
     //Se agrega validación en el valor '3' para no invocar al método 'Borrado' si el usuario selecciona 'Regresar'
                        if (opcionBorrado != 3) {
                           Borrado Tres = new Borrado();
                           Tres.Borrar(nombres, promedios, status, opcionBorrado);
                        }
                        opcion = 0;
                        break;
               case 4 : int opcionImpresion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones:\n\n1.- Imprimir uno.\n2. Imprimir todos\n3. Regresar."));
                        
     //Se agrega validación en el valor '3' para no invocar al método 'Impresion' si el usuario selecciona 'Regresar'
                        if (opcionImpresion != 3) {
                           Impresion Cuatro = new Impresion();
                           Cuatro.Imprimir(nombres, promedios, status, opcionImpresion);
                        }
                        opcion = 0;
                        break;
               case 5 : JOptionPane.showMessageDialog(null, "Programa finalizado con éxito.\n¡Hasta pronto!");
                        bandera = false;
                        break; 
               default : JOptionPane.showMessageDialog(null, "Opción inválida");     
            }
         } 
    //Este error nos previene en caso que el usuario ingrese un caracter en vez de un int  
            catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Ingresa un numero entero válido.\n\n");
         }
      }
   }
}
