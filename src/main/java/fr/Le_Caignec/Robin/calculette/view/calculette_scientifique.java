package fr.Le_Caignec.Robin.calculette.view;
import fr.Le_Caignec.Robin.calculette.controler.*;

/**
* @author Le Caignec Robin
* Dans cette classe ce trouve le code permetttant de créer l'interface graphique 
* de la calculette Scientifique.
*/

public class calculette_scientifique extends javax.swing.JFrame {

    public calculette_scientifique() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        num_6 = new javax.swing.JButton();
        resultat = new javax.swing.JTextField();
        num_1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        num_4 = new javax.swing.JButton();
        num_0 = new javax.swing.JButton();
        signe = new javax.swing.JButton();
        num_5 = new javax.swing.JButton();
        num_2 = new javax.swing.JButton();
        sinus = new javax.swing.JButton();
        fois = new javax.swing.JButton();
        moins = new javax.swing.JButton();
        egale = new javax.swing.JButton();
        num_3 = new javax.swing.JButton();
        point = new javax.swing.JButton();
        standard = new javax.swing.JToggleButton();
        num_8 = new javax.swing.JButton();
        num_9 = new javax.swing.JButton();
        num_7 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        modulo = new javax.swing.JButton();
        tangente = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        factorielle = new javax.swing.JButton();
        cosinus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        ActionListener_chiffres num_6ActionListener = new ActionListener_chiffres(this);
        num_6.addActionListener( num_6ActionListener );
        num_6.setText("6");
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_6ActionPerformed(evt);
            }
        });

        ActionListener_operation resultatActionListener = new ActionListener_operation(this);
        resultat.addActionListener( resultatActionListener );
        resultat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultat.setText("0");
        resultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultatActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_1ActionListener = new ActionListener_chiffres(this);
        num_1.addActionListener( num_1ActionListener );
        num_1.setText("1");
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_1ActionPerformed(evt);
            }
        });

        ActionListener_operation clearActionListener = new ActionListener_operation(this);
        clear.addActionListener( clearActionListener );
        clear.setBackground(new java.awt.Color(255, 153, 0));
        clear.setText("A/C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_4ActionListener = new ActionListener_chiffres(this);
        num_4.addActionListener( num_4ActionListener );
        num_4.setText("4");
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_4ActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_0ActionListener = new ActionListener_chiffres(this);
        num_0.addActionListener( num_0ActionListener );
        num_0.setText("0");
        num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_0ActionPerformed(evt);
            }
        });

        ActionListener_operation signeActionListener = new ActionListener_operation(this);
        signe.addActionListener( signeActionListener );
        signe.setBackground(new java.awt.Color(255, 153, 0));
        signe.setText("+/-");
        signe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signeActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_5ActionListener = new ActionListener_chiffres(this);
        num_5.addActionListener( num_5ActionListener );
        num_5.setText("5");
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_5ActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_2ActionListener = new ActionListener_chiffres(this);
        num_2.addActionListener( num_2ActionListener );
        num_2.setText("2");
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_2ActionPerformed(evt);
            }
        });

        ActionListener_operation sinusActionListener = new ActionListener_operation(this);
        sinus.addActionListener( sinusActionListener );
        sinus.setBackground(new java.awt.Color(255, 153, 0));
        sinus.setText("sin");
        sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusActionPerformed(evt);
            }
        });

        ActionListener_operation foisActionListener = new ActionListener_operation(this);
        fois.addActionListener( foisActionListener );
        fois.setBackground(new java.awt.Color(255, 153, 0));
        fois.setText("*");
        fois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foisActionPerformed(evt);
            }
        });

        ActionListener_operation moinsActionListener = new ActionListener_operation(this);
        moins.addActionListener( moinsActionListener );
        moins.setBackground(new java.awt.Color(255, 153, 0));
        moins.setText("-");
        moins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsActionPerformed(evt);
            }
        });

        ActionListener_operation egaleActionListener = new ActionListener_operation(this);
        egale.addActionListener( egaleActionListener );
        egale.setBackground(new java.awt.Color(255, 153, 0));
        egale.setText("=");
        egale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egaleActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_3ActionListener = new ActionListener_chiffres(this);
        num_3.addActionListener( num_3ActionListener );
        num_3.setText("3");
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_3ActionPerformed(evt);
            }
        });

        ActionListener_operation pointActionListener = new ActionListener_operation(this);
        point.addActionListener( pointActionListener );
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        standard.setText("Switch to Calculette Standard");
        standard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_8ActionListener = new ActionListener_chiffres(this);
        num_8.addActionListener( num_8ActionListener );
        num_8.setText("8");
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_8ActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_9ActionListener = new ActionListener_chiffres(this);
        num_9.addActionListener( num_9ActionListener );
        num_9.setText("9");
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_9ActionPerformed(evt);
            }
        });

        ActionListener_chiffres num_7ActionListener = new ActionListener_chiffres(this);
        num_7.addActionListener( num_7ActionListener );
        num_7.setText("7");
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_7ActionPerformed(evt);
            }
        });

        ActionListener_operation divActionListener = new ActionListener_operation(this);
        div.addActionListener( divActionListener );
        div.setBackground(new java.awt.Color(255, 153, 0));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        ActionListener_operation moduloActionListener = new ActionListener_operation(this);
        modulo.addActionListener( moduloActionListener );
        modulo.setBackground(new java.awt.Color(255, 153, 0));
        modulo.setText("%");
        modulo.setToolTipText("");
        modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloActionPerformed(evt);
            }
        });

        ActionListener_operation tangenteActionListener = new ActionListener_operation(this);
        tangente.addActionListener( tangenteActionListener );
        tangente.setBackground(new java.awt.Color(255, 153, 0));
        tangente.setText("tan");
        tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteActionPerformed(evt);
            }
        });

        ActionListener_operation plusActionListener = new ActionListener_operation(this);
        plus.addActionListener( plusActionListener );
        plus.setBackground(new java.awt.Color(255, 153, 0));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        ActionListener_operation factorielleActionListener = new ActionListener_operation(this);
        factorielle.addActionListener( factorielleActionListener );
        factorielle.setBackground(new java.awt.Color(255, 153, 0));
        factorielle.setText("x!");
        factorielle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorielleActionPerformed(evt);
            }
        });

        ActionListener_operation cosinusActionListener = new ActionListener_operation(this);
        cosinus.addActionListener( cosinusActionListener );
        cosinus.setBackground(new java.awt.Color(255, 153, 0));
        cosinus.setText("cos");
        cosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num_7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(num_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num_8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(num_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(signe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(factorielle, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fois, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(num_6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(num_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cosinus, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(tangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(moins, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(num_3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(num_0, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(egale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(standard)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(standard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(signe)
                    .addComponent(fois)
                    .addComponent(modulo)
                    .addComponent(factorielle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_8)
                    .addComponent(num_9)
                    .addComponent(num_7)
                    .addComponent(moins)
                    .addComponent(sinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_5)
                    .addComponent(num_4)
                    .addComponent(num_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cosinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_1)
                    .addComponent(num_2)
                    .addComponent(num_3)
                    .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_0)
                        .addComponent(point))
                    .addComponent(egale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

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

    private void num_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_6ActionPerformed

    }//GEN-LAST:event_num_6ActionPerformed

    private void resultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultatActionPerformed

    }//GEN-LAST:event_resultatActionPerformed

    private void num_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_1ActionPerformed

    }//GEN-LAST:event_num_1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

    }//GEN-LAST:event_clearActionPerformed

    private void num_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_4ActionPerformed

    }//GEN-LAST:event_num_4ActionPerformed

    private void num_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_0ActionPerformed
    
    }//GEN-LAST:event_num_0ActionPerformed

    private void signeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signeActionPerformed

    }//GEN-LAST:event_signeActionPerformed

    private void num_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_5ActionPerformed

    }//GEN-LAST:event_num_5ActionPerformed

    private void num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_2ActionPerformed

    }//GEN-LAST:event_num_2ActionPerformed

    private void sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusActionPerformed

    }//GEN-LAST:event_sinusActionPerformed

    private void foisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foisActionPerformed

    }//GEN-LAST:event_foisActionPerformed

    private void moinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsActionPerformed

    }//GEN-LAST:event_moinsActionPerformed

    private void egaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egaleActionPerformed

    }//GEN-LAST:event_egaleActionPerformed

    private void num_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_3ActionPerformed

    }//GEN-LAST:event_num_3ActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed

    }//GEN-LAST:event_pointActionPerformed

    private void num_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_8ActionPerformed

    }//GEN-LAST:event_num_8ActionPerformed

    private void num_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_9ActionPerformed

    }//GEN-LAST:event_num_9ActionPerformed

    private void num_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_7ActionPerformed

    }//GEN-LAST:event_num_7ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed

    }//GEN-LAST:event_divActionPerformed

    private void moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduloActionPerformed

    private void standardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardActionPerformed
        calculette_standard f_st = new calculette_standard(); 
        f_st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_standardActionPerformed

    private void tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tangenteActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusActionPerformed

    private void factorielleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorielleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorielleActionPerformed

    private void cosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosinusActionPerformed

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
            java.util.logging.Logger.getLogger(calculette_scientifique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculette_scientifique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculette_scientifique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculette_scientifique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculette_scientifique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton cosinus;
    private javax.swing.JButton div;
    private javax.swing.JButton egale;
    private javax.swing.JButton factorielle;
    private javax.swing.JButton fois;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modulo;
    private javax.swing.JButton moins;
    private javax.swing.JButton num_0;
    private javax.swing.JButton num_1;
    private javax.swing.JButton num_2;
    private javax.swing.JButton num_3;
    private javax.swing.JButton num_4;
    private javax.swing.JButton num_5;
    private javax.swing.JButton num_6;
    private javax.swing.JButton num_7;
    private javax.swing.JButton num_8;
    private javax.swing.JButton num_9;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JTextField resultat;
    private javax.swing.JButton signe;
    private javax.swing.JButton sinus;
    private javax.swing.JToggleButton standard;
    private javax.swing.JButton tangente;
    // End of variables declaration//GEN-END:variables


    /**
    * Ci-dessous ce trouve les getters permettant de retourner les objets (du 
    * type JButton,JTextField) qui ont été créée dans la calculette scientifique. 
    */ 

    public javax.swing.JButton getClear() {
        return this.clear;
    }

    public javax.swing.JButton getDiv() {
        return this.div;
    }

    public javax.swing.JButton getEgale() {
        return this.egale;
    }

    public javax.swing.JButton getFois() {
        return this.fois;
    }

    public javax.swing.JButton getMoins() {
        return this.moins;
    }

    public javax.swing.JButton getNum_0() {
        return this.num_0;
    }

    public javax.swing.JButton getNum_1() {
        return this.num_1;
    }

    public javax.swing.JButton getNum_2() {
        return this.num_2;
    }

    public javax.swing.JButton getNum_3() {
        return this.num_3;
    }

    public javax.swing.JButton getNum_4() {
        return this.num_4;
    }

    public javax.swing.JButton getNum_5() {
        return this.num_5;
    }

    public javax.swing.JButton getNum_6() {
        return this.num_6;
    }

    public javax.swing.JButton getNum_7() {
        return this.num_7;
    }

    public javax.swing.JButton getNum_8() {
        return this.num_8;
    }

    public javax.swing.JButton getNum_9() {
        return this.num_9;
    }

    public javax.swing.JButton getPlus() {
        return this.plus;
    }

    public javax.swing.JButton getPoint() {
        return this.point;
    }

    public javax.swing.JTextField getResultat() {
        return this.resultat;
    }

    public javax.swing.JButton getModulo() {
        return this.modulo;
    }
    
    public javax.swing.JButton getSigne() {
        return this.signe;
    } 
    
    public javax.swing.JButton getSinus() {
        return this.sinus;
    } 

    public javax.swing.JButton getCosinus() {
        return this.cosinus;
    } 

    public javax.swing.JButton getTangente() {
        return this.tangente;
    } 
    
    public javax.swing.JButton getFactorielle() {
        return this.factorielle;
    }
    
}
