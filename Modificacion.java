import javax.swing.*;

public class Modificacion {
   public static void Modificar(String[] nombres, float[] promedios, int[] status){
      
      boolean banderaModificacion = true;
      boolean esValido = false;
      int veces = 0;

      while (banderaModificacion) {
      
         while (!esValido) {   
               try {
                  veces = Integer.parseInt(JOptionPane.showInputDialog("\n¿Cuántos registros desea modificar? ")); 
                  esValido = true;
               } catch (InputMismatchException e) {
                  JOptionPane.showMessageDialog(null, "Ingresa un numero entero válido.\n\n");
               }
         }  
         
         esValido = false; 
         
         for (int i=0; i < veces; i++) {
                      
             while (!esValido) {   
                try {  
                  nombreIngresado = JOptionPane.showInputDialog("Ingresa el nombre del alumno que quieres modificar: ");
                  nombres[i] = nombres[i].toUpperCase().trim();
                  esValido = true;
                } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
                }
             }
             
             esValido = false;
             
             int posicion = -1;
             
             while (posicion == -1) {
                for (i=0; i < nombre.lenght ; i++){
                  if (nombreIngresado == nombres[i]){
                     posicion = i;
                     break;
                  }
                }
                
                if (posicion == -1) {
                  JOptionPane.showMessageDialog(null, "Nombre no encontrado. Repite el proceso.\n\n");
                  break;
                }
             }
             
             if (posicion == -1) {
                break;
             }   
            
            if (status[posicion] == 1){
               
              int opcion = Integer.parseInt(JOptionPane.showInputDialog("    ***MENU***    \n¿Qué dato quieres modificar?\n\n1. Nombre\n2. Promedio\n3. Regresar\n\nElige una de las opciones disponibles: "));
              
              switch (opcion) {
              case 1 : while (!esValido) { 
                        try {
                           nombres[posicion] = JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
                           nombres[posicion] = nombre[posicion].toUpperCase().trim();
                           esValido = true;
                          } catch (InputMismatchException e) {
                              JOptionPane.showMessageDialog(null, "Ingresa un una cadena de texto\n\n");
                          }
                        }
                       esValido = false;
                       break; 
              case 2 : while (!esValido) {
                          try {
                           promedios[posicion] = JOptionPane.showInputDialog("Ingresa el nuevo promedio: ");
                           esValido = true;
                          } catch (InputMismatchException e) {
                              JOptionPane.showMessageDialog(null, "Ingresa un numero décimal válido.\n\n");
                          }
                       }
                       esValido = false;
                       break;
              case 3 : Menu menu = new Menu();
                       menu.main();
                       banderaModificacion = false;
                       break;
              default : JOptionPane.showMessageDialog(null, "Opción inválida");    
              }
            } else {
               JOptionPane.showMessageDialog(null, "Este usuario se encuentra inactivo.\n\n");
            }
            
             String otroMas =  JOptionPane.showInputDialog("¿Te gustaría hacer más registros (Si / No?");
           
           otroMas = otroMas.toUpperCase().trim();
           
           if (otroMas == "NO") {
               banderaCaptura = false;

       } 

   }
}
}}