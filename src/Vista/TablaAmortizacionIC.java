package Vista;

import clases.Funcionalidades;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TablaAmortizacionIC extends javax.swing.JFrame {

    int tiempo = 0;
    double valor = 0;

    public TablaAmortizacionIC() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setSize(959, 625);
        this.setLocationRelativeTo(null);

        //Añade el ícono al programa
        setIconImage(new ImageIcon(getClass().getResource("/recursos/banco.png")).getImage());
        setTitle("Tabla de amortización interés compuesto");
    }

    /*Getters y setters*/
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonLlenarTabla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelCapitalIngresado = new javax.swing.JLabel();
        labelMontoTotal = new javax.swing.JLabel();
        labelInteresAPagar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menubarMenu = new javax.swing.JMenu();
        menuitemRegresarMenuPrincipal = new javax.swing.JMenuItem();
        menuContainerPoliza = new javax.swing.JMenu();
        itemPolizaInteresSimple = new javax.swing.JMenuItem();
        itemPolizaInteresCompuesto = new javax.swing.JMenuItem();
        menuContainerSolicitud = new javax.swing.JMenu();
        itemSolicitudInteresSimple = new javax.swing.JMenuItem();
        itemSolicitudInteresCompuesto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();
        menubarMasInfo = new javax.swing.JMenu();
        menuItemSoftwareUtilizado = new javax.swing.JMenuItem();
        menuItemContacto = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo60pxAltura.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel2.setText("Te encuentras en:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel3.setText("Tabla de amortización con interés compuesto");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de mes", "Dinero a pagar"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        botonLlenarTabla.setText("Llenar tabla");
        botonLlenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLlenarTablaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Monto total:   $");

        labelCapitalIngresado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        labelMontoTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        labelInteresAPagar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Interés a pagar:  $");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Capital ingresado:  $");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Tiempo en años: ");

        labelTiempo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCapitalIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelInteresAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(labelCapitalIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelInteresAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addComponent(labelMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        menubarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lista.png"))); // NOI18N
        menubarMenu.setText("Menú");
        menubarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubarMenu.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        menuitemRegresarMenuPrincipal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuitemRegresarMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hogar (1).png"))); // NOI18N
        menuitemRegresarMenuPrincipal.setText("Regresar a la página principal");
        menuitemRegresarMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemRegresarMenuPrincipalActionPerformed(evt);
            }
        });
        menubarMenu.add(menuitemRegresarMenuPrincipal);

        menuContainerPoliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        menuContainerPoliza.setText("Póliza");
        menuContainerPoliza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuContainerPoliza.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        itemPolizaInteresSimple.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        itemPolizaInteresSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        itemPolizaInteresSimple.setText("Calcular con interés simple");
        menuContainerPoliza.add(itemPolizaInteresSimple);

        itemPolizaInteresCompuesto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        itemPolizaInteresCompuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        itemPolizaInteresCompuesto.setText("Calcular con interés compuesto");
        itemPolizaInteresCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPolizaInteresCompuestoActionPerformed(evt);
            }
        });
        menuContainerPoliza.add(itemPolizaInteresCompuesto);

        menubarMenu.add(menuContainerPoliza);

        menuContainerSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        menuContainerSolicitud.setText("Solicitud de préstamo");
        menuContainerSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuContainerSolicitud.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        itemSolicitudInteresSimple.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        itemSolicitudInteresSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        itemSolicitudInteresSimple.setText("Calcular con interés simple");
        itemSolicitudInteresSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSolicitudInteresSimpleActionPerformed(evt);
            }
        });
        menuContainerSolicitud.add(itemSolicitudInteresSimple);

        itemSolicitudInteresCompuesto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        itemSolicitudInteresCompuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        itemSolicitudInteresCompuesto.setText("Calcular con interés compuesto");
        itemSolicitudInteresCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSolicitudInteresCompuestoActionPerformed(evt);
            }
        });
        menuContainerSolicitud.add(itemSolicitudInteresCompuesto);

        menubarMenu.add(menuContainerSolicitud);
        menubarMenu.add(jSeparator2);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItemSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar-sesion.png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menubarMenu.add(menuItemSalir);

        jMenuBar1.add(menubarMenu);

        menubarMasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informacion.png"))); // NOI18N
        menubarMasInfo.setText("Más información");
        menubarMasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubarMasInfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        menuItemSoftwareUtilizado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuItemSoftwareUtilizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/operando.png"))); // NOI18N
        menuItemSoftwareUtilizado.setText("Sistema");
        menuItemSoftwareUtilizado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemSoftwareUtilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSoftwareUtilizadoActionPerformed(evt);
            }
        });
        menubarMasInfo.add(menuItemSoftwareUtilizado);

        menuItemContacto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuItemContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/contactos-de-google.png"))); // NOI18N
        menuItemContacto.setText("Contacto");
        menuItemContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemContactoActionPerformed(evt);
            }
        });
        menubarMasInfo.add(menuItemContacto);

        jMenuBar1.add(menubarMasInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(botonLlenarTabla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(botonLlenarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPolizaInteresCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPolizaInteresCompuestoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PolizaIC ventana = new PolizaIC();
        ventana.setVisible(true);
    }//GEN-LAST:event_itemPolizaInteresCompuestoActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        Funcionalidades.cerrarPrograma();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuitemRegresarMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemRegresarMenuPrincipalActionPerformed
        // TODO add your handling code here:
        Funcionalidades.regresarMenuPrincipal(this);
    }//GEN-LAST:event_menuitemRegresarMenuPrincipalActionPerformed

    private void menuItemSoftwareUtilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSoftwareUtilizadoActionPerformed
        // TODO add your handling code here:
        InformacionDelSistema informacion = new InformacionDelSistema();
        informacion.setVisible(true);
    }//GEN-LAST:event_menuItemSoftwareUtilizadoActionPerformed

    private void menuItemContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemContactoActionPerformed
        // TODO add your handling code here:
        Icon iconoContacto = new ImageIcon(getClass().getResource("/recursos/contactos-de-google.png"));

        JOptionPane.showMessageDialog(null,
                "guachrichard@gmail.com",
                "Contacto",
                JOptionPane.OK_OPTION,
                iconoContacto);
    }//GEN-LAST:event_menuItemContactoActionPerformed

    private void itemSolicitudInteresCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSolicitudInteresCompuestoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TablaAmortizacionIC ventana = new TablaAmortizacionIC();
        ventana.setVisible(true);
    }//GEN-LAST:event_itemSolicitudInteresCompuestoActionPerformed

    private void botonLlenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlenarTablaActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo = new DefaultTableModel();

        String mes = "Mes";
        modelo.addColumn("Mes");
        modelo.addColumn("Interés a pagar");
        DecimalFormat dosDecimales = new DecimalFormat("#.00");

        for (int i = 1; i <= getTiempo(); i++) {

            Object[] fila = {mes + i, "$  " + dosDecimales.format(valor)};
            modelo.addRow(fila);
        }

        tabla.setModel(modelo);

        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        tabla.getColumnModel().getColumn(1).setCellRenderer(cellRender);

    }//GEN-LAST:event_botonLlenarTablaActionPerformed

    private void itemSolicitudInteresSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSolicitudInteresSimpleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SolicitudPrestamoIS().setVisible(true);
    }//GEN-LAST:event_itemSolicitudInteresSimpleActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaAmortizacionIC().setVisible(true);
            }
        });
    }

    public JLabel getLabelCapitalIngresado() {
        return labelCapitalIngresado;
    }

    public void setLabelCapitalIngresado(JLabel labelCapitalIngresado) {
        this.labelCapitalIngresado = labelCapitalIngresado;
    }

    public JLabel getLabelInteresAPagar() {
        return labelInteresAPagar;
    }

    public void setLabelInteresAPagar(JLabel labelInteresAPagar) {
        this.labelInteresAPagar = labelInteresAPagar;
    }

    public JLabel getLabelMontoTotal() {
        return labelMontoTotal;
    }

    public void setLabelMontoTotal(JLabel labelMontoTotal) {
        this.labelMontoTotal = labelMontoTotal;
    }

    public JLabel getLabelTiempo() {
        return labelTiempo;
    }

    public void setLabelTiempo(JLabel labelTiempo) {
        this.labelTiempo = labelTiempo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLlenarTabla;
    private javax.swing.JMenuItem itemPolizaInteresCompuesto;
    private javax.swing.JMenuItem itemPolizaInteresSimple;
    private javax.swing.JMenuItem itemSolicitudInteresCompuesto;
    private javax.swing.JMenuItem itemSolicitudInteresSimple;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelCapitalIngresado;
    private javax.swing.JLabel labelInteresAPagar;
    private javax.swing.JLabel labelMontoTotal;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JMenu menuContainerPoliza;
    private javax.swing.JMenu menuContainerSolicitud;
    private javax.swing.JMenuItem menuItemContacto;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemSoftwareUtilizado;
    private javax.swing.JMenu menubarMasInfo;
    private javax.swing.JMenu menubarMenu;
    private javax.swing.JMenuItem menuitemRegresarMenuPrincipal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
