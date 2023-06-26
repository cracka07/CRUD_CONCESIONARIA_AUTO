
package gui;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Automovil;
import logica.Controladora;

public class ConsultarAutomovil extends javax.swing.JFrame {
        Controladora control=new Controladora();
    /**
     * Creates new form ConsultarAutomovil
     */
    public ConsultarAutomovil() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAuto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTA DE AUTOMÓVILES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 120, -1));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 30));

        tblAuto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAuto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 110));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toyota_Thailand_1671078833945_1672574388288_1672574388288.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            //Control de que la tabla no esté vacía 
            if(tblAuto.getRowCount()>0){
                //Valido que se haya seleccionado un registro
                //Las tablas se empiezan a contar desde cero
                if(tblAuto.getSelectedRow()!=-1){
                    int idAuto=Integer.parseInt(String.valueOf( tblAuto.getValueAt(tblAuto.getSelectedRow(), 0)));
                    control.borrarAuto(idAuto);
                    mostrarMensaje("Auto  eliminado correctamente", "Info", "Eliminado exitoso");
                    cargarTabla();
                }else{
                    mostrarMensaje("No se seleccionó registro para eliminar", "Error", "Error al eliminar");
                }
            }else{
                mostrarMensaje("La tabla se encuentra vacía, no se puede eliminar","Error","Error al eliminar");
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         //Control de que la tabla no esté vacía 
            if(tblAuto.getRowCount()>0){
                //Valido que se haya seleccionado un registro
                //Las tablas se empiezan a contar desde cero
                if(tblAuto.getSelectedRow()!=-1){
                   int idAuto=Integer.parseInt(String.valueOf( tblAuto.getValueAt(tblAuto.getSelectedRow(), 0)));
                   EditarAuto editAuto=new EditarAuto(idAuto);
                   editAuto.setVisible(true);
                   editAuto.setLocationRelativeTo(null);
                   this.dispose();
                   }else{
                    mostrarMensaje("No se seleccionó registro para editar", "Error", "Error al editar");
                }
            }else{
                mostrarMensaje("La tabla se encuentra vacía, no se puede editar","Error","Error al editar");
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Interfaz principal=new Interfaz();
      principal.setVisible(true);
      principal.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   public void mostrarMensaje(String mensaje,String tipo, String titulo){
       JOptionPane optionPane=new JOptionPane(mensaje);
       if(tipo.equals("Info")){
           optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
       }
        JDialog dialog=optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAuto;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
          DefaultTableModel tableModel=new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
        
    };
    String titulo[]={"Id","Modelo","Marca","Motor","Color","Patente","Puertas"};
    tableModel.setColumnIdentifiers(titulo);
    
    
    //traer los autos desde la base de datos
    List<Automovil>listaAutomovil=control.traerAutos();
    //Setear los datos en la tabla
    if(listaAutomovil!=null){
        for(Automovil auto:listaAutomovil){
            Object[] objecto={
            auto.getId(),auto.getModelo(),auto.getMarca(),auto.getMotor(),auto.getColor(),auto.getPatente(),auto.getCantPuertas()
            
           
        };
             tableModel.addRow(objecto);
        }
    }
    
    
    tblAuto.setModel(tableModel);
    }


}