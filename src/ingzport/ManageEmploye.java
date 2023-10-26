package ingzport;
/**
 *
 * @author Diego Escobedo
 */
import static ingzport.IngZport.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageEmploye extends javax.swing.JFrame {

    boolean View = false;

    public ManageEmploye() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DayBDComboBox = new javax.swing.JComboBox<>();
        RollComboBox = new javax.swing.JComboBox<>();
        MonthBDComboBox = new javax.swing.JComboBox<>();
        EDDayComboBox = new javax.swing.JComboBox<>();
        EDMonthComboBox = new javax.swing.JComboBox<>();
        YearEDComboBox = new javax.swing.JComboBox<>();
        YearBDComboBox = new javax.swing.JComboBox<>();
        NStreetSpinner = new javax.swing.JSpinner();
        ViewButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        ChargeButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        LastNameTextField = new javax.swing.JTextField();
        SalaryTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        UserNameTextField = new javax.swing.JTextField();
        StreetTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        Pwd2PasswordField = new javax.swing.JPasswordField();
        Pwd1PasswordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeesTable = new javax.swing.JTable();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        BDLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        SalaryLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        RollLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        Pwd2Label = new javax.swing.JLabel();
        Pwd1Label = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        TittleLabel1 = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        NStreetLabel = new javax.swing.JLabel();
        EDLabel = new javax.swing.JLabel();
        TittleLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DayBDComboBox.setBackground(new java.awt.Color(204, 255, 255));
        DayBDComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DayBDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DayBDComboBox.setToolTipText("Selecciona aquí de entre los modelos disponibles.");
        DayBDComboBox.setBorder(null);
        getContentPane().add(DayBDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 70, 30));

        RollComboBox.setBackground(new java.awt.Color(204, 255, 255));
        RollComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        RollComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "VENDEDOR" }));
        RollComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        RollComboBox.setBorder(null);
        getContentPane().add(RollComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 200, 30));

        MonthBDComboBox.setBackground(new java.awt.Color(204, 255, 255));
        MonthBDComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        MonthBDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        MonthBDComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        MonthBDComboBox.setBorder(null);
        getContentPane().add(MonthBDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 70, 30));

        EDDayComboBox.setBackground(new java.awt.Color(204, 255, 255));
        EDDayComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EDDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        EDDayComboBox.setToolTipText("Selecciona aquí de entre los modelos disponibles.");
        EDDayComboBox.setBorder(null);
        getContentPane().add(EDDayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 70, 30));

        EDMonthComboBox.setBackground(new java.awt.Color(204, 255, 255));
        EDMonthComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EDMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        EDMonthComboBox.setToolTipText("Selecciona aquí de entre los propietarios disponibles.");
        EDMonthComboBox.setBorder(null);
        getContentPane().add(EDMonthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 70, 30));

        YearEDComboBox.setBackground(new java.awt.Color(204, 255, 255));
        YearEDComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        YearEDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        YearEDComboBox.setToolTipText("Selecciona aquí de entre los conductores disponibles.");
        YearEDComboBox.setBorder(null);
        getContentPane().add(YearEDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 70, 30));

        YearBDComboBox.setBackground(new java.awt.Color(204, 255, 255));
        YearBDComboBox.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        YearBDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        YearBDComboBox.setToolTipText("Selecciona aquí de entre los conductores disponibles.");
        YearBDComboBox.setBorder(null);
        getContentPane().add(YearBDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 70, 30));
        getContentPane().add(NStreetSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 150, 30));

        ViewButton.setBackground(new java.awt.Color(204, 255, 255));
        ViewButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        ViewButton.setToolTipText("Click aquí para modificar el bus seleccionado.");
        ViewButton.setBorder(null);
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 50, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("X");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 20, 20));

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
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 160, 30));

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
        getContentPane().add(ModifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 120, 30));

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
        getContentPane().add(ChargeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 30, 30));

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

        LastNameTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        LastNameTextField.setToolTipText("Escribe aquí la matricula del bus.");
        LastNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 200, 30));

        SalaryTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SalaryTextField.setToolTipText("Escribe aquí la matricula del bus.");
        SalaryTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(SalaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, 30));

        NameTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameTextField.setToolTipText("Escribe aquí la matricula del bus.");
        NameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, 30));

        PhoneTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PhoneTextField.setToolTipText("Escribe aquí la matricula del bus.");
        PhoneTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 150, 30));

        EmailTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EmailTextField.setToolTipText("Escribe aquí la matricula del bus.");
        EmailTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 150, 30));

        UserNameTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        UserNameTextField.setToolTipText("Escribe aquí la matricula del bus.");
        UserNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 200, 30));

        StreetTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        StreetTextField.setToolTipText("Escribe aquí la matricula del bus.");
        StreetTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(StreetTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 200, 30));

        CityTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CityTextField.setToolTipText("Escribe aquí la matricula del bus.");
        CityTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 200, 30));
        getContentPane().add(Pwd2PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 150, 30));
        getContentPane().add(Pwd1PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 150, 30));

        EmployeesTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EmployeesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Telefono", "Email", "Fecha Nacimiento", "Fecha Contratacion", "Puesto", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmployeesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 810, 230));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoBar.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 50));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Registro y administracion de Trabajadores");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 30));

        BDLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BDLabel.setText("Fecha de nacimiento:");
        getContentPane().add(BDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 210, 30));

        EmailLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 150, 30));

        NameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nombre:");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 30));

        SalaryLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SalaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalaryLabel.setText("Salario:");
        getContentPane().add(SalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 30));

        LastNameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        LastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastNameLabel.setText("Apellidos");
        getContentPane().add(LastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 30));

        RollLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        RollLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RollLabel.setText("Puesto:");
        getContentPane().add(RollLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, 30));

        PhoneLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PhoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneLabel.setText("Telefono:");
        getContentPane().add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 150, 30));

        Pwd2Label.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        Pwd2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pwd2Label.setText("Confirmar Contraseña:");
        getContentPane().add(Pwd2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 150, 30));

        Pwd1Label.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        Pwd1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pwd1Label.setText("Contraseña:");
        getContentPane().add(Pwd1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 150, 30));

        UserNameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        UserNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameLabel.setText("Nombre de Usuario:");
        getContentPane().add(UserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 30));

        TittleLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel1.setText("Ingresa el Nombre de usuario y la contraseña con la que ingresaras al sistema");
        getContentPane().add(TittleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 660, 30));

        StreetLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        StreetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StreetLabel.setText("Calle:");
        getContentPane().add(StreetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 200, 30));

        CityLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityLabel.setText("Ciudad:");
        getContentPane().add(CityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 200, 30));

        NStreetLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NStreetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NStreetLabel.setText("Numero:");
        getContentPane().add(NStreetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 150, 30));

        EDLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        EDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EDLabel.setText("Fecha de ingreso:");
        getContentPane().add(EDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 210, 30));

        TittleLabel2.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        TittleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel2.setText("(Toma en cuanta que estos 2 apartados ya no se pueden modificar)");
        getContentPane().add(TittleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 660, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ReadDataBase() {
        int i = 0;
        int rn = EmployeesTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) EmployeesTable.getModel();
        while (i < rn) {
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleado;");
            while (rs.next()) {
                String Row[] = new String[]{rs.getString("ClaveEmp"), rs.getString("Nombre")+" "+rs.getString("Apellidos"),
                rs.getString("Calle")+" "+rs.getString("NumeroCasa")+", "+rs.getString("Ciudad"), rs.getString("Telefono"),
                rs.getString("Email"),rs.getString("FechaNac"), rs.getString("FechaContratacion"),rs.getString("Puesto"), rs.getString("Salario")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        if (View == false) {
            Pwd1PasswordField.setEchoChar((char) 0);
            Pwd2PasswordField.setEchoChar((char) 0);
            View = true;
            ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NoViewIcon.png")));
        } else if (View == true) {
            Pwd1PasswordField.setEchoChar((char) '•');
            Pwd2PasswordField.setEchoChar((char) '•');
            ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png")));
            View = false;
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = EmployeesTable.getSelectedRow();
        if (i == -1)
        JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(EmployeesTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("DELETE FROM usuario WHERE ClaveEmp=" + id);
                st.executeUpdate("DELETE FROM empleado WHERE ClaveEmp=" + id);
                DefaultTableModel table = (DefaultTableModel) EmployeesTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null, "Se elimino el empleado de toda la app", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El dato que quieres eliminar esta ligado a otro registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChargeButtonActionPerformed
        int i =EmployeesTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            int id=Integer.parseInt(EmployeesTable.getValueAt(i, 0).toString());
            Statement st;
            try {
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM empleado WHERE ClaveEmp ="+id);
                if(rs.next()){
                    NameTextField.setText(rs.getString("Nombre"));
                    LastNameTextField.setText(rs.getString("Apellidos"));
                    PhoneTextField.setText(rs.getString("Telefono"));
                    EmailTextField.setText(rs.getString("Email"));
                    StreetTextField.setText(rs.getString("Calle"));
                    NStreetSpinner.setValue(Integer.parseInt(rs.getString("NumeroCasa")));
                    CityTextField.setText(rs.getString("Ciudad"));
                    RollComboBox.setSelectedItem(rs.getString("Puesto"));
                    SalaryTextField.setText(rs.getString("Salario"));
                    String BD=rs.getString("FechaNac"), ED=rs.getString("FechaContratacion");
                    YearBDComboBox.setSelectedItem(BD.substring(0, 4));
                    MonthBDComboBox.setSelectedItem(BD.substring(5, 7));
                    DayBDComboBox.setSelectedItem(BD.substring(8, 10));
                    YearEDComboBox.setSelectedItem(ED.substring(0, 4));
                    EDMonthComboBox.setSelectedItem(ED.substring(5, 7));
                    EDDayComboBox.setSelectedItem(ED.substring(8, 10));   
                }
            } catch (SQLException ex) {}       
        }
    }//GEN-LAST:event_ChargeButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try { 
            Statement st = con.createStatement();
            if("".equals(SalaryTextField.getText()) || "".equals(NameTextField.getText()) || 
            "".equals(LastNameTextField.getText()) || "".equals(EmailTextField.getText()) || 
            "".equals(PhoneTextField.getText()) || "".equals(CityTextField.getText()) || 
            "".equals(CityTextField.getText())|| "".equals(UserNameTextField.getText())||
            "".equals(String.valueOf(Pwd1PasswordField.getPassword()))){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            }else if(!String.valueOf(Pwd1PasswordField.getPassword()).equals(String.valueOf(Pwd2PasswordField.getPassword()))){
                JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                st.execute("INSERT INTO `empleado` (`ClaveEmp`, `Nombre`, `Apellidos`, `Calle`, `NumeroCasa`, `Ciudad`,"
                + " `Telefono`, `Email`, `FechaNac`, `FechaContratacion`, `Puesto`, `Salario`)"
                + "VALUES (NULL, '" +NameTextField.getText()+"','"+LastNameTextField.getText()+"','"+StreetTextField.getText()
                +"','"+NStreetSpinner.getValue().toString()+"','"+CityTextField.getText()+"','"+PhoneTextField.getText()
                +"','"+EmailTextField.getText()+"','"+YearBDComboBox.getSelectedItem().toString()+"-"
                +MonthBDComboBox.getSelectedItem().toString()+"-"+DayBDComboBox.getSelectedItem().toString()+"','"
                +YearEDComboBox.getSelectedItem().toString()+"-"+EDMonthComboBox.getSelectedItem().toString()+"-"
                +EDDayComboBox.getSelectedItem().toString()+"','"+RollComboBox.getSelectedItem().toString()
                +"','"+SalaryTextField.getText()+"')");
                
                int id=0;
                st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT ClaveEmp FROM empleado WHERE Nombre ='"+NameTextField.getText()+"';");
                if(rs.next()) id = Integer.parseInt(rs.getString("ClaveEmp"));
                
                st.execute("INSERT INTO `usuario` (`NombreUsuario`, `Contraseña`, `Tipo`, `ClaveEmp`) "
                +"VALUES ('" +UserNameTextField.getText()+"', aes_encrypt('"
                +String.valueOf(Pwd1PasswordField.getPassword())+"','AES'),'"+RollComboBox.getSelectedItem().toString()
                +"','"+String.valueOf(id)+"')");
                JOptionPane.showMessageDialog(null, "Se añadio el cliente a tu lista", "Listo", JOptionPane.INFORMATION_MESSAGE);
                ReadDataBase();
            }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        int i = EmployeesTable.getSelectedRow();
        if (i == -1)
            JOptionPane.showMessageDialog(null, "No has seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                int id = Integer.parseInt(EmployeesTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();
                st.executeUpdate("UPDATE empleado SET Nombre='" + NameTextField.getText()+"', Apellidos='"+LastNameTextField.getText()
                +"', Calle='"+ StreetTextField.getText() + "', NumeroCasa='" +NStreetSpinner.getValue().toString()
                + "', Ciudad='"+ CityTextField.getText() + "', Telefono='"+PhoneTextField.getText()
                +"', Email='"+EmailTextField.getText()+"', FechaNac='"+YearBDComboBox.getSelectedItem().toString()+"-"
                +MonthBDComboBox.getSelectedItem().toString()+"-"+DayBDComboBox.getSelectedItem().toString()
                +"', FechaContratacion='"+YearEDComboBox.getSelectedItem().toString()+"-"+EDMonthComboBox.getSelectedItem().toString()+"-"
                +EDDayComboBox.getSelectedItem().toString()+ "', Puesto='"+RollComboBox.getSelectedItem().toString()
                + "', Salario='"+SalaryTextField.getText()+"' WHERE ClaveEmp=" + id);
                ReadDataBase();
                
                JOptionPane.showMessageDialog(null, "Se Actualizaron los datos del cliente", "Listo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {}
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmploye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmploye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel BDLabel;
    private javax.swing.JLabel Background;
    private javax.swing.JButton ChargeButton;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JComboBox<String> DayBDComboBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> EDDayComboBox;
    private javax.swing.JLabel EDLabel;
    private javax.swing.JComboBox<String> EDMonthComboBox;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTable EmployeesTable;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JComboBox<String> MonthBDComboBox;
    private javax.swing.JLabel NStreetLabel;
    private javax.swing.JSpinner NStreetSpinner;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel Pwd1Label;
    private javax.swing.JPasswordField Pwd1PasswordField;
    private javax.swing.JLabel Pwd2Label;
    private javax.swing.JPasswordField Pwd2PasswordField;
    private javax.swing.JComboBox<String> RollComboBox;
    private javax.swing.JLabel RollLabel;
    private javax.swing.JLabel SalaryLabel;
    private javax.swing.JTextField SalaryTextField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JTextField StreetTextField;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel TittleLabel1;
    private javax.swing.JLabel TittleLabel2;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JButton ViewButton;
    private javax.swing.JComboBox<String> YearBDComboBox;
    private javax.swing.JComboBox<String> YearEDComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
