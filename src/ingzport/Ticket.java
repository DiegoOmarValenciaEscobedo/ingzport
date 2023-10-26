package ingzport;

import static ingzport.IngZport.*;
import java.sql.*;

/**
 *
 * @author Diego Escobedo
 */
public class Ticket extends javax.swing.JFrame {

    int Folio=0;
    double Total=0, Pay=0;
    public Ticket(int folio, double total, double pay){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Folio = folio;
        Total = total;
        Pay = pay;
        CompleteTicket();
    }
    
    public void CompleteTicket(){
        String ticket="Producto\tPrecio\tCantidad\tTotal\n";
            ticket+="----------------------------------------------";  
            try {
                Statement st;
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM productosvendidos WHERE Folio = "+Folio);
                int i=0;
                while(rs.next()){
                    if(rs.getString("Descripcion").length()>7){
                        ticket +="\n"+rs.getString("Descripcion").substring(0, 6)+"...\t";
                    }else{
                        ticket +="\n"+rs.getString("Descripcion")+"...\t";
                    }
                    ticket += rs.getString("Precio")+"\t";
                    ticket += rs.getString("Cantidad")+"\t";
                    ticket += rs.getString("Total");
                }
                ticket+="\n----------------------------------------------\n";
                ticket+="                    total $"+Total+" MXN";
                ticket+="\n----------------------------------------------\n";
                ticket+="                     Su cambio $"+(Pay-Total)+" MXN";
                ticket+="\n----------------------------------------------\n";
                ticket+="----MUCHAS GRACIAS POR SU COMPRA----";
                ticket+="\n-----------VUELVA PRONTO------------";
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
                    .addComponent(jScrollPane1)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
