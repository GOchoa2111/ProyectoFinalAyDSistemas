/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Controlador;

import gochoapc.frontventafinal.Modelo.Usuario;
import gochoapc.frontventafinal.Servicio.UsuarioServicio;

import java.util.List;

public class UsuarioControlador {
    private final UsuarioServicio servicio = new UsuarioServicio();

    public List<Usuario> listarUsuarios() throws Exception {
        return servicio.obtenerUsuarios();
    }

    public void crearUsuario(Usuario usuario) throws Exception {
        servicio.crearUsuario(usuario);
    }

    public void actualizarUsuario(Usuario usuario) throws Exception {
        servicio.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(int id) throws Exception {
        servicio.eliminarUsuario(id);
    }
    
    public boolean validarLogin(String correo, String clave) throws Exception {
    Usuario usuario = servicio.buscarPorCorreo(correo);
    return usuario != null && usuario.getClave().equals(clave);
}
}

