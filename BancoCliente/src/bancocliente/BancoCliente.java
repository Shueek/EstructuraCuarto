/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancocliente;

import controlador.ControladorCliente;

import vista.VistaCliente;

/**
 *
 * @author Shueek
 */
public class BancoCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ControladorCliente controlador = new ControladorCliente();
        VistaCliente vista = new VistaCliente();
        
        controlador.manejarAcciones(vista);
    }
}
    
    

