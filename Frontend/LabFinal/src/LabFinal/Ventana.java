
package LabFinal;

public class Ventana extends javax.swing.JFrame {

   Clientes cliente = new Clientes();
   Productos producto = new Productos();
   Ventas venta = new Ventas();
    public Ventana() {
        initComponents();
        cliente.CabeceraClientes(jTableClientes);
        producto.CebeceraProductos(jTableProducto);
        venta.CebecerasubTotalVenta(jTableSubtotal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombreCli = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonAddCliente = new javax.swing.JButton();
        jLabelProducto = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCantidadComprar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSubtotal = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonElimiCliente = new javax.swing.JButton();
        jButtonEliminarproducto = new javax.swing.JButton();
        jButtonEliminarSubtotal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAddProducto = new javax.swing.JButton();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldNombreProduc = new javax.swing.JTextField();
        jLabelNombreProd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelBajo = new javax.swing.JLabel();
        jLabelAlto = new javax.swing.JLabel();
        jTextFieldDescuento = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldTotalconDesc = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldBajo = new javax.swing.JTextField();
        jTextFieldAlto = new javax.swing.JTextField();
        jLabelDescuento = new javax.swing.JLabel();
        jLabelTipoDescuento = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombreCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreCliKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, -1));

        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, -1));

        jTextFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, -1));
        jPanel1.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, -1));

        jTextFieldCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCelularKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, -1));

        jButtonAddCliente.setText("AGREGAR");
        jButtonAddCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddClienteMouseClicked(evt);
            }
        });
        jButtonAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabelProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelProducto.setText("PRODUCTO");
        jPanel1.add(jLabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 60, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("SUBTOTAL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableClientes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 94));

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableProducto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 359, 98));

        jLabel1.setText("CANTIDAD A COMPRAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 124, 140, 20));

        jTextFieldCantidadComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadComprarActionPerformed(evt);
            }
        });
        jTextFieldCantidadComprar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadComprarKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldCantidadComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 80, -1));

        jTableSubtotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableSubtotal);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 359, 90));

        jButtonAdd.setText("COMPRAR");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("VENTAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 100, 50));

        jButtonElimiCliente.setText("ELIMINAR");
        jButtonElimiCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonElimiClienteMouseClicked(evt);
            }
        });
        jButtonElimiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElimiClienteActionPerformed(evt);
            }
        });
        jButtonElimiCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonElimiClienteKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonElimiCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jButtonEliminarproducto.setText("ELIMINAR");
        jButtonEliminarproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarproductoMouseClicked(evt);
            }
        });
        jButtonEliminarproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonEliminarproductoKeyTyped(evt);
            }
        });
        jPanel1.add(jButtonEliminarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jButtonEliminarSubtotal.setText("ELIMINAR");
        jButtonEliminarSubtotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarSubtotalMouseClicked(evt);
            }
        });
        jButtonEliminarSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarSubtotalActionPerformed(evt);
            }
        });
        jButtonEliminarSubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEliminarSubtotalKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonEliminarSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, -1, -1));

        jLabelNombre.setText("NOMBRE");

        jLabelApellido.setText("APELLIDO");

        jLabelCedula.setText("CEDULA");

        jLabelDireccion.setText("DIRECCION");

        jLabelCelular.setText("CELULAR");

        jLabelEmail.setText("EMAIL");

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCliente.setText("CLIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCedula)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelNombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCelular)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelEmail))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 122, Short.MAX_VALUE)
                .addComponent(jLabelCliente)
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombre)
                .addGap(28, 28, 28)
                .addComponent(jLabelApellido)
                .addGap(18, 18, 18)
                .addComponent(jLabelCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDireccion)
                .addGap(18, 18, 18)
                .addComponent(jLabelCelular)
                .addGap(27, 27, 27)
                .addComponent(jLabelEmail)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 260));

        jButtonAddProducto.setText("AGREGAR");
        jButtonAddProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddProductoMouseClicked(evt);
            }
        });
        jButtonAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProductoActionPerformed(evt);
            }
        });

        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });

        jLabelPrecio.setText("PRECIO");

        jLabelCantidad.setText("CANTIDAD");

        jTextFieldNombreProduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreProducKeyTyped(evt);
            }
        });

        jLabelNombreProd.setText("NOMBRE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelNombreProd)
                        .addGap(45, 45, 45)
                        .addComponent(jLabelCantidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonAddProducto))
                    .addComponent(jLabelPrecio))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelNombreProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCantidad)
                            .addComponent(jLabelPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddProducto)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 480, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FACTURA");

        jLabelBajo.setText("SUBTOTAL MÁS BAJO");

        jLabelAlto.setText("SUBTOTAL MÁS ALTO");

        jLabelTotal.setText("TOTAL SIN DESCUENTO");

        jLabel3.setText("TOTAL CON DESCUENTO");

        jTextFieldBajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBajoActionPerformed(evt);
            }
        });

        jTextFieldAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAltoActionPerformed(evt);
            }
        });

        jLabelDescuento.setText("DESCUENTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabelBajo)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabelAlto)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelDescuento)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTotalconDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTipoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotalconDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 560, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mike Cotzojay\\Pictures\\admon3\\logoAZ-e1699644348860.png")); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 450, 380));
        jLabel5.getAccessibleContext().setAccessibleParent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddClienteActionPerformed

    private void jButtonAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddProductoActionPerformed

    private void jButtonAddClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddClienteMouseClicked
        cliente.AgregarCliente(jTextFieldNombreCli, jTextFieldApellido, jTextFieldCedula, jTextFieldDireccion, jTextFieldCelular, jTextFieldEmail);
        cliente.LimpiarDatosClientes(jTextFieldNombreCli, jTextFieldApellido, jTextFieldCedula, jTextFieldDireccion, jTextFieldCelular, jTextFieldEmail);
    }//GEN-LAST:event_jButtonAddClienteMouseClicked

    private void jButtonAddProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddProductoMouseClicked
        producto.AgregarProducto(jTextFieldNombreProduc, jTextFieldCantidad, jTextFieldPrecio);
        producto.LimpiarDatosProductos(jTextFieldNombreProduc, jTextFieldCantidad, jTextFieldPrecio);
    }//GEN-LAST:event_jButtonAddProductoMouseClicked

    private void jTextFieldCantidadComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadComprarActionPerformed

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        venta.AgregarTablaVentas(jTextFieldCantidadComprar, jTableProducto, jTableSubtotal,jTextFieldBajo,jTextFieldAlto, jTextFieldDescuento, jTextFieldTotal, jTextFieldTotalconDesc,jLabelTipoDescuento);
        //System.out.println("Item mas Alto "+venta.CalcularSubtotalAlto(jTableSubtotal));
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jTextFieldBajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBajoActionPerformed

    private void jTextFieldAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAltoActionPerformed

    private void jTextFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldCantidadKeyTyped

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void jTextFieldCantidadComprarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadComprarKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldCantidadComprarKeyTyped

    private void jTextFieldCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCelularKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldCelularKeyTyped

    private void jTextFieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCedulaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldCedulaKeyTyped

    private void jTextFieldNombreCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreCliKeyTyped
        char c = evt.getKeyChar();
        if (c<'a'|| c>'z')evt.consume();
    }//GEN-LAST:event_jTextFieldNombreCliKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if (c<'a'|| c>'z')evt.consume();
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldNombreProducKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreProducKeyTyped
        char c = evt.getKeyChar();
        if (c<'a'|| c>'z')evt.consume();
    }//GEN-LAST:event_jTextFieldNombreProducKeyTyped

    private void jButtonElimiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElimiClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonElimiClienteActionPerformed

    private void jButtonEliminarproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEliminarproductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarproductoKeyTyped

    private void jButtonEliminarproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarproductoMouseClicked
        producto.eliminarfilaProducto(jTableProducto);
    }//GEN-LAST:event_jButtonEliminarproductoMouseClicked

    private void jButtonElimiClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonElimiClienteKeyPressed
        
    }//GEN-LAST:event_jButtonElimiClienteKeyPressed

    private void jButtonElimiClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonElimiClienteMouseClicked
        cliente.eliminarfilaCliente(jTableClientes);
    }//GEN-LAST:event_jButtonElimiClienteMouseClicked

    private void jButtonEliminarSubtotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarSubtotalMouseClicked
        venta.eliminarfilaventa(jTableSubtotal,jTextFieldBajo,jTextFieldAlto,jTextFieldDescuento,jTextFieldTotal,jTextFieldTotalconDesc,jLabelTipoDescuento);
    }//GEN-LAST:event_jButtonEliminarSubtotalMouseClicked

    private void jButtonEliminarSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarSubtotalActionPerformed

    private void jButtonEliminarSubtotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEliminarSubtotalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarSubtotalKeyPressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddCliente;
    private javax.swing.JButton jButtonAddProducto;
    private javax.swing.JButton jButtonElimiCliente;
    private javax.swing.JButton jButtonEliminarSubtotal;
    private javax.swing.JButton jButtonEliminarproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAlto;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBajo;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreProd;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelTipoDescuento;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTable jTableSubtotal;
    private javax.swing.JTextField jTextFieldAlto;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBajo;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCantidadComprar;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombreCli;
    private javax.swing.JTextField jTextFieldNombreProduc;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalconDesc;
    // End of variables declaration//GEN-END:variables
}
