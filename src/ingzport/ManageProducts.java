package ingzport;

import static ingzport.IngZport.*;
import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageProducts extends javax.swing.JFrame {

    public ManageProducts() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();

        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM marca;");
            
            while (rs.next()) {
                BrandComboBox.addItem(rs.getString("ClaveMarca") + " - " + rs.getString("Nombre"));
            }
            ResultSet rs3 = st.executeQuery("SELECT * FROM departamento");
            while (rs3.next()) {
                DepartmentComboBox.addItem(rs3.getString("ClaveD") + " - " + rs3.getString("Descripcion"));
            }
        } catch (SQLException ex) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DescriptionTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        ImageTextField = new javax.swing.JTextField();
        ColorTextField = new javax.swing.JTextField();
        AdqPriceTextField = new javax.swing.JTextField();
        SizeComboBox = new javax.swing.JComboBox<>();
        GenderComboBox = new javax.swing.JComboBox<>();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        BrandComboBox = new javax.swing.JComboBox<>();
        ExitButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BrowserButton = new javax.swing.JButton();
        StockSpinner = new javax.swing.JSpinner();
        RPSpinner = new javax.swing.JSpinner();
        ChargeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        BrandLabel = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        SizeLabel = new javax.swing.JLabel();
        DepartmentLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        ColorLabel = new javax.swing.JLabel();
        RPLabel = new javax.swing.JLabel();
        StockLabel = new javax.swing.JLabel();
        AdqPriceLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Admin de autobuses");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DescriptionTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DescriptionTextField.setToolTipText("Escribe aquí la matricula del bus.");
        DescriptionTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(DescriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 30));

        PriceTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PriceTextField.setToolTipText("Escribe aquí la matricula del bus.");
        PriceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(PriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 150, 30));

        ImageTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ImageTextField.setToolTipText("Escribe aquí la matricula del bus.");
        ImageTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(ImageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 180, 30));

        ColorTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ColorTextField.setToolTipText("Escribe aquí la matricula del bus.");
        ColorTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(ColorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, 30));

        AdqPriceTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AdqPriceTextField.setToolTipText("Escribe aquí la matricula del bus.");
        AdqPriceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(AdqPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 150, 30));

        SizeComboBox.setBackground(new java.awt.Color(204, 255, 255));
        SizeComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL" }));
        SizeComboBox.setToolTipText("Selecciona aquí de entre los conductores disponibles.");
        SizeComboBox.setBorder(null);
        getContentPane().add(SizeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 150, 30));

        GenderComboBox.setBackground(new java.awt.Color(204, 255, 255));
        GenderComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Ambos" }));
        GenderComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        GenderComboBox.setBorder(null);
        getContentPane().add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 150, 30));

        DepartmentComboBox.setBackground(new java.awt.Color(204, 255, 255));
        DepartmentComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DepartmentComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        DepartmentComboBox.setBorder(null);
        getContentPane().add(DepartmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 150, 30));

        BrandComboBox.setBackground(new java.awt.Color(204, 255, 255));
        BrandComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BrandComboBox.setToolTipText("Selecciona aquí de entre los modelos disponibles.");
        BrandComboBox.setBorder(null);
        getContentPane().add(BrandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 150, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("CERRAR");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 20));

        ModifyButton.setBackground(new java.awt.Color(204, 255, 255));
        ModifyButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ModifyButton.setText("MODIFICAR");
        ModifyButton.setToolTipText("Click aquí para modificar el bus seleccionado.");
        ModifyButton.setBorder(null);
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 120, 30));

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
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 160, 30));

        AddButton.setBackground(new java.awt.Color(153, 255, 153));
        AddButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AddButton.setText("AGREGAR");
        AddButton.setToolTipText("Click aquí para agregar un nuevo bus con los datos proporcionados.");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 160, 30));

        BrowserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Browser.png"))); // NOI18N
        BrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BrowserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 30, 30));
        getContentPane().add(StockSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 60, 30));
        getContentPane().add(RPSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 70, 30));

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
        getContentPane().add(ChargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 30, 30));

        ProductTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Marca", "Talla/Tamaño", "Para", "Color", "Stock", "Costo Compra", "Precio", "Departamento", "Punto Reorden"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 810, 230));

        BrandLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BrandLabel.setText("Marca:");
        getContentPane().add(BrandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 150, 30));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Registro y administracion de productos");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 30));

        SizeLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SizeLabel.setText("Talla/Tamaño:");
        getContentPane().add(SizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 150, 30));

        DepartmentLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DepartmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepartmentLabel.setText("Departamento:");
        getContentPane().add(DepartmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, 30));

        DescriptionLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescriptionLabel.setText("Descripcion:");
        getContentPane().add(DescriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 30));

        GenderLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        GenderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenderLabel.setText("Genero:");
        getContentPane().add(GenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, 30));

        ColorLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorLabel.setText("Color:");
        getContentPane().add(ColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, 30));

        RPLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        RPLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RPLabel.setText("Punto de reorden:");
        getContentPane().add(RPLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 30));

        StockLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        StockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StockLabel.setText("Stock:");
        getContentPane().add(StockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 60, 30));

        AdqPriceLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AdqPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdqPriceLabel.setText("Costo de adquisicion");
        getContentPane().add(AdqPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 150, 30));

        PriceLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Precio de venta:");
        getContentPane().add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 150, 30));

        ImageLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setText("Imagen:");
        getContentPane().add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 510));

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
            ResultSet rs = st.executeQuery("SELECT * FROM producto;");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveProd"), rs.getString("Descripcion"),
                rs.getString("Marca"), rs.getString("Talla"), rs.getString("Sexo"), rs.getString("Color"), 
                rs.getString("Stock"), rs.getString("CostoAdq"), rs.getString("PrecioVenta"), rs.getString("Departamento"),rs.getString("PuntoReorden")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {
        }

    }
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        int i = ProductTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(ProductTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("UPDATE producto SET Descripcion='"+DescriptionTextField.getText()
                +"', Marca='"+BrandComboBox.getSelectedItem().toString().substring(0,2).trim()
                +"', Talla='"+SizeComboBox.getSelectedItem().toString()+"', Sexo='"+GenderComboBox.getSelectedItem().toString()
                +"', Color='"+ColorTextField.getText()+"', Stock='"+StockSpinner.getValue().toString()
                + "', CostoAdq='"+AdqPriceTextField.getText()+"', PrecioVenta='"+PriceTextField.getText()
                +"', Img='"+ImageTextField.getText()+"', PuntoReorden='"+RPSpinner.getValue().toString()
                +"', Departamento='"+DepartmentComboBox.getSelectedItem().toString().substring(0,2).trim()
                +"' WHERE ClaveProd=" + id);
                ReadDataBase();
                JOptionPane.showMessageDialog(null, "Se Actualizaron los datos del producto", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = ProductTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(ProductTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM producto WHERE ClaveProd=" + id);
                DefaultTableModel table = (DefaultTableModel) ProductTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null, "Se elimino el producto de la lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try { 
            Statement st = con.createStatement();
            if("".equals(DescriptionTextField.getText()) || "".equals(ImageTextField.getText()) || 
            "".equals(AdqPriceTextField.getText()) || "".equals(PriceTextField.getText()) || 
            "".equals(ColorTextField.getText())){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                st.execute("INSERT `producto` (`ClaveProd`, `Descripcion`, `Marca`, `Talla`, `Sexo`, `Color`, `Stock`,"
                +"`CostoAdq`,`PrecioVenta`, `Img`, `PuntoReorden`, `Departamento`)"
                + "VALUES (NULL, '" +DescriptionTextField.getText()+"','"+BrandComboBox.getSelectedItem().toString().substring(0,2).trim()
                +"','"+SizeComboBox.getSelectedItem().toString()+"','"+GenderComboBox.getSelectedItem().toString()
                +"','"+ColorTextField.getText()+"','"+StockSpinner.getValue().toString()+"','"+AdqPriceTextField.getText()
                +"','"+PriceTextField.getText()+"','"+ImageTextField.getText()+"','"+RPSpinner.getValue().toString()+"','"
                +DepartmentComboBox.getSelectedItem().toString().substring(0,2).trim()+"')");
                JOptionPane.showMessageDialog(null, "Se añadio el producto a tu lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
                ReadDataBase();
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ChargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButtonActionPerformed
        int i =ProductTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            int id=Integer.parseInt(ProductTable.getValueAt(i, 0).toString());
            Statement st;
            try {
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM producto WHERE ClaveProd ="+id);
                if(rs.next()){
                    DescriptionTextField.setText(rs.getString("Descripcion"));
                    SizeComboBox.setSelectedItem(rs.getString("Talla"));
                    GenderComboBox.setSelectedItem(rs.getString("Sexo"));
                    ColorTextField.setText(rs.getString("Color"));
                    StockSpinner.setValue(Integer.parseInt(rs.getString("Stock")));
                    RPSpinner.setValue(Integer.parseInt(rs.getString("PuntoReorden")));
                    AdqPriceTextField.setText(rs.getString("CostoAdq"));
                    PriceTextField.setText(rs.getString("PrecioVenta"));
                    ImageTextField.setText(rs.getString("Img"));
                }
            } catch (SQLException ex) {}       
        }
    }//GEN-LAST:event_ChargeButtonActionPerformed

    private void BrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowserButtonActionPerformed
        JFileChooser FChooser = new JFileChooser();
        int result = FChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = FChooser.getSelectedFile();
            ImageTextField.setText(file.getPath());
        }
    }//GEN-LAST:event_BrowserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AdqPriceLabel;
    private javax.swing.JTextField AdqPriceTextField;
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> BrandComboBox;
    private javax.swing.JLabel BrandLabel;
    private javax.swing.JButton BrowserButton;
    private javax.swing.JButton ChargeButton;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JTextField ColorTextField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTextField ImageTextField;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel RPLabel;
    private javax.swing.JSpinner RPSpinner;
    private javax.swing.JComboBox<String> SizeComboBox;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JLabel StockLabel;
    private javax.swing.JSpinner StockSpinner;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
