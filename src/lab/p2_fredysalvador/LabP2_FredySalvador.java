/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.p2_fredysalvador;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 *
 * @author Fredy Salvador
 */
public class LabP2_FredySalvador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList producto = new ArrayList();

        //Scanner leer = new Scanner(System.in);
        int contador = 0;
        while (contador != 8) {

            contador = Integer.parseInt(JOptionPane.showInputDialog("Tienda Fredy Salvador\n1-Agregar Comida\n2-Agregar Bebida\n3-Modificar Productos\n4-Eliminar Producto\n5-Mostrar Producto\n6-Generar Compra\n7-Registro Compras\n8-Salir"));
            //contador = leer.nextInt();

            // System.out.println("Tienda Fredy Salvador\n1-Agregar Comida\n2-Agregar Bebida\n3-Modificar Productos\n4-Eliminar Producto\n5-Mostrar Producto\n6-Generar Compra\n7-Registro Compras\n8-Salir");
            if (contador == 1) {

                Object[] opciones = {"Verdadero", "Falso"};

                // Muestra la caja de diálogo y obtiene el índice de la opción seleccionada
                int seleccion = JOptionPane.showOptionDialog(null, "¿La comida que Ingresara Esta Vencida?", "Seleccione una opción",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                // Asigna el valor booleano correspondiente según la opción seleccionada
                boolean valor = (seleccion == 0) ? true : false;

                Comida d = new Comida(JOptionPane.showInputDialog("Ingrese el nombre de la comida"),
                        Double.valueOf(JOptionPane.showInputDialog("Ingrese el precio de la comida")),
                        valor);

                producto.add(d);

            } else if (contador == 2) {

                Bebida c = new Bebida(JOptionPane.showInputDialog("Ingrese el nombre de la bebida"),
                        Double.valueOf(JOptionPane.showInputDialog("Ingrese el Precio de la bebida")),
                        Double.valueOf(JOptionPane.showInputDialog("Ingrese el Tamaño de la bebida")));

                producto.add(c);

            } else if (contador == 3) {

            } else if (contador == 4) {

                int index = Integer.parseInt(JOptionPane.showInputDialog("Escriba el Index del campo a Eliminar"));
                //System.out.println("Escriba el Index del campo a Eliminar");
                //      int index = leer.nextInt();

                // Productos productoEliminado = productos.get(index);
                producto.remove(index);
                JOptionPane.showInputDialog("Producto Eliminado Exitosamente");

                // System.out.println("Producto Eliminado Exitosamente");
            } else if (contador == 5) {

            } else if (contador == 6) {

            } else if (contador == 7) {

            } else if (contador == 8) {

            }

        }

    }

}
