package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageClients extends javax.swing.JFrame {

    public ManageClients() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RFCTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        SuburbTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ChargeButton = new javax.swing.JButton();
        NStreetSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientsTable = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        RFCLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        SuburbLabel = new javax.swing.JLabel();
        NStreetLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Admin de autobuses");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RFCTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        RFCTextField.setToolTipText("Escribe aquí la matricula del bus.");
        RFCTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(RFCTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, 30));

        LastNameTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        LastNameTextField.setToolTipText("Escribe aquí la matricula del bus.");
        LastNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 180, 30));

        NameTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameTextField.setToolTipText("Escribe aquí la matricula del bus.");
        NameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 210, 30));

        EmailTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EmailTextField.setToolTipText("Escribe aquí la matricula del bus.");
        EmailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, 30));

        CityTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CityTextField.setToolTipText("Escribe aquí la matricula del bus.");
        CityTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 150, 30));

        PhoneTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PhoneTextField.setToolTipText("Escribe aquí la matricula del bus.");
        PhoneTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 210, 30));

        SuburbTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SuburbTextField.setToolTipText("Escribe aquí la matricula del bus.");
        SuburbTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        SuburbTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuburbTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(SuburbTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 20, 20));

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
        getContentPane().add(ModifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 140, 30));

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
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 180, 30));

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
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 180, 30));

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
        getContentPane().add(ChargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 30, 30));
        getContentPane().add(NStreetSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 50, 30));

        ClientsTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ClientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "Nombres", "Telefono", "Email", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ClientsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 620, 230));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Registro y administracion de clientes");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 30));

        RFCLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        RFCLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RFCLabel.setText("RFC:");
        getContentPane().add(RFCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 30));

        NameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nombre(s):");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 210, 30));

        LastNameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        LastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastNameLabel.setText("Apellidos:");
        getContentPane().add(LastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 180, 30));

        EmailLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 30));

        PhoneLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneLabel.setText("Telefono");
        getContentPane().add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, 30));

        SuburbLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SuburbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SuburbLabel.setText("Calle:");
        getContentPane().add(SuburbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 30));

        NStreetLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NStreetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NStreetLabel.setText("Numero:");
        getContentPane().add(NStreetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 100, 30));

        CityLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityLabel.setText("Ciudad:");
        getContentPane().add(CityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ReadDataBase() {
        int i = 0;
        int rn = ClientsTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) ClientsTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente WHERE Nombre !='Generico';");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("RFC"), rs.getString("Nombre")+" "+rs.getString("Apellido"),
                rs.getString("Telefono"), rs.getString("Email"), rs.getString("Calle")+" "+rs.getString("NumeroCasa")+", "+rs.getString("Ciudad")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        int i = ClientsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                String RFC = ClientsTable.getValueAt(i, 0).toString();
                Statement st;
                st = con.createStatement();
                st.executeUpdate("UPDATE cliente SET RFC='" + RFCTextField.getText()+"', Nombre='"+NameTextField.getText()+"', Apellido='"
                + LastNameTextField.getText() + "', Telefono='" + PhoneTextField.getText() + "', Email='"
                + EmailTextField.getText() + "', Calle='"+SuburbTextField.getText()+"', NumeroCasa='"
                +NStreetSpinner.getValue().toString()+"', Ciudad='"+CityTextField.getText()+"' WHERE RFC='" + RFC+"';");
                ReadDataBase();
                JOptionPane.showMessageDialog(null, "Se Actualizaron los datos del cliente", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {}
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = ClientsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                String RFC = ClientsTable.getValueAt(i, 0).toString();
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM cliente WHERE RFC='"+RFC+"';");
                DefaultTableModel table = (DefaultTableModel) ClientsTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null, "Se elimino el cliente de la lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try { 
            Statement st = con.createStatement();
            if("".equals(RFCTextField.getText()) || "".equals(NameTextField.getText()) || 
            "".equals(LastNameTextField.getText()) || "".equals(EmailTextField.getText()) || 
            "".equals(PhoneTextField.getText()) || "".equals(SuburbTextField.getText()) || "".equals(CityTextField.getText())){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                st.execute("INSERT INTO `cliente` (`RFC`,`Nombre`,`Apellido`,`Telefono`,`Email`,`Calle`,`NumeroCasa`,`Ciudad`)"
                + "VALUES ('" +RFCTextField.getText()+"','"+NameTextField.getText()+"','"+LastNameTextField.getText()
                +"','"+PhoneTextField.getText()+"','"+EmailTextField.getText()+"','"+SuburbTextField.getText()
                +"','"+NStreetSpinner.getValue().toString()+"','"+CityTextField.getText()+"')");
                JOptionPane.showMessageDialog(null, "Se añadio el cliente a tu lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
                ReadDataBase();
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ChargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButtonActionPerformed
        int i =ClientsTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            RFCTextField.setText(ClientsTable.getValueAt(i, 0).toString());
            Statement st;
            try {
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM cliente WHERE RFC ='"+RFCTextField.getText()+"';");
                if(rs.next()){
                    NameTextField.setText(rs.getString("Nombre"));
                    LastNameTextField.setText(rs.getString("Apellido"));
                    PhoneTextField.setText(rs.getString("Telefono"));
                    EmailTextField.setText(rs.getString("Email"));
                    SuburbTextField.setText(rs.getString("Calle"));
                    NStreetSpinner.setValue(Integer.parseInt(rs.getString("NumeroCasa")));
                    CityTextField.setText(rs.getString("Ciudad"));
                }
            } catch (SQLException ex) {}   
        }
    }//GEN-LAST:event_ChargeButtonActionPerformed

    private void SuburbTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuburbTextFieldActionPerformed

    }//GEN-LAST:event_SuburbTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton ChargeButton;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTable ClientsTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel NStreetLabel;
    private javax.swing.JSpinner NStreetSpinner;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel RFCLabel;
    private javax.swing.JTextField RFCTextField;
    private javax.swing.JLabel SuburbLabel;
    private javax.swing.JTextField SuburbTextField;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
