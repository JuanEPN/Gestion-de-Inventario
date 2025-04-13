package proyectofinal.Vista;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import proyectofinal.Controlador.GestionProovedor;
import proyectofinal.Controlador.GestionAdmin; 
import proyectofinal.Modelo.Empleado;
import proyectofinal.Modelo.Proovedor;






public class Vistaadministrador extends javax.swing.JFrame {
    GestionProovedor controlador = new GestionProovedor(this);
    GestionAdmin controladorA = new GestionAdmin(this);

    public Vistaadministrador() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        cuadroIDE = new javax.swing.JTextField();
        cuadroTelefonoE = new javax.swing.JTextField();
        cuadroHorarioE = new javax.swing.JTextField();
        cuadroIDrolE = new javax.swing.JTextField();
        cuadroSueldoE = new javax.swing.JTextField();
        agregarE = new javax.swing.JButton();
        buscarE = new javax.swing.JButton();
        editarE = new javax.swing.JButton();
        borrarE = new javax.swing.JButton();
        cuadroNombreE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        cuadroNombreProovedor = new javax.swing.JTextField();
        cuadroIDProovedor = new javax.swing.JTextField();
        cuadroTelefonoProovedor = new javax.swing.JTextField();
        cuadroCorreoProovedor = new javax.swing.JTextField();
        cuadroDireccionProovedor = new javax.swing.JTextField();
        agregarProovedor = new javax.swing.JButton();
        buscarProovedor = new javax.swing.JButton();
        editarProovedor = new javax.swing.JButton();
        borrarProovedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        limpiarTProv = new javax.swing.JButton();
        limpiarTEmp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Registro Empleado");

        jLabel3.setText("Nombre completo:");

        jLabel4.setText("ID: ");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Horario");

        jLabel7.setText("ID_rol");

        jLabel8.setText("Sueldo:");

        agregarE.setText("AGREGAR");
        agregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEActionPerformed(evt);
            }
        });

        buscarE.setText("BUSCAR");
        buscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEActionPerformed(evt);
            }
        });

        editarE.setText("EDITAR");
        editarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEActionPerformed(evt);
            }
        });

        borrarE.setText("BORRAR");
        borrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarEActionPerformed(evt);
            }
        });

        cuadroNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroNombreEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuadroNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(agregarE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarE)
                                .addGap(18, 18, 18)
                                .addComponent(editarE)
                                .addGap(18, 18, 18)
                                .addComponent(borrarE))
                            .addComponent(cuadroIDrolE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuadroTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cuadroIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cuadroHorarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cuadroSueldoE, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadroTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cuadroHorarioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cuadroSueldoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cuadroIDrolE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarE)
                    .addComponent(buscarE)
                    .addComponent(editarE)
                    .addComponent(borrarE))
                .addGap(220, 220, 220)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProv);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Registro Proovedor");

        jLabel11.setText("Nombre completo:");

        jLabel12.setText("ID: ");

        jLabel13.setText("Telefono:");

        jLabel14.setText("Correo:");

        jLabel15.setText("Dirección:");

        cuadroNombreProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroNombreProovedorActionPerformed(evt);
            }
        });

        agregarProovedor.setText("AGREGAR");
        agregarProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProovedorActionPerformed(evt);
            }
        });

        buscarProovedor.setText("BUSCAR");
        buscarProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProovedorActionPerformed(evt);
            }
        });

        editarProovedor.setText("EDITAR");
        editarProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProovedorActionPerformed(evt);
            }
        });

        borrarProovedor.setText("BORRAR");
        borrarProovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarProovedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuadroNombreProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuadroTelefonoProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuadroIDProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuadroCorreoProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarProovedor)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarProovedor)
                                .addGap(18, 18, 18)
                                .addComponent(editarProovedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(borrarProovedor))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(cuadroDireccionProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroNombreProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroIDProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuadroTelefonoProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cuadroCorreoProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cuadroDireccionProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarProovedor)
                    .addComponent(buscarProovedor)
                    .addComponent(editarProovedor)
                    .addComponent(borrarProovedor))
                .addGap(169, 169, 169)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaE.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablaE);
        tablaE.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        limpiarTProv.setText("LIMPIAR TABLA");
        limpiarTProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarTProvActionPerformed(evt);
            }
        });

        limpiarTEmp.setText("LIMPIAR TABLA");
        limpiarTEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarTEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(limpiarTEmp)
                                .addGap(267, 267, 267))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarTProv)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarTEmp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarTProv)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreEActionPerformed

    private void cuadroNombreProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroNombreProovedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreProovedorActionPerformed

    private void agregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEActionPerformed

        controladorA.registrarEmpleado();
        controladorA.limpiarCamposEmpleado();
        controladorA.consultarEmpleados();
        System.out.print("Metodo registrado empleado tabla");
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)tablaE.getModel();  
        ArrayList<Empleado> empleados=controladorA.consultarEmpleados();  
        Empleado empleadoA = empleados.get(empleados.size()-1); 
        Object[] newRow = {empleadoA.getNombreempleado(), empleadoA.getIdempleado(), empleadoA.getHorarioempleado(), empleadoA.getNumeroempleado(), empleadoA.getRolempleado(), empleadoA.getSueldoempleado()};
        model.addRow(newRow);
    }//GEN-LAST:event_agregarEActionPerformed

    private void buscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEActionPerformed
        ArrayList<Empleado> empleados=controladorA.buscarporId(Integer.parseInt(cuadroIDE.getText())); 
        DefaultTableModel modelo = (DefaultTableModel) tablaE.getModel();
        modelo.setRowCount(0);
        for (Empleado e : empleados) {
            cuadroIDE.setText(String.valueOf(e.getIdempleado()));
            cuadroNombreE.setText(e.getNombreempleado());
            cuadroTelefonoE.setText(e.getNumeroempleado());
            cuadroHorarioE.setText(e.getHorarioempleado());
            cuadroSueldoE.setText(String.valueOf(e.getSueldoempleado())); 
            cuadroIDrolE.setText(e.getRolempleado());
            
        Object[] rowData = {e.getIdempleado(), e.getNombreempleado(), e.getNumeroempleado(), e.getHorarioempleado(), e.getSueldoempleado(), e.getRolempleado()};
        modelo.addRow(rowData);
        }
    }//GEN-LAST:event_buscarEActionPerformed

        
        
    private void agregarProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProovedorActionPerformed
        controlador.registrarProveedor();
        controlador.limpiarCamposProveedor();
        controlador.consultarProveedores();
        System.out.print("Metodo registrado proveedor tabla");
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)tablaProv.getModel();  
        ArrayList<Proovedor> empleados=controlador.consultarProveedores();  
        Proovedor pr1 = empleados.get(empleados.size()-1); 
        Object[] newRow = {pr1.getNombreproovedor(), pr1.getIdproovedor(), pr1.getCorreoproovedor(), pr1.getDireccionproovedor(), pr1.getNumeroproovedor()};
        model.addRow(newRow);
    }//GEN-LAST:event_agregarProovedorActionPerformed

    private void editarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEActionPerformed

        int id = Integer.parseInt(cuadroIDE.getText());
        controladorA.actualizarEmpleado(id);
        controladorA.limpiarCamposEmpleado();
        controladorA.consultarEmpleados();
    }//GEN-LAST:event_editarEActionPerformed

    private void borrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarEActionPerformed
        int fila=tablaE.getSelectedRow(); 
        
        int id = Integer.parseInt(cuadroIDE.getText());
        controladorA.limpiarCamposEmpleado();
        controladorA.consultarEmpleados();
    }//GEN-LAST:event_borrarEActionPerformed

    private void buscarProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProovedorActionPerformed
        ArrayList<Proovedor> proveedores=controlador.buscarporId(cuadroIDProovedor.getText()); 
        DefaultTableModel modelo = (DefaultTableModel) tablaProv.getModel();
        modelo.setRowCount(0);
        for (Proovedor p : proveedores) {
        cuadroIDProovedor.setText(String.valueOf(p.getIdproovedor()));
        cuadroNombreProovedor.setText(p.getNombreproovedor());
        cuadroTelefonoProovedor.setText(p.getNumeroproovedor());
        cuadroCorreoProovedor.setText(p.getCorreoproovedor());
        cuadroDireccionProovedor.setText(p.getDireccionproovedor());
        Object[] rowData = {p.getIdproovedor(), p.getNombreproovedor(),p.getDireccionproovedor(),p.getNumeroproovedor(), p.getCorreoproovedor()};
        modelo.addRow(rowData);
        }
    }//GEN-LAST:event_buscarProovedorActionPerformed

    private void editarProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProovedorActionPerformed
         int id = Integer.parseInt(cuadroIDProovedor.getText());
        controlador.actualizarProveedor(id);
        controlador.limpiarCamposProveedor();
        controlador.consultarProveedores();
    }//GEN-LAST:event_editarProovedorActionPerformed

    private void borrarProovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarProovedorActionPerformed
       int id = Integer.parseInt(cuadroIDProovedor.getText());
        controlador.eliminarProveedor();
        controlador.consultarProveedores();
    }//GEN-LAST:event_borrarProovedorActionPerformed

    private void tablaProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaProvMouseClicked

    private void limpiarTEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarTEmpActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaE.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_limpiarTEmpActionPerformed

    private void limpiarTProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarTProvActionPerformed
         DefaultTableModel modelo = (DefaultTableModel) tablaProv.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_limpiarTProvActionPerformed

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
            java.util.logging.Logger.getLogger(Vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistaadministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vistaadministrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarE;
    private javax.swing.JButton agregarProovedor;
    private javax.swing.JButton borrarE;
    private javax.swing.JButton borrarProovedor;
    private javax.swing.JButton buscarE;
    private javax.swing.JButton buscarProovedor;
    private javax.swing.JTextField cuadroCorreoProovedor;
    private javax.swing.JTextField cuadroDireccionProovedor;
    private javax.swing.JTextField cuadroHorarioE;
    private javax.swing.JTextField cuadroIDE;
    private javax.swing.JTextField cuadroIDProovedor;
    private javax.swing.JTextField cuadroIDrolE;
    private javax.swing.JTextField cuadroNombreE;
    private javax.swing.JTextField cuadroNombreProovedor;
    private javax.swing.JTextField cuadroSueldoE;
    private javax.swing.JTextField cuadroTelefonoE;
    private javax.swing.JTextField cuadroTelefonoProovedor;
    private javax.swing.JButton editarE;
    private javax.swing.JButton editarProovedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton limpiarTEmp;
    private javax.swing.JButton limpiarTProv;
    private javax.swing.JTable tablaE;
    private javax.swing.JTable tablaProv;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getCuadroCorreoE() {
        return cuadroHorarioE;
    }

    public javax.swing.JTextField getCuadroCorreoProovedor() {
        return cuadroCorreoProovedor;
    }

    public javax.swing.JTextField getCuadroDireccionProovedor() {
        return cuadroDireccionProovedor;
    }

    public javax.swing.JTextField getCuadroIDE() {
        return cuadroIDE;
    }

    public javax.swing.JTextField getCuadroIDProovedor() {
        return cuadroIDProovedor;
    }

    public javax.swing.JTextField getCuadroNombreE() {
        return cuadroNombreE;
    }

    public javax.swing.JTextField getCuadroNombreProovedor() {
        return cuadroNombreProovedor;
    }

    

    public javax.swing.JTextField getCuadroSueldoE() {
        return cuadroSueldoE;
    }

    public javax.swing.JTextField getCuadroTelefonoE() {
        return cuadroTelefonoE;
    }

    public javax.swing.JTextField getCuadroTelefonoProovedor() {
        return cuadroTelefonoProovedor;
    }

    public javax.swing.JTextField getCuadroIDrolE() {
        return cuadroIDrolE;
    }

    public JTextField getCuadroHorarioE() {
        return cuadroHorarioE;
    }

    public void setCuadroCorreoProovedor(JTextField cuadroCorreoProovedor) {
        this.cuadroCorreoProovedor = cuadroCorreoProovedor;
    }

    public void setCuadroDireccionProovedor(JTextField cuadroDireccionProovedor) {
        this.cuadroDireccionProovedor = cuadroDireccionProovedor;
    }

    public void setCuadroHorarioE(JTextField cuadroHorarioE) {
        this.cuadroHorarioE = cuadroHorarioE;
    }

    public void setCuadroIDE(JTextField cuadroIDE) {
        this.cuadroIDE = cuadroIDE;
    }

    public void setCuadroIDProovedor(JTextField cuadroIDProovedor) {
        this.cuadroIDProovedor = cuadroIDProovedor;
    }

    public void setCuadroIDrolE(JTextField cuadroIDrolE) {
        this.cuadroIDrolE = cuadroIDrolE;
    }

    public void setCuadroNombreE(JTextField cuadroNombreE) {
        this.cuadroNombreE = cuadroNombreE;
    }
    
    
    
    

 
}
