/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

import javax.swing.JOptionPane;

/**
 *
 * @author milkyaakath
 */
public class SuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Super miSuper = new Super("Super Chino Katalina", "SH-023");
        Empleado empleado = new Empleado ("Katalina Zúñiga", "604990901");
        
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("A01", "Pan Cuadrado", "alimentos", 10, 900, 1000, 100);
        productos [1] = new Producto("B02", "Gaseosa", "bebidas", 6, 1200, 1500, 300);
        productos [2] = new Producto("H03", "Shampoo", "higiene", 5, 2500, 3000, 500);
        productos [3] = new Producto("L04", "Desinfectante", "limpieza", 8, 1800, 2000, 200);
        productos [4] = new Producto("A05", "Frijoles", "alimentos", 15, 700, 1000, 300);
        
        double totalGanancia=0;
        for (Producto producto : productos) {
            totalGanancia += producto.getGanancia();
        }
        
        
        String mensaje2 = "Inventario del super " + miSuper.getNombre() + "\n\n";
        mensaje2 += "Código " + miSuper.getCodigo() + "\n";
        mensaje2 += "Empleado responsable: " + empleado.getNombreEmpleado() + "\n";
        mensaje2 += "Cédula de empleado: " + empleado.getCedulaEmpleado() + "\n\n";
        mensaje2 += "Productos agregados:\n";
        for (int i = 0; i < productos.length; i++) {
            mensaje2 += productos[i].toString()+"\n";       
        }
        mensaje2 += "Ganancia total esperada: ¢" + totalGanancia;
        
                
        JOptionPane.showMessageDialog(null, mensaje2);

        
    }
    
}
