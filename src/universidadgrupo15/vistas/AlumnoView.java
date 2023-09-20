package universidadgrupo15.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadgrupo15.accesoaDatos.AlumnoData;
import universidadgrupo15.entidades.Alumno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Chris
 */
public class AlumnoView extends javax.swing.JInternalFrame {

    private AlumnoData alu=new AlumnoData();
    private Alumno a=new Alumno();
    private boolean activo=false;
    
    
    public AlumnoView() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFecha = new com.toedter.calendar.JDateChooser();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jTEstado = new javax.swing.JRadioButton();
        jTApellido = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        jTFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTFechaPropertyChange(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTEstado.setText("Activo");
        jTEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEstadoActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTEstado)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)))
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTEstado)
                            .addComponent(jLabel5))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        int dni=Integer.parseInt(jTDocumento.getText());
        int id=alu.buscarAlumnoPorDNI(dni).getIdAlumno();
       
        alu.eliminarAlumno(id);
        limpiarFormulario();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        //Guardo en una variable lo que ingresa el usuario por texfield
        
        int dni = Integer.parseInt(jTDocumento.getText());
        String apellido = jTApellido.getText();
        String nombre = jTNombre.getText();
        LocalDate f =jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        a.setDni(dni);
        a.setApellido(apellido);
        a.setNombre(nombre);
        a.setFechaNac(f);
        a.setEstado(activo);
        
        alu.guardarAlumno(a);
        limpiarFormulario();

  
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTFechaPropertyChange
        // TODO add your handling code here:
        if (jTFecha.getDate() != null) {

            LocalDate f= jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-MM-YYYY");
           
        
        }
        
    }//GEN-LAST:event_jTFechaPropertyChange

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
       
        int dni=Integer.parseInt(jTDocumento.getText());
        Alumno a=alu.buscarAlumnoPorDNI(dni);
        jTApellido.setText(a.getApellido());
        jTNombre.setText(a.getNombre());
        jTFecha.setDate(Date.valueOf(a.getFechaNac()));
        jTEstado.setSelected(a.isEstado());
        
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEstadoActionPerformed
        // TODO add your handling code here:
        activo=true;
    }//GEN-LAST:event_jTEstadoActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        try {
            
        
        int dni = Integer.parseInt(jTDocumento.getText());
        String apellido = jTApellido.getText();
        String nombre = jTNombre.getText();
        LocalDate f =jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado=activo;
        int id=alu.buscarAlumnoPorDNI(dni).getIdAlumno();
       
        
        Alumno a1=new Alumno (id,dni,apellido,nombre,f,estado);
        
        alu.modificarAlumno(a1);
        
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                    + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo");
        }
        
        limpiarFormulario();
        
    }//GEN-LAST:event_jBModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JRadioButton jTEstado;
    private com.toedter.calendar.JDateChooser jTFecha;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario(){
    
    jTDocumento.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTFecha.setDate(null);
        jTEstado.setSelected(false);
    
    
    }
}
