package JSO.Com.ControllPanels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox.DataPackanimationStartEnd;
import JSO.Com.DataBox_cutom.DatabaseMain;
import JSO.Com.Main.ImagePanel;
import JSO.Com.Main.TimerTimer;
import JSO.Com.Main.TimerUser;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Shayan
 */
public class ControllPanelx extends javax.swing.JPanel implements TimerUser {

    // private QueuingSystem queuingSystem;
    TimerTimer timer;
    ControolPack controolPack;
    DatabaseMain databaseM;
//    Database1 database1;
    Controll controll;
//    PanelFixFrame fixFrame;
    ImagePanel imageme;
    
    boolean newsha = true;
    
    boolean timertimeCounterActive, timerCounterMainDirection, timerPart2;
    int timeCounterTime;
    long timeBase, timeCounterMain;
    PanelVisAnimBool animBool[];
    PanelAnimationStartEnd animationStartEnd[];

//    File file
    /**
     * Creates new form frameController
     */
    public ControllPanelx(Controll controll) {
        newsha = false;
        initComponents();
        this.controll = controll;
        this.controolPack = controll.getControolPack();
        this.databaseM = controll.getDatabase0();
//        database1 = controll.getDatabase1();
        timer = new TimerTimer(this, 0, 0, 600, 0);
        timer.setWait(10);
        timer.setWaitTimeAbselute(true);
        timer.setActive(false);
        timer.start();
        
        initcombo();
        initdata();
        initStroke();

//        fixFrame = new PanelFixFrame(this, "pictures\\");
//        jTabbedPane1.add("نمایش تصویر ثابت", fixFrame);
//        sounds = new Sounds();
        newsha = true;
        jComboBox1.setSelectedIndex(databaseM.getLastvisanimsIndex());
        timer.setActive(true);
        timerPart2 = false;
        
    }
    
    private void choosePic() {
        
        java.awt.FileDialog fd = new java.awt.FileDialog(new JFrame("انتخاب عکس"), "انتخاب تصاویر", java.awt.FileDialog.LOAD);
//fd.setMultipleMode(true);
        //  fd.setDirectory(settingPack.getPath());
        fd.setVisible(true);
        imageme.setString(fd.getFiles()[0].getAbsolutePath());
        if (fd.getFile() == null) {
            return;
        } else {
            File files = fd.getFiles()[0];
            imageme.drawImage(files);
        }
    }
    
    private void resetVisAnimBycombo() {

        jTextFieldNamegg.setText(databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getNameG());
//        System.out.print("981105-  k1="+k);
        boolean b = newsha;
        newsha = false;
        jPanel4.removeAll();
        jPanel5.removeAll();
        int k = databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getVisanimbools().size();
        jSpinnerVisanimbool.setValue(k);
        animBool = new PanelVisAnimBool[k];
        
        for (int i = 0; i < k; i++) {
            animBool[i] = new PanelVisAnimBool(databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getVisanimbools(i));
            jPanel4.add(animBool[i]);
        }
//          System.out.print("981105-  k2="+k);
        k = databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getaRateFromENds().size();
        jSpinneranimrateseq.setValue(k);
        animationStartEnd = new PanelAnimationStartEnd[k];
        for (int i = 0; i < k; i++) {
            animationStartEnd[i] = new PanelAnimationStartEnd(databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getaRateFromENds(i));
            jPanel5.add(animationStartEnd[i]);
        }
        updateUI();
        newsha = b;
    }
    
    void resetVisAnimValues(int vis, int seq) {
        if (newsha) {
            databaseM.getVisanims(databaseM.getLastvisanimsIndex()).setVisanimboolssetSize(vis);
            databaseM.getVisanims(databaseM.getLastvisanimsIndex()).setaRateFromENdsSize(seq);
            
            resetVisAnimBycombo();
        }
    }

    
    
    static class MyActionListener extends AbstractAction {
        
        ControllPanelx x;
        
        MyActionListener(ControllPanelx x, String action) {
            
            super(action);
            this.x = x;
        }
        
        @Override
        
        public void actionPerformed(ActionEvent event) {

//            System.out.println(getValue(Action.NAME));
            switch ((String) getValue(Action.NAME)) {
                case "start":
//                    x.jToggleButtonTimer.setSelected(true);
//                    x.startStopTimer();
                    break;
                
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel42 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonMines = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButtonAdd1 = new javax.swing.JButton();
        jButtonAdd2 = new javax.swing.JButton();
        jTextFieldNamegg = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerVisanimbool = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinneranimrateseq = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jSpinnerTop1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanelPic = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSpinnerspped = new javax.swing.JSpinner();
        jSpinnerspped1 = new javax.swing.JSpinner();
        jSpinnerspped2 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setForeground(new java.awt.Color(153, 0, 0));
        setLayout(new java.awt.BorderLayout());

        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        jPanel67.setLayout(new java.awt.GridLayout(1, 0));
        jPanel42.add(jPanel67);

        add(jPanel42, java.awt.BorderLayout.NORTH);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.BorderLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox1, java.awt.BorderLayout.CENTER);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jButtonAdd.setText("+");
        jButtonAdd.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonAdd);

        jButtonMines.setText("-");
        jButtonMines.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonMines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinesActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonMines);

        jPanel8.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel8);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jButtonAdd1.setText("c");
        jButtonAdd1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonAdd1);

        jButtonAdd2.setText("v");
        jButtonAdd2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonAdd2);

        jPanel10.add(jPanel11, java.awt.BorderLayout.WEST);

        jTextFieldNamegg.setText("jTextField2");
        jPanel10.add(jTextFieldNamegg, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("visanimbool");
        jPanel6.add(jLabel1);

        jSpinnerVisanimbool.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerVisanimbool.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerVisanimbool.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerVisanimboolStateChanged(evt);
            }
        });
        jPanel6.add(jSpinnerVisanimbool);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("animsation");
        jPanel7.add(jLabel2);

        jSpinneranimrateseq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinneranimrateseq.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinneranimrateseq.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinneranimrateseqStateChanged(evt);
            }
        });
        jPanel7.add(jSpinneranimrateseq);

        jPanel3.add(jPanel7);

        jButton1.setText("send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanel4);

        jPanel1.add(jScrollPane1);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(jPanel5);

        jPanel1.add(jScrollPane2);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("tab3", jPanel2);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("jTextField1");

        jButton18.setText("B");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jSpinnerTop1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerTop1.setModel(new javax.swing.SpinnerNumberModel(13, null, null, 1));
        jSpinnerTop1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerTop1StateChanged(evt);
            }
        });

        jCheckBox1.setText("vis");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setText("motion");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("imageSeq");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jPanelPic.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPic.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanelPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPicMouseClicked(evt);
            }
        });
        jPanelPic.setLayout(new java.awt.GridLayout(1, 0));

        jButton19.setText("B");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton4.setText("test");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jSpinnerspped.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerspped.setModel(new javax.swing.SpinnerNumberModel(-25, null, null, 1));
        jSpinnerspped.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnersppedStateChanged(evt);
            }
        });

        jSpinnerspped1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerspped1.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerspped1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerspped1StateChanged(evt);
            }
        });

        jSpinnerspped2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerspped2.setModel(new javax.swing.SpinnerNumberModel(25, null, null, 1));
        jSpinnerspped2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerspped2StateChanged(evt);
            }
        });

        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addComponent(jSpinnerTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel70Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jCheckBox1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerspped, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerspped1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel70Layout.createSequentialGroup()
                                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jSpinnerspped2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel70Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jSpinnerTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinnerspped, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerspped1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerspped2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)))
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel70);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int id = (int) jSpinnerTop1.getValue();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        controolPack.addDatapackString(id, jTextField1.getText());
        controolPack.addDatapackImage(id, imageme.getAddress());
        controll.SendControolPack();
//        test t = new test(jTextField1.getText());
//                Gson gson = new Gson();
//                DatabaseMain d = new DatabaseMain();
//        String rrrr = gson.toJson(t);
//        System.out.println("\t\tt="+d+" \trrr="+rrrr);
//        controll.Sendserver(rrrr);
    }//GEN-LAST:event_jButton18ActionPerformed
    public class test {
        
        int x = (int) jSpinnerTop1.getValue();
        String st;
        
        public test(String st) {
            this.st = st;
        }
        
    }
    private void jSpinnerTop1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerTop1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerTop1StateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        int id = (int) jSpinnerTop1.getValue();
        
        controolPack.addVis_Anim_Bool(id, jCheckBox1.isSelected());
//        System.out.println("id=" + id + "     bool=" + jCheckBox1.isSelected());
        controll.SendControolPack();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        int id = (int) jSpinnerTop1.getValue();
        
        controolPack.addVis_Anim_Bool(id, jCheckBox1.isSelected(), jCheckBox2.isSelected(), 1, jCheckBox3.isSelected());
//        System.out.println("id=" + id + "     bool=" + jCheckBox1.isSelected());
        controll.SendControolPack();
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        // TODO add your handling code here:
        int id = (int) jSpinnerTop1.getValue();
        controolPack.addVis_Anim_Bool(id, jCheckBox1.isSelected(), jCheckBox2.isSelected(), 1, jCheckBox3.isSelected());
        if (jCheckBox4.isSelected()) {
            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(id, (int) jSpinnerspped.getValue(), (int) jSpinnerspped1.getValue(), (int) jSpinnerspped2.getValue()));
        } else {
            controolPack.getDataPackanimationStartEnds().add(new DataPackanimationStartEnd(id, (int) jSpinnerspped.getValue()));
        }
        System.out.println("id=" + id + "     animrate=" + (int) jSpinnerspped.getValue());
        controll.SendControolPack();
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jPanelPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPicMouseClicked
        // TODO add your handling code here:
        choosePic();
    }//GEN-LAST:event_jPanelPicMouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int id = (int) jSpinnerTop1.getValue();
        String st = "-ن \ufe07\ufe68 \ufe07\ufe5e ";
        controolPack.addDatapackString(id, st);
        controll.SendControolPack();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jSpinnersppedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnersppedStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnersppedStateChanged

    private void jSpinnerspped1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerspped1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerspped1StateChanged

    private void jSpinnerspped2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerspped2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerspped2StateChanged

    private void jSpinnerVisanimboolStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerVisanimboolStateChanged
        // TODO add your handling code here:
        resetVisAnimValues((int) jSpinnerVisanimbool.getValue(), (int) jSpinneranimrateseq.getValue());
    }//GEN-LAST:event_jSpinnerVisanimboolStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sendxxx();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinneranimrateseqStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinneranimrateseqStateChanged
        // TODO add your handling code here:
        resetVisAnimValues((int) jSpinnerVisanimbool.getValue(), (int) jSpinneranimrateseq.getValue());
    }//GEN-LAST:event_jSpinneranimrateseqStateChanged

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        if (newsha) {
            databaseM.setLastvisanimsIndex(jComboBox1.getSelectedIndex());
            resetVisAnimBycombo();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        if (newsha) {
            addnewvisanim();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonMinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinesActionPerformed
        // TODO add your handling code here:
         if (newsha) {
            addnewvisanimMin();
        }
    }//GEN-LAST:event_jButtonMinesActionPerformed

    private void jButtonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd1ActionPerformed
        // TODO add your handling code here:
        copy();
    }//GEN-LAST:event_jButtonAdd1ActionPerformed

    private void jButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd2ActionPerformed
        // TODO add your handling code here:
        paste();
    }//GEN-LAST:event_jButtonAdd2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controll.sounds.playmp31("sounds\\Casual-friday-electronic-beat-music.mp3");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAdd1;
    private javax.swing.JButton jButtonAdd2;
    private javax.swing.JButton jButtonMines;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelPic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerTop1;
    private javax.swing.JSpinner jSpinnerVisanimbool;
    private javax.swing.JSpinner jSpinneranimrateseq;
    private javax.swing.JSpinner jSpinnerspped;
    private javax.swing.JSpinner jSpinnerspped1;
    private javax.swing.JSpinner jSpinnerspped2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNamegg;
    // End of variables declaration//GEN-END:variables

    private void saveDatabase() {
        controll.saveDatabase();
    }
    
    private void initdata() {
//        databaseM = new FileManipulat().loadDatabasealfabet(databasefilename);
//        jSpinnerMinute2.setValue(databaseM.getResetmin());
//        jSpinnerMinute1.setValue(databaseM.getResetmin());
//        jSpinnerSecond1.setValue(databaseM.getResetsec());
//        jSpinnerSecond2.setValue(databaseM.getResetsec());

    }
    
    private void initcombo() {
        jComboBox1.removeAllItems();
        if(databaseM.getVisanims().size()<1)databaseM.addVisanims("0 first");
        for (int i = 0; i < databaseM.getVisanims().size(); i++) {
            jComboBox1.addItem(i+"-"+databaseM.getVisanims(i).getNameG());
        }
    }
    
    void initStroke() {
        String aKey = "Action";

//        KeyStroke keStroke = KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0);
//        Action act = new MyActionListener(this, "start");
//        InputMap iMap = jButton1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//        iMap.put(keStroke, aKey);
//        ActionMap actionMap = jButton1.getActionMap();
//        actionMap.put(aKey, act);
    }
    
    private void updateControlpack() {
        for (DatabaseMain.VIsanimBool visanimbool : databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getVisanimbools()) {
            controolPack.addVis_Anim_Bool(visanimbool);
        }
        for (DatabaseMain.animRateFromENd aRateFromENd : databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getaRateFromENds()) {
            controolPack.addDataPackanimationStartEnds(aRateFromENd);
        }
    }
    
    private void updateControlpackAndsend() {
        updateControlpack();
        controll.SendControolPack();
    }
    
    private void updateDatabase() {
        if (newsha) {
            databaseM.getVisanims(databaseM.getLastvisanimsIndex()).setNameG(jTextFieldNamegg.getText());
            for (int i = 0; i < animBool.length; i++) {
                animBool[i].getVisAnimBool(databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getVisanimbools(i));
            }
            for (int i = 0; i < animationStartEnd.length; i++) {
                animationStartEnd[i].getAnimationStartEnd(databaseM.getVisanims(databaseM.getLastvisanimsIndex()).getaRateFromENds(i));
            }
            saveDatabase();
        }
    }
    
    public void showFixOn(int picnumber, int fix_in_out, String pic) {
        
    }
    
    public void showFixOff(int picnumber, int fix_out) {
    }
    
    void sendTime(int minuten, int secondn) {
        databaseM.setTime(minuten * 60 + secondn);
        
    }
    
    @Override
    public void updatetime(long timeB) {
//        System.out.println("970128-timeB=" + timeB +"\ttimerCounterMainDirection= "+timerCounterMainDirection+ "\ttimerforcountdown= " + timertimeCounterActive + "\ttimeCountdownBase= " + timeCounterMain + "\t timeCounterTime=" + timeCounterTime);
        timeBase = timeB;
        int time = (int) Math.abs(timeB - timeCounterMain) / 1000;
        
        if (timertimeCounterActive && time > 0) {
            
        }
    }
    
    private void updateDataFromscreen() {
        updateDatabase();
    }
    
    private void updateDatabBaseAndSendPAck() {
        updateDatabase();
        updateControlpack();
        controll.SendControolPack();
        saveDatabase();
    }
    
    private void sendxxx() {
        updateDatabase();
        updateControlpack();
        controll.SendControolPack();
    }

    private void addnewvisanim() {
        String st = "";
        st = JOptionPane.showInputDialog(null, "enter name");
        boolean b = newsha;
        newsha = false;
        databaseM.addVisanims(st);
        initcombo();
        newsha = b;
//        if (databaseM.getLastvisanimsIndex() < databaseM.getVisanims().size() - 1) {
            jComboBox1.setSelectedIndex(databaseM.getVisanims().size() - 1);
//        }

        updateDatabase();
    }
    
     private void addnewvisanimMin() {
//        String st = "";
//        st = JOptionPane.showInputDialog(null, "enter name");
int k = jComboBox1.getSelectedIndex();
if(databaseM.getVisanims().size()>1){
        boolean b = newsha;
        newsha = false;
        databaseM.getVisanims().remove(k);
        initcombo();
        newsha = b;
        if (databaseM.getLastvisanimsIndex()-1 < databaseM.getVisanims().size() && databaseM.getLastvisanimsIndex()>=0 ) {
            jComboBox1.setSelectedIndex(databaseM.getLastvisanimsIndex() - 1);
        }
    }else JOptionPane.showMessageDialog(new JButton("GG"), "there will be empty");

        updateDatabase();
     }

     private void copy() {
         databaseM.getSettingshowgroupsClipboard().getVisanimbools().clear();
         databaseM.getSettingshowgroupsClipboard().getaRateFromENds().clear();
            for (int i = 0; i < animBool.length; i++) {
                animBool[i].getVisAnimBool(databaseM.getSettingshowgroupsClipboard().getVisanimbools(i));
            }
            for (int i = 0; i < animationStartEnd.length; i++) {
                animationStartEnd[i].getAnimationStartEnd(databaseM.getSettingshowgroupsClipboard().getaRateFromENds(i));
            }
                    updateDatabase();
    }
     private void  paste(){
        boolean b = newsha;
        newsha = false;
        jPanel4.removeAll();
        jPanel5.removeAll();
        int k = databaseM.getSettingshowgroupsClipboard().getVisanimbools().size();
        jSpinnerVisanimbool.setValue(k);
        animBool = new PanelVisAnimBool[k];
        
        for (int i = 0; i < k; i++) {
            animBool[i] = new PanelVisAnimBool(databaseM.getSettingshowgroupsClipboard().getVisanimbools(i));
            jPanel4.add(animBool[i]);
        }
//          System.out.print("981105-  k2="+k);
        k = databaseM.getSettingshowgroupsClipboard().getaRateFromENds().size();
        jSpinneranimrateseq.setValue(k);
        animationStartEnd = new PanelAnimationStartEnd[k];
        for (int i = 0; i < k; i++) {
            animationStartEnd[i] = new PanelAnimationStartEnd(databaseM.getSettingshowgroupsClipboard().getaRateFromENds(i));
            jPanel5.add(animationStartEnd[i]);
        }
        updateUI();
        newsha = b;  
                updateDatabase();
     }
}
