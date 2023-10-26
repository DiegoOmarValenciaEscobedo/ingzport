package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MainMenuAdmin extends javax.swing.JFrame {

    int Id=0;
    
    public MainMenuAdmin(int id) {
        initComponents();
        StartConnection();
        SetMainMenu();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.Id = id;
        ChargeName();
        ViewSalesA();
        ViewSalesB();
        ViewStock();
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
    
    public void ViewSalesA(){
        try {
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM ventas WHERE Tipo ='GENERICO'");
            DefaultTableModel table = (DefaultTableModel) UClientSaleTable.getModel();
            while(rs.next()){
                String Row[] = new String[]{rs.getString("Folio"),"Desconocido", rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    public void ViewSalesB(){
        try {
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM ventas WHERE Tipo =!'GENERICO'");
            DefaultTableModel table = (DefaultTableModel) ClientSaleTable.getModel();
            while(rs.next()){
                String Row[] = new String[]{rs.getString("Folio"),rs.getString("Cliente"), rs.getString("Total")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }

    public void ViewStock(){
        try {
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM producto");
            DefaultTableModel table = (DefaultTableModel) LProductsTable.getModel();
            while(rs.next()){
                int s = Integer.parseInt(rs.getString("Stock")), rp=Integer.parseInt(rs.getString("PuntoReorden"));
                if(s<=rp){
                    String Row[] = new String[]{rs.getString("Descripcion"),rs.getString("Stock")};
                    table.addRow(Row);
                }
            }
        } catch (SQLException ex) {}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        UClientSaleTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        LProductsTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClientSaleTable = new javax.swing.JTable();
        ExitButton = new javax.swing.JButton();
        ClientButton = new javax.swing.JButton();
        BrandButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JButton();
        SaleButton = new javax.swing.JButton();
        EmployeButton = new javax.swing.JButton();
        DepartmentButton = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        SubtitleLabel = new javax.swing.JLabel();
        SubtitleLabel2 = new javax.swing.JLabel();
        SubtitleLabel3 = new javax.swing.JLabel();
        AboutLabel = new javax.swing.JLabel();
        AboutLabel2 = new javax.swing.JLabel();
        SubtitleLabel4 = new javax.swing.JLabel();
        SubtitleLabel5 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Menu Principal");
        setMinimumSize(new java.awt.Dimension(900, 570));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UClientSaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Cliente", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UClientSaleTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 250, 100));

        LProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(LProductsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 240, 100));

        ClientSaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ClientSaleTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 100));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("Cerrar sesión");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 80, 20));

        ClientButton.setBackground(new java.awt.Color(153, 255, 255));
        ClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserIcon.png"))); // NOI18N
        ClientButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        ClientButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 210, 100));

        BrandButton.setBackground(new java.awt.Color(204, 255, 255));
        BrandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BrandIcon.png"))); // NOI18N
        BrandButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        BrandButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BrandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrandButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 210, 100));

        ProductButton.setBackground(new java.awt.Color(153, 255, 255));
        ProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ProductIcon.png"))); // NOI18N
        ProductButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        ProductButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 210, 100));

        SaleButton.setBackground(new java.awt.Color(204, 255, 255));
        SaleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SaleIcon.png"))); // NOI18N
        SaleButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        SaleButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 210, 100));

        EmployeButton.setBackground(new java.awt.Color(153, 255, 255));
        EmployeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Employe.png"))); // NOI18N
        EmployeButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        EmployeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        EmployeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmployeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 210, 100));

        DepartmentButton.setBackground(new java.awt.Color(204, 255, 255));
        DepartmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DepartmentIcon.png"))); // NOI18N
        DepartmentButton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("HelvLight", 1, 12))); // NOI18N
        DepartmentButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DepartmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DepartmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, 100));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 70));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("¡'UserName' bienvenido al sistema de gestión de IngZport!");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 30));

        SubtitleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SubtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel.setText("Compras hechas por clientes");
        getContentPane().add(SubtitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 30));

        SubtitleLabel2.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SubtitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel2.setText("Estos productos estan por agotarse");
        getContentPane().add(SubtitleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 420, 30));

        SubtitleLabel3.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SubtitleLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel3.setText("Conpras hechas por no clientes");
        getContentPane().add(SubtitleLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 270, 30));

        AboutLabel.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel.setText("IngZport: Morelia Michoacán S.A. de C.V. 2021");
        getContentPane().add(AboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 900, 20));

        AboutLabel2.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel2.setText("Diego Valencia, Rodrigo Villaseñor & Diana Damian");
        getContentPane().add(AboutLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 900, 20));

        SubtitleLabel4.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SubtitleLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel4.setText("Toma en cuenta que el % de tus compras fueron hechos por usuarios que no son clientes ");
        getContentPane().add(SubtitleLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 900, 30));

        SubtitleLabel5.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        SubtitleLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel5.setText("¿Qué deseas gestionar hoy?");
        getContentPane().add(SubtitleLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 900, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        LogIn LI = new LogIn();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientButtonActionPerformed
        ManageClients MC = new ManageClients();
    }//GEN-LAST:event_ClientButtonActionPerformed

    private void SaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleButtonActionPerformed
        ManageSales MS = new ManageSales();
    }//GEN-LAST:event_SaleButtonActionPerformed

    private void DepartmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentButtonActionPerformed
        ManageDepartments MD = new ManageDepartments();
    }//GEN-LAST:event_DepartmentButtonActionPerformed

    private void EmployeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeButtonActionPerformed
        ManageEmploye ME = new ManageEmploye();
    }//GEN-LAST:event_EmployeButtonActionPerformed

    private void BrandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandButtonActionPerformed
        ManageBrands MB = new ManageBrands();
    }//GEN-LAST:event_BrandButtonActionPerformed

    private void ProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductButtonActionPerformed
        ManageProducts MP = new ManageProducts();
    }//GEN-LAST:event_ProductButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutLabel;
    private javax.swing.JLabel AboutLabel2;
    private javax.swing.JLabel Background;
    private javax.swing.JButton BrandButton;
    private javax.swing.JButton ClientButton;
    private javax.swing.JTable ClientSaleTable;
    private javax.swing.JButton DepartmentButton;
    private javax.swing.JButton EmployeButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable LProductsTable;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ProductButton;
    private javax.swing.JButton SaleButton;
    private javax.swing.JLabel SubtitleLabel;
    private javax.swing.JLabel SubtitleLabel2;
    private javax.swing.JLabel SubtitleLabel3;
    private javax.swing.JLabel SubtitleLabel4;
    private javax.swing.JLabel SubtitleLabel5;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JTable UClientSaleTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void SetMainMenu() {
    }

}
