/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorGeneral;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author krypt97
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ControladorGeneral miControladorGeneral;

    /**
     * Creates new form VentanaPrincipal
     */
    FondoPanel fondo = new FondoPanel();

    public VentanaPrincipal() {

        this.setContentPane(fondo);
        initComponents();
        
        //Colocando fuentes
        //Font roboto = new Font();
        //lblTitulo.setFont(roboto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panLatBtns = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1300, 720));

        panLatBtns.setBackground(new java.awt.Color(49, 213, 223));
        panLatBtns.setForeground(new java.awt.Color(255, 255, 255));
        panLatBtns.setMinimumSize(new java.awt.Dimension(150, 720));
        panLatBtns.setOpaque(false);
        panLatBtns.setPreferredSize(new java.awt.Dimension(150, 720));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 25);
        flowLayout1.setAlignOnBaseline(true);
        panLatBtns.setLayout(flowLayout1);

        btnInicio.setBackground(new java.awt.Color(44, 80, 154));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 12));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/home.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(new RoundedBorder(20));
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setMinimumSize(new java.awt.Dimension(130, 60));
        btnInicio.setPreferredSize(new java.awt.Dimension(130, 60));
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panLatBtns.add(btnInicio);

        btnUsuarios.setBackground(new java.awt.Color(44, 80, 154));
        btnUsuarios.setFont(new java.awt.Font("Roboto", 1, 12));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/people.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setAlignmentX(1.0F);
        btnUsuarios.setAlignmentY(1.0F);
        btnUsuarios.setBorder(new RoundedBorder(20));
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setMinimumSize(new java.awt.Dimension(130, 60));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(130, 60));
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        panLatBtns.add(btnUsuarios);

        btnProductos.setBackground(new java.awt.Color(44, 80, 154));
        btnProductos.setFont(new java.awt.Font("Roboto", 1, 12));
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/productos.png"))); // NOI18N
        btnProductos.setBorder(new RoundedBorder(20));
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setLabel("Productos");
        btnProductos.setMinimumSize(new java.awt.Dimension(130, 60));
        btnProductos.setPreferredSize(new java.awt.Dimension(130, 60));
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        panLatBtns.add(btnProductos);

        btnProveedores.setBackground(new java.awt.Color(44, 80, 154));
        btnProveedores.setFont(new java.awt.Font("Roboto", 1, 12));
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/proveedor32pbnx.png"))); // NOI18N
        btnProveedores.setBorder(new RoundedBorder(20));
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedores.setLabel("Proveedores");
        btnProveedores.setMinimumSize(new java.awt.Dimension(130, 60));
        btnProveedores.setPreferredSize(new java.awt.Dimension(130, 60));
        btnProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        panLatBtns.add(btnProveedores);

        btnVentas.setBackground(new java.awt.Color(44, 80, 154));
        btnVentas.setFont(new java.awt.Font("Roboto", 1, 12));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/monedas.png"))); // NOI18N
        btnVentas.setBorder(new RoundedBorder(20));
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setLabel("Ventas");
        btnVentas.setMinimumSize(new java.awt.Dimension(130, 60));
        btnVentas.setPreferredSize(new java.awt.Dimension(130, 60));
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        panLatBtns.add(btnVentas);

        btnClientes.setBackground(new java.awt.Color(44, 80, 154));
        btnClientes.setFont(new java.awt.Font("Roboto", 1, 12));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cliente_hand.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorder(new RoundedBorder(20));
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setMinimumSize(new java.awt.Dimension(130, 60));
        btnClientes.setPreferredSize(new java.awt.Dimension(130, 60));
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        panLatBtns.add(btnClientes);

        btnHistorial.setBackground(new java.awt.Color(44, 80, 154));
        btnHistorial.setFont(new java.awt.Font("Roboto", 1, 12));
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/historial.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.setBorder(new RoundedBorder(20));
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorial.setMinimumSize(new java.awt.Dimension(130, 60));
        btnHistorial.setPreferredSize(new java.awt.Dimension(130, 60));
        btnHistorial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        panLatBtns.add(btnHistorial);

        btnCerrarSesion.setBackground(new java.awt.Color(44, 80, 154));
        btnCerrarSesion.setFont(new java.awt.Font("Roboto", 1, 12));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(new RoundedBorder(20));
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(130, 60));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(130, 60));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(130, 60));
        btnCerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        panLatBtns.add(btnCerrarSesion);

        panelHome.setMinimumSize(new java.awt.Dimension(1150, 720));
        panelHome.setOpaque(false);
        panelHome.setPreferredSize(new java.awt.Dimension(1150, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo1.2.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Roboto",Font.BOLD, 50));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido a BikeShop");

        lblMensaje.setFont(new java.awt.Font("Roboto", 0, 18));
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensaje.setText("<html>\n<p style=\\\"width:500px\\\">Los desarrolladores del proyecto BikeShop estamos felices de</p>\n<p style=\\\"width:500px\\\"> tenerte con nosotros.</p>\n<p style=\\\"width:500px\\\"></p>\n<p style=\\\"width:500px\\\">Mensaje de nuestro CEO :</p>\n<p style=\\\"width:500px\\\">Hola, gracias por elegir nuestro software para tus ventas,</p>\n<p style=\\\"width:500px\\\">espero que ahora seas más productivo al momento de</p>\n<p style=\\\"width:500px\\\">gestionar y administrar tu negocio.</p>\n<p style=\\\"width:500px\\\"></p>\n<p style=\\\"width:500px\\\">Siempre estaremos mejorando e innovando día a día para</p>\n<p style=\\\"width:500px\\\">facilitarte el trabajo.</p>\n</html>");
        lblMensaje.setToolTipText("");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(227, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panLatBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panLatBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelProveedores();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelProductos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelUsuarios();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelVentas();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelHistorialVentas();
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.cargarPanelHome();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        miControladorGeneral.logout();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPanel panLatBtns;
    public javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    public void setControladorGeneral(ControladorGeneral miControladorGeneral) {
        this.miControladorGeneral = miControladorGeneral;
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/ventana3.0.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);

            super.paint(g);
        }
    }

    private static class RoundedBorder implements Border {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
}