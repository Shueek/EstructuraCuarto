/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Shueek
 */
public class Cola {
    private Nodo frente;
    private Nodo fin;


    public Cola() {
        this.frente = null;
        this.fin = null;
    }

  
    public boolean estaVacia() {
        return frente == null;
    }


    public void agregarCliente(Cliente cliente) {
        Nodo nuevoNodo = new Nodo(cliente);
        if (estaVacia()) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.Siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }


    public Cliente atenderCliente() {
        if (estaVacia()) {
            return null;
        }
        Cliente clienteAtendido = frente.cliente;
        frente = frente.Siguiente;
        if (frente == null) {
            fin = null;
        }
        return clienteAtendido;
    }
}

