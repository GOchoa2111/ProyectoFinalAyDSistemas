/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gochoapc.frontventafinal.Vista;

import gochoapc.frontventafinal.Controlador.ClienteControlador;
import gochoapc.frontventafinal.Controlador.ProductoControlador;
import gochoapc.frontventafinal.Controlador.UsuarioControlador;
import gochoapc.frontventafinal.Modelo.Cliente;
import gochoapc.frontventafinal.Modelo.DetalleVenta;
import gochoapc.frontventafinal.Modelo.Producto;
import gochoapc.frontventafinal.Modelo.Usuario;
import gochoapc.frontventafinal.Modelo.Venta;
import gochoapc.frontventafinal.Servicio.TicketServicio;
import gochoapc.frontventafinal.Servicio.VentaServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author GOchoa
 */
public class MuestraProducto extends javax.swing.JFrame {

    /**
     * Creates new form MuestraProducto
     */
    public MuestraProducto() {
        initComponents();
        aplicarEstiloModerno();
        cargarCombos();
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int fila = tablaProductos.getSelectedRow();
        if (fila >= 0) {
            txtId.setText(tablaProductos.getValueAt(fila, 0).toString());
            txtNombre.setText(tablaProductos.getValueAt(fila, 1).toString());
            txtCategoria.setText(tablaProductos.getValueAt(fila, 2).toString());
            txtPrecio.setText(tablaProductos.getValueAt(fila, 3).toString());
            txtStock.setText(tablaProductos.getValueAt(fila, 4).toString());
        }
    }
});
    }
    private void cargarCombos() {
    try {
        ClienteControlador clienteControlador = new ClienteControlador();
        List<Cliente> clientes = clienteControlador.listarClientes();
        combocliente.removeAllItems();
        for (Cliente c : clientes) {
            combocliente.addItem(c);
        }

        UsuarioControlador usuarioControlador = new UsuarioControlador();
        List<Usuario> usuarios = usuarioControlador.listarUsuarios();
        combousuario.removeAllItems();
        for (Usuario u : usuarios) {
            combousuario.addItem(u);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar combos: " + e.getMessage());
    }
}
private void aplicarEstiloModerno() {
    Font fuente = new Font("Segoe UI", Font.PLAIN, 14);
    Font fuenteTitulo = new Font("Segoe UI", Font.BOLD, 24);
    Color colorPrimario = new Color(33, 150, 243);
    Color colorExito = new Color(76, 175, 80);
    Color colorPeligro = new Color(244, 67, 54);
    Color fondoCampo = new Color(30, 30, 30);
    Color textoClaro = Color.WHITE;

    getContentPane().setBackground(Color.BLACK);

    // Etiqueta principal
    laberl.setFont(fuenteTitulo);
    laberl.setForeground(textoClaro);

    // Etiquetas de campos
    JLabel[] etiquetas = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8};
    for (JLabel etiqueta : etiquetas) {
        etiqueta.setFont(fuente);
        etiqueta.setForeground(textoClaro);
    }

    // Campos de texto
    JTextField[] campos = {txtId, txtNombre, txtCategoria, txtPrecio, txtStock, txtcantidad};
    for (JTextField campo : campos) {
        campo.setFont(fuente);
        campo.setForeground(textoClaro);
        campo.setBackground(fondoCampo);
        campo.setCaretColor(textoClaro);
        campo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    // Botones
    JButton[] botones = {btncrear, btnactualizar, btneliminar, btnbuscar, btnregresar, btnvender};
    for (JButton boton : botones) {
        boton.setFont(fuente);
        boton.setForeground(Color.WHITE);
        boton.setFocusPainted(false);
    }

    btncrear.setBackground(colorPrimario);
    btnactualizar.setBackground(colorExito);
    btneliminar.setBackground(colorPeligro);
    btnbuscar.setBackground(colorPrimario);
    btnregresar.setBackground(new Color(120, 144, 156));
    btnvender.setBackground(new Color(0, 188, 212)); // cian

    // Combos
    combocliente.setFont(fuente);
    combousuario.setFont(fuente);

    // Tabla
    tablaProductos.setFont(fuente);
    tablaProductos.setForeground(textoClaro);
    tablaProductos.setBackground(fondoCampo);
    tablaProductos.setGridColor(Color.GRAY);
    tablaProductos.setSelectionBackground(colorPrimario);
    tablaProductos.setSelectionForeground(Color.WHITE);
    tablaProductos.setRowHeight(24);
    tablaProductos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
    tablaProductos.getTableHeader().setBackground(new Color(224, 224, 224));
    tablaProductos.getTableHeader().setForeground(Color.BLACK);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laberl = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnactualizar = new javax.swing.JButton();
        btncrear = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnvender = new javax.swing.JButton();
        combocliente = new javax.swing.JComboBox<>();
        combousuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        laberl.setText("Muestra Producto");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Categoria", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Precio");

        jLabel3.setText("Nombre");

        jLabel4.setText("Stock");

        jLabel5.setText("Categoria");

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad");

        btnvender.setText("Vender");
        btnvender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvenderActionPerformed(evt);
            }
        });

        jLabel7.setText("Selecciona vendedor");

        jLabel8.setText("Selecciona cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laberl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnvender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                        .addComponent(txtPrecio)
                                        .addComponent(txtNombre)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(laberl))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncrear)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregresar)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvender))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        try {
            ProductoControlador controlador = new ProductoControlador();
            List<Producto> productos = controlador.listarProductos();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Categoría");
            model.addColumn("Precio");
            model.addColumn("Stock");

            for (Producto p : productos) {
                model.addRow(new Object[]{
                   p.getId(), p.getNombre(), p.getCategoria(), p.getPrecio(), p.getStock()
                });
            }

            tablaProductos.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener productos: " + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
    try {
        Producto producto = new Producto();
        producto.setId(Integer.parseInt(txtId.getText()));
        producto.setNombre(txtNombre.getText());
        producto.setCategoria(txtCategoria.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));

        ProductoControlador controlador = new ProductoControlador();
        controlador.actualizarProducto(producto);
        btnbuscarActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al actualizar producto: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
    try {
        Producto producto = new Producto();
        producto.setNombre(txtNombre.getText());
        producto.setCategoria(txtCategoria.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));

        ProductoControlador controlador = new ProductoControlador();
        controlador.crearProducto(producto);
        btnbuscarActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "Producto creado correctamente.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al crear producto: " + e.getMessage());
}
    }//GEN-LAST:event_btncrearActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    try {
        int id = Integer.parseInt(txtId.getText());

        ProductoControlador controlador = new ProductoControlador();
        controlador.eliminarProducto(id);
        btnbuscarActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al eliminar producto: " + ex.getMessage());
    }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        PrincipalForm form = new PrincipalForm();
     form.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnvenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvenderActionPerformed
        // TODO add your handling code here:
    try {
        // Obtener producto seleccionado
        Producto producto = new Producto();
        producto.setId(Integer.parseInt(txtId.getText()));
        producto.setNombre(txtNombre.getText());
        producto.setCategoria(txtCategoria.getText());
        producto.setPrecio(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtStock.getText()));

        // Obtener cantidad a vender
        int cantidad = Integer.parseInt(txtcantidad.getText());
        if (cantidad <= 0 || cantidad > producto.getStock()) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida o mayor al stock disponible.");
            return;
        }

        // Obtener cliente y usuario seleccionados
        Cliente cliente = (Cliente) combocliente.getSelectedItem();
        Usuario usuario = (Usuario) combousuario.getSelectedItem();

        // Crear venta
        Venta venta = new Venta();
        venta.setClienteId(cliente.getId());
        venta.setUsuarioId(usuario.getId());
        venta.setTotal(producto.getPrecio() * cantidad);

        VentaServicio ventaServicio = new VentaServicio();
        Venta ventaCreada = ventaServicio.crearVenta(venta);

        // Crear detalle de venta
        DetalleVenta detalle = new DetalleVenta();
        detalle.setVentaId(ventaCreada.getId());
        detalle.setProductoId(producto.getId());
        detalle.setCantidad(cantidad);
        detalle.setPrecioUnitario(producto.getPrecio());
        detalle.setSubtotal(producto.getPrecio() * cantidad);
        ventaServicio.crearDetalleVenta(detalle);

        // Actualizar stock del producto
        producto.setStock(producto.getStock() - cantidad);
        ventaServicio.actualizarProducto(producto);

        // Refrescar tabla
        btnbuscarActionPerformed(evt);
        JOptionPane.showMessageDialog(this, "Venta realizada con éxito.");
        
        //Genera Ticket
        TicketServicio ticketServicio = new TicketServicio();
        ticketServicio.generarTicket(ventaCreada, detalle, cliente, usuario, producto);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al realizar la venta: " + e.getMessage());
    }
    }//GEN-LAST:event_btnvenderActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcantidadActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuestraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuestraProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnvender;
    private javax.swing.JComboBox<Cliente> combocliente;
    private javax.swing.JComboBox<Usuario> combousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laberl;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
