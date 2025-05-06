package its340.finalproject;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class Demographics extends javax.swing.JFrame {

    public Demographics() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_demographics = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btn_retrieveall = new javax.swing.JButton();
        btn_lastsearch = new javax.swing.JButton();
        lbl_patientname = new javax.swing.JLabel();
        lbl_patientid = new javax.swing.JLabel();
        txt_lastsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_prevlast = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_home = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_province = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_zip = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_country = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_citizenship = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_mobilephone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_homephone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_emphone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_ssn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_gender = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_ethnicity = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_marital = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_hcp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_comments = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        txt_nokrelation = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_nextofkin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_toGMH = new javax.swing.JButton();
        btn_toSOB = new javax.swing.JButton();
        btn_toAT = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_unlock = new javax.swing.JButton();
        btn_lock = new javax.swing.JButton();
        btn_interview = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl_demographics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Last Name", "First Name"
            }
        ));
        tbl_demographics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_demographicsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_demographics);

        btn_retrieveall.setText("RETRIEVE ALL PATIENTS");
        btn_retrieveall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrieveallActionPerformed(evt);
            }
        });

        btn_lastsearch.setText("Search by Last Name");
        btn_lastsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastsearchActionPerformed(evt);
            }
        });

        lbl_patientname.setText("Current Patient:");

        lbl_patientid.setText("ID: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_retrieveall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_patientid, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_patientname, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 80, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_lastsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_lastsearch)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_retrieveall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lastsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lastsearch))
                .addGap(18, 18, 18)
                .addComponent(lbl_patientname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_patientid))
        );

        jLabel1.setText("*Last Name:");

        jLabel3.setText("Prev. Last Name:");

        jLabel4.setText("*First Name:");

        txt_firstname.setText(" ");

        jLabel5.setText("Home Address:");

        txt_home.setText(" ");

        jLabel2.setText("City:");

        txt_city.setText(" ");

        jLabel6.setText("State/Province:");

        txt_province.setText(" ");

        jLabel7.setText("ZIP:");

        txt_zip.setText(" ");

        jLabel8.setText("Country:");

        txt_country.setText(" ");

        jLabel9.setText("Citizenship:");

        txt_citizenship.setText(" ");

        jLabel10.setText("Mobile Phone:");

        txt_mobilephone.setText(" ");

        jLabel11.setText("*Home Phone:");

        txt_homephone.setText(" ");

        jLabel12.setText("Emergency Phone:");

        txt_emphone.setText(" ");

        jLabel13.setText("Email Address:");

        txt_email.setText(" ");

        jLabel14.setText("*SSN:");

        txt_ssn.setText(" ");

        jLabel15.setText("DOB:");

        txt_dob.setText(" ");
        txt_dob.setToolTipText("");

        jLabel16.setText("Gender:");

        txt_gender.setText(" ");

        jLabel17.setText("Ethnic Association:");

        txt_ethnicity.setText(" ");

        jLabel18.setText("Marital Status:");
        jLabel18.setToolTipText("");

        txt_marital.setText(" ");

        jLabel19.setText("Primary HCP:");

        txt_hcp.setText(" ");

        jLabel20.setText("Comments:");
        jLabel20.setToolTipText("");

        txt_comments.setColumns(20);
        txt_comments.setRows(5);
        jScrollPane2.setViewportView(txt_comments);

        jLabel21.setText("Relationship to Patient:");

        txt_nokrelation.setText(" ");

        jLabel22.setText("Next of Kin:");

        txt_nextofkin.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel23.setText("DEMOGRAPHICS");

        btn_toGMH.setText("GMH");
        btn_toGMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toGMHActionPerformed(evt);
            }
        });

        btn_toSOB.setText("Shortness of Breath");

        btn_toAT.setText("Activities Tolerance");

        btn_new.setText("NEW RECORD");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_edit.setText("EDIT RECORD");

        btn_delete.setText("DELETE ");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE/UPDATE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_unlock.setText("UNLOCK FORM");

        btn_lock.setText("LOCK FORM");

        btn_interview.setText("START INTERVIEW");
        btn_interview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_toGMH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_toAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_toSOB))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_unlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_lock, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_interview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_toAT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_toSOB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_toGMH)
                .addGap(63, 63, 63)
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addGap(41, 41, 41)
                .addComponent(btn_interview)
                .addGap(59, 59, 59)
                .addComponent(btn_unlock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lock)
                .addGap(18, 18, 18))
        );

        jLabel24.setText("NOTE: Creating a new record only applies required (*) fields. ");
        jLabel24.setToolTipText("");

        jLabel25.setText("To enter all of a patient's information, use the update button.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_hcp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_homephone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_emphone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mobilephone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_prevlast, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_marital, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_home, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nokrelation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nextofkin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ethnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txt_nextofkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nokrelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_prevlast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_mobilephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_homephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_emphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_hcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_marital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_retrieveallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retrieveallActionPerformed
       try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtils_Demog.GetAllPatients(conn);

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_retrieveallActionPerformed

    private void tbl_demographicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_demographicsMouseClicked
        int selectedRow = tbl_demographics.getSelectedRow();
        if (selectedRow != -1) 
        {
            String pidStr = tbl_demographics.getValueAt(selectedRow, 0).toString();
            int pidInt = Integer.parseInt(pidStr);
            GlobalData.patientID = pidInt;
            lbl_patientname.setText(
                    "Current Patient: " + tbl_demographics.getValueAt(selectedRow, 1).toString() 
                    + ", " + tbl_demographics.getValueAt(selectedRow, 2).toString() );
            
            GlobalData.patientName = tbl_demographics.getValueAt(selectedRow, 1).toString() 
                    + ", " + tbl_demographics.getValueAt(selectedRow, 2).toString();
            lbl_patientid.setText("ID: " + pidStr);
            System.out.println("DEBUG: Clicked Patient ID: " + pidStr);
            
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtils_Demog.GetPatient_FromID(conn, pidInt);

            if (rs.next()) 
            {
                //txt_box.setText(rs.getString(sqlColumnName));
                txt_firstname.setText(rs.getString("PtFirstName"));
                txt_lastname.setText(rs.getString("PtLastName"));
                txt_prevlast.setText(rs.getString("PtPreviousLastName"));
                txt_homephone.setText(rs.getString("PtHomePhone"));
                txt_mobilephone.setText(rs.getString("PtMobilePhone"));
                txt_emphone.setText(rs.getString("EmergencyPhoneNumber"));
                txt_dob.setText(rs.getString("DOB"));
                txt_email.setText(rs.getString("EmailAddress"));
                txt_home.setText(rs.getString("HomeAddress1"));
                txt_city.setText(rs.getString("HomeCity"));
                txt_province.setText(rs.getString("HomeRegion"));
                txt_zip.setText(rs.getString("HomeZip"));
                txt_country.setText(rs.getString("Country"));
                txt_citizenship.setText(rs.getString("Citizenship"));
                txt_ssn.setText(rs.getString("SSN"));
                txt_gender.setText(rs.getString("Gender"));
                txt_ethnicity.setText(rs.getString("EthnicAssociation"));
                txt_marital.setText(rs.getString("MaritalStatus"));
                txt_hcp.setText(rs.getString("CurrentPrimaryHCP"));
                txt_comments.setText(rs.getString("Comments"));
                txt_nextofkin.setText(rs.getString("NextOfKin"));
                txt_nokrelation.setText(rs.getString("NextOfKinRelationshipToPatient"));
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        }
    }//GEN-LAST:event_tbl_demographicsMouseClicked

    private void btn_lastsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastsearchActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtils_Demog.GetPatient_LastName(conn, txt_lastsearch.getText());

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }        
    }//GEN-LAST:event_btn_lastsearchActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            DBUtils_Demog.InsertPatient(conn, txt_firstname.getText(), txt_lastname.getText(),
                txt_homephone.getText(), txt_ssn.getText());
            //maybe add a confirmation swing popup here

            //retrieve all after inserting
            ResultSet rs = DBUtils_Demog.GetAllPatients(conn);

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            int pid = GlobalData.patientID;
            DBUtils_Demog.DeletePatient(conn, pid);
            System.out.println("Delete button clicked for patient ID: " + pid);

            //retrieve all after deletion
            ResultSet rs = DBUtils_Demog.GetAllPatients(conn);
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            //clear text fields
            for (java.awt.Component comp : getContentPane().getComponents())
            {
                if (comp instanceof JTextField)
                {
                    ((JTextField) comp).setText("");
                }
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_interviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_interviewActionPerformed

    private void btn_toGMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toGMHActionPerformed
        GeneralMedicalHistory gmhFrame = new GeneralMedicalHistory(); 
        gmhFrame.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_btn_toGMHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int pid = GlobalData.patientID;
        lbl_patientname.setText("Current Patient: " + GlobalData.patientName);
        lbl_patientid.setText("Patient ID: " + GlobalData.patientID);
        
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtils_Demog.GetAllPatients(conn);

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.setColumnCount(3);
            tbl.setColumnIdentifiers(new String[] {"Patient ID", "Last Name", "First Name"});
            while(rs.next() )
            {
                String tbData[] = {rs.getString(1), rs.getString(2), rs.getString(3) };
                tbl.addRow(tbData);
            }
            tbl_demographics.setModel(tbl);
            conn.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() );
        }
        
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            ResultSet rs = DBUtils_Demog.GetPatient_FromID(conn, pid);

            if (rs.next()) 
            {
                //txt_box.setText(rs.getString(sqlColumnName));
                txt_firstname.setText(rs.getString("PtFirstName"));
                txt_lastname.setText(rs.getString("PtLastName"));
                txt_prevlast.setText(rs.getString("PtPreviousLastName"));
                txt_homephone.setText(rs.getString("PtHomePhone"));
                txt_mobilephone.setText(rs.getString("PtMobilePhone"));
                txt_emphone.setText(rs.getString("EmergencyPhoneNumber"));
                txt_dob.setText(rs.getString("DOB"));
                txt_email.setText(rs.getString("EmailAddress"));
                txt_home.setText(rs.getString("HomeAddress1"));
                txt_city.setText(rs.getString("HomeCity"));
                txt_province.setText(rs.getString("HomeRegion"));
                txt_zip.setText(rs.getString("HomeZip"));
                txt_country.setText(rs.getString("Country"));
                txt_citizenship.setText(rs.getString("Citizenship"));
                txt_ssn.setText(rs.getString("SSN"));
                txt_gender.setText(rs.getString("Gender"));
                txt_ethnicity.setText(rs.getString("EthnicAssociation"));
                txt_marital.setText(rs.getString("MaritalStatus"));
                txt_hcp.setText(rs.getString("CurrentPrimaryHCP"));
                txt_comments.setText(rs.getString("Comments"));
                txt_nextofkin.setText(rs.getString("NextOfKin"));
                txt_nokrelation.setText(rs.getString("NextOfKinRelationshipToPatient"));
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try
        {
            Connection conn = GlobalData.ConnectToDB("root", "password");
            int pid = GlobalData.patientID;
            DBUtils_Demog.UpdatePatient(conn, pid, txt_firstname.getText(), txt_lastname.getText(),
            txt_prevlast.getText(), txt_mobilephone.getText(), txt_homephone.getText(), 
            txt_emphone.getText(), txt_email.getText(), txt_hcp.getText(), txt_ssn.getText(), txt_dob.getText(),
            txt_marital.getText(), txt_gender.getText(), txt_home.getText(), txt_city.getText(), txt_province.getText(), txt_zip.getText(),
            txt_country.getText(), txt_citizenship.getText(), txt_ethnicity.getText(), txt_nextofkin.getText(), 
            txt_nokrelation.getText(), txt_comments.getText());

            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demographics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demographics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_interview;
    private javax.swing.JButton btn_lastsearch;
    private javax.swing.JButton btn_lock;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_retrieveall;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_toAT;
    private javax.swing.JButton btn_toGMH;
    private javax.swing.JButton btn_toSOB;
    private javax.swing.JButton btn_unlock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_patientid;
    private javax.swing.JLabel lbl_patientname;
    private javax.swing.JTable tbl_demographics;
    private javax.swing.JTextField txt_citizenship;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextArea txt_comments;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emphone;
    private javax.swing.JTextField txt_ethnicity;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_hcp;
    private javax.swing.JTextField txt_home;
    private javax.swing.JTextField txt_homephone;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_lastsearch;
    private javax.swing.JTextField txt_marital;
    private javax.swing.JTextField txt_mobilephone;
    private javax.swing.JTextField txt_nextofkin;
    private javax.swing.JTextField txt_nokrelation;
    private javax.swing.JTextField txt_prevlast;
    private javax.swing.JTextField txt_province;
    private javax.swing.JTextField txt_ssn;
    private javax.swing.JTextField txt_zip;
    // End of variables declaration//GEN-END:variables
}
