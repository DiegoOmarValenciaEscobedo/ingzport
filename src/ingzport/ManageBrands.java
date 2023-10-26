package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageBrands extends javax.swing.JFrame {

    public ManageBrands() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DescriptionTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ChargeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BrandTable = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Admin de autobuses");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DescriptionTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DescriptionTextField.setToolTipText("Escribe aquí la matricula del bus.");
        DescriptionTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(DescriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 310, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 20, 20));

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
        getContentPane().add(ModifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 190, 30));

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
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 230, 30));

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
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 230, 30));

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
        getContentPane().add(ChargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 30, 30));

        BrandTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BrandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BrandTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 230));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 50));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Registro y administracion de marcas");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 330, 30));

        DescriptionLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DescriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescriptionLabel.setText("Nombre de marca:");
        getContentPane().add(DescriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 310, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ReadDataBase() {
        int i = 0;
        int rn = BrandTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) BrandTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM marca;");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveMarca"), rs.getString("Nombre")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        int i = BrandTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(BrandTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("UPDATE marca SET Nombre='"+DescriptionTextField.getText()+"' WHERE ClaveMarca=" + id);
                ReadDataBase();
                JOptionPane.showMessageDialog(null, "Se Actualizaron los datos de marca", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = BrandTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(BrandTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM marca WHERE ClaveMarca=" + id);
                DefaultTableModel table = (DefaultTableModel) BrandTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null, "Se elimino la marca de la lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try { 
            Statement st = con.createStatement();
            if("".equals(DescriptionTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                st.execute("INSERT INTO `marca` (`ClaveMarca`,`Nombre`)"+ "VALUES (NULL,'" +DescriptionTextField.getText()+ "')");
                JOptionPane.showMessageDialog(null, "Ahora esta marca esta en tu lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
                ReadDataBase();
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ChargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButtonActionPerformed
        int i = BrandTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            DescriptionTextField.setText(BrandTable.getValueAt(i, 1).toString());
                
        }
    }//GEN-LAST:event_ChargeButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBrands().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel Background;
    private javax.swing.JTable BrandTable;
    private javax.swing.JButton ChargeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
