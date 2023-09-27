package universidadgrupo15.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo15.accesoaDatos.*;
import universidadgrupo15.entidades.*;

public class ManipulacionNotasView extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form ManipulacionNotasView
     */
    AlumnoData al = new AlumnoData();
    InscripcionData ind = new InscripcionData();

    public ManipulacionNotasView() {
        initComponents();
        crearCabecera();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jtfMatSelec = new javax.swing.JTextField();
        jcbNota = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setMinimumSize(new java.awt.Dimension(500, 375));
        panel.setPreferredSize(new java.awt.Dimension(500, 375));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 492, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });
        panel.add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 252, -1));

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMateriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtMaterias);

        panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 106, -1, 154));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        panel.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jtfMatSelec.setEditable(false);
        jtfMatSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMatSelecActionPerformed(evt);
            }
        });
        panel.add(jtfMatSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 290, 232, -1));

        jcbNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jcbNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNotaActionPerformed(evt);
            }
        });
        panel.add(jcbNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 50, -1));

        jLabel4.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 24)); // NOI18N
        jLabel4.setText("Carga de Notas");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 40));

        jLabel1.setText("Nombre materia");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel3.setText("Nota");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        cargarTabla();
        
        jtfMatSelec.setText("");
        jcbNota.setSelectedIndex(0);
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int matSelec = jtMaterias.getSelectedRow();
        int idAlu = ((Alumno)jcbAlumnos.getSelectedItem()).getIdAlumno();
        int idMat = (Integer)jtMaterias.getValueAt(matSelec, 0);
        int nota = jcbNota.getSelectedIndex();
        
        ind.actualizarNota(idAlu, idMat, nota);
        
        cargarTabla();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfMatSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMatSelecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMatSelecActionPerformed

    private void jcbNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNotaActionPerformed

    private void jtMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseClicked
        // TODO add your handling code here:
        int matSelec = jtMaterias.getSelectedRow();
        
        jtfMatSelec.setText((String)jtMaterias.getValueAt(matSelec, 1));
        jcbNota.setSelectedIndex((Integer)jtMaterias.getValueAt(matSelec, 2));
    }//GEN-LAST:event_jtMateriasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JComboBox<String> jcbNota;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JTextField jtfMatSelec;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Alumno> alumnos = al.ListarAlumnos();
        for (Alumno alum : alumnos) {

            jcbAlumnos.addItem(alum);
        }
    }

    private void crearCabecera() {
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Nota");
        jtMaterias.setModel(tabla);
    }

    private void limpiarTabla() {
        int f = jtMaterias.getRowCount() - 1;

        for (; f >= 0; f--) {
            tabla.removeRow(f);
        }
    }
    
    private void cargarTabla(){
        limpiarTabla();

        Alumno alumno = (Alumno) jcbAlumnos.getSelectedItem();
        List<Inscripcion> inscripciones;
        inscripciones = ind.obtenerInscripcionesPorAlumno(alumno.getIdAlumno());

        for (Inscripcion i : inscripciones) {
            tabla.addRow(new Object[]{i.getMateria().getIdMateria(), i.getMateria().getNombre(), i.getNota()});
        }
    }
}
