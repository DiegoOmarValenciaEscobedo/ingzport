package ingzport;

import static ingzport.IngZport.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Diego Escobedo
 */
public class Factura extends javax.swing.JFrame {

    int Folio=0;
    
    public Factura(int folio){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Folio = folio;
        CompleteTicket();
    }
    
    public void CompleteTicket(){ 
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Nombre, Apellido FROM cliente c INNER JOIN ventas v"
            +" ON c.RFC = v.Cliente WHERE v.Folio = "+Folio);
            String ticket="\t\tIngZport\n\n";
            ticket+="\t\tMorelia Michoacan Mexico\n\n";
            if(rs.next()) ticket+="Cliente: "+rs.getString("Nombre")+" "+rs.getString("Apellido")+"\n\n";
            rs = st.executeQuery("SELECT Nombre, Apellidos FROM empleado e INNER JOIN ventas v"
            +" ON e.ClaveEmp = v.Empleado WHERE v.Folio = "+Folio);
            if(rs.next()) ticket+="Vendedor: "+rs.getString("Nombre")+" "+rs.getString("Apellidos")+"\n\n";
            ticket+="Folio de compra: "+Folio;
            ticket+="\n\nProducto\tColor\tTalla\tPrecio\tCantidad\tTotal\n";
            ticket+="--------------------------------------------------------------------------------------------"; 
            rs = st.executeQuery("SELECT * FROM productosvendidos WHERE Folio = "+Folio);
            int i=0;
            while(rs.next()){
                if(rs.getString("Descripcion").length()>10){
                    ticket +="\n"+rs.getString("Descripcion").substring(0, 9)+"...\t";
                }else{
                    ticket +="\n"+rs.getString("Descripcion")+"...\t";
                }
                    ticket += rs.getString("Color")+"\t";
                    ticket += rs.getString("Talla")+"\t";
                    ticket += rs.getString("Precio")+"\t";
                    ticket += rs.getString("Cantidad")+"\t";
                    ticket += rs.getString("Total");
                }
                rs = st.executeQuery("SELECT Total FROM ventas WHERE Folio = "+Folio);
                ticket+="\n--------------------------------------------------------------------------------------------\n";
                if(rs.next())ticket+="                                                            total $"+rs.getString("Total")+" MXN";
                ticket+="\n--------------------------------------------------------------------------------------------\n";
                ticket+="\n--------------------------------------------------------------------------------------------\n";
                ticket+="----------------------------MUCHAS GRACIAS POR SU COMPRA-----------------------------";
                ticket+="\n----------------------------------VUELVA PRONTO-----------------------------------";
                jTextArea1.setText(ticket);
            } catch (SQLException ex) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("Cerrar");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
