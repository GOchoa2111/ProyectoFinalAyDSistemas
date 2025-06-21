/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Controlador;
import gochoapc.frontventafinal.Modelo.Cliente;
import gochoapc.frontventafinal.Servicio.ClienteServicio;

import java.util.List;
/**
 *
 * @author GOchoa
 */
public class ClienteControlador {
    private final ClienteServicio servicio = new ClienteServicio();

    public List<Cliente> listarClientes() throws Exception {
        return servicio.obtenerClientes();
    }

    public void crearCliente(Cliente cliente) throws Exception {
        servicio.crearCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) throws Exception {
        servicio.actualizarCliente(cliente);
    }

    public void eliminarCliente(int id) throws Exception {
        servicio.eliminarCliente(id);
    }
}


