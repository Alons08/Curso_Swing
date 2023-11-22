/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JList;

import javax.swing.DefaultListModel;

public class Matricula extends javax.swing.JFrame {
    //Definir un modelo que es necesario para manejo de listas
    private DefaultListModel modelo1 = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();
    
    public Matricula() {
        initComponents();
        //la variable modelo1 es de para la caja de la lista lstCursosS
        lstCursosS.setModel(modelo1);
        lstCostosS.setModel(modelo2);
        //Los botones se inhabiliten desde la ejecución de la aplicación
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCostos = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCursosS = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstCostosS = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbContado = new javax.swing.JRadioButton();
        rbCredito = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIncremento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMPagar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ALUMNO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        getContentPane().add(txtAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 250, -1));

        jLabel2.setText("Seleccionar cursos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Visual Basic", "Power Builder", "Visual Java", "Aplicaciones Web", "Internet" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCursosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCursos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 110));

        lstCostos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "180", "160", "150", "170", "140" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstCostos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, 110));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        lstCursosS.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCursosSValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCursosS);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, 110));

        jScrollPane4.setViewportView(lstCostosS);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 50, 110));

        jLabel3.setText("Cursos Seleccionados:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel4.setText("Forma de pago:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        buttonGroup1.add(rbContado);
        rbContado.setText("Contado");
        getContentPane().add(rbContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        buttonGroup1.add(rbCredito);
        rbCredito.setText("Credito");
        getContentPane().add(rbCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel5.setText("Descuento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 90, -1));

        jLabel6.setText("Incremento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));
        getContentPane().add(txtIncremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 90, -1));

        jLabel7.setText("Monto a Pagar:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
        getContentPane().add(txtMPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 90, -1));

        jLabel8.setText("Total:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double descuento=0, incremento=0, monto;
        int total;
        
        total = Integer.parseInt(txtTotal.getText());
        
        if(rbContado.isSelected())
            descuento = total*0.05;
        if(rbCredito.isSelected())
            incremento = total*0.07;
        
        monto = total - descuento + incremento;
        
        txtDescuento.setText(String.valueOf(descuento));
        txtIncremento.setText(String.valueOf(incremento));
        txtMPagar.setText(String.valueOf(monto));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void lstCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCursosValueChanged
        int indice;
        //recibe el valor del indice seleccionado
        indice = lstCursos.getSelectedIndex();
        //para darle el mismo indice a la caja de la lista lstCostos
        lstCostos.setSelectedIndex(indice);
        //Habilitamos el boton Agregar
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_lstCursosValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String curso, costo;
        int cuenta, i, total=0;
        
        //Almacenamos el curso seleccionado en la lista lstCursos
        curso = (String)lstCursos.getSelectedValue();
        //Almacenamos el costo seleccionado en la lista lstCostos
        costo = (String)lstCostos.getSelectedValue();
        //Agregar un item a una caja de lista
        modelo1.addElement(curso);
        modelo2.addElement(costo);
        //Se almacena el total de items que hay en la lista de lstCostos
        cuenta = modelo2.size();
        /*Extraemos cada uno de los items de la caja de lista lstCostos e ir
          sumando en cada interacción para poder encontrar el costo total de
          los cursos seleccionados*/
        for(i=0; i<cuenta; i++){
            total = total+Integer.parseInt((String)modelo2.elementAt(i));
    //elementAt(): devuelve el item de una caja de lista con solo indicar indice
        }
        //visualizamos el contenido de la variable total
        txtTotal.setText(String.valueOf(total));
        //inhabilitamos el boton btnAgregar
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lstCursosSValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCursosSValueChanged
        int indice;
        //recibe el valor del indice seleccionado
        indice = lstCursosS.getSelectedIndex();
        //para darle el mismo indice a la caja de la lista lstCostos
        lstCostos.setSelectedIndex(indice);
        //habilitamos el boton Agregar 
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_lstCursosSValueChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice, cuenta, total=0;
        //recibe el valor del indice seleccionado
        indice = lstCursosS.getSelectedIndex();
        //eliminamos de cada modelo el indice de lo seleccionado
        modelo1.remove(indice);
        modelo2.remove(indice);
        //reajustamos el tamaño de la cuenta
        cuenta = modelo2.size();
        //recorremos el total de la cuenta, para recalcularlo con lo modificado
        for(int i=0; i<cuenta; i++){
            total = total+Integer.parseInt((String)modelo2.elementAt(i));
        }
        //Imprimimos el nuevo total
        txtTotal.setText(String.valueOf(total));
        //Inhabilitamos el boton btnEliminar
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtAlumno.setText("");
        /*limpiar variables del objeto modelo1 y modelo2 y a la vez a los objetos 
          lstCursosS y lstCostosS*/
        modelo1.clear();
        modelo2.clear();
        txtTotal.setText("");
        txtDescuento.setText("");
        txtIncremento.setText("");
        txtMPagar.setText("");
        /*ponemos el indice 5 ya que dicho indice no existe en la caja,
          lo que hace que se pierda lo seleccionado*/
        lstCursos.setSelectedIndex(5);
        lstCostos.setSelectedIndex(5);
        //Ponemos el cursos del puse aquí
        txtAlumno.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstCostos;
    private javax.swing.JList<String> lstCostosS;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JList<String> lstCursosS;
    private javax.swing.JRadioButton rbContado;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIncremento;
    private javax.swing.JTextField txtMPagar;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
