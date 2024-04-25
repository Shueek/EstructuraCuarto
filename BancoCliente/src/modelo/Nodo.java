/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Shueek
 */
public class Nodo {
    Cliente cliente;
    Nodo Siguiente;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.Siguiente = null;
    }
    
}
