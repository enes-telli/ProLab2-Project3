package netflix;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class WatchShow extends javax.swing.JFrame {

    Timer timer;
    boolean timerOn = false;
    int showCurrentTime = 1;
    int showTime = 12;
    String showType = null;
    int showEpisode = 1;

    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String query = "";

    private boolean check = true;

    public void setTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showCurrentTime < showTime) {
                    timerLabel.setText("" + (++showCurrentTime));
                } else {
                    if (showType.equals("Dizi")) {
                        showCurrentTime = 1;
                        showEpisode++;
                        JOptionPane.showMessageDialog(null,
                                MainFrame.currentShow + " " + (showEpisode - 1) + ". bolum bitti!");
                    } else {
                        JOptionPane.showMessageDialog(null, MainFrame.currentShow + " bitti!");
                    }
                    timer.stop();
                    UpdateShow();
                }

            }

        });
    }

    public void timerUpdate() {
        if (timerOn == false) {
            timerOn = true;
            setTimer();
            timer.start();
        } else if (timerOn == true) {
            timerOn = false;
            timer.stop();
        }

    }

    public WatchShow() {
        initComponents();
        this.setLocationRelativeTo(null);
        Check();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();
        labelClose = new javax.swing.JLabel();
        panelMin = new javax.swing.JPanel();
        labelMin = new javax.swing.JLabel();
        panelEmail = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        timerLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        showPassword = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        panelEmail1 = new javax.swing.JPanel();
        timerLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        showPassword1 = new javax.swing.JLabel();
        timerLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Netflix");
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(100, 100, 100));

        panelClose.setBackground(new java.awt.Color(100, 100, 100));
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

        panelMin.setBackground(new java.awt.Color(100, 100, 100));
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

        panelEmail.setBackground(new java.awt.Color(64, 64, 64));
        panelEmail.setPreferredSize(new java.awt.Dimension(268, 48));

        timerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        timerLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel2.setText("Dk:");
        timerLabel2.setPreferredSize(new java.awt.Dimension(60, 22));

        jPanel1.setBackground(new java.awt.Color(144, 144, 144));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        showPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        showPassword.setForeground(new java.awt.Color(255, 255, 255));
        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setText("Izle");
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        emailLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel1.setPreferredSize(new java.awt.Dimension(60, 22));

        emailLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailLabel2.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel2.setText(MainFrame.currentShow + " izleniyor...");
        emailLabel2.setPreferredSize(new java.awt.Dimension(60, 22));

        panelEmail1.setBackground(new java.awt.Color(64, 64, 64));
        panelEmail1.setPreferredSize(new java.awt.Dimension(268, 48));

        timerLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel1.setText("10 üzerinden tam puan ver!");
        timerLabel1.setPreferredSize(new java.awt.Dimension(60, 22));

        email.setBackground(new java.awt.Color(64, 64, 64));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(144, 144, 144));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        showPassword1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        showPassword1.setForeground(new java.awt.Color(255, 255, 255));
        showPassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword1.setText("Puan Ver");
        showPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEmail1Layout = new javax.swing.GroupLayout(panelEmail1);
        panelEmail1.setLayout(panelEmail1Layout);
        panelEmail1Layout.setHorizontalGroup(
            panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmail1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmail1Layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(timerLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEmail1Layout.setVerticalGroup(
            panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmail1Layout.createSequentialGroup()
                .addComponent(timerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        timerLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        timerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel3.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(timerLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(emailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(panelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
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

        getAccessibleContext().setAccessibleName("Login2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_panelMinMouseClicked

    private void panelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseEntered
        panelMin.setBackground(new Color(110, 110, 110));
    }//GEN-LAST:event_panelMinMouseEntered

    private void panelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinMouseExited
        panelMin.setBackground(new Color(100, 100, 100));
    }//GEN-LAST:event_panelMinMouseExited

    private void panelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseClicked
        if (timerOn) {
            timer.stop();
        }
        UpdateShow();
        this.dispose();
    }//GEN-LAST:event_panelCloseMouseClicked

    public void UpdateShow() throws NumberFormatException, HeadlessException {

        //int minute = Integer.parseInt(timerLabel.getText());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String dateString = formatter.format(date);

        int k_id = 0;
        int p_id = 0;
        query = "SELECT * FROM Kullanici WHERE isim = '" + Login.user + "'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                k_id = Integer.parseInt(rs.getObject("id").toString());
                rs.close();
                query = "SELECT * FROM Program WHERE isim = ?";
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, MainFrame.currentShow);
                rs = ps.executeQuery();
                if (rs.next()) {
                    p_id = Integer.parseInt(rs.getObject("id").toString());
                    rs.close();
                    query = "UPDATE KullaniciProgram SET tarih = ?, sure = ?, bolum = ? "
                            + "WHERE k_id = ? AND p_id = ?";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    ps.setString(1, dateString);
                    ps.setInt(2, showCurrentTime);
                    ps.setInt(3, showEpisode);
                    ps.setInt(4, k_id);
                    ps.setInt(5, p_id);
                    System.out.println(dateString);
                    System.out.println(showCurrentTime);
                    System.out.println(k_id);
                    System.out.println(p_id);
                    ps.executeUpdate();

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        this.dispose();

    }

    private void panelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseEntered
        panelClose.setBackground(new Color(229, 9, 20));
    }//GEN-LAST:event_panelCloseMouseEntered

    private void panelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseExited
        panelClose.setBackground(new Color(100, 100, 100));
    }//GEN-LAST:event_panelCloseMouseExited

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased

    }//GEN-LAST:event_emailKeyReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (check) {
            showPassword.setText("Durdur");
            check = false;
        } else {
            showPassword.setText("İzle");
            check = true;
        }
        timerUpdate();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        int point = Integer.parseInt(email.getText());
        int k_id = 0;
        int p_id = 0;
        query = "SELECT * FROM Kullanici WHERE isim = '" + Login.user + "'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                k_id = Integer.parseInt(rs.getObject("id").toString());
                rs.close();
                query = "SELECT * FROM Program WHERE isim = ?";
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, MainFrame.currentShow);
                rs = ps.executeQuery();
                if (rs.next()) {
                    p_id = Integer.parseInt(rs.getObject("id").toString());
                    rs.close();

                    query = "UPDATE KullaniciProgram SET puan = ? "
                            + "WHERE k_id = ? AND p_id = ?";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    ps.setInt(1, point);
                    ps.setInt(2, k_id);
                    ps.setInt(3, p_id);
                    ps.executeUpdate();
                    timerLabel3.setText(point + " puan verdiniz!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(WatchShow.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(WatchShow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    public void Check() {
        int k_id = 0;
        int p_id = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String dateString = formatter.format(date);
        query = "SELECT * FROM Kullanici WHERE isim = '" + Login.user + "'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                k_id = Integer.parseInt(rs.getObject("id").toString());
                rs.close();
                query = "SELECT * FROM Program WHERE isim = ?";
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, MainFrame.currentShow);
                rs = ps.executeQuery();
                if (rs.next()) {
                    p_id = Integer.parseInt(rs.getObject("id").toString());
                    showType = rs.getObject("tip").toString();
                    rs.close();
                    query = "SELECT * FROM KullaniciProgram WHERE k_id = '" + k_id + "' AND p_id = '" + p_id + "'";
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        // VAR OLAN KAYDI GUNCELLEME
                        if (showType.equals("Dizi")) {
                            showTime = 6;
                            showCurrentTime = rs.getInt("sure");
                            showEpisode = rs.getInt("bolum");
                            JOptionPane.showMessageDialog(this, showEpisode + ". bolum " + showCurrentTime + ". dakikada kalmışsınız!");
                            emailLabel2.setText(MainFrame.currentShow + " " + showEpisode + ". bölüm izleniyor!");
                        } else {
                            showCurrentTime = rs.getInt("sure");
                            JOptionPane.showMessageDialog(this, showCurrentTime + ". dakikada kalmışsınız!");
                        }

                        if (rs.getObject("puan") != null) {
                            int point = Integer.parseInt(rs.getObject("puan").toString());
                            timerLabel3.setText(point + " puan verdiniz!");
                        } else {
                            timerLabel3.setText("Henüz puan vermediniz!");
                        }
                        timerLabel.setText("" + showCurrentTime);
                    } else {
                        // YENİ KAYIT OLUSTURMA
                        query = "INSERT INTO KullaniciProgram (tarih, sure, bolum, k_id, p_id) "
                                + "VALUES (?,?,?,?,?)";
                        ps = MyConnection.getConnection().prepareStatement(query);
                        ps.setString(1, dateString);
                        ps.setInt(2, 1);
                        ps.setInt(3, 1);
                        ps.setInt(4, k_id);
                        ps.setInt(5, p_id);
                        System.out.println("." + p_id);
                        ps.execute();
                        if (showType.equals("Dizi")) {
                            showTime = 6;
                            emailLabel2.setText(MainFrame.currentShow + " 1. bölüm izleniyor!");
                        }
                        timerLabel.setText("" + showCurrentTime);
                        timerLabel3.setText("Henüz puan vermediniz!");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(WatchShow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WatchShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelMin;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelEmail1;
    private javax.swing.JPanel panelMin;
    private javax.swing.JLabel showPassword;
    private javax.swing.JLabel showPassword1;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel timerLabel1;
    private javax.swing.JLabel timerLabel2;
    private javax.swing.JLabel timerLabel3;
    // End of variables declaration//GEN-END:variables
}
