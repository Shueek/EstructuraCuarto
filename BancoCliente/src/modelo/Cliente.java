/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Shueek
 */
public class Cliente {
    private String Nombre;
    private int NumeroTikets;

    public Cliente(String Nombre, int NumeroTikets) {
        this.Nombre = Nombre;
        this.NumeroTikets = NumeroTikets;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroTikets() {
        return NumeroTikets;
    }

    public void setNumeroTikets(int NumeroTikets) {
        this.NumeroTikets = NumeroTikets;
    }
    
    
}
