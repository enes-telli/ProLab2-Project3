package netflix;

import java.awt.Color;
import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Question extends javax.swing.JFrame {

    public boolean show = true;

    public static String[] choices = new String[3];
    public static int[] ids = new int[3];

    public Question() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        labelClose = new javax.swing.JLabel();
        panelMin = new javax.swing.JPanel();
        labelMin = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        panelRegister = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Netflix");
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(144, 144, 144));

        panelClose.setBackground(new java.awt.Color(144, 144, 144));
        panelClose.setPreferredSize(new java.awt.Dimension(36, 36));
        panelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCloseMouseExited(evt);
            }
        });

        labelClose.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClose.setText("x");
        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.setPreferredSize(new java.awt.Dimension(36, 36));

        javax.swing.GroupLayout panelCloseLayout = new javax.swing.GroupLayout(panelClose);
        panelClose.setLayout(panelCloseLayout);
        panelCloseLayout.setHorizontalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCloseLayout.setVerticalGroup(
            panelCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMin.setBackground(new java.awt.Color(144, 144, 144));
        panelMin.setPreferredSize(new java.awt.Dimension(36, 36));
        panelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinMouseExited(evt);
            }
        });

        labelMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMin.setText("-");
        labelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMin.setPreferredSize(new java.awt.Dimension(36, 36));

        javax.swing.GroupLayout panelMinLayout = new javax.swing.GroupLayout(panelMin);
        panelMin.setLayout(panelMinLayout);
        panelMinLayout.setHorizontalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMinLayout.setVerticalGroup(
            panelMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        infoLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        infoLabel1.setForeground(new java.awt.Color(16, 16, 16));
        infoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel1.setText(Login.user + ", lütfen ilgi alanın olan 3 farklı tür seç!");
        infoLabel1.setMaximumSize(new java.awt.Dimension(220, 36));
        infoLabel1.setMinimumSize(new java.awt.Dimension(220, 36));
        infoLabel1.setPreferredSize(new java.awt.Dimension(220, 36));

        infoLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(16, 16, 16));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Sonrasında öneri programlar görmek için butona tıkla!");
        infoLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        infoLabel2.setMaximumSize(new java.awt.Dimension(220, 30));
        infoLabel2.setMinimumSize(new java.awt.Dimension(220, 30));
        infoLabel2.setPreferredSize(new java.awt.Dimension(220, 30));

        panelRegister.setBackground(new java.awt.Color(216, 24, 24));
        panelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegisterMouseClicked(evt);
            }
        });

        registerLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("Önerileri Gör");
        registerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Anime", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setToolTipText("Tür seç");
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Anime", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        jComboBox4.setSelectedIndex(-1);
        jComboBox4.setToolTipText("Tür seç");
        jComboBox4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksiyon ve Macera", "Anime", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        jComboBox5.setSelectedIndex(-1);
        jComboBox5.setToolTipText("Tür seç");
        jComboBox5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_panelCloseMouseClicked

    private void panelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseEntered
        panelClose.setBackground(new Color(229, 9, 20));
    }//GEN-LAST:event_panelCloseMouseEntered

    private void panelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseExited
        panelClose.setBackground(new Color(144, 144, 144));
    }//GEN-LAST:event_panelCloseMouseExited

    private void panelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseExited
        panelMin.setBackground(new Color(144, 144, 144));
    }//GEN-LAST:event_panelMinMouseExited

    private void panelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseEntered
        panelMin.setBackground(new Color(110, 110, 110));
    }//GEN-LAST:event_panelMinMouseEntered

    private void panelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_panelMinMouseClicked

    private void panelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegisterMouseClicked
        String query = "SELECT * FROM Tur WHERE isim = '" + Question.choices[0] + "'";
        PreparedStatement ps = null;
        ResultSet rs;
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                Question.ids[0] = Integer.parseInt(rs.getObject("id").toString());
                rs.close();
                query = "SELECT * FROM Tur WHERE isim = '" + Question.choices[1] + "'";
                ps = MyConnection.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Question.ids[1] = Integer.parseInt(rs.getObject("id").toString());
                    rs.close();
                    query = "SELECT * FROM Tur WHERE isim = '" + Question.choices[2] + "'";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        Question.ids[2] = Integer.parseInt(rs.getObject("id").toString());
                        this.dispose();
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new Advice().setVisible(true);
                            }
                        });
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_panelRegisterMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Question.choices[0] = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        Question.choices[1] = jComboBox4.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        Question.choices[2] = jComboBox5.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelMin;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JLabel registerLabel;
    // End of variables declaration//GEN-END:variables
}
