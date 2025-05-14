package ventayfactura;

//import clases.ConexionBs;
import interfazes.InicioSesion;
import java.awt.*;
import java.awt.print.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JFrame implements Printable {

    //  String produu;
    /*  String cant;
    int canti, total;*/
    //float vprecio;
    DefaultTableModel model1 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /*
    public void copro(String prod) {
        this.produu = prod;
    }*/

 /* public void nop(String namp) {
        this.produu = namp;
    }

    public void cantid(String cant) {
        this.cant = cant;
        canti = Integer.parseInt(cant);
    }
     */
    public Factura() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generar factura - Sistema SME - Sesion de " +InicioSesion.usuario);

        /* try {
            Connection cnn = ConexionBs.conectarb();
            PreparedStatement pstt = cnn.prepareStatement(
                    "select precio from producto where codigo = '" + produu + "'");
            ResultSet rss = pstt.executeQuery();
            if(rss.next()){
            vprecio = rss.getFloat("precio");
            cnn.close();
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro el precio");
            }
        } catch (Exception e) {
            System.err.println("Error al consultar el precio");
            JOptionPane.showMessageDialog(null, "El errrrrr");
        }*/
 /*pro.setText(produu);
        tcanti.setText(cant);
        tprecio.setText(vprecio);
         */
 /*int vvprecio = Integer.parseInt(vprecio);
        total = (int) (vvprecio *canti);
        String ttootal = String.valueOf(total);
        ttotal.setText(ttootal);*/
        // String vprecioo = String.valueOf(vprecio);
        //tprecio.setText(vprecioo);
        /*String preu = tprecio.getText().trim();
        String cccan = tcanti.getText().trim();
        float press = Float.valueOf(preu);
        int cccann = Integer.parseInt(cccan);
        
        int total11 = (int) press * cccann;
        String totaldefi = String.valueOf(total11);
        ttotal.setText(totaldefi);*/
        pro.setVisible(false);
        tcanti.setVisible(false);
        ttotal.setVisible(false);
        tprecio.setVisible(false);

        pro2.setVisible(false);
        tcanti2.setVisible(false);
        ttotal2.setVisible(false);
        tprecio2.setVisible(false);

        pro3.setVisible(false);
        tcanti3.setVisible(false);
        ttotal3.setVisible(false);
        tprecio3.setVisible(false);

        pro4.setVisible(false);
        tcanti4.setVisible(false);
        ttotal4.setVisible(false);
        tprecio4.setVisible(false);

        pro5.setVisible(false);
        tcanti5.setVisible(false);
        ttotal5.setVisible(false);
        tprecio5.setVisible(false);

        pro6.setVisible(false);
        tcanti6.setVisible(false);
        ttotal6.setVisible(false);
        tprecio6.setVisible(false);

        pro7.setVisible(false);
        tcanti7.setVisible(false);
        ttotal7.setVisible(false);
        tprecio7.setVisible(false);

        pro8.setVisible(false);
        tcanti8.setVisible(false);
        ttotal8.setVisible(false);
        tprecio8.setVisible(false);

        pro9.setVisible(false);
        tcanti9.setVisible(false);
        ttotal9.setVisible(false);
        tprecio9.setVisible(false);

    }
 
    public void cerrarr() {
        
        pro.setVisible(false);
        tcanti.setVisible(false);
        ttotal.setVisible(false);
        tprecio.setVisible(false);

        pro2.setVisible(false);
        tcanti2.setVisible(false);
        ttotal2.setVisible(false);
        tprecio2.setVisible(false);

        pro3.setVisible(false);
        tcanti3.setVisible(false);
        ttotal3.setVisible(false);
        tprecio3.setVisible(false);

        pro4.setVisible(false);
        tcanti4.setVisible(false);
        ttotal4.setVisible(false);
        tprecio4.setVisible(false);

        pro5.setVisible(false);
        tcanti5.setVisible(false);
        ttotal5.setVisible(false);
        tprecio5.setVisible(false);

        pro6.setVisible(false);
        tcanti6.setVisible(false);
        ttotal6.setVisible(false);
        tprecio6.setVisible(false);

        pro7.setVisible(false);
        tcanti7.setVisible(false);
        ttotal7.setVisible(false);
        tprecio7.setVisible(false);

        pro8.setVisible(false);
        tcanti8.setVisible(false);
        ttotal8.setVisible(false);
        tprecio8.setVisible(false);

        pro9.setVisible(false);
        tcanti9.setVisible(false);
        ttotal9.setVisible(false);
        tprecio9.setVisible(false);

        id_cliente.setText("");
        nombre_cliente.setText("");
        ttapagar.setText("");
        pro.setText("");
        tcanti.setText("");
        ttotal.setText("");
        tprecio.setText("");
        pro2.setText("");
        tcanti2.setText("");
        ttotal2.setText("");
        tprecio2.setText("");
        pro3.setText("");
        tcanti3.setText("");
        ttotal3.setText("");
        tprecio3.setText("");
        pro4.setText("");
        tcanti4.setText("");
        ttotal4.setText("");
        tprecio4.setText("");
        pro5.setText("");
        tcanti5.setText("");
        ttotal5.setText("");
        tprecio5.setText("");
        pro6.setText("");
        tcanti6.setText("");
        ttotal6.setText("");
        tprecio6.setText("");
        pro7.setText("");
        tcanti7.setText("");
        ttotal7.setText("");
        tprecio7.setText("");
        pro8.setText("");
        tcanti8.setText("");
        ttotal8.setText("");
        tprecio8.setText("");
        pro9.setText("");
        tcanti9.setText("");
        ttotal9.setText("");
        tprecio9.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Recibo = new javax.swing.JPanel();
        NumFactura = new javax.swing.JLabel();
        jLabel2_idcliente = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel3_cliente = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        vttttt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tprecio = new javax.swing.JTextField();
        tcanti = new javax.swing.JTextField();
        pro = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        tprecio2 = new javax.swing.JTextField();
        tcanti2 = new javax.swing.JTextField();
        pro2 = new javax.swing.JTextField();
        ttotal2 = new javax.swing.JTextField();
        tprecio4 = new javax.swing.JTextField();
        tcanti4 = new javax.swing.JTextField();
        pro4 = new javax.swing.JTextField();
        ttotal4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tprecio3 = new javax.swing.JTextField();
        tcanti3 = new javax.swing.JTextField();
        pro3 = new javax.swing.JTextField();
        ttotal3 = new javax.swing.JTextField();
        tprecio5 = new javax.swing.JTextField();
        tcanti5 = new javax.swing.JTextField();
        pro5 = new javax.swing.JTextField();
        ttotal5 = new javax.swing.JTextField();
        tprecio6 = new javax.swing.JTextField();
        tcanti6 = new javax.swing.JTextField();
        pro6 = new javax.swing.JTextField();
        ttotal6 = new javax.swing.JTextField();
        tprecio7 = new javax.swing.JTextField();
        tcanti7 = new javax.swing.JTextField();
        pro7 = new javax.swing.JTextField();
        ttotal7 = new javax.swing.JTextField();
        tprecio8 = new javax.swing.JTextField();
        tcanti8 = new javax.swing.JTextField();
        pro8 = new javax.swing.JTextField();
        ttotal8 = new javax.swing.JTextField();
        tprecio9 = new javax.swing.JTextField();
        tcanti9 = new javax.swing.JTextField();
        pro9 = new javax.swing.JTextField();
        ttotal9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ttapagar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FacturaParaVenta");
        setResizable(false);

        Recibo.setBackground(new java.awt.Color(255, 255, 255));
        Recibo.setLayout(null);

        NumFactura.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        NumFactura.setText("Factura ");
        NumFactura.setToolTipText("");
        Recibo.add(NumFactura);
        NumFactura.setBounds(230, 10, 140, 30);

        jLabel2_idcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2_idcliente.setText("ID");
        Recibo.add(jLabel2_idcliente);
        jLabel2_idcliente.setBounds(420, 50, 60, 30);

        id_cliente.setEditable(false);
        id_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });
        Recibo.add(id_cliente);
        id_cliente.setBounds(420, 80, 150, 30);

        jLabel3_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3_cliente.setText("Cliente");
        Recibo.add(jLabel3_cliente);
        jLabel3_cliente.setBounds(10, 50, 60, 30);

        nombre_cliente.setEditable(false);
        nombre_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_clienteActionPerformed(evt);
            }
        });
        Recibo.add(nombre_cliente);
        nombre_cliente.setBounds(10, 80, 380, 30);

        vttttt.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        vttttt.setText("Gracias por preferirnos");
        Recibo.add(vttttt);
        vttttt.setBounds(10, 500, 230, 26);

        tprecio.setEditable(false);
        tprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecioActionPerformed(evt);
            }
        });

        tcanti.setEditable(false);
        tcanti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcantiActionPerformed(evt);
            }
        });

        pro.setEditable(false);
        pro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal.setEditable(false);
        ttotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio2.setEditable(false);
        tprecio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio2ActionPerformed(evt);
            }
        });

        tcanti2.setEditable(false);
        tcanti2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti2ActionPerformed(evt);
            }
        });

        pro2.setEditable(false);
        pro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal2.setEditable(false);
        ttotal2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio4.setEditable(false);
        tprecio4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio4ActionPerformed(evt);
            }
        });

        tcanti4.setEditable(false);
        tcanti4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti4ActionPerformed(evt);
            }
        });

        pro4.setEditable(false);
        pro4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal4.setEditable(false);
        ttotal4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Producto");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Precio Unitario");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tprecio3.setEditable(false);
        tprecio3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio3ActionPerformed(evt);
            }
        });

        tcanti3.setEditable(false);
        tcanti3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti3ActionPerformed(evt);
            }
        });

        pro3.setEditable(false);
        pro3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal3.setEditable(false);
        ttotal3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio5.setEditable(false);
        tprecio5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio5ActionPerformed(evt);
            }
        });

        tcanti5.setEditable(false);
        tcanti5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti5ActionPerformed(evt);
            }
        });

        pro5.setEditable(false);
        pro5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal5.setEditable(false);
        ttotal5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio6.setEditable(false);
        tprecio6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio6ActionPerformed(evt);
            }
        });

        tcanti6.setEditable(false);
        tcanti6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti6ActionPerformed(evt);
            }
        });

        pro6.setEditable(false);
        pro6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal6.setEditable(false);
        ttotal6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio7.setEditable(false);
        tprecio7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio7ActionPerformed(evt);
            }
        });

        tcanti7.setEditable(false);
        tcanti7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti7ActionPerformed(evt);
            }
        });

        pro7.setEditable(false);
        pro7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal7.setEditable(false);
        ttotal7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio8.setEditable(false);
        tprecio8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio8ActionPerformed(evt);
            }
        });

        tcanti8.setEditable(false);
        tcanti8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti8ActionPerformed(evt);
            }
        });

        pro8.setEditable(false);
        pro8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal8.setEditable(false);
        ttotal8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tprecio9.setEditable(false);
        tprecio9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tprecio9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecio9ActionPerformed(evt);
            }
        });

        tcanti9.setEditable(false);
        tcanti9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcanti9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcanti9ActionPerformed(evt);
            }
        });

        pro9.setEditable(false);
        pro9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ttotal9.setEditable(false);
        ttotal9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pro9, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(pro8)
                    .addComponent(pro7)
                    .addComponent(pro6)
                    .addComponent(pro5)
                    .addComponent(pro4)
                    .addComponent(pro3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pro2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pro)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tcanti3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tprecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tcanti2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(tcanti))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(tprecio)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tcanti7)
                                    .addComponent(tcanti6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tprecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tprecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tcanti4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tprecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tcanti5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tprecio5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ttotal2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttotal)
                            .addComponent(ttotal4)
                            .addComponent(ttotal5)
                            .addComponent(ttotal7)
                            .addComponent(ttotal6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tcanti8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tprecio8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttotal8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tcanti9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tprecio9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ttotal9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcanti9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprecio9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Recibo.add(jPanel1);
        jPanel1.setBounds(0, 130, 590, 360);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total a pagar:");
        Recibo.add(jLabel6);
        jLabel6.setBounds(270, 500, 100, 30);

        ttapagar.setEditable(false);
        ttapagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Recibo.add(ttapagar);
        ttapagar.setBounds(370, 500, 220, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIME(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Recibo, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Recibo, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed

    }//GEN-LAST:event_id_clienteActionPerformed

    private void IMPRIME(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIME
        try {
            PrinterJob gap = PrinterJob.getPrinterJob(); //Crear la imagen que se va a imprimir
            gap.setPrintable(this);
            boolean top = gap.printDialog(); //Ejecutará el dialogo de la impresión, es la ventana que vemos cuando vamos a imprimir un documento.
            if (top) {
                gap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_IMPRIME

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_clienteActionPerformed

    private void tprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecioActionPerformed

    private void tcantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcantiActionPerformed

    private void tprecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio2ActionPerformed

    private void tcanti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti2ActionPerformed

    private void tprecio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio4ActionPerformed

    private void tcanti4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti4ActionPerformed

    private void tprecio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio3ActionPerformed

    private void tcanti3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti3ActionPerformed

    private void tprecio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio5ActionPerformed

    private void tcanti5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti5ActionPerformed

    private void tprecio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio6ActionPerformed

    private void tcanti6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti6ActionPerformed

    private void tprecio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio7ActionPerformed

    private void tcanti7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti7ActionPerformed

    private void tprecio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio8ActionPerformed

    private void tcanti8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti8ActionPerformed

    private void tprecio9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecio9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecio9ActionPerformed

    private void tcanti9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcanti9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcanti9ActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel NumFactura;
    private javax.swing.JPanel Recibo;
    public javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_idcliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_cliente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nombre_cliente;
    public javax.swing.JTextField pro;
    public javax.swing.JTextField pro2;
    public javax.swing.JTextField pro3;
    public javax.swing.JTextField pro4;
    public javax.swing.JTextField pro5;
    public javax.swing.JTextField pro6;
    public javax.swing.JTextField pro7;
    public javax.swing.JTextField pro8;
    public javax.swing.JTextField pro9;
    public javax.swing.JTextField tcanti;
    public javax.swing.JTextField tcanti2;
    public javax.swing.JTextField tcanti3;
    public javax.swing.JTextField tcanti4;
    public javax.swing.JTextField tcanti5;
    public javax.swing.JTextField tcanti6;
    public javax.swing.JTextField tcanti7;
    public javax.swing.JTextField tcanti8;
    public javax.swing.JTextField tcanti9;
    public javax.swing.JTextField tprecio;
    public javax.swing.JTextField tprecio2;
    public javax.swing.JTextField tprecio3;
    public javax.swing.JTextField tprecio4;
    public javax.swing.JTextField tprecio5;
    public javax.swing.JTextField tprecio6;
    public javax.swing.JTextField tprecio7;
    public javax.swing.JTextField tprecio8;
    public javax.swing.JTextField tprecio9;
    public javax.swing.JTextField ttapagar;
    public javax.swing.JTextField ttotal;
    public javax.swing.JTextField ttotal2;
    public javax.swing.JTextField ttotal3;
    public javax.swing.JTextField ttotal4;
    public javax.swing.JTextField ttotal5;
    public javax.swing.JTextField ttotal6;
    public javax.swing.JTextField ttotal7;
    public javax.swing.JTextField ttotal8;
    public javax.swing.JTextField ttotal9;
    private javax.swing.JLabel vttttt;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE; //Se crea para hacer una sola impresión, empezará por la pág cero
        }

        Graphics2D hub = (Graphics2D) graf;//Se le reconoce como objeto
        hub.translate(pagfor.getImageableX() + 15, pagfor.getImageableY() + 15); //Para que no salga pegado a la página la impresión
        hub.scale(1.0, 1.0);

        Recibo.printAll(graf); //Lo que se va a imprimir
        return PAGE_EXISTS;
    }
}
