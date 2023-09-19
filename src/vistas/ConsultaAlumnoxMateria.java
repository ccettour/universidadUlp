/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;


import java.util.*;

import javax.swing.table.DefaultTableModel;
import universidadgrupo15.accesoaDatos.MateriaData;
import universidadgrupo15.accesoaDatos.InscripcionData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;

/**
 *
 * @author User
 */
public class ConsultaAlumnoxMateria extends javax.swing.JInternalFrame {
private DefaultTableModel model=new DefaultTableModel();
InscripcionData ind=new InscripcionData();
    /**
     * Creates new form ConsultaAlumnoxMateria
     */
    public ConsultaAlumnoxMateria() {
        initComponents();
        cabecera();
        llenarCombo();
        
    }

    private void llenarCombo(){
    MateriaData mt=new MateriaData();
    List<Materia>lm=mt.listarMaterias();
    
        for (int i = 0; i < lm.size(); i++) {
           materiasListadas.addItem(lm.get(i).toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        materiasListadas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(482, 368));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 312));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 370, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una Materia :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 20));

        materiasListadas.setToolTipText("");
        materiasListadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiasListadasActionPerformed(evt);
            }
        });
        jPanel1.add(materiasListadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 240, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materiasListadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiasListadasActionPerformed
       
     Materia mate=(Materia)materiasListadas.getSelectedItem();
     List<Alumno> listaN= ind.obtenerAlumnosXMateria(mate.getIdMateria());
            for (Alumno alum : listaN) {
             model.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), 
                                alum.getApellido(), alum.getNombre()});
            }
        

//  model.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), 
//          alumno.getApellido(), alumno.getNombre()});

//private void listarMaterias(boolean cursadas){
//        limpiarTabla();
//        Alumno alumno = (Alumno) jcbAlumnosInsc.getSelectedItem();
//        List<Materia> materias;
//        if(cursadas){
//            materias = ind.obtenerMateriasCursadas(alumno.getIdAlumno());
//        } else {
//            materias = ind.obtenerMateriasNoCursadas(alumno.getIdAlumno());
//        }
//        
//        for (Materia m : materias) {
//            tabla.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
//        }
//    }
    }//GEN-LAST:event_materiasListadasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> materiasListadas;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

private void cabecera(){
    model.addColumn("ID");
    model.addColumn("DNI");
    model.addColumn("Apellido");
    model.addColumn("Nombre");
    tabla.setModel(model);
    
    
}
private void datos(Alumno alum){
model.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), 
                                alum.getApellido(), alum.getNombre()});
}
}