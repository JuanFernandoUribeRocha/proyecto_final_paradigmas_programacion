import javax.swing.*;

public class Menu {
   public static void main (String a[]){
      int opcion = 0;
      boolean bandera = true;
      
      String[] nombres = new String[30];
      float[] promedios = new float[30];
      int[] status = new int[30];
      
      JOptionPane.showMessageDialog(null, "Bienvenido al programa de gestión de alumnos.\n\n");
      
      while (bandera) {
         if (opcion == 0){   
            opcion = Integer.parseInt(JOptionPane.showInputDialog("    ***MENU***    \n1. Capturar\n2. Modificación\n3. Borrar\n4. Imprimir\n5. Finalizar el programa\n\nElige una de las opciones disponibles: "));
         } else {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\nIntentalo de nuevo con una opción válida entre 1 y 5: "));   
         }
         switch (opcion) {
            case 1 : Captura Uno = new Captura();
                     Uno.Capturar(nombres, promedios, status);
                     bandera = false;
                     break;
            case 2 : Modificacion Dos = new Modificacion();
                     Dos.Modificar(nombres, promedios, status);
                     bandera = false;
                     break; 
            case 3 : Borrado Tres = new Borrado();
                     Tres.Borrar(nombres, promedios, status);
                     bandera = false;
                     break;
            case 4 : Impresion Cuatro = new Impresion();
                     Cuatro.Imprimir(nombres, promedios, status);
                     bandera = false;
                     break;
            case 5 : JOptionPane.showMessageDialog(null, "Programa finalizado con éxito.\n¡Hasta pronto!");
                     bandera = false;
                     break; 
            default : JOptionPane.showMessageDialog(null, "Opción inválida");     
         }
      }
   }
}