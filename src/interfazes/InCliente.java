/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazes;

import clases.ConexionBs;
import java.awt.Color;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ADMIN
 */
public class InCliente extends javax.swing.JFrame {

    public String idcliii;
    TableRowSorter trs;
    //DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

    };

    /**
     * Creates new form InCliente
     */
    public InCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tpcocli = new TextPrompt("ID", tcodcli);
        TextPrompt tpncli = new TextPrompt("Nombres", tncli);
        TextPrompt tpacli = new TextPrompt("Apellidos", tapcli);
        TextPrompt tpdicli = new TextPrompt("Direccion", tdicli);
        TextPrompt tptelecli = new TextPrompt("0000-0000", tntcli);
        TextPrompt tpcorcli = new TextPrompt("Correo", tcorrecli);
        TextPrompt tpcons = new TextPrompt("Id a buscar", tcons);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control e informacion de clientes - Sistema SME - Sesion de " + InicioSesion.usuario);
       lcons.setVisible(false);
       tcons.setVisible(false);
       bbuscar.setVisible(false);
        try {
            Connection cn = ConexionBs.conectarb();
            PreparedStatement pst = cn.prepareStatement(
                    "select id, nombre, apellido, direccion, telefono, email from cliente");
            ResultSet rs = pst.executeQuery();
            tabrecliente = new JTable(model);
            jScrollPane1.setViewportView(tabrecliente);
            model.addColumn(" ");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Direccion");
            model.addColumn("Telefono ");
            model.addColumn("Correo");

            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla ");
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
        }
        tabrecliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = tabrecliente.rowAtPoint(e.getPoint());
                tcodcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 0)));
                idcliii = tcodcli.getText().trim();
                tncli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 1)));
                tapcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 2)));
                tdicli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 3)));
                tntcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 4)));
                tcorrecli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 5)));
                // int columna_point = 0;

                /*if (fila_point > -1) {
                    idcliii = (String) model.getValueAt(fila_point, columna_point);

                    try {
                        Connection cn = ConexionBs.conectarb();

                        PreparedStatement pst = cn.prepareStatement("select * from cliente where id = ?");
                        pst.setString(1, idcliii);
                        ResultSet rs = pst.executeQuery();
                        if (rs.next()) {

                            tcodcli.setText(rs.getString("id"));
                            tncli.setText(rs.getString("nombre"));
                            tapcli.setText(rs.getString("apellido"));
                            tdicli.setText(rs.getString("direccion"));
                            tntcli.setText(rs.getString("telefono"));
                            tcorrecli.setText(rs.getString("email"));

                        } else {
                            tcons.setBackground(Color.red);
                            JOptionPane.showMessageDialog(null, "Id del cliente inexistente");
                            tcons.setBackground(Color.WHITE);
                        }
                    } catch (Exception ev) {
                        System.err.println("Error en el boton buscar " + e);
                        JOptionPane.showMessageDialog(null, "Error al buscar, contacte al personal administrativo");

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "naaaa");
                }*/
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titcli = new javax.swing.JLabel();
        tncli = new javax.swing.JTextField();
        tdicli = new javax.swing.JTextField();
        tntcli = new javax.swing.JTextField();
        tcorrecli = new javax.swing.JTextField();
        lccli = new javax.swing.JLabel();
        bregistr = new javax.swing.JButton();
        lncli = new javax.swing.JLabel();
        ldcli = new javax.swing.JLabel();
        lntecli = new javax.swing.JLabel();
        lemailpro = new javax.swing.JLabel();
        tcodcli = new javax.swing.JTextField();
        lapcli = new javax.swing.JLabel();
        tapcli = new javax.swing.JTextField();
        bmodifi = new javax.swing.JButton();
        belimin = new javax.swing.JButton();
        tcons = new javax.swing.JTextField();
        lcons = new javax.swing.JLabel();
        bbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabrecliente = new javax.swing.JTable();
        lfbb = new javax.swing.JLabel();
        tff = new javax.swing.JTextField();
        bll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titcli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titcli.setText("Ingresar datos del cliente");

        tncli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tncli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tncliActionPerformed(evt);
            }
        });

        tdicli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tdicli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdicliActionPerformed(evt);
            }
        });

        tntcli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tntcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tntcliActionPerformed(evt);
            }
        });

        tcorrecli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcorrecli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcorrecliActionPerformed(evt);
            }
        });

        lccli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lccli.setText("Ingresa el id:");

        bregistr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bregistr.setText("Registrar");
        bregistr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregistrActionPerformed(evt);
            }
        });

        lncli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lncli.setText("Ingresa los nombres :");

        ldcli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ldcli.setText("Ingresa la direccion:");

        lntecli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lntecli.setText("Ingresa el numero de telefono:");

        lemailpro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lemailpro.setText("Ingresa el correo electronico:");

        tcodcli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcodcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcodcliActionPerformed(evt);
            }
        });

        lapcli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lapcli.setText("Ingresa los apellidos");

        tapcli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tapcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapcliActionPerformed(evt);
            }
        });

        bmodifi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bmodifi.setText("Actualizar");
        bmodifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodifiActionPerformed(evt);
            }
        });

        belimin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        belimin.setText("Eliminar");
        belimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminActionPerformed(evt);
            }
        });

        tcons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcons.setEnabled(false);

        lcons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lcons.setText("ID a consultar:");
        lcons.setEnabled(false);

        bbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bbuscar.setText("Buscar");
        bbuscar.setEnabled(false);
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });

        tabrecliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabrecliente);

        lfbb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lfbb.setText("Filtro de busqueda:");

        tff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffKeyTyped(evt);
            }
        });

        bll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bll.setText("Limpiar");
        bll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcodcli, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lccli, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lncli)
                            .addComponent(tncli, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lapcli)
                            .addComponent(tapcli, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ldcli, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(lntecli, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tdicli, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tntcli, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lemailpro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tcorrecli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lcons, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tcons, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bregistr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bmodifi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(belimin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(lfbb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tff, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(bll, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(titcli, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titcli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lccli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lncli, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lapcli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tcodcli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tapcli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tncli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldcli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lntecli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdicli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tntcli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lemailpro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcorrecli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(bregistr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bmodifi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcons, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcons, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(belimin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lfbb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tncliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tncliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tncliActionPerformed

    private void tdicliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdicliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdicliActionPerformed

    private void bregistrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregistrActionPerformed
        String idc, nombre, correo, apellido, telefono, direccion;
        int valcampos = 0;
        idc = tcodcli.getText().trim();
        nombre = tncli.getText().trim();
        correo = tcorrecli.getText().trim();
        apellido = tapcli.getText().trim();
        telefono = tntcli.getText().trim();
        direccion = tdicli.getText().trim();
        if (idc.equals("")) {
            tcodcli.setBackground(Color.red);
            valcampos++;
        }
        if (nombre.equals("")) {
            tncli.setBackground(Color.red);
            valcampos++;
        }
        if (correo.equals("")) {
            tcorrecli.setBackground(Color.red);
            valcampos++;
        }
        if (apellido.equals("")) {
            tapcli.setBackground(Color.red);
            valcampos++;
        }
        if (telefono.equals("")) {
            tntcli.setBackground(Color.red);
            valcampos++;
        }
        if (direccion.equals("")) {
            tdicli.setBackground(Color.red);
            valcampos++;
        }
        try {
            Connection cn2 = ConexionBs.conectarb();
            PreparedStatement pst2 = cn2.prepareStatement("select id from cliente where id = '" + idc + "'");
            ResultSet rs = pst2.executeQuery();
            if (rs.next()) {
                tcodcli.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Id de cliente no disponible");
                tcodcli.setBackground(Color.WHITE);
                tncli.setBackground(Color.WHITE);
                tcorrecli.setBackground(Color.WHITE);
                tntcli.setBackground(Color.WHITE);
                tapcli.setBackground(Color.WHITE);
                tdicli.setBackground(Color.WHITE);
                cn2.close();
            } else {
                cn2.close();
                if (valcampos == 0) {
                    try {
                        Connection cn = ConexionBs.conectarb();
                        PreparedStatement pst = cn.prepareStatement(
                                "insert into cliente values(?,?,?,?,?,?)");

                        pst.setString(1, tcodcli.getText().trim());
                        pst.setString(2, tncli.getText().trim());
                        pst.setString(3, tapcli.getText().trim());
                        pst.setString(4, tdicli.getText().trim());
                        pst.setString(5, tntcli.getText().trim());
                        pst.setString(6, tcorrecli.getText().trim());
                        pst.executeUpdate();

                        tcodcli.setText("");
                        tncli.setText("");
                        tapcli.setText("");
                        tdicli.setText("");
                        tntcli.setText("");
                        tcorrecli.setText("");
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                        cn.close();
                        model.setRowCount(0);
                        model.setColumnCount(0);
                        try {
                            Connection cnn = ConexionBs.conectarb();
                            PreparedStatement pstt = cnn.prepareStatement(
                                    "select id, nombre, apellido, direccion, telefono, email from cliente");
                            ResultSet rss = pstt.executeQuery();
                            tabrecliente = new JTable(model);
                            jScrollPane1.setViewportView(tabrecliente);
                            model.addColumn(" ");
                            model.addColumn("Nombre");
                            model.addColumn("Apellido");
                            model.addColumn("Direccion");
                            model.addColumn("Telefono ");
                            model.addColumn("Correo");

                            while (rss.next()) {
                                Object[] fila = new Object[6];
                                for (int i = 0; i < 6; i++) {
                                    fila[i] = rss.getObject(i + 1);
                                }
                                model.addRow(fila);
                            }
                            cnn.close();

                        } catch (SQLException e) {
                            System.err.println("Error al llenar tabla ");
                            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                        }
                         tabrecliente.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                                int fila_point = tabrecliente.rowAtPoint(e.getPoint());
                                tcodcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 0)));
                                idcliii = tcodcli.getText().trim();
                                tncli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 1)));
                                tapcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 2)));
                                tdicli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 3)));
                                tntcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 4)));
                                tcorrecli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 5)));
                            }
                        });
                    } catch (Exception e) {
                        System.out.println("Error en el boton registrar" + e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                    tcodcli.setBackground(Color.WHITE);
                    tncli.setBackground(Color.WHITE);
                    tcorrecli.setBackground(Color.WHITE);
                    tntcli.setBackground(Color.WHITE);
                    tapcli.setBackground(Color.WHITE);
                    tdicli.setBackground(Color.WHITE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en validar nameuser");
            JOptionPane.showMessageDialog(null, "Error al validar, cantacte al administrador");
        }


    }//GEN-LAST:event_bregistrActionPerformed

    private void tcodcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcodcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcodcliActionPerformed

    private void tapcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tapcliActionPerformed

    private void tntcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tntcliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tntcliActionPerformed

    private void bmodifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodifiActionPerformed
        String idc, nombre, correo, apellido, telefono, direccion;
        int valcampos = 0;
        idc = tcodcli.getText().trim();
        nombre = tncli.getText().trim();
        correo = tcorrecli.getText().trim();
        apellido = tapcli.getText().trim();
        telefono = tntcli.getText().trim();
        direccion = tdicli.getText().trim();
        if (idc.equals("")) {
            tcodcli.setBackground(Color.red);
            valcampos++;
        }
        if (nombre.equals("")) {
            tncli.setBackground(Color.red);
            valcampos++;
        }
        if (correo.equals("")) {
            tcorrecli.setBackground(Color.red);
            valcampos++;
        }
        if (apellido.equals("")) {
            tapcli.setBackground(Color.red);
            valcampos++;
        }
        if (telefono.equals("")) {
            tntcli.setBackground(Color.red);
            valcampos++;
        }
        if (direccion.equals("")) {
            tdicli.setBackground(Color.red);
            valcampos++;
        }
        if (valcampos == 0) {
           // String idd = tcons.getText().trim();
            /* if (idd.equals("")) {
                tcons.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "No es posible modificar porque no has ingresado una busqueda");
                tcons.setBackground(Color.WHITE);
            } else {*/
 try {
                Connection cn3 = ConexionBs.conectarb();

                PreparedStatement pst3 = cn3.prepareStatement("select * from cliente where id = ?");
                pst3.setString(1, idcliii);
                ResultSet rs2 = pst3.executeQuery();
                if (rs2.next()) {
                    cn3.close();
            try {
                Connection cn4 = ConexionBs.conectarb();

                PreparedStatement pst4 = cn4.prepareStatement("select id from cliente where id = ? and not id = '" + idcliii + "'");
                pst4.setString(1, tcodcli.getText().trim());
                ResultSet rs3 = pst4.executeQuery();
                if (rs3.next()) {

                    JOptionPane.showMessageDialog(null, "El id del cliente a modificar ya existe");
                    cn4.close();

                } else {

                    try {
                        Connection cn = ConexionBs.conectarb();

                        PreparedStatement pst = cn.prepareStatement(
                                "update cliente set id = ?, nombre = ?, apellido = ?, direccion = ?, telefono = ?, email = ? where id = '" + idcliii + "'");
                        pst.setString(1, tcodcli.getText().trim());
                        pst.setString(2, tncli.getText().trim());
                        pst.setString(3, tapcli.getText().trim());
                        pst.setString(4, tdicli.getText().trim());
                        pst.setString(5, tntcli.getText().trim());
                        pst.setString(6, tcorrecli.getText().trim());
                        pst.executeUpdate();
                        tcodcli.setText("");
                        tncli.setText("");
                        tapcli.setText("");
                        tdicli.setText("");
                        tntcli.setText("");
                        tcorrecli.setText("");
                        JOptionPane.showMessageDialog(null, "Registro actualizado");
                        cn.close();
                     //   idd = "";
                        model.setRowCount(0);
                        model.setColumnCount(0);
                        try {
                            Connection cnn = ConexionBs.conectarb();
                            PreparedStatement pstt = cnn.prepareStatement(
                                    "select id, nombre, apellido, direccion, telefono, email from cliente");
                            ResultSet rss = pstt.executeQuery();
                            tabrecliente = new JTable(model);
                            jScrollPane1.setViewportView(tabrecliente);
                            model.addColumn(" ");
                            model.addColumn("Nombre");
                            model.addColumn("Apellido");
                            model.addColumn("Direccion");
                            model.addColumn("Telefono ");
                            model.addColumn("Correo");

                            while (rss.next()) {
                                Object[] fila = new Object[6];
                                for (int i = 0; i < 6; i++) {
                                    fila[i] = rss.getObject(i + 1);
                                }
                                model.addRow(fila);
                            }
                            cnn.close();

                        } catch (SQLException e) {
                            System.err.println("Error al llenar tabla ");
                            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                        }

                        tabrecliente.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                                int fila_point = tabrecliente.rowAtPoint(e.getPoint());
                                tcodcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 0)));
                                idcliii = tcodcli.getText().trim();
                                tncli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 1)));
                                tapcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 2)));
                                tdicli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 3)));
                                tntcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 4)));
                                tcorrecli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 5)));
                            }
                        });
                    } catch (Exception e) {
                        System.err.println("Error en el boton actualizar" + e);
                        JOptionPane.showMessageDialog(null, "Error al actaulizar, contacte al personal administrativo");

                    }
                }
            } catch (Exception e) {
                System.err.println("Error en la consulta de id " + e);
                JOptionPane.showMessageDialog(null, "Error al consultar nit para modificar, contacte al personal administrativo");

            }

            } else {
                    cn3.close();
                    tcons.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Codido de cliente no reconocido, Debes realizar la consuta en el filtro de busqueda---");
                    tcons.setBackground(Color.WHITE);
                }
            } catch (Exception e) {
                System.err.println("Error en la consulta de id " + e);
                JOptionPane.showMessageDialog(null, "Error al consultar id, contacte al personal administrativo");

            }
        } else {
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda o hay campos vacios");
            tcodcli.setBackground(Color.WHITE);
            tncli.setBackground(Color.WHITE);
            tcorrecli.setBackground(Color.WHITE);
            tntcli.setBackground(Color.WHITE);
            tapcli.setBackground(Color.WHITE);
            tdicli.setBackground(Color.WHITE);
        }


    }//GEN-LAST:event_bmodifiActionPerformed

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
        String consul = tcons.getText().trim();
        if (consul.equals("")) {
            tcons.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda");
            tcons.setBackground(Color.WHITE);
        } else {
            try {
                Connection cn = ConexionBs.conectarb();

                PreparedStatement pst = cn.prepareStatement("select * from cliente where id = ?");
                pst.setString(1, consul);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    tcodcli.setText(rs.getString("id"));
                    tncli.setText(rs.getString("nombre"));
                    tapcli.setText(rs.getString("apellido"));
                    tdicli.setText(rs.getString("direccion"));
                    tntcli.setText(rs.getString("telefono"));
                    tcorrecli.setText(rs.getString("email"));

                } else {
                    tcons.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Id del cliente inexistente");
                    tcons.setBackground(Color.WHITE);
                }
            } catch (Exception e) {
                System.err.println("Error en el boton buscar " + e);
                JOptionPane.showMessageDialog(null, "Error al buscar, contacte al personal administrativo");

            }
        }
    }//GEN-LAST:event_bbuscarActionPerformed

    private void beliminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminActionPerformed
        String idc, nombre, correo, apellido, telefono, direccion;
        int valcampos = 0;
        idc = tcodcli.getText().trim();
        nombre = tncli.getText().trim();
        correo = tcorrecli.getText().trim();
        apellido = tapcli.getText().trim();
        telefono = tntcli.getText().trim();
        direccion = tdicli.getText().trim();
        if (idc.equals("")) {
            tcodcli.setBackground(Color.red);
            valcampos++;
        }
        if (nombre.equals("")) {
            tncli.setBackground(Color.red);
            valcampos++;
        }
        if (correo.equals("")) {
            tcorrecli.setBackground(Color.red);
            valcampos++;
        }
        if (apellido.equals("")) {
            tapcli.setBackground(Color.red);
            valcampos++;
        }
        if (telefono.equals("")) {
            tntcli.setBackground(Color.red);
            valcampos++;
        }
        if (direccion.equals("")) {
            tdicli.setBackground(Color.red);
            valcampos++;
        }
        if (valcampos == 0) {
            /*   String idd = tcons.getText().trim();
            if (idd.equals("")) {
                tcons.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "No es posible eliminar porque no has ingresado una busqueda");
                tcons.setBackground(Color.WHITE);
            } else {*/
            try {
                    Connection cn3 = ConexionBs.conectarb();

                    PreparedStatement pst3 = cn3.prepareStatement("select * from cliente where id = ?");
                    pst3.setString(1, idc);
                    ResultSet rs2 = pst3.executeQuery();
                    if (rs2.next()) {
                        cn3.close(); 
            try {
                Connection cn = ConexionBs.conectarb();

                PreparedStatement pst = cn.prepareStatement(
                        "delete from cliente where id = ?");
                pst.setString(1, idcliii);

                pst.executeUpdate();
                tcodcli.setText("");
                tncli.setText("");
                tapcli.setText("");
                tdicli.setText("");
                tntcli.setText("");
                tcorrecli.setText("");
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                cn.close();
                model.setRowCount(0);
                model.setColumnCount(0);
                try {
                    Connection cnn = ConexionBs.conectarb();
                    PreparedStatement pstt = cnn.prepareStatement(
                            "select id, nombre, apellido, direccion, telefono, email from cliente");
                    ResultSet rss = pstt.executeQuery();
                    tabrecliente = new JTable(model);
                    jScrollPane1.setViewportView(tabrecliente);
                    model.addColumn(" ");
                    model.addColumn("Nombre");
                    model.addColumn("Apellido");
                    model.addColumn("Direccion");
                    model.addColumn("Telefono ");
                    model.addColumn("Correo");

                    while (rss.next()) {
                        Object[] fila = new Object[6];
                        for (int i = 0; i < 6; i++) {
                            fila[i] = rss.getObject(i + 1);
                        }
                        model.addRow(fila);
                    }
                    cnn.close();

                } catch (SQLException e) {
                    System.err.println("Error al llenar tabla ");
                    JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                }
                 tabrecliente.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                                int fila_point = tabrecliente.rowAtPoint(e.getPoint());
                                tcodcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 0)));
                                idcliii = tcodcli.getText().trim();
                                tncli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 1)));
                                tapcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 2)));
                                tdicli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 3)));
                                tntcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 4)));
                                tcorrecli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 5)));
                            }
                        });
            } catch (Exception e) {
                System.err.println("Error en el boton eliminar" + e);
                JOptionPane.showMessageDialog(null, "Error al eliminar, contacte al personal administrativo");

            }
            tabrecliente.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    int fila_point = tabrecliente.rowAtPoint(e.getPoint());
                    tcodcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 0)));
                    idcliii = tcodcli.getText().trim();
                    tncli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 1)));
                    tapcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 2)));
                    tdicli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 3)));
                    tntcli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 4)));
                    tcorrecli.setText(String.valueOf(tabrecliente.getValueAt(fila_point, 5)));
                }
            });
             } else {
                        cn3.close();
                        tcons.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "Codigo de cliente no reconocido o incorrecto, Debes realizar la consulta en el filtro de busqueda");
                        tcons.setBackground(Color.WHITE);
                    }
                } catch (Exception e) {
                    System.err.println("Error en la consulta de id " + e);
                    JOptionPane.showMessageDialog(null, "Error al consultar id, contacte al personal administrativo");

                }

 /*  }*/
        } else {
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda o hay campos vacios");
            tcodcli.setBackground(Color.WHITE);
            tncli.setBackground(Color.WHITE);
            tcorrecli.setBackground(Color.WHITE);
            tntcli.setBackground(Color.WHITE);
            tapcli.setBackground(Color.WHITE);
            tdicli.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_beliminActionPerformed

    private void tcorrecliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcorrecliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcorrecliActionPerformed

    private void tffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffKeyTyped
        tff.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + tff.getText(), 0, 1, 2));
            }
        });
        trs = new TableRowSorter(model);
        tabrecliente.setRowSorter(trs);

    }//GEN-LAST:event_tffKeyTyped

    private void bllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bllActionPerformed
        tcodcli.setText("");
        tncli.setText("");
        tapcli.setText("");
        tdicli.setText("");
        tntcli.setText("");
        tcorrecli.setText("");
        tcons.setText("");
        tff.setText("");
    }//GEN-LAST:event_bllActionPerformed

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
            java.util.logging.Logger.getLogger(InCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton belimin;
    private javax.swing.JButton bll;
    private javax.swing.JButton bmodifi;
    private javax.swing.JButton bregistr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lapcli;
    private javax.swing.JLabel lccli;
    private javax.swing.JLabel lcons;
    private javax.swing.JLabel ldcli;
    private javax.swing.JLabel lemailpro;
    private javax.swing.JLabel lfbb;
    private javax.swing.JLabel lncli;
    private javax.swing.JLabel lntecli;
    private javax.swing.JTable tabrecliente;
    private javax.swing.JTextField tapcli;
    public javax.swing.JTextField tcodcli;
    private javax.swing.JTextField tcons;
    private javax.swing.JTextField tcorrecli;
    private javax.swing.JTextField tdicli;
    private javax.swing.JTextField tff;
    private javax.swing.JLabel titcli;
    private javax.swing.JTextField tncli;
    private javax.swing.JTextField tntcli;
    // End of variables declaration//GEN-END:variables

}
