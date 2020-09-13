package netflix;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private boolean show = true;

    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String query = "";
    
    public Register() {
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
        panelPassword = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        panelEmail = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        panelRegister = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        panelFullName = new javax.swing.JPanel();
        fullname = new javax.swing.JTextField();
        fullnameLabel = new javax.swing.JLabel();
        panelDate = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

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

        panelPassword.setBackground(new java.awt.Color(64, 64, 64));
        panelPassword.setPreferredSize(new java.awt.Dimension(268, 48));

        password.setBackground(new java.awt.Color(64, 64, 64));
        password.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));

        showPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showPassword.setForeground(new java.awt.Color(144, 144, 144));
        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setText("Goster");
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(144, 144, 144));
        passwordLabel.setText("Parola");
        passwordLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(showPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasswordLayout.createSequentialGroup()
                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(showPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelEmail.setBackground(new java.awt.Color(64, 64, 64));
        panelEmail.setPreferredSize(new java.awt.Dimension(268, 48));

        email.setBackground(new java.awt.Color(64, 64, 64));
        email.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(144, 144, 144));
        emailLabel.setText("E-posta");
        emailLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailLayout.createSequentialGroup()
                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRegister.setBackground(new java.awt.Color(229, 9, 20));
        panelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegister.setPreferredSize(new java.awt.Dimension(268, 48));
        panelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegisterMouseClicked(evt);
            }
        });

        registerLabel.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("Kayit Ol");
        registerLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        infoLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoLabel1.setForeground(new java.awt.Color(144, 144, 144));
        infoLabel1.setText("Zaten bir hesabınız var mı?");

        infoLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setText("Simdi giris yapin.");
        infoLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoLabel2MouseClicked(evt);
            }
        });

        panelFullName.setBackground(new java.awt.Color(64, 64, 64));
        panelFullName.setPreferredSize(new java.awt.Dimension(268, 48));

        fullname.setBackground(new java.awt.Color(64, 64, 64));
        fullname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));

        fullnameLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fullnameLabel.setForeground(new java.awt.Color(144, 144, 144));
        fullnameLabel.setText("Ad Soyad");
        fullnameLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout panelFullNameLayout = new javax.swing.GroupLayout(panelFullName);
        panelFullName.setLayout(panelFullNameLayout);
        panelFullNameLayout.setHorizontalGroup(
            panelFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFullNameLayout.createSequentialGroup()
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelFullNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFullNameLayout.setVerticalGroup(
            panelFullNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFullNameLayout.createSequentialGroup()
                .addComponent(fullnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDate.setBackground(new java.awt.Color(64, 64, 64));
        panelDate.setPreferredSize(new java.awt.Dimension(268, 48));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(144, 144, 144));
        dateLabel.setText("Dogum Tarihi");
        dateLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        dateChooser.setBackground(new java.awt.Color(64, 64, 64));
        dateChooser.setMaxSelectableDate(new java.util.Date(1591048904000L));

        javax.swing.GroupLayout panelDateLayout = new javax.swing.GroupLayout(panelDate);
        panelDate.setLayout(panelDateLayout);
        panelDateLayout.setHorizontalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDateLayout.createSequentialGroup()
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDateLayout.setVerticalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDateLayout.createSequentialGroup()
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(panelFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(panelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(infoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(panelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
        System.exit(0);
    }//GEN-LAST:event_panelCloseMouseClicked

    private void panelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseEntered
        panelClose.setBackground(new Color(229, 9, 20));
    }//GEN-LAST:event_panelCloseMouseEntered

    private void panelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCloseMouseExited
        panelClose.setBackground(new Color(100, 100, 100));
    }//GEN-LAST:event_panelCloseMouseExited

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        if (show) {
            password.setEchoChar((char) 0);
            show = false;
            showPassword.setText("Gizle");
        } else {
            password.setEchoChar('•');
            show = true;
            showPassword.setText("Goster");
        }
    }//GEN-LAST:event_showPasswordMouseClicked

    private void infoLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoLabel2MouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }//GEN-LAST:event_infoLabel2MouseClicked

    private void panelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegisterMouseClicked
        String fullName = fullname.getText();
        String eMail = email.getText();
        String passWord = String.valueOf(password.getPassword());
        String birthDate = null;
        
        if (fullName.equals("") || eMail.equals("") || passWord.equals("") || dateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Lutfen bilgilerinizi eksiksiz giriniz!");
        } else {
            if (isEmailExists(eMail)) {
                JOptionPane.showMessageDialog(null, "E-posta adresiyle baglantili bir hesap zaten mevcut!");
            } else {
                query = "INSERT INTO Kullanici(isim,eposta,sifre,dogum) VALUES (?,?,?,?)";
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    birthDate = dateFormat.format(dateChooser.getDate());
                    
                    ps = MyConnection.getConnection().prepareStatement(query);
                    ps.setString(1, fullName);
                    ps.setString(2, eMail);
                    ps.setString(3, passWord);
                    ps.setString(4, birthDate);
                    
                    if (ps.executeUpdate() > 0) {
                        Login.user = fullName;
                        JOptionPane.showMessageDialog(null, "Netflix'e hosgeldin " + fullName + "!");
                        this.dispose();
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new Question().setVisible(true);
                            }
                        });
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        }
    }//GEN-LAST:event_panelRegisterMouseClicked

    public boolean isEmailExists(String eMail) {
        query = "SELECT * FROM Kullanici WHERE eposta = '" + eMail + "'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelMin;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelDate;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelFullName;
    private javax.swing.JPanel panelMin;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel showPassword;
    // End of variables declaration//GEN-END:variables
}
