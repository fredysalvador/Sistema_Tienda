/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.p2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Comida {    
private String Nombre;
private Double Precio;
private boolean Estado_Vencm;

    public Comida(String Nombre, Double Precio, boolean Estado_Vencm) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Estado_Vencm = Estado_Vencm;
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

    public boolean isEstado_Vencm() {
        return Estado_Vencm;
    }

    public void setEstado_Vencm(boolean Estado_Vencm) {
        this.Estado_Vencm = Estado_Vencm;
    }

    
    

}
