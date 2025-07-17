/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import javax.swing.JOptionPane;

/**
 *
 * @author milkyaakath
 */
public class Producto {
    private String codigoProducto;
    private String nombreProducto;
    private String tipo;
    private int cantidad;
    private double precioBaseProducto;
    private double precioBrutoProducto;
    private double ganancia;

    public Producto() {
    }

    public Producto(String codigoProducto, String nombreProducto, String tipo, int cantidad, double precioBaseProducto, double precioBrutoProducto, double ganancia) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precioBaseProducto = precioBaseProducto;
        this.precioBrutoProducto = precioBrutoProducto;
        this.ganancia = ganancia;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBaseProducto() {
        return precioBaseProducto;
    }

    public void setPrecioBaseProducto(double precioBaseProducto) {
        this.precioBaseProducto = precioBaseProducto;
    }

    public double getPrecioBrutoProducto() {
        return precioBrutoProducto;
    }

    public void setPrecioBrutoProducto(double precioBrutoProducto) {
        this.precioBrutoProducto = precioBrutoProducto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", tipo=" + tipo + ", cantidad=" + cantidad + ", precioBaseProducto=" + precioBaseProducto + ", precioBrutoProducto=" + precioBrutoProducto + ", ganancia=" + ganancia + '}';
    }
    
    private void calcaularPrecioBruto(){
        switch(tipo){
            case "alimentos":
                precioBrutoProducto = precioBaseProducto *1.20;
                break;
            case "bebidas":
                precioBrutoProducto = precioBaseProducto *1.30;
                break;
            case "higiene":
                precioBrutoProducto = precioBaseProducto *1.25+500;
                break;
            case "limpieza":
                precioBrutoProducto = precioBaseProducto *1.23+1000;
                break;
            default:
                precioBrutoProducto = precioBaseProducto;
        }
    }
    
    private void calcularGnancia(){
        ganancia = (precioBrutoProducto - precioBaseProducto) * cantidad;
    }
    
    public void mostrarInfo(){
        String mensaje = "Código: " + codigoProducto + "\n";
        mensaje += "Nombre del producto: " + nombreProducto + "\n";
        mensaje += "Tipo de producto: " + tipo + "\n";
        mensaje += "Cantidad de productos: " + cantidad + "\n";
        mensaje += "Precio base: ¢" + precioBaseProducto + "\n";
        mensaje += "Precio brutp: ¢" + precioBrutoProducto + "\n";
        mensaje += "Ganancia esperada: " + ganancia + "\n";
        mensaje += "---------------------";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public double getganancia(){
       return ganancia;
    }
    
}
