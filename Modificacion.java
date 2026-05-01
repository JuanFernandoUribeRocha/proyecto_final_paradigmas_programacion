import javax.swing.*;

public class Modificacion {
   public static void Modificar(String[] nombres, float[] promedios, int[] status) {
      
      boolean banderaModificacion = true;
      boolean esValido = false;
      int veces = 0;
      String nombreIngresado = "";
      int opcion = 0;

      while (banderaModificacion) {
         
         while (!esValido) {   
            try {
               veces = Integer.parseInt(JOptionPane.showInputDialog("\n¿Cuántos registros desea modificar? ")); 
               esValido = true;
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Ingresa un número entero válido.\n\n");
            } catch (NullPointerException e) {
               banderaModificacion = false;
               break;
            }
         }  
         
         esValido = false;

         for (int i = 0; i < veces; i++) {
            
            int posicion = -1;

            while (posicion == -1) {
               try {
                  nombreIngresado = JOptionPane.showInputDialog("Ingresa el nombre del alumno que quieres modificar: ");
                  nombreIngresado = nombreIngresado.toUpperCase().trim();

                  for (int j = 0; j < nombres.length; j++) {
                     if (nombres[j] != null && nombres[j].equals(nombreIngresado)) {
                        posicion = j;
                        break;
                     }
                  }

                  if (posicion == -1) {
                     JOptionPane.showMessageDialog(null, "Nombre no encontrado. Inténtalo de nuevo.\n\n");
                  }

               } catch (NullPointerException e) {
                  banderaModificacion = false;
                  break;
               }
            }

            if (!banderaModificacion) {
               break;
            }

            if (status[posicion] == 1) {
               
               esValido = false;

               while (!esValido) {
                  try { 
                     opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "    ***MENU***    \n¿Qué dato quieres modificar?\n\n1. Nombre\n2. Promedio\n3. Regresar\n\nElige una de las opciones disponibles: "
                     ));
                     esValido = true;
                  } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(null, "Ingresa un número entero válido.\n\n");
                  } catch (NullPointerException e) {
                     banderaModificacion = false;
                     break;
                  }
               }

               if (!banderaModificacion) {
                  break;
               }

               switch (opcion) {
                  
                  case 1:
                     esValido = false;

                     while (!esValido) { 
                        try {
                           nombres[posicion] = JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
                           nombres[posicion] = nombres[posicion].toUpperCase().trim();
                           esValido = true;
                        } catch (NullPointerException e) {
                           JOptionPane.showMessageDialog(null, "Operación cancelada.\n\n");
                           esValido = true;
                        }
                     }

                     esValido = false;
                     break; 

                  case 2:
                     esValido = false;

                     while (!esValido) {
                        try {
                           promedios[posicion] = Float.parseFloat(JOptionPane.showInputDialog(
                              "Ingresa el nuevo promedio (ej. 9.0 o 7.5): "
                           ));
                           
                           if (promedios[posicion] < 0.0 || promedios[posicion] > 10.0) {
                              JOptionPane.showMessageDialog(null, "Promedio inválido, solo entre 0.0 y 10.0\n\n");
                           } else {
                              esValido = true;
                           }

                        } catch (NumberFormatException e) {
                           JOptionPane.showMessageDialog(null, "Ingresa un número decimal válido.\n\n");
                        } catch (NullPointerException e) {
                           JOptionPane.showMessageDialog(null, "Operación cancelada.\n\n");
                           esValido = true;
                        }
                     }

                     esValido = false;
                     break;

                  case 3:
                     banderaModificacion = false;
                     break;

                  default:
                     JOptionPane.showMessageDialog(null, "Opción inválida");
                     break;
               }

            } else {
               JOptionPane.showMessageDialog(null, "Este usuario se encuentra inactivo.\n\n");
            }
         }

         if (banderaModificacion) {
            String otroMas = JOptionPane.showInputDialog("¿Te gustaría modificar más registros? (Si / No)");

            if (otroMas == null) {
               banderaModificacion = false;
            } else {
               otroMas = otroMas.toUpperCase().trim();

               if (otroMas.equals("NO")) {
                  banderaModificacion = false;
               }
            }
         }
      }
   }
}