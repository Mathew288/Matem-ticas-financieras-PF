package Vista;

import clases.Funcionalidades;
import clases.Validaciones;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PolizaIS extends javax.swing.JFrame {

    public PolizaIS() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setSize(723, 477);
        this.setLocationRelativeTo(null);
        botonCalcular.setEnabled(false);
        setIconImage(new ImageIcon(getClass().getResource("/recursos/banco.png")).getImage());
        setTitle("Póliza con interés simple.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldCapital = new javax.swing.JTextField();
        fieldInteres = new javax.swing.JTextField();
        botonCalcular = new javax.swing.JButton();
        fieldTiempo = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo60pxAltura.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel2.setText("Te encuentras en:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel3.setText("Calculo de una póliza con interés simple.");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Por favor, ingrese todos los campos solicitados.");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel4.setText("Capital:  $");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel6.setText("Interés:   %");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel7.setText("Tiempo (en años):  ");

        fieldCapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldCapitalKeyTyped(evt);
            }
        });

        fieldInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldInteresKeyTyped(evt);
            }
        });

        botonCalcular.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        fieldTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTiempoKeyTyped(evt);
            }
        });

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
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8)
                                .addComponent(fieldCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(fieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fieldCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(fieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
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

    private void fieldCapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCapitalKeyTyped
        // TODO add your handling code here:
        Validaciones.estaVacioElCampo(fieldTiempo, fieldCapital, fieldInteres, botonCalcular);
        Validaciones.validarANumeros(evt);
    }//GEN-LAST:event_fieldCapitalKeyTyped

    private void fieldInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldInteresKeyTyped
        // TODO add your handling code here:
        Validaciones.estaVacioElCampo(fieldTiempo, fieldCapital, fieldInteres, botonCalcular);
        Validaciones.validarANumeros(evt);


    }//GEN-LAST:event_fieldInteresKeyTyped

    private void fieldTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTiempoKeyTyped
        // TODO add your handling code here:
        Validaciones.estaVacioElCampo(fieldTiempo, fieldCapital, fieldInteres, botonCalcular);
        Validaciones.validarANumeros(evt);

    }//GEN-LAST:event_fieldTiempoKeyTyped

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        ResultadosPolizaIS resultados = new ResultadosPolizaIS();
        //this.setVisible(false);
        resultados.setVisible(true);
        double capital = Double.parseDouble(fieldCapital.getText());
        double interes = Double.parseDouble(fieldInteres.getText());
        int tiempo = Integer.parseInt(fieldTiempo.getText());
        double montoTotal = Funcionalidades.interesSimple(capital, tiempo, interes);

        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        resultados.getLabelMontoTotal().setText(dosDecimales.format(montoTotal));
        resultados.getLabelInteresAPagar().
                setText(dosDecimales.format(Funcionalidades.interesAPagar(capital, montoTotal)));

        resultados.getLabelCapitalIngresado().setText(dosDecimales.format(capital));
    }//GEN-LAST:event_botonCalcularActionPerformed

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
        SolicitudPrestamoIC ventana = new SolicitudPrestamoIC();
        ventana.setVisible(true);
    }//GEN-LAST:event_itemSolicitudInteresCompuestoActionPerformed

    private void itemSolicitudInteresSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSolicitudInteresSimpleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SolicitudPrestamoIS().setVisible(true);
    }//GEN-LAST:event_itemSolicitudInteresSimpleActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolizaIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JTextField fieldCapital;
    private javax.swing.JTextField fieldInteres;
    private javax.swing.JTextField fieldTiempo;
    private javax.swing.JMenuItem itemPolizaInteresCompuesto;
    private javax.swing.JMenuItem itemPolizaInteresSimple;
    private javax.swing.JMenuItem itemSolicitudInteresCompuesto;
    private javax.swing.JMenuItem itemSolicitudInteresSimple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuContainerPoliza;
    private javax.swing.JMenu menuContainerSolicitud;
    private javax.swing.JMenuItem menuItemContacto;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemSoftwareUtilizado;
    private javax.swing.JMenu menubarMasInfo;
    private javax.swing.JMenu menubarMenu;
    private javax.swing.JMenuItem menuitemRegresarMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
