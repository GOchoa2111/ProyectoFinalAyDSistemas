/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Servicio;
import gochoapc.frontventafinal.Modelo.Cliente;
import gochoapc.frontventafinal.Modelo.Producto;
import gochoapc.frontventafinal.Modelo.Usuario;
import gochoapc.frontventafinal.Modelo.Venta;
import gochoapc.frontventafinal.Modelo.DetalleVenta;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author GOchoa
 */
public class TicketServicio {

    public void generarTicket(Venta venta, DetalleVenta detalle, Cliente cliente, Usuario usuario, Producto producto) throws Exception {
        String fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String nombreArchivo = "TicketVenta_" + venta.getId() + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("========================================");
            writer.println("             TICKET DE VENTA");
            writer.println("========================================");
            writer.println("Fecha: " + fecha);
            writer.println();
            writer.println("Cliente: " + cliente.getNombre());
            writer.println("Vendedor: " + usuario.getNombre());
            writer.println();
            writer.println("Producto: " + producto.getNombre());
            writer.println("Cantidad: " + detalle.getCantidad());
            writer.println("Precio Unitario: $" + detalle.getPrecioUnitario());
            writer.println("Subtotal: $" + detalle.getSubtotal());
            writer.println("----------------------------------------");
            writer.println("TOTAL A PAGAR: $" + venta.getTotal());
            writer.println("========================================");
            writer.println("     ¡Gracias por su compra!");
            writer.println("========================================");
        }
    }
}
