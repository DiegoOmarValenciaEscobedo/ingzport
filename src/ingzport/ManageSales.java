package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageSales extends javax.swing.JFrame {

    public ManageSales() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchbuttonGroup = new javax.swing.ButtonGroup();
        SearchTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        BrowserButton = new javax.swing.JButton();
        ChargeButton = new javax.swing.JButton();
        PayRadioButton = new javax.swing.JRadioButton();
        ClientRadioButton = new javax.swing.JRadioButton();
        IdRadioButton = new javax.swing.JRadioButton();
        EmployeRadioButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        IProductTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        TittleLabel1 = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        SearchLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Admin de autobuses");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 590, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 20, 20));

        DeleteButton.setBackground(new java.awt.Color(255, 153, 153));
        DeleteButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DeleteButton.setText("ELIMINAR");
        DeleteButton.setToolTipText("Click aquí para eliminar el bus seleccionado.");
        DeleteButton.setBorder(null);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        BrowserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        BrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 30, 30));

        ChargeButton.setBackground(new java.awt.Color(255, 255, 255));
        ChargeButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ChargeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Charge.png"))); // NOI18N
        ChargeButton.setToolTipText("Click aquí para modificar el bus seleccionado.");
        ChargeButton.setBorder(null);
        ChargeButton.setBorderPainted(false);
        ChargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChargeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 40, 40));

        SearchbuttonGroup.add(PayRadioButton);
        PayRadioButton.setText("Metodo de pago");
        getContentPane().add(PayRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        SearchbuttonGroup.add(ClientRadioButton);
        ClientRadioButton.setText("Cliente");
        getContentPane().add(ClientRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 30));

        SearchbuttonGroup.add(IdRadioButton);
        IdRadioButton.setSelected(true);
        IdRadioButton.setText("Folio");
        getContentPane().add(IdRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        SearchbuttonGroup.add(EmployeRadioButton);
        EmployeRadioButton.setText("Vendedor");
        getContentPane().add(EmployeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, 30));

        IProductTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        IProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Producto", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(IProductTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 720, 160));

        ProductTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Hecha por", "Metodo Pago", "Empleado", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 720, 160));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

        TittleLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel1.setText("Productos de esta venta");
        getContentPane().add(TittleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 740, 30));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Visor de ventas");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 740, 30));

        SearchLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel.setText("Por:");
        getContentPane().add(SearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 30));

        SearchLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SearchLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel1.setText("Buscar");
        getContentPane().add(SearchLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ReadDataBase() {
        int i = 0;
        int rn = ProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Nombre, MetodoPago, Empleado, Total FROM ventas v INNER JOIN cliente c ON v.Cliente= c.RFC;");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Nombre"),
                rs.getString("MetodoPago"), rs.getString("Empleado"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void CleanTable() {
        int i = 0;
        int rn = IProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) IProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
    }
    public void ReadDataBaseB(int folio) {
        int i = 0;
        int rn = IProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) IProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Descripcion, Precio, Cantidad, Total FROM productosvendidos WHERE Folio="+folio);
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Descripcion"),
                rs.getString("Precio"), rs.getString("Cantidad"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void ReadDataBaseFolio(int folio) {
        int i = 0;
        int rn = ProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Nombre, MetodoPago, Empleado, Total FROM ventas v INNER JOIN cliente c ON v.Cliente= c.RFC WHERE v.Folio="+folio);
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Nombre"),
                rs.getString("MetodoPago"), rs.getString("Empleado"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void ReadDataBaseClient(String name) {
        int i = 0;
        int rn = ProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Nombre, MetodoPago, Empleado, Total FROM ventas v INNER JOIN cliente c ON v.Cliente= c.RFC WHERE c.Nombre='"+name+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Nombre"),
                rs.getString("MetodoPago"), rs.getString("Empleado"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void ReadDataBaseSeller(String seller) {
        int i = 0;
        int rn = ProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Cliente, MetodoPago, Nombre, Total FROM ventas v INNER JOIN empleado e ON v.Empleado= e.ClaveEmp WHERE e.Nombre='"+seller+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Cliente"),
                rs.getString("MetodoPago"), rs.getString("Nombre"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void ReadDataBasePay(String pay) {
        String Pay = pay.toUpperCase();
        int i = 0;
        int rn = ProductTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT Folio, Nombre, MetodoPago, Empleado, Total FROM ventas v INNER JOIN cliente c ON v.Cliente= c.RFC WHERE MetodoPago='"+Pay+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("Folio"), rs.getString("Nombre"),
                rs.getString("MetodoPago"), rs.getString("Empleado"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = ProductTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(ProductTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM productosvendidos WHERE Folio=" + id);
                st.executeUpdate("DELETE FROM ventas WHERE Folio=" + id);
                DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
                table.removeRow(i);
                ReadDataBase();
                CleanTable();
                JOptionPane.showMessageDialog(null, "Se elimino la venta de la lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void BrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowserButtonActionPerformed
        if(IdRadioButton.isSelected()) ReadDataBaseFolio(Integer.parseInt(SearchTextField.getText()));
        else if(ClientRadioButton.isSelected()) ReadDataBaseClient(SearchTextField.getText());
        else if(EmployeRadioButton.isSelected()) ReadDataBaseSeller(SearchTextField.getText());
        else if(PayRadioButton.isSelected()) ReadDataBasePay(SearchTextField.getText());
    }//GEN-LAST:event_BrowserButtonActionPerformed

    private void ChargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButtonActionPerformed
        int i =ProductTable.getSelectedRow();
        if (i == -1)
        JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            int id=Integer.parseInt(ProductTable.getValueAt(i, 0).toString());
            ReadDataBaseB(id);
        }
    }//GEN-LAST:event_ChargeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BrowserButton;
    private javax.swing.JButton ChargeButton;
    private javax.swing.JRadioButton ClientRadioButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JRadioButton EmployeRadioButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable IProductTable;
    private javax.swing.JRadioButton IdRadioButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JRadioButton PayRadioButton;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JLabel SearchLabel1;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.ButtonGroup SearchbuttonGroup;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel TittleLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
