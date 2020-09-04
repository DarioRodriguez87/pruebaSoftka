/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasajeavion;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN DARIO RODRIGUEZ CUELLAR
 * 
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    
   

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
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

        Panel = new javax.swing.JPanel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelNumDias = new javax.swing.JLabel();
        jLabelDescuento = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelPorcentaje = new javax.swing.JLabel();
        cajaTextoDistancia = new javax.swing.JTextField();
        cajaTextoDias = new javax.swing.JTextField();
        cajaTextoDescuento = new javax.swing.JTextField();
        cajaTextoPrecio = new javax.swing.JTextField();
        ButtonCalcularValorPasaje = new javax.swing.JButton();
        jLabelValorPasaje = new javax.swing.JLabel();
        cajaTextoValorPasajeAvion = new javax.swing.JTextField();
        ButtonLimpiar = new javax.swing.JButton();
        jLabelValorPasajesinDescuento = new javax.swing.JLabel();
        cajaTextoValorsinDescuento = new javax.swing.JTextField();
        IconoPasaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUAN DARIO RODRIGUEZ CUELLAR");

        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Pasaje en Avión"));

        jLabelDistancia.setText("Distancia");

        jLabelNumDias.setText("Numero de Dias");

        jLabelDescuento.setText("Descuento");

        jLabelPrecio.setText("Precio");

        jLabelPorcentaje.setText("%");

        cajaTextoDescuento.setText("30");

        cajaTextoPrecio.setText("35.00");

        ButtonCalcularValorPasaje.setText("Calcular");
        ButtonCalcularValorPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularValorPasajeActionPerformed(evt);
            }
        });

        jLabelValorPasaje.setText("Valor del Pasaje de Avión con % DESCUENTO %");

        ButtonLimpiar.setText("Limpiar");
        ButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelValorPasajesinDescuento.setText("Valor del Pasaje sin Descuento");

        IconoPasaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/iconoPasaje.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(ButtonCalcularValorPasaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLimpiar)
                .addGap(75, 75, 75))
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabelDistancia)
                                .addGap(44, 44, 44)
                                .addComponent(cajaTextoDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabelNumDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaTextoDias, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(cajaTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabelDescuento)
                                .addGap(18, 18, 18)
                                .addComponent(cajaTextoDescuento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPorcentaje)
                        .addGap(16, 16, 16))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorPasaje)
                            .addComponent(jLabelValorPasajesinDescuento))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaTextoValorPasajeAvion, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(cajaTextoValorsinDescuento))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconoPasaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(IconoPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDistancia)
                    .addComponent(jLabelDescuento)
                    .addComponent(cajaTextoDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTextoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPorcentaje))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumDias)
                    .addComponent(jLabelPrecio)
                    .addComponent(cajaTextoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorPasajesinDescuento)
                    .addComponent(cajaTextoValorsinDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorPasaje)
                    .addComponent(cajaTextoValorPasajeAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLimpiar)
                    .addComponent(ButtonCalcularValorPasaje))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCalcularValorPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularValorPasajeActionPerformed
        
        //VALIDANDO LOS CAMPOS VACIOS
        if (cajaTextoDistancia.getText().equals("") || cajaTextoDias.getText().equals("")) {
            
            //MENSAJE ALERTA CAMPOS VACIOS
            JOptionPane.showMessageDialog(this, "EXISTEN CAMPOS VACIOS", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
            
        }
        
        //DECLARACION DE VARIABLES
        int valorPasaje;
        int valorpasajesindescuento;
        int calculoDescuento;
        int distanciaKM = Integer.parseInt(cajaTextoDistancia.getText());
        double descuento = Double.parseDouble(cajaTextoDescuento.getText());
        double precioxKM = Double.parseDouble(cajaTextoPrecio.getText());
        int numDiasEstancia = Integer.parseInt(cajaTextoDias.getText());
        
        //VALIDANDO NUMERO DE DIAS DE ESTANCIA MAYOR A 7 Y DITANCIA - KM MAYOR A 1000
        if (numDiasEstancia > 7 && distanciaKM > 1000) {
            //REALIZANDO CALCULO
            valorpasajesindescuento = (int) (distanciaKM * precioxKM);
            calculoDescuento = (int) ((distanciaKM * precioxKM) * descuento) / 100;
            valorPasaje = valorpasajesindescuento - calculoDescuento;

            //MOSTRANDO RESULTADO SIN DESCUENTO
            cajaTextoValorsinDescuento.setText("" + valorpasajesindescuento);
            //MOSTRANDO RESULTADO CON DESCUENTO
            cajaTextoValorPasajeAvion.setText("" + valorPasaje);
        } else {
            //REALIZANDO CALCULO
            valorPasaje = (int) ((distanciaKM * precioxKM));

            //MOSTRANDO RESULTADO
            cajaTextoValorsinDescuento.setText("" + valorPasaje);
            
        }        
        
    

 
    }//GEN-LAST:event_ButtonCalcularValorPasajeActionPerformed

    private void ButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimpiarActionPerformed
        
        this.cajaTextoDistancia.setText("");
        this.cajaTextoDias.setText("");
        this.cajaTextoValorPasajeAvion.setText("");
        this.cajaTextoValorsinDescuento.setText("");
        
    }//GEN-LAST:event_ButtonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcularValorPasaje;
    private javax.swing.JButton ButtonLimpiar;
    private javax.swing.JLabel IconoPasaje;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField cajaTextoDescuento;
    private javax.swing.JTextField cajaTextoDias;
    private javax.swing.JTextField cajaTextoDistancia;
    private javax.swing.JTextField cajaTextoPrecio;
    private javax.swing.JTextField cajaTextoValorPasajeAvion;
    private javax.swing.JTextField cajaTextoValorsinDescuento;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelNumDias;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelValorPasaje;
    private javax.swing.JLabel jLabelValorPasajesinDescuento;
    // End of variables declaration//GEN-END:variables
}
