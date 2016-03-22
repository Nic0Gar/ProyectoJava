
package ar.com.educacionit.vehiculos.ventanas;

public class VentanaMaestra extends javax.swing.JFrame {


    public VentanaMaestra() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAutos = new javax.swing.JMenuItem();
        menuVendedores = new javax.swing.JMenuItem();
        menuCompradores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jMenu1.setText("Abrir Ventana");

        menuAutos.setText("Autos");
        menuAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutosActionPerformed(evt);
            }
        });
        jMenu1.add(menuAutos);

        menuVendedores.setText("Vendedores");
        menuVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendedoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuVendedores);

        menuCompradores.setText("Compradores");
        menuCompradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompradoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuCompradores);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        menuAyuda.setText("Ayuda On-line");
        jMenu2.add(menuAyuda);

        menuConfiguracion.setText("Configuracion");
        jMenu2.add(menuConfiguracion);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(menuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutosActionPerformed
        
            AutosVentana v = new AutosVentana();
            escritorio.add(v);
            
            v.setVisible(true);
            
            
        
    }//GEN-LAST:event_menuAutosActionPerformed

    private void menuVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendedoresActionPerformed
        // TODO add your handling code here:
            VendedoresVentana v = new VendedoresVentana();
            escritorio.add(v);
            v.setVisible(true);
            
    }//GEN-LAST:event_menuVendedoresActionPerformed

    private void menuCompradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompradoresActionPerformed
        // TODO add your handling code here:
        CompradoresVentana v = new CompradoresVentana();
            escritorio.add(v);
            v.setVisible(true);
    }//GEN-LAST:event_menuCompradoresActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMaestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMaestra v = new VentanaMaestra();
                new VentanaMaestra().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAutos;
    private javax.swing.JMenuItem menuAyuda;
    private javax.swing.JMenuItem menuCompradores;
    private javax.swing.JMenuItem menuConfiguracion;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuVendedores;
    // End of variables declaration//GEN-END:variables
}
