
package com.mycompany.caninosshop.IGU;

import com.mycompany.caninosshop.logica.ControladoraLogica;
import com.mycompany.caninosshop.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {

    ControladoraLogica controlLogica = new ControladoraLogica();
    
    public VerDatos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaMascota = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditarDatos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Visualizacion de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Datos de la tabla");

        tblListaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListaMascota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanns\\Downloads\\boton-eliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditarDatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanns\\Downloads\\editar (1).png")); // NOI18N
        btnEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //controlar que la tabla no este vacia
        if (tblListaMascota.getRowCount() > 0) {
            //confirmar que haya selecianado una fila en la tabla
            if (tblListaMascota.getSelectedRow() != -1) {
                //capturar el ID de la fila
                int num_id = Integer.parseInt(String.valueOf(tblListaMascota.getValueAt(tblListaMascota.getSelectedRow(),0)));
                //declara variable = Parseo (retorna String reprentado del objeto(obtener el valor columna fila(Selecciona la fila, valor columna)
                
                
                controlLogica.borrarMascota(num_id);
                //Se llama la logica donde se crea el metodo, y se envia el parametro
                mostrarMensaje(" Se elimino correctamente", "Info"," Eliminar Datos");
                
                
            } else {
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
            
        } else {
            mostrarMensaje(" No es posible eliminar mascota", "Error", "Error al eliminar");
        }
        // Se vuelve a cargar la tabla
        cargarTabla();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosActionPerformed
        // TODO add your handling code here:
        //validar que la lista tenga datos
        if (tblListaMascota.getRowCount() > 0) {
            //confirmar que haya seleccionado una fila
            if (tblListaMascota.getSelectedRow() != -1) {
                // se captura el indice del objeto
                int num_id = Integer.parseInt(String.valueOf(tblListaMascota.getValueAt(tblListaMascota.getSelectedRow(),0)));
                
                ModificarDatos modificarDatos = new ModificarDatos(num_id);
                modificarDatos.setVisible(true); // sea visible el formulario
                modificarDatos.setLocationRelativeTo(null); // este en el centro
                //cerrar ventana
                this.dispose();
            }
            
        }
        
    }//GEN-LAST:event_btnEditarDatosActionPerformed

    private void mostrarMensaje(String mensaje, String tipo, String titulo){
        
        JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equalsIgnoreCase("Info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            } else if (tipo.equalsIgnoreCase("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaMascota;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        //Se define el moledo que tenga la tabla.  clase"DefaulTableModel" ir agregando diferentes partes a la tabla de forma personalizada
        DefaultTableModel modeltabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        
        //Setiando los nombre de las columnas que tendra la tabla
        // Se crea un vertor con los nombre de los columnas
        String titulos[] = {"Num","Nombre","Color","Raza","Alrgico","Ate.Especial","Dueño","Cel"};
        modeltabla.setColumnIdentifiers(titulos);
        
        
        //Cargar los datos desde la base de datos
        List<Mascota> listaMascotas = controlLogica.traerMascotas();
        
        
        //Recorrer la lista y mostrar casda uno de los elementos en la tabla
        if (listaMascotas!=null) { // si tiene datos la lista ingresa al cilo
            for (Mascota listaMascota : listaMascotas) {
                //Creamos un objeto para traer los datos
                Object[] objeto = {listaMascota.getNum_cliente(),listaMascota.getNombre()
                ,listaMascota.getColor(),listaMascota.getRaza(),listaMascota.getAlergico(),
                listaMascota.getAtencion_especial(),listaMascota.getUnDuenio().getNombre(),listaMascota.getUnDuenio().getCelDuenio()};
                
                modeltabla.addRow(objeto);
            }
        }
        tblListaMascota.setModel(modeltabla); // se asigna los valores a la tabla en jframe
        
    }
}
