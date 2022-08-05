package Vista;

import clases.Funcionalidades;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setSize(789, 490);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/recursos/banco.png")).getImage());
        setTitle("Bienvenid@ al sistema.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menubarMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        menubarMasInfo = new javax.swing.JMenu();
        menuitemSoftwareUtilizado = new javax.swing.JMenuItem();
        menuitemContacto = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo60pxAltura.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Bienvenido al sistema de la Cooperativa Guach.");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Aquí podras realizar: Cálculo de un prestamo con interés simple e interés compuesto; cálculo de una póliza");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("con interés simple e interés compuesto. Además, se te mostrará una tabla de amortización al final del cálculo");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("de la solicitud de un préstamo.");

        jLabel6.setFont(new java.awt.Font("Roboto", 3, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 101, 192));
        jLabel6.setText("En este sistema, puedes acceder a todas las funcionalidades desde el menú que se encuentra en la parte ");

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 101, 192));
        jLabel7.setText("superior izquierda.");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Cuando accedes a realizar una operación, en la parte inferior izquierda te muestra la operación que estás");

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("realizando, ya que, en ocasiones puede ser confuso detectar en que parte del sistema te encuentras.");

        menubarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lista.png"))); // NOI18N
        menubarMenu.setText("Menú");
        menubarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubarMenu.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menubarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubarMenuActionPerformed(evt);
            }
        });

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        jMenu3.setText("Póliza");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        jMenuItem3.setText("Calcular con interés simple");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/poliza-de-seguros.png"))); // NOI18N
        jMenuItem1.setText("Calcular con interés compuesto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        menubarMenu.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        jMenu4.setText("Solicitud de préstamo");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        jMenuItem2.setText("Calcular con interés simple");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prestamo.png"))); // NOI18N
        jMenuItem4.setText("Calcular con interés compuesto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        menubarMenu.add(jMenu4);
        menubarMenu.add(jSeparator2);

        jMenuItem6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar-sesion.png"))); // NOI18N
        jMenuItem6.setText("Salir");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menubarMenu.add(jMenuItem6);

        jMenuBar1.add(menubarMenu);

        menubarMasInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informacion.png"))); // NOI18N
        menubarMasInfo.setText("Mas información");
        menubarMasInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menubarMasInfo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        menuitemSoftwareUtilizado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuitemSoftwareUtilizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/operando.png"))); // NOI18N
        menuitemSoftwareUtilizado.setText("Sistema");
        menuitemSoftwareUtilizado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuitemSoftwareUtilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemSoftwareUtilizadoActionPerformed(evt);
            }
        });
        menubarMasInfo.add(menuitemSoftwareUtilizado);

        menuitemContacto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        menuitemContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/contactos-de-google.png"))); // NOI18N
        menuitemContacto.setText("Contacto");
        menuitemContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuitemContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemContactoActionPerformed(evt);
            }
        });
        menubarMasInfo.add(menuitemContacto);

        jMenuBar1.add(menubarMasInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PolizaIC ventana = new PolizaIC();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menubarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubarMenuActionPerformed
        // TODO add your handling code here:
        Funcionalidades.cerrarPrograma();
    }//GEN-LAST:event_menubarMenuActionPerformed

    private void menuitemSoftwareUtilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemSoftwareUtilizadoActionPerformed
        // TODO add your handling code here:
        InformacionDelSistema informacion = new InformacionDelSistema();
        informacion.setVisible(true);
    }//GEN-LAST:event_menuitemSoftwareUtilizadoActionPerformed

    private void menuitemContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemContactoActionPerformed
        // TODO add your handling code here:
        Icon iconoContacto = new ImageIcon(getClass().getResource("/recursos/contactos-de-google.png"));

        JOptionPane.showMessageDialog(null,
                "guachrichard@gmail.com",
                "Contacto",
                JOptionPane.OK_OPTION,
                iconoContacto);
    }//GEN-LAST:event_menuitemContactoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PolizaIS polizaIs = new PolizaIS();
        polizaIs.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SolicitudPrestamoIC ventana = new SolicitudPrestamoIC();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SolicitudPrestamoIS().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menubarMasInfo;
    private javax.swing.JMenu menubarMenu;
    private javax.swing.JMenuItem menuitemContacto;
    private javax.swing.JMenuItem menuitemSoftwareUtilizado;
    // End of variables declaration//GEN-END:variables
}
