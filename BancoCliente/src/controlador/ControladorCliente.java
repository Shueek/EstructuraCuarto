/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cliente;
import modelo.Cola;
import vista.VistaCliente;

/**
 *
 * @author Shueek
 */
public class ControladorCliente {

   private Cola colaClientes = new Cola();
    private int contadorTickets = 1;


    public void agregarCliente(String nombreCliente) {
        Cliente nuevoCliente = new Cliente(nombreCliente, contadorTickets++);
        colaClientes.agregarCliente(nuevoCliente);
    }


    public Cliente atenderCliente() {
        return colaClientes.atenderCliente();
    }


    public boolean hayClientesEnEspera() {
        return !colaClientes.estaVacia();
    }


    public void manejarAcciones(VistaCliente vista) {
        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String nombreCliente = vista.obtenerNombreCliente();
                    casoAgregarCliente(nombreCliente);
                    break;
                case 2:
                    casoAtenderCliente();
                    break;
                case 3:
                    casoVerificarClientesEnEspera();
                    break;
                case 4:
                    vista.mostrarDespedida();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }


    public void casoAgregarCliente(String nombreCliente) {
        agregarCliente(nombreCliente);
        System.out.println("Se ha agregado a " + nombreCliente + " a la fila.");
    }


    public void casoAtenderCliente() {
        if (hayClientesEnEspera()) {
            Cliente clienteAtendido = atenderCliente();
            System.out.println("Se ha atendido a " + clienteAtendido.getNombre() + ", con número de ticket: " + clienteAtendido.getNumeroTikets());
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }


    public void casoVerificarClientesEnEspera() {
        if (hayClientesEnEspera()) {
            System.out.println("tenemos  clientes en espera.");
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }
}

