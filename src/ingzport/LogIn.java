package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import javax.swing.JOptionPane;
import java.sql.*;
import org.jvnet.substance.SubstanceLookAndFeel;

public class LogIn extends javax.swing.JFrame {

    boolean View = false, exist = false;

    public LogIn() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        ViewButton = new javax.swing.JToggleButton();
        ExitButton = new javax.swing.JButton();
        GetInButton = new javax.swing.JButton();
        UsernameTextField = new javax.swing.JTextField();
        LogInPasswordField = new javax.swing.JPasswordField();
        AdminRadioButton = new javax.swing.JRadioButton();
        SellerRadioButton = new javax.swing.JRadioButton();
        EnterpriceIcon = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: LogIn");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        ViewButton.setToolTipText("Clíck aqui para mostrar tu contraseña legible.");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, 20));

        ExitButton.setBackground(new java.awt.Color(153, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Clíck aqui para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 20, 20));

        GetInButton.setBackground(new java.awt.Color(102, 255, 102));
        GetInButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        GetInButton.setText("INGRESAR");
        GetInButton.setToolTipText("Clíck aqui para ingresar con los datos proporcionados.");
        GetInButton.setBorder(null);
        GetInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GetInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 30));

        UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameTextField.setToolTipText("Escribe aquí tu nombre del sistema.");
        UsernameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        UsernameTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        UsernameTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, -1));

        LogInPasswordField.setToolTipText("Escribe aquí tu contraseña.");
        LogInPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        getContentPane().add(LogInPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 20));

        AdminRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(AdminRadioButton);
        AdminRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AdminRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        AdminRadioButton.setText("Administrador");
        AdminRadioButton.setToolTipText("Clíck aqui si eres administrador.");
        AdminRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(AdminRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 110, -1));

        SellerRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup.add(SellerRadioButton);
        SellerRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SellerRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        SellerRadioButton.setSelected(true);
        SellerRadioButton.setText("Vendedor");
        SellerRadioButton.setToolTipText("Clíck aqui si eres cliente.");
        SellerRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SellerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 100, -1));

        EnterpriceIcon.setBackground(new java.awt.Color(0, 0, 0));
        EnterpriceIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterpriceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        getContentPane().add(EnterpriceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 60));

        PasswordLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Contraseña:");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 20));

        UsernameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Nombre:");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 20));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Accede a tu cuenta");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        try {
            System.exit(0);
            con.close();
        } catch (SQLException ex) {}
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void GetInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetInButtonActionPerformed
        try {
            Statement st = con.createStatement();
            ResultSet rs = null;

            if (SellerRadioButton.isSelected()) rs = st.executeQuery("SELECT NombreUsuario,"
                +" aes_decrypt(Contraseña,'AES') pwd, Tipo, ClaveEmp FROM usuario WHERE Tipo ='VENDEDOR'");
            else if (AdminRadioButton.isSelected())rs = st.executeQuery("SELECT NombreUsuario,"
                +" aes_decrypt(Contraseña,'AES') pwd, Tipo, ClaveEmp FROM usuario WHERE Tipo ='ADMINISTRADOR'");
            
            while (rs.next()) {
                if (rs.getString("NombreUsuario").equalsIgnoreCase(UsernameTextField.getText()) 
                && rs.getString("pwd").equals(String.valueOf(LogInPasswordField.getPassword()))) {
                    exist = true;                    
                    System.out.println("Datos Correctos");
                    break;
                }
            }
            
            if (exist) {
                this.dispose();
                if (rs.getString("Tipo").equalsIgnoreCase("ADMINISTRADOR")) {
                    MainMenuAdmin A = new MainMenuAdmin(Integer.parseInt(rs.getString("ClaveEmp")));
                } else{
                    MainMenuSeller B = new MainMenuSeller(Integer.parseInt(rs.getString("ClaveEmp")));
                } 
            } else {
                JOptionPane.showMessageDialog(null, "El usuario y/o contraseña\nson incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_GetInButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        if (View == false) {
            LogInPasswordField.setEchoChar((char) 0);
            View = true;
            ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NoViewIcon.png")));
        } else if (View == true) {
            LogInPasswordField.setEchoChar((char) '•');
            ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png")));
            View = false;
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistSilverSkin");
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadioButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel EnterpriceIcon;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton GetInButton;
    private javax.swing.JPasswordField LogInPasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JRadioButton SellerRadioButton;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JToggleButton ViewButton;
    private javax.swing.ButtonGroup buttonGroup;
    // End of variables declaration//GEN-END:variables
}
