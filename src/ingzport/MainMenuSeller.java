package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainMenuSeller extends javax.swing.JFrame {

    int Id=0;
    
    public MainMenuSeller(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.Id = id;
        ChargeName();
        StartConnection();
        ReadDataBase();
    }
    
    public void ChargeName(){
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT Nombre FROM empleado WHERE CLaveEmp ="+Id);
            if(rs.next())TittleLabel.setText(rs.getString("Nombre")+" bienvenido al sistema de gestión de IngZport!");
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
            ResultSet rs = st.executeQuery("SELECT * FROM producto;");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"), rs.getString("PrecioVenta")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void SearchId(int id) {
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
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE ClaveProd="+id);
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"), rs.getString("PrecioVenta")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void SearchName(String name) {
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
            ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE Descripcion='"+name+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"), rs.getString("PrecioVenta")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void SearchBrand(String brand) {
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
            ResultSet rs = st.executeQuery("SELECT * FROM producto p INNER JOIN marca m ON p.Marca = m.ClaveMarca WHERE m.Nombre='"+brand+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"), rs.getString("PrecioVenta")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void SearchDepartment(String dep) {
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
            ResultSet rs = st.executeQuery("SELECT * FROM producto p INNER JOIN departamento d ON p.Departamento = d.ClaveD WHERE d.Descripcion='"+dep+"';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"), rs.getString("PrecioVenta")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchGroup = new javax.swing.ButtonGroup();
        ShoppingCartButton = new javax.swing.JButton();
        BrowserButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        EmployeRadioButton = new javax.swing.JRadioButton();
        PayRadioButton = new javax.swing.JRadioButton();
        ClientRadioButton = new javax.swing.JRadioButton();
        IdRadioButton = new javax.swing.JRadioButton();
        AmountSpinner = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        SearchTextField = new javax.swing.JTextField();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        AboutLabel = new javax.swing.JLabel();
        AboutLabel2 = new javax.swing.JLabel();
        SearchLabel2 = new javax.swing.JLabel();
        SearchLabel1 = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShoppingCartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ShoppingCart.png"))); // NOI18N
        ShoppingCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoppingCartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShoppingCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 30, 30));

        BrowserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        BrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 30, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("Cerrar sesion");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 80, 20));

        AddButton.setBackground(new java.awt.Color(204, 255, 255));
        AddButton.setText("Agregar al carrito");
        AddButton.setToolTipText("");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 350, 30));

        ViewButton.setBackground(new java.awt.Color(153, 255, 255));
        ViewButton.setText("Ver Detalles");
        ViewButton.setToolTipText("Ver detalles del producto");
        ViewButton.setBorder(null);
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 100, 30));

        SearchGroup.add(EmployeRadioButton);
        EmployeRadioButton.setText("Departamento");
        getContentPane().add(EmployeRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 120, 30));

        SearchGroup.add(PayRadioButton);
        PayRadioButton.setText("Marca");
        getContentPane().add(PayRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 120, 30));

        SearchGroup.add(ClientRadioButton);
        ClientRadioButton.setText("Nombre");
        getContentPane().add(ClientRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 110, 30));

        SearchGroup.add(IdRadioButton);
        IdRadioButton.setSelected(true);
        IdRadioButton.setText("Codigo");
        getContentPane().add(IdRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));
        getContentPane().add(AmountSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 70, 30));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ProductsTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 570, 310));

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 440, 30));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 70));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("¡'UserName' bienvenido a IngZport!");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 30));

        AboutLabel.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel.setText("IngZport: Morelia Michoacán S.A. de C.V. 2021");
        getContentPane().add(AboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 590, 20));

        AboutLabel2.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel2.setText("Diego Valencia, Rodrigo Villaseñor & Diana Damian");
        getContentPane().add(AboutLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 590, 20));

        SearchLabel2.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        SearchLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel2.setText("Cantidad:");
        SearchLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(SearchLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 70, 30));

        SearchLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SearchLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel1.setText("Buscar");
        getContentPane().add(SearchLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        SearchLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SearchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchLabel.setText("Por:");
        getContentPane().add(SearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        LogIn LI = new LogIn();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        int amount = Integer.parseInt(AmountSpinner.getValue().toString());
        int i =ProductsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun producto", "Error", JOptionPane.ERROR_MESSAGE);
        else if(amount<1){
            JOptionPane.showMessageDialog(null, "La cantidad del producto debe ser de minimo una", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(ProductsTable.getValueAt(i, 0).toString());
            Statement st;
            try {
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE ClaveProd="+id);
                if(rs.next()){
                    double total = Double.parseDouble(rs.getString("PrecioVenta"));
                    total *= amount;
                    st.execute("INSERT INTO `carrito` (`ClaveProd`, `Descripcion`, `Cantidad`, `PrecioIndividual`,"
                    +" `Total`, `Color`, `Talla`) VALUES ('" +rs.getString("ClaveProd")+"','"+rs.getString("Descripcion")
                    +"','"+String.valueOf(amount)+"','"+rs.getString("PrecioVenta")+"','"+String.valueOf(total)
                    +"','"+rs.getString("Color")+"','"+rs.getString("Talla")+"')");
                JOptionPane.showMessageDialog(null, "Se añadio el Producto a tu carrito", "Listo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El producto ya se encuentra en tu carrito", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void BrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowserButtonActionPerformed
        if(IdRadioButton.isSelected()) SearchId(Integer.parseInt(SearchTextField.getText()));
        else if(ClientRadioButton.isSelected()) SearchName(SearchTextField.getText());
        else if(EmployeRadioButton.isSelected()) SearchDepartment(SearchTextField.getText());
        else if(PayRadioButton.isSelected()) SearchBrand(SearchTextField.getText());
    }//GEN-LAST:event_BrowserButtonActionPerformed

    private void ShoppingCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoppingCartButtonActionPerformed
        ShoppingCart SC = new ShoppingCart(Id);
    }//GEN-LAST:event_ShoppingCartButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        int i =ProductsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun producto", "Error", JOptionPane.ERROR_MESSAGE);
        else{
            int id = Integer.parseInt(ProductsTable.getValueAt(i, 0).toString());
            ViewProducts VP = new ViewProducts(id);
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutLabel;
    private javax.swing.JLabel AboutLabel2;
    private javax.swing.JButton AddButton;
    private javax.swing.JSpinner AmountSpinner;
    private javax.swing.JLabel Background;
    private javax.swing.JButton BrowserButton;
    private javax.swing.JRadioButton ClientRadioButton;
    private javax.swing.JRadioButton EmployeRadioButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JRadioButton IdRadioButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JRadioButton PayRadioButton;
    private javax.swing.JTable ProductsTable;
    private javax.swing.ButtonGroup SearchGroup;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JLabel SearchLabel1;
    private javax.swing.JLabel SearchLabel2;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton ShoppingCartButton;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JButton ViewButton;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
