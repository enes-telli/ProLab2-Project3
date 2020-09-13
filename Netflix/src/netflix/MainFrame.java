package netflix;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class MainFrame extends javax.swing.JFrame {

    public static String currentShow;

    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String query = "SELECT * FROM Program";

    private String search;
    private String selection;

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        FillTable(1);
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
        email = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        panelEmail1 = new javax.swing.JPanel();
        emailLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        emailLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        emailLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        emailLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        emailLabel5 = new javax.swing.JLabel();
        emailLabel6 = new javax.swing.JLabel();
        emailLabel7 = new javax.swing.JLabel();
        emailLabel8 = new javax.swing.JLabel();
        emailLabel9 = new javax.swing.JLabel();

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

        email.setBackground(new java.awt.Color(64, 64, 64));
        email.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(144, 144, 144));
        emailLabel.setText("Dizi/Film aramak için buraya yazabilirsiniz");
        emailLabel.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(email)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailLayout.createSequentialGroup()
                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelEmail1.setBackground(new java.awt.Color(64, 64, 64));
        panelEmail1.setPreferredSize(new java.awt.Dimension(268, 48));

        emailLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(144, 144, 144));
        emailLabel1.setText("Tür aramak için burayı kullanabilirsiniz");
        emailLabel1.setPreferredSize(new java.awt.Dimension(60, 22));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TÜM TÜRLER", "Aksiyon ve Macera", "Anime", "Belgesel", "Bilim Kurgu ve Fantastik Yapımlar", "Bilim ve Doğa", "Çocuk ve Aile", "Drama", "Gerilim", "Komedi", "Korku", "Reality Program", "Romantik" }));
        jComboBox1.setToolTipText("Tür seç");
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmail1Layout = new javax.swing.GroupLayout(panelEmail1);
        panelEmail1.setLayout(panelEmail1Layout);
        panelEmail1Layout.setHorizontalGroup(
            panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmail1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 223, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEmail1Layout.setVerticalGroup(
            panelEmail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmail1Layout.createSequentialGroup()
                .addComponent(emailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        emailLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel2.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel2.setText(Login.user + "!");
        emailLabel2.setPreferredSize(new java.awt.Dimension(60, 22));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "tur", "tip", "bolum", "uzunluk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        emailLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLabel3.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel3.setText("Lütfen izlemek istediğiniz programı seçip izle butonuna tıklayınız!");
        emailLabel3.setPreferredSize(new java.awt.Dimension(60, 22));

        jButton1.setText("Programı İzle");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        emailLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLabel4.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel4.setText("Kolonları alfabetik veya numerik olarak sıralamak için üzerine tıklayabilirsiniz.");
        emailLabel4.setPreferredSize(new java.awt.Dimension(60, 22));

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "tur", "tip", "bolum", "uzunluk"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        emailLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLabel5.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel5.setText("İzlediğim/İzlemekte Olduğum Programlar (Süre dakika cinsinden belirtilmiştir):");
        emailLabel5.setPreferredSize(new java.awt.Dimension(60, 22));

        emailLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel6.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel6.setText("Tekrar Hoşgeldin,");
        emailLabel6.setPreferredSize(new java.awt.Dimension(60, 22));

        emailLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel7.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel7.setText("Diziler 10 bölüm 6 dakika,");
        emailLabel7.setPreferredSize(new java.awt.Dimension(60, 22));

        emailLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        emailLabel8.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel8.setText("filmler 12 dakika olarak kayıtlıdır.");
        emailLabel8.setPreferredSize(new java.awt.Dimension(60, 22));

        emailLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLabel9.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel9.setText("İzlenenler/İzlemekte Olduğum Programlar, Programı İzle butonuna her tııkladığınızda güncellenir.");
        emailLabel9.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(emailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(panelEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(emailLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(emailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(emailLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(emailLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(emailLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(emailLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jButton1.setEnabled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search = email.getText();
        if (search.equals("")) {
            if (jComboBox1.getSelectedIndex() != 0) {
                String selection = jComboBox1.getSelectedItem().toString();
                query = "SELECT * FROM Tur WHERE isim = '" + selection + "'";
                try {
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        int t_id = Integer.parseInt(rs.getObject("id").toString());
                        query = "SELECT p.id, p.isim, p.tip, p.bolum, p.uzunluk, p.puan "
                                + "FROM Program AS p, ProgramTur AS pt "
                                + "WHERE pt.t_id = '" + t_id + "'" + " AND p.id = pt.p_id";
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                query = "SELECT * FROM Program";
            }
        } else {
            selection = jComboBox1.getSelectedItem().toString(); // tüm türler
            search = email.getText(); // re 
            if (jComboBox1.getSelectedIndex() != 0) {
                query = "SELECT * FROM Tur WHERE isim = '" + selection + "'";
                try {
                    ps = MyConnection.getConnection().prepareStatement(query);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        int t_id = Integer.parseInt(rs.getObject("id").toString());
                        query = "SELECT p.id, p.isim, p.tip, p.bolum, p.uzunluk, p.puan "
                                + "FROM Program AS p, ProgramTur AS pt "
                                + "WHERE pt.t_id = '" + t_id + "' "
                                + "AND p.id = pt.p_id "
                                + "AND (isim LIKE '%" + search + "' "
                                + "OR isim LIKE '" + search + "%' "
                                + "OR isim LIKE '%" + search + "%')";
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                query = "SELECT * FROM Program WHERE isim LIKE '%" + search + "' "
                        + "OR isim LIKE '" + search + "%' "
                        + "OR isim LIKE '%" + search + "%'";
            }

        }

        FillTable(1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        MainFrame.currentShow = jTable1.getModel().getValueAt(row, 0).toString();
        System.out.println(MainFrame.currentShow);
        jButton1.setEnabled(true);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Check();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WatchShow().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1MouseClicked

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        jButton1.setEnabled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        String search = email.getText();
        if (jComboBox1.getSelectedIndex() == 0) {
            if (!search.equals("")) {
                query = "SELECT * FROM Program WHERE isim LIKE '%" + search + "' "
                        + "OR isim LIKE '" + search + "%' "
                        + "OR isim LIKE '%" + search + "%'";
            } else {
                query = "SELECT * FROM Program";
            }
        } else {

            String selection = jComboBox1.getSelectedItem().toString();
            query = "SELECT * FROM Tur WHERE isim = '" + selection + "'";
            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    int t_id = Integer.parseInt(rs.getObject("id").toString());
                    query = "SELECT p.id, p.isim, p.tip, p.bolum, p.uzunluk, p.puan "
                            + "FROM Program AS p, ProgramTur AS pt "
                            + "WHERE pt.t_id = '" + t_id + "' "
                            + "AND p.id = pt.p_id "
                            + "AND (isim LIKE '%" + search + "' "
                            + "OR isim LIKE '" + search + "%' "
                            + "OR isim LIKE '%" + search + "%')";
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        FillTable(1);
    }//GEN-LAST:event_emailKeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = jTable2.getSelectedRow();
        MainFrame.currentShow = jTable2.getModel().getValueAt(row, 0).toString();
        System.out.println(MainFrame.currentShow);
        jButton1.setEnabled(true);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jTable2MouseClicked

    public void FillTable(int tableNumber) {
        JTable table;
        TableModel tm;
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (tableNumber == 1) {
                tm = ResultSetToTableModel(rs);
                table = jTable1;
            } else {
                tm = ResultSetToTableModel2(rs);
                table = jTable2;
            }
            table.setModel(tm);
            table.getColumnModel().getColumn(0).setPreferredWidth(200);
            if(tableNumber == 1) {
                table.getColumnModel().getColumn(1).setPreferredWidth(350);
                table.getColumnModel().getColumn(2).setPreferredWidth(50);
            } else {
                table.getColumnModel().getColumn(1).setPreferredWidth(50);
                table.getColumnModel().getColumn(2).setPreferredWidth(200);
            }
            table.getColumnModel().getColumn(3).setPreferredWidth(15);
            table.getColumnModel().getColumn(4).setPreferredWidth(20);
            table.getColumnModel().getColumn(5).setPreferredWidth(20);
            for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
                table.getColumnModel().getColumn(i).setResizable(false);
            }
            table.setAutoCreateRowSorter(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public TableModel ResultSetToTableModel(ResultSet rs) {
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            ResultSetMetaData md = rs.getMetaData();
            int numberOfColumns = md.getColumnCount();
            Vector columnNames = new Vector();

            columnNames.addElement(md.getColumnLabel(2));
            columnNames.addElement("tur");

            for (int i = 3; i <= numberOfColumns; i++) {
                columnNames.addElement(md.getColumnLabel(i));
            }

            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();
                newRow.addElement(rs.getObject(2));
                int id = Integer.parseInt(rs.getObject("id").toString());
                query = "SELECT t.isim "
                        + "FROM Tur AS t, ProgramTur AS pt "
                        + "WHERE pt.p_id = '" + id + "' AND pt.t_id = t.id";
                PreparedStatement ps2 = MyConnection.getConnection().prepareStatement(query);
                ResultSet rs2 = ps2.executeQuery();
                int k = 0;
                while (rs2.next()) {
                    k++;
                }
                rs2.close();
                rs2 = ps2.executeQuery();
                String type = "";

                if (rs2.next()) {
                    if (k == 1) {
                        type = rs2.getObject("isim").toString();
                    } else {
                        type += (rs2.getObject("isim").toString() + ",");
                        int i = 1;
                        while (rs2.next()) {
                            if (i < k - 1) {
                                System.out.println("i");
                                type += (rs2.getObject("isim").toString() + ", ");
                                continue;
                            }
                            type += rs2.getObject(1).toString();
                        }
                    }
                }

                newRow.addElement(type);

                for (int i = 3; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);

            }
            return new DefaultTableModel(rows, columnNames);

        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public TableModel ResultSetToTableModel2(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public void Check() {
        int k_id = 0;
        query = "SELECT * FROM Kullanici WHERE isim = '" + Login.user + "'";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                k_id = Integer.parseInt(rs.getObject("id").toString());
                rs.close();
            }

            query = "SELECT p.isim, p.tip, kp.tarih, kp.sure, kp.bolum, kp.puan "
                    + "FROM Program AS p, KullaniciProgram AS kp "
                    + "WHERE kp.k_id = '" + k_id + "' "
                    + "AND p.id = kp.p_id";
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                FillTable(2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel emailLabel3;
    private javax.swing.JLabel emailLabel4;
    private javax.swing.JLabel emailLabel5;
    private javax.swing.JLabel emailLabel6;
    private javax.swing.JLabel emailLabel7;
    private javax.swing.JLabel emailLabel8;
    private javax.swing.JLabel emailLabel9;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelMin;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelEmail1;
    private javax.swing.JPanel panelMin;
    // End of variables declaration//GEN-END:variables
}
