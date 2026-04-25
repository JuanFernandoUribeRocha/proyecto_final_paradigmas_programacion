import javax.swing.*;

public class Menu {
   public static void main (String a[]){
      int opcion = 0;
      boolean bandera = true;
      
      String[] nombres = new String[30];
      float[] promedios = new float[30];
      int[] status = new int[30];
      
      nombres[0] = "Jesus";
      nombres[1] = "Fernando";
      nombres[2] = "Luis";
      
      promedios[0] = 9.5f;
      promedios[1] = 10.0f;
      promedios[2] = 9.0f;
      
      status[0] = 1;
      status[1] = 1;
      status[2] = 1;
      
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
            case 3 : int opcionBorrado = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones:\n\n1.- Borrado físico.\n2. Borrado lógico\n3. Regresar."));
                     
                     Borrado Tres = new Borrado();
                     Tres.Borrar(nombres, promedios, status, opcionBorrado);
                     bandera = false;
                     break;
            case 4 : int opcionImpresion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones:\n\n1.- Imprimir uno.\n2. Imprimir todos\n3. Regresar."));
            
                     Impresion Cuatro = new Impresion();
                     Cuatro.Imprimir(nombres, promedios, status, opcionImpresion);
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
