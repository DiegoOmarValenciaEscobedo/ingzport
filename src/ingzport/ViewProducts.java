package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.StartConnection;
import static ingzport.IngZport.con;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewProducts extends javax.swing.JFrame {

    public ViewProducts(int Id) {
        initComponents();
        StartConnection();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ReadItems(Id);
    }

    public void ReadItems(int i){
        Statement st;
            try {
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE ClaveProd="+i);
                if(rs.next()){
                    IdLabel.setText(rs.getString("ClaveProd"));
                    NameLabel.setText("Nombre: "+rs.getString("Descripcion"));
                    BrandLabel.setText("Marca: "+rs.getString("Marca"));
                    SizeLabel.setText("Talla: "+rs.getString("Talla"));
                    GenderLabel.setText("Sexo: "+rs.getString("Sexo"));
                    ColorLabel.setText("Color: "+rs.getString("Color"));
                    StockLabel.setText("Stock: "+rs.getString("Stock"));
                    DepartmentLabel.setText("Departamento: "+rs.getString("Departamento"));
                    ReorderPointLabel.setText("Punto Reorden: "+rs.getString("PuntoReorden"));
                    PriceLabel.setText("Precio: "+rs.getString("PrecioVenta"));
                    
                    Image img = getToolkit().getImage(rs.getString("Img"));
                    img = img.getScaledInstance(160, 170, Image.SCALE_DEFAULT);
                    ImageLabel.setIcon(new ImageIcon(img));
                }
            } catch (SQLException ex) {}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        AmountSpinner = new javax.swing.JSpinner();
        Logo = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        BrandLabel = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        SizeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        ColorLabel = new javax.swing.JLabel();
        StockLabel = new javax.swing.JLabel();
        DepartmentLabel = new javax.swing.JLabel();
        ReorderPointLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        AboutLabel = new javax.swing.JLabel();
        AboutLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 20, 20));

        AddButton.setBackground(new java.awt.Color(204, 255, 255));
        AddButton.setText("Agregar al carrito");
        AddButton.setToolTipText("");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 30));
        getContentPane().add(AmountSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 100, 30));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 70));

        IdLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        IdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdLabel.setText("CostoAdq");
        getContentPane().add(IdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        NameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nombre");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 30));

        BrandLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrandLabel.setText("Marca");
        getContentPane().add(BrandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 190, 30));

        ImageLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Error.png"))); // NOI18N
        ImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 170));

        SizeLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SizeLabel.setText("talla");
        getContentPane().add(SizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 30));

        GenderLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        GenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenderLabel.setText("Sexo");
        getContentPane().add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 30));

        ColorLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorLabel.setText("Color");
        getContentPane().add(ColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 190, 30));

        StockLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        StockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StockLabel.setText("Stock");
        getContentPane().add(StockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 190, 30));

        DepartmentLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DepartmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepartmentLabel.setText("Departamento");
        getContentPane().add(DepartmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 190, 30));

        ReorderPointLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ReorderPointLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReorderPointLabel.setText("PuntoReorden");
        getContentPane().add(ReorderPointLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 190, 30));

        PriceLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Precio Venta");
        getContentPane().add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 190, 30));

        AboutLabel.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel.setText("IngZport: Morelia Michoacán S.A. de C.V. 2021");
        getContentPane().add(AboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 390, 20));

        AboutLabel2.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        AboutLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AboutLabel2.setText("Diego Valencia, Rodrigo Villaseñor & Diana Damian");
        getContentPane().add(AboutLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        int amount = Integer.parseInt(AmountSpinner.getValue().toString());
        if(amount<1){
            JOptionPane.showMessageDialog(null, "La cantidad del producto debe ser de minimo una", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(IdLabel.getText());
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
                    this.dispose();
                }
            } catch (SQLException ex) {JOptionPane.showMessageDialog(null, "El producto ya se encuentra en tu carrito", "Error", JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_AddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JLabel BrandLabel;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel ReorderPointLabel;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JLabel StockLabel;
    // End of variables declaration//GEN-END:variables
}
