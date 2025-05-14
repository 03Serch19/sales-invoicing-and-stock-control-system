/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazes;

import javax.swing.WindowConstants;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ADMIN
 */
public class InProducto extends javax.swing.JFrame {

    //String nitproveedor = "";
    public String ccdddd;
    TableRowSorter trs;
    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form InProducto
     */
    public InProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt tpcodipro = new TextPrompt("Codigo producto", tcodigprod);
        TextPrompt tpnaprod = new TextPrompt("Nombre producto", tnameprod);
        TextPrompt tppu = new TextPrompt("Precio unitario", tpuniprod);
        TextPrompt tpcons = new TextPrompt("Codigo a buscar", tconsss);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion de productos - Sistema SME - Sesion de " +InicioSesion.usuario);
        tconsss.setVisible(false);
        bbuscar.setVisible(false);
        lcons.setVisible(false);
        try {
            Connection cn = ConexionBs.conectarb();
            PreparedStatement pst = cn.prepareStatement(
                    "select proveedor from proveedor");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String nitt = rs.getString("proveedor");
                cbnitproprod.addItem(nitt);
                /*Object[] fila = new Object[1];
                for (int i = 0; i < 1; i++) {
                    fila[i] = rs.getObject(i + 1);
                    
                }
                //model.addRow(fila);
                cbnitproprod.addItem(fila.toString());
               //cbnitproprod.addRow(fila); */
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar EL COMBOBOX ");
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
        }
        try {
            Connection cn = ConexionBs.conectarb();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre from categoria");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String catt = rs.getString("nombre");
                cbidcatprod.addItem(catt);
                /*Object[] fila = new Object[1];
                for (int i = 0; i < 1; i++) {
                    fila[i] = rs.getObject(i + 1);
                    
                }
                //model.addRow(fila);
                cbnitproprod.addItem(fila.toString());
               //cbnitproprod.addRow(fila); */
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar EL COMBOBOX ");
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
        }

        try {
            Connection cnn = ConexionBs.conectarb();
            PreparedStatement pstt = cnn.prepareStatement(
                    "select * from producto");
            ResultSet rss = pstt.executeQuery();
            tabrproducto = new JTable(model);
            jScrollPane1.setViewportView(tabrproducto);
            model.addColumn("Codigo");
            model.addColumn("Nit Proveedor");
            model.addColumn("Nombre Producto");
            model.addColumn("Precio Unitario");
            model.addColumn("Categoria");

            while (rss.next()) {
                Object[] fila = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rss.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cnn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla ");
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
        }
          tabrproducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = tabrproducto.rowAtPoint(e.getPoint());
                tcodigprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 0)));
                ccdddd = tcodigprod.getText().trim();
                String nprrrr = String.valueOf(tabrproducto.getValueAt(fila_point, 1));
                try {
                        Connection cn2 = ConexionBs.conectarb();
                        PreparedStatement pst2 = cn2.prepareStatement("select proveedor from proveedor where nit = ?");
                        pst2.setString(1, nprrrr);
                        ResultSet rs2 = pst2.executeQuery();
                       
                        
                        if (rs2.next()) {
                           
                            cbnitproprod.setSelectedItem(rs2.getString("proveedor"));

                       
                            cn2.close();
                            
                        } else {
                            tconsss.setBackground(Color.red);
                            JOptionPane.showMessageDialog(null, "No se encontro el proveedor");
                            tconsss.setBackground(Color.WHITE);
                        }
                    } catch (Exception ee) {
                        System.err.println("Error en la busqueda del nombre");
                        JOptionPane.showMessageDialog(null, "Error en la busqueda del nombre...");
                    }
                tnameprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 2)));
                tpuniprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 3)));
                cbidcatprod.setSelectedItem(String.valueOf(tabrproducto.getValueAt(fila_point, 4)));
              
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


    /* public String gnitprove(){
        return nitproveedor;
    }
    
      public void snitpp(String nitprovee){ 
        this.nitproveedor = nitprovee;
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bregistrprod = new javax.swing.JButton();
        lcodip = new javax.swing.JLabel();
        tcodigprod = new javax.swing.JTextField();
        lnamep = new javax.swing.JLabel();
        titledprod = new javax.swing.JLabel();
        lnprovpro = new javax.swing.JLabel();
        lpreunipro = new javax.swing.JLabel();
        lidcatego = new javax.swing.JLabel();
        tnameprod = new javax.swing.JTextField();
        tpuniprod = new javax.swing.JTextField();
        cbnitproprod = new javax.swing.JComboBox<>();
        cbidcatprod = new javax.swing.JComboBox<>();
        belimin = new javax.swing.JButton();
        bmodifi = new javax.swing.JButton();
        tconsss = new javax.swing.JTextField();
        lcons = new javax.swing.JLabel();
        bbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabrproducto = new javax.swing.JTable();
        lfbbb = new javax.swing.JLabel();
        tffil = new javax.swing.JTextField();
        bll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bregistrprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bregistrprod.setText("Registrar");
        bregistrprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregistrprodActionPerformed(evt);
            }
        });

        lcodip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lcodip.setText("Ingresa el codigo:");

        tcodigprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lnamep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnamep.setText("Ingresa el nombre:");

        titledprod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titledprod.setText("Ingresar datos del producto");

        lnprovpro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnprovpro.setText("Elije el proveedor:");

        lpreunipro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lpreunipro.setText("Ingresa el precio unitario:");

        lidcatego.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lidcatego.setText("Elije la categoria:");

        tnameprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tnameprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameprodActionPerformed(evt);
            }
        });

        tpuniprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbnitproprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbnitproprod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbnitproprod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbnitproprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnitproprodActionPerformed(evt);
            }
        });

        cbidcatprod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbidcatprod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbidcatprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidcatprodActionPerformed(evt);
            }
        });

        belimin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        belimin.setText("Eliminar");
        belimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminActionPerformed(evt);
            }
        });

        bmodifi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bmodifi.setText("Actualizar");
        bmodifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodifiActionPerformed(evt);
            }
        });

        tconsss.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lcons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lcons.setText("Ingresa el codigo a consultar:");

        bbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bbuscar.setText("Buscar");
        bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuscarActionPerformed(evt);
            }
        });

        tabrproducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabrproducto);

        lfbbb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lfbbb.setText("Filtro de busqueda:");

        tffil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tffil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffilKeyTyped(evt);
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(titledprod, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lcodip, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lnamep))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lpreunipro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tpuniprod, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(70, 70, 70))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tcodigprod, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tnameprod, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lcons)
                                                .addGap(36, 36, 36)
                                                .addComponent(tconsss, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lnprovpro)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbnitproprod, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lidcatego, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbidcatprod, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(52, 52, 52)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bmodifi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bregistrprod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(belimin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lfbbb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tffil, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(bll, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titledprod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcodip, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnamep, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bregistrprod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bmodifi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(belimin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcodigprod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnameprod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnprovpro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbnitproprod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tpuniprod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lpreunipro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lidcatego, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbidcatprod, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lcons, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tconsss, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tffil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lfbbb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bregistrprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregistrprodActionPerformed
        String coddigo, nitprov, produuu, preciop, idcaprood;
        int valcampos = 0;
        coddigo = tcodigprod.getText().trim();
        nitprov = cbnitproprod.getSelectedItem().toString();
        produuu = tnameprod.getText().trim();
        preciop = tpuniprod.getText().trim();
        idcaprood = cbidcatprod.getSelectedItem().toString();
        if (coddigo.equals("")) {
            tcodigprod.setBackground(Color.red);
            valcampos++;
        }
        if (produuu.equals("")) {
            tnameprod.setBackground(Color.red);
            valcampos++;
        }
        if (preciop.equals("")) {
            tpuniprod.setBackground(Color.red);
            valcampos++;
        }
        if (nitprov.equals("")) {

            valcampos++;
        }
        if (idcaprood.equals("")) {

            valcampos++;
        }
        try {
            Connection cn3 = ConexionBs.conectarb();
            PreparedStatement pst3 = cn3.prepareStatement("select codigo from producto where codigo = '" + coddigo + "'");
            ResultSet rs3 = pst3.executeQuery();
            if (rs3.next()) {
                tcodigprod.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Codigo de producto ya existe");
                tcodigprod.setBackground(Color.WHITE);

                tpuniprod.setBackground(Color.WHITE);

                tnameprod.setBackground(Color.WHITE);
                cn3.close();
            } else {
                cn3.close();
                if (valcampos == 0) {
                    try {
                        Connection cn2 = ConexionBs.conectarb();
                        PreparedStatement pst2 = cn2.prepareStatement("select nit from proveedor where proveedor = ?");
                        pst2.setString(1, cbnitproprod.getSelectedItem().toString());
                        ResultSet rs2 = pst2.executeQuery();
                        if (rs2.next()) {
                            String niprove = rs2.getString("nit");
                            cn2.close();
                            try {
                                Connection cn = ConexionBs.conectarb();
                                PreparedStatement pst = cn.prepareStatement(
                                        "insert into producto values(?,?,?,?,?)");
                                //String nitpro = cbnitproprod.getSelectedItem().toString();
                                // String ncateg = cbidcatprod.getSelectedItem().toString();
                                pst.setString(1, tcodigprod.getText().trim());
                                //  pst.setString(2, cbnitproprod.getSelectedItem().toString());
                                pst.setString(2, niprove);
                                pst.setString(3, tnameprod.getText().trim());
                                pst.setString(4, tpuniprod.getText().trim());
                                pst.setString(5, cbidcatprod.getSelectedItem().toString());
                                pst.executeUpdate();

                                tcodigprod.setText("");
                                tnameprod.setText("");
                                tpuniprod.setText("");
                                cbnitproprod.setSelectedIndex(0);
                                cbidcatprod.setSelectedIndex(0);
                                JOptionPane.showMessageDialog(null, "Producto registrado");
                                cn.close();
                                model.setRowCount(0);
                                model.setColumnCount(0);
                                try {
                                    Connection cnn = ConexionBs.conectarb();
                                    PreparedStatement pstt = cnn.prepareStatement(
                                            "select codigo, nit_proveedor, producto, precio, nombre from producto");
                                    ResultSet rss = pstt.executeQuery();
                                    tabrproducto = new JTable(model);
                                    jScrollPane1.setViewportView(tabrproducto);
                                    model.addColumn("Codigo");
                                    model.addColumn("Nit Proveedor");
                                    model.addColumn("Nombre Producto");
                                    model.addColumn("Precio Unitario");
                                    model.addColumn("Categoria");

                                    while (rss.next()) {
                                        Object[] fila = new Object[5];
                                        for (int i = 0; i < 5; i++) {
                                            fila[i] = rss.getObject(i + 1);
                                        }
                                        model.addRow(fila);
                                    }
                                    cnn.close();

                                } catch (SQLException e) {
                                    System.err.println("Error al llenar tabla ");
                                    JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                                }
                                      tabrproducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila_point = tabrproducto.rowAtPoint(e.getPoint());
                tcodigprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 0)));
                ccdddd = tcodigprod.getText().trim();
                String nprrrr = String.valueOf(tabrproducto.getValueAt(fila_point, 1));
                try {
                        Connection cn2 = ConexionBs.conectarb();
                        PreparedStatement pst2 = cn2.prepareStatement("select proveedor from proveedor where nit = ?");
                        pst2.setString(1, nprrrr);
                        ResultSet rs2 = pst2.executeQuery();
                       
                        
                        if (rs2.next()) {
                           
                            cbnitproprod.setSelectedItem(rs2.getString("proveedor"));

                       
                            cn2.close();
                            
                        } else {
                            tconsss.setBackground(Color.red);
                            JOptionPane.showMessageDialog(null, "No se encontro el proveedor");
                            tconsss.setBackground(Color.WHITE);
                        }
                    } catch (Exception ee) {
                        System.err.println("Error en la busqueda del nombre");
                        JOptionPane.showMessageDialog(null, "Error en la busqueda del nombre...");
                    }
                tnameprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 2)));
                tpuniprod.setText(String.valueOf(tabrproducto.getValueAt(fila_point, 3)));
                cbidcatprod.setSelectedItem(String.valueOf(tabrproducto.getValueAt(fila_point, 4)));
              
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
                            } catch (Exception e) {
                                System.out.println("Error en el boton registrar" + e);
                            }
                        }
                    } catch (Exception e) {
                        System.err.println("Error en la consulta de nit proveedor");
                        JOptionPane.showMessageDialog(null, "Error en la consulta de nit proveedor");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
                    tcodigprod.setBackground(Color.WHITE);

                    tpuniprod.setBackground(Color.WHITE);

                    tnameprod.setBackground(Color.WHITE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en validar nameuser");
            JOptionPane.showMessageDialog(null, "Error al validar, contacte al administrador");
        }


    }//GEN-LAST:event_bregistrprodActionPerformed

    private void tnameprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameprodActionPerformed

    private void cbnitproprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnitproprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnitproprodActionPerformed

    private void beliminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminActionPerformed
        String coddigo, nitprov, produuu, preciop, idcaprood;
        int valcampos = 0;
        coddigo = tcodigprod.getText().trim();
        nitprov = cbnitproprod.getSelectedItem().toString();
        produuu = tnameprod.getText().trim();
        preciop = tpuniprod.getText().trim();
        idcaprood = cbidcatprod.getSelectedItem().toString();
        if (coddigo.equals("")) {
            tcodigprod.setBackground(Color.red);
            valcampos++;
        }
        if (produuu.equals("")) {
            tnameprod.setBackground(Color.red);
            valcampos++;
        }
        if (preciop.equals("")) {
            tpuniprod.setBackground(Color.red);
            valcampos++;
        }
        if (nitprov.equals("")) {

            valcampos++;
        }
        if (idcaprood.equals("")) {

            valcampos++;
        }

        if (valcampos == 0) {
          /*  String coddii = tconsss.getText().trim();
            if (coddii.equals("")) {
                tconsss.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "No es posible eliminar porque no has ingresado una busqueda");
                tconsss.setBackground(Color.WHITE);
            } else {*/
                try {
                    Connection cn3 = ConexionBs.conectarb();

                    PreparedStatement pst3 = cn3.prepareStatement("select * from producto where codigo = ?");
                    pst3.setString(1, ccdddd);
                    ResultSet rs2 = pst3.executeQuery();
                    if (rs2.next()) {
                        cn3.close();
                        try {
                            Connection cn = ConexionBs.conectarb();

                            PreparedStatement pst = cn.prepareStatement(
                                    "delete from producto where codigo = ?");
                            pst.setString(1, tconsss.getText().trim());

                            pst.executeUpdate();
                            tcodigprod.setText("");
                            tnameprod.setText("");
                            tpuniprod.setText("");
                            cbnitproprod.setSelectedIndex(0);
                            cbidcatprod.setSelectedIndex(0);
                            JOptionPane.showMessageDialog(null, "Registro eliminado");
                            cn.close();
                            model.setRowCount(0);
                            model.setColumnCount(0);
                            try {
                                Connection cnn = ConexionBs.conectarb();
                                PreparedStatement pstt = cnn.prepareStatement(
                                        "select codigo, nit_proveedor, producto, precio, nombre from producto");
                                ResultSet rss = pstt.executeQuery();
                                tabrproducto = new JTable(model);
                                jScrollPane1.setViewportView(tabrproducto);
                                model.addColumn("Codigo");
                                model.addColumn("Nit Proveedor");
                                model.addColumn("Nombre Producto");
                                model.addColumn("Precio Unitario");
                                model.addColumn("Categoria");

                                while (rss.next()) {
                                    Object[] fila = new Object[5];
                                    for (int i = 0; i < 5; i++) {
                                        fila[i] = rss.getObject(i + 1);
                                    }
                                    model.addRow(fila);
                                }
                                cnn.close();

                            } catch (SQLException e) {
                                System.err.println("Error al llenar tabla ");
                                JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                            }
                        } catch (Exception e) {
                            System.err.println("Error en el boton eliminar" + e);
                            JOptionPane.showMessageDialog(null, "Error al eliminar, contacte al personal administrativo");

                        }
                    } else {
                        cn3.close();
                        tconsss.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "El producto consultado para eliminar no existe");
                        tconsss.setBackground(Color.WHITE);
                    }
                } catch (Exception e) {
                    System.err.println("Error en la consulta de codigo " + e);
                    JOptionPane.showMessageDialog(null, "Error al consultar codigo, contacte al personal administrativo");

                }

           // }
        } else {
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda o hay campos vacios");
            tcodigprod.setBackground(Color.WHITE);

            tpuniprod.setBackground(Color.WHITE);

            tnameprod.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_beliminActionPerformed

    private void bmodifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodifiActionPerformed

        String coddigo, nitprov, produuu, preciop, idcaprood;
        int valcampos = 0;
        coddigo = tcodigprod.getText().trim();
        nitprov = cbnitproprod.getSelectedItem().toString();
        produuu = tnameprod.getText().trim();
        preciop = tpuniprod.getText().trim();
        idcaprood = cbidcatprod.getSelectedItem().toString();
        if (coddigo.equals("")) {
            tcodigprod.setBackground(Color.red);
            valcampos++;
        }
        if (produuu.equals("")) {
            tnameprod.setBackground(Color.red);
            valcampos++;
        }
        if (preciop.equals("")) {
            tpuniprod.setBackground(Color.red);
            valcampos++;
        }
        if (nitprov.equals("")) {

            valcampos++;
        }
        if (idcaprood.equals("")) {

            valcampos++;
        }
        if (valcampos == 0) {
            String coddii = tconsss.getText().trim();

            if (coddii.equals("")) {
                tconsss.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "No es posible modificar porque no has ingresado una busqueda");
                tconsss.setBackground(Color.WHITE);
            } else {
                try {
                    Connection cn3 = ConexionBs.conectarb();

                    PreparedStatement pst3 = cn3.prepareStatement("select * from producto where codigo = ?");
                    pst3.setString(1, coddii);
                    ResultSet rs2 = pst3.executeQuery();
                    if (rs2.next()) {
                        cn3.close();
                        try {
                            Connection cn4 = ConexionBs.conectarb();

                            PreparedStatement pst4 = cn4.prepareStatement("select codigo from producto where codigo = ? and not codigo = '" + coddii + "'");
                            pst4.setString(1, tcodigprod.getText().trim());
                            ResultSet rs3 = pst4.executeQuery();
                            if (rs3.next()) {

                                tcodigprod.setBackground(Color.red);
                                JOptionPane.showMessageDialog(null, "El codigo de producto a modificar ya existe");
                                tcodigprod.setBackground(Color.WHITE);
                                cn4.close();

                            } else {
                                try {
                                    Connection cn2 = ConexionBs.conectarb();
                                    PreparedStatement pst2 = cn2.prepareStatement("select nit from proveedor where proveedor = ?");
                                    pst2.setString(1, cbnitproprod.getSelectedItem().toString());
                                    ResultSet rs4 = pst2.executeQuery();
                                    if (rs4.next()) {
                                        String niprove = rs4.getString("nit");
                                        cn2.close();
                                        try {
                                            Connection cn = ConexionBs.conectarb();
                                            PreparedStatement pst = cn.prepareStatement(
                                                    "update producto set codigo = ?, nit_proveedor = ?, producto = ?, precio = ?, nombre = ? where codigo = '" + coddii + "'");
                                            //String nitpro = cbnitproprod.getSelectedItem().toString();
                                            // String ncateg = cbidcatprod.getSelectedItem().toString();
                                            pst.setString(1, tcodigprod.getText().trim());
                                            //  pst.setString(2, cbnitproprod.getSelectedItem().toString());
                                            pst.setString(2, niprove);
                                            pst.setString(3, tnameprod.getText().trim());
                                            pst.setString(4, tpuniprod.getText().trim());
                                            pst.setString(5, cbidcatprod.getSelectedItem().toString());
                                            pst.executeUpdate();

                                            tcodigprod.setText("");
                                            tnameprod.setText("");
                                            tpuniprod.setText("");
                                            cbnitproprod.setSelectedIndex(0);
                                            cbidcatprod.setSelectedIndex(0);
                                            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                                            cn.close();
                                            model.setRowCount(0);
                                            model.setColumnCount(0);
                                            try {
                                                Connection cnn = ConexionBs.conectarb();
                                                PreparedStatement pstt = cnn.prepareStatement(
                                                        "select codigo, nit_proveedor, producto, precio, nombre from producto");
                                                ResultSet rss = pstt.executeQuery();
                                                tabrproducto = new JTable(model);
                                                jScrollPane1.setViewportView(tabrproducto);
                                                model.addColumn("Codigo");
                                                model.addColumn("Nit Proveedor");
                                                model.addColumn("Nombre Producto");
                                                model.addColumn("Precio Unitario");
                                                model.addColumn("Categoria");

                                                while (rss.next()) {
                                                    Object[] fila = new Object[5];
                                                    for (int i = 0; i < 5; i++) {
                                                        fila[i] = rss.getObject(i + 1);
                                                    }
                                                    model.addRow(fila);
                                                }
                                                cnn.close();

                                            } catch (SQLException e) {
                                                System.err.println("Error al llenar tabla ");
                                                JOptionPane.showMessageDialog(null, "Error al mostrar informacion...");
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error en el boton modificar" + e);
                                        }
                                    }
                                } catch (Exception e) {
                                    System.err.println("Error en la consulta de codigo de producto");
                                    JOptionPane.showMessageDialog(null, "Error en la consulta de codigo de prodcuto");
                                }

                            }
                        } catch (Exception e) {
                            System.err.println("Error en la consulta de codigo " + e);
                            JOptionPane.showMessageDialog(null, "Error al consultar codigo para modificar, contacte al personal administrativo");

                        }

                    } else {
                        cn3.close();
                        tconsss.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "El producto consultado para actualizar no existe");
                        tconsss.setBackground(Color.WHITE);
                    }
                } catch (Exception e) {
                    System.err.println("Error en la consulta de codigo " + e);
                    JOptionPane.showMessageDialog(null, "Error al consultar codigo, contacte al personal administrativo");

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda o hay campos vacios");
            tcodigprod.setBackground(Color.WHITE);

            tpuniprod.setBackground(Color.WHITE);

            tnameprod.setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_bmodifiActionPerformed

    private void bbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuscarActionPerformed
        String consul = tconsss.getText().trim();
        if (consul.equals("")) {
            tconsss.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No has realizado ninguna busqueda");
            tconsss.setBackground(Color.WHITE);
        } else {
            //
            try {
                Connection cn = ConexionBs.conectarb();

                PreparedStatement pst = cn.prepareStatement("select * from producto where codigo = ?");
                pst.setString(1, tconsss.getText().trim());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String gnit = rs.getString("nit_proveedor");
                    try {
                        Connection cn2 = ConexionBs.conectarb();
                        PreparedStatement pst2 = cn2.prepareStatement("select proveedor from proveedor where nit = ?");
                        pst2.setString(1, gnit);
                        ResultSet rs2 = pst2.executeQuery();
                       
                        
                        if (rs2.next()) {
                            tcodigprod.setText(rs.getString("codigo"));
                            cbnitproprod.setSelectedItem(rs2.getString("proveedor"));

                            tnameprod.setText(rs.getString("producto"));
                            tpuniprod.setText(rs.getString("precio"));
                            cbidcatprod.setSelectedItem(rs.getString("nombre"));

                            cn2.close();
                            cn.close();
                        } else {
                            tconsss.setBackground(Color.red);
                            JOptionPane.showMessageDialog(null, "No se encontro el proveedor");
                            tconsss.setBackground(Color.WHITE);
                        }
                    } catch (Exception e) {
                        System.err.println("Error en la busqueda del nombre");
                        JOptionPane.showMessageDialog(null, "Error en la busqueda del nombre...");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Codigo del producto inexistente");

                }

            } catch (Exception e) {
                System.err.println("Error en el boton buscar " + e);
                JOptionPane.showMessageDialog(null, "Error al buscar, contacte al personal administrativo");

            }
        }
    }//GEN-LAST:event_bbuscarActionPerformed

    private void tffilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffilKeyTyped
        tffil.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + tffil.getText(), 0, 2, 4));
            }

        });
        trs = new TableRowSorter(model);
        tabrproducto.setRowSorter(trs);
    }//GEN-LAST:event_tffilKeyTyped

    private void bllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bllActionPerformed
        tcodigprod.setText("");
        tnameprod.setText("");
        tpuniprod.setText("");
        cbnitproprod.setSelectedIndex(0);
        cbidcatprod.setSelectedIndex(0);
        tconsss.setText("");
        tffil.setText("");
    }//GEN-LAST:event_bllActionPerformed

    private void cbidcatprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidcatprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbidcatprodActionPerformed

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
            java.util.logging.Logger.getLogger(InProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton belimin;
    private javax.swing.JButton bll;
    private javax.swing.JButton bmodifi;
    private javax.swing.JButton bregistrprod;
    private javax.swing.JComboBox<String> cbidcatprod;
    public javax.swing.JComboBox<String> cbnitproprod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcodip;
    private javax.swing.JLabel lcons;
    private javax.swing.JLabel lfbbb;
    private javax.swing.JLabel lidcatego;
    private javax.swing.JLabel lnamep;
    private javax.swing.JLabel lnprovpro;
    private javax.swing.JLabel lpreunipro;
    private javax.swing.JTable tabrproducto;
    private javax.swing.JTextField tcodigprod;
    private javax.swing.JTextField tconsss;
    private javax.swing.JTextField tffil;
    private javax.swing.JLabel titledprod;
    private javax.swing.JTextField tnameprod;
    private javax.swing.JTextField tpuniprod;
    // End of variables declaration//GEN-END:variables

}
