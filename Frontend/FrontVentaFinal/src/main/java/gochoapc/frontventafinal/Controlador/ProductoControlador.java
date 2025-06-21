/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Controlador;
import gochoapc.frontventafinal.Modelo.Producto;
import gochoapc.frontventafinal.Servicio.ProductoServicio;
import java.util.List;
/**
 *
 * @author GOchoa
 */
public class ProductoControlador {
    private final ProductoServicio servicio = new ProductoServicio();

    public List<Producto> listarProductos() throws Exception {
        return servicio.obtenerProductos();
    }
        
    public void crearProducto(Producto producto) throws Exception {
    servicio.crearProducto(producto);
}

    public void actualizarProducto(Producto producto) throws Exception {
    servicio.actualizarProducto(producto);
}

    public void eliminarProducto(int id) throws Exception {
    servicio.eliminarProducto(id);
}

}
