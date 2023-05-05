/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Bebida {
    private String Nombre;
private Double Precio;
private Double Tamaño_Ml;

    public Bebida(String Nombre, Double Precio, Double Tamaño_Ml) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Tamaño_Ml = Tamaño_Ml;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public Double getTamaño_Ml() {
        return Tamaño_Ml;
    }

    public void setTamaño_Ml(Double Tamaño_Ml) {
        this.Tamaño_Ml = Tamaño_Ml;
    }

    @Override
    public String toString() {
        return "Bebida{" + "Nombre=" + Nombre + ", Precio=" + Precio + ", Tama\u00f1o_Ml=" + Tamaño_Ml + '}';
    }
    

}
