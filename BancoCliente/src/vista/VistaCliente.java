/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Shueek
 */
public class VistaCliente {
    private Scanner scanner = new Scanner(System.in);


    public int mostrarMenu() {
        System.out.println("BIENVENIDO A NUESTRO BANCOLOPEZ PORFACOR  SIGA ");
        System.out.println("1. Agregar nuevo cliente ");
        System.out.println("2. Atender al siguiente cliente ");
        System.out.println("3. Salir del programa");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }


    public String obtenerNombreCliente() {
        System.out.print("Ingrese su nombre : ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }


    public void mostrarClienteAtendido(String nombreCliente, int numeroTicket) {
        System.out.println("Atendiendo al cliente: " + nombreCliente + ", con número de ticket: " + numeroTicket);
    }


    public void mostrarNoClientesEnEspera() {
        System.out.println("No hay clientes en espera.");
    }

   
    public void mostrarDespedida() {
        System.out.println("Gracias por utilizar nuestro sistema. ¡Hasta luego!");
    }
}

