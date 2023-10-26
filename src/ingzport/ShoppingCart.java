package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShoppingCart extends javax.swing.JFrame {
    double total=0;
    int Seller;
    public ShoppingCart(int Seller) {
        initComponents();
        StartConnection();
        this.setVisible(true);
        this.setLocationRelativeTo(null);   
        ReadDataBase();
        this.Seller = Seller;
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente;");
            while (rs.next()) {
                ClientComboBox.addItem(rs.getString("Nombre"));
            }
        } catch (SQLException ex) {}
    }

    public void ReadDataBase() {
        int i = 0;
        int rn = ProductsTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductsTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carrito;");
            while (rs.next()) {
                total += Double.parseDouble(rs.getString("Total"));
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"),rs.getString("Color"),
                rs.getString("Talla"), rs.getString("PrecioIndividual"), rs.getString("Cantidad"), rs.getString("Total")};
                table.addRow(Row);
            }
            TotalLabel.setText("Total:   $"+total);
        } catch (SQLException ex) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        ClientComboBox = new javax.swing.JComboBox<>();
        CashTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        AboutLabel = new javax.swing.JLabel();
        AboutLabel2 = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        CashLabel = new javax.swing.JLabel();
        ClientLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Menu Principal");
        setMinimumSize(new java.awt.Dimension(900, 570));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        DeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        DeleteButton.setText("Eliminar");
        DeleteButton.setToolTipText("CENTER");
        DeleteButton.setBorder(null);
        DeleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 160, 30));

        PayButton.setBackground(new java.awt.Color(153, 255, 255));
        PayButton.setText("Pagar");
        PayButton.setBorder(null);
        PayButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 880, 40));

        ClientComboBox.setBackground(new java.awt.Color(204, 255, 255));
        ClientComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ClientComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        ClientComboBox.setBorder(null);
        getContentPane().add(ClientComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 200, 30));

        CashTextField.setText("0");
        getContentPane().add(CashTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 160, 30));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Producto", "Color", "Talla", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ProductsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 880, 250));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 70));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Carrito de compras");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 30));

        AboutLabel.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel.setText("IngZport: Morelia Michoacán S.A. de C.V. 2021");
        getContentPane().add(AboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 900, 20));

        AboutLabel2.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel2.setText("Diego Valencia, Rodrigo Villaseñor & Diana Damian");
        getContentPane().add(AboutLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 900, 20));

        TotalLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        TotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalLabel.setText("Total: $");
        getContentPane().add(TotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 150, 30));

        CashLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CashLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CashLabel.setText("Paga en efectivo $");
        getContentPane().add(CashLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 160, 30));

        ClientLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ClientLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientLabel.setText("Cliente:");
        getContentPane().add(ClientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = ProductsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(ProductsTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM carrito WHERE ClaveProd=" + id);
                DefaultTableModel table = (DefaultTableModel) ProductsTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null, "Se elimino el producto del carrito", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        double cash= Double.parseDouble(CashTextField.getText());
        if (cash < total)
            JOptionPane.showMessageDialog(null, "No has pagado lo suficiente", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                Statement st;
                st = con.createStatement();
                if("GENERICO".equalsIgnoreCase(ClientComboBox.getSelectedItem().toString())){
                    st.execute("INSERT INTO `ventas` (`Folio`, `Tipo`, `Cliente`, `MetodoPago`, `Empleado`, `Total`)"
                    +" VALUES (NULL, 'GENERICO','0000000000','EFECTIVO','"+Seller+"','"+total+"')");
                }else{
                    String name = ClientComboBox.getSelectedItem().toString();
                    ResultSet rs = st.executeQuery("SELECT RFC FROM cliente WHERE Nombre='"+name.trim()+"';");
                    if(rs.next()){
                        st.execute("INSERT INTO `ventas` (`Folio`, `Tipo`, `Cliente`, `MetodoPago`, `Empleado`, `Total`)"
                        +"VALUES (NULL, 'CLIENTE','"+rs.getString("RFC")+"','EFECTIVO"+"','"+Seller+"','"+total+"')");
                    }
                }
                ResultSet rs = st.executeQuery("SELECT max(Folio) AS Folio FROM ventas;");
                int folio=0;
                if(rs.next()){
                    folio = Integer.parseInt(rs.getString("Folio"));
                }
                rs = st.executeQuery("SELECT * FROM carrito");
                while(rs.next()){
                    Statement st2;
                    st2 = con.createStatement();
                    st2.execute("INSERT INTO `productosvendidos` (`id`, `Folio`, `CodigoP`, `Descripcion`, `Color`, `Talla`,"
                    +" `Precio`, `Cantidad`, `Total`)"+"VALUES (NULL, '"+folio+"','1','"+rs.getString("Descripcion")
                    +"','"+rs.getString("Color")+"','"+rs.getString("Talla")+"','"+rs.getString("PrecioIndividual")
                    +"','"+rs.getString("Cantidad")+"','"+rs.getString("Total")+"')");
                }
                st.execute("TRUNCATE carrito;");
                if("GENERICO".equalsIgnoreCase(ClientComboBox.getSelectedItem().toString())){
                    double pay = Double.parseDouble(CashTextField.getText());
                    Ticket T = new Ticket(folio, total, pay);
                }else{
                    Factura F = new Factura(folio);
                }
                this.dispose();
            } catch (SQLException ex) {}
        }
    }//GEN-LAST:event_PayButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutLabel;
    private javax.swing.JLabel AboutLabel2;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CashLabel;
    private javax.swing.JTextField CashTextField;
    private javax.swing.JComboBox<String> ClientComboBox;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton PayButton;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
