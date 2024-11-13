/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Patient;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Model.Patient;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import utility.DatabaseConnector;

/**
 *
 * @author H_Kofi
 */
public class ViewJPanel extends javax.swing.JPanel {
       
    ArrayList <Patient> patients;
    Patient selectedPatient;
    ImageIcon profilePicture;
       Patient p1;
       
    /**
     * Creates new form FormJPanel
     */
    public ViewJPanel() {
        initComponents();
        populateTable();
        //DisableAll();
    
    }
public ViewJPanel(Patient p1){
    this.p1=p1;
    initComponents();
    populateData();
    //DisableAll();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TitlejLabel1 = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabelEmailAddress = new javax.swing.JLabel();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        jComboBoxPatientType = new javax.swing.JComboBox<>();
        jLabelPatientType = new javax.swing.JLabel();
        CommentjTextField = new javax.swing.JTextField();
        CommentjLabel = new javax.swing.JLabel();
        DateOfBirthjLabel = new javax.swing.JLabel();
        DateofBirthjDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientjTable = new javax.swing.JTable();
        EditjButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();
        UpdateSubmitjButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        TitlejLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitlejLabel1.setText("Patient Registration");

        jLabelFirstName.setText("First Name");

        jTextFieldFirstName.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setText("Gender");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("MALE");

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("FEMALE");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonOther);
        jRadioButtonOther.setText("Other");
        jRadioButtonOther.setActionCommand("OTHER");

        jLabelLastName.setText("Last Name");

        jLabelAge.setText("Age");

        jLabelPhoneNumber.setText("Phone Number");

        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });

        jLabelEmailAddress.setText("Email Address");

        jComboBoxPatientType.setEditable(true);
        jComboBoxPatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emmergency", "Appointment", "Walk-in" }));
        jComboBoxPatientType.setSelectedIndex(-1);
        jComboBoxPatientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPatientTypeActionPerformed(evt);
            }
        });

        jLabelPatientType.setText("Patient Type");

        CommentjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentjTextFieldActionPerformed(evt);
            }
        });

        CommentjLabel.setText("Comment");

        DateOfBirthjLabel.setText("Date of Birth");

        DateofBirthjDateChooser.setDateFormatString("dd MMMM, yyyy");

        PatientjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "Email Address", "Phone Number", "Patient Type", "Gender", "Date of Birth", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PatientjTable);

        EditjButton.setText("Edit");
        EditjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditjButtonActionPerformed(evt);
            }
        });

        DeletejButton.setText("Delete Row");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });

        UpdateSubmitjButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateSubmitjButton.setText("Submit");
        UpdateSubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSubmitjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfBirthjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommentjLabel))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(TitlejLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPatientType, javax.swing.GroupLayout.Alignment.TRAILING, 0, 223, Short.MAX_VALUE)
                                    .addComponent(DateofBirthjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jRadioButtonMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonFemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonOther, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CommentjTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(UpdateSubmitjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditjButton)
                .addGap(103, 103, 103)
                .addComponent(DeletejButton)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TitlejLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFirstName)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLastName)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPatientType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale)
                            .addComponent(jRadioButtonOther)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateofBirthjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfBirthjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CommentjLabel)
                            .addComponent(CommentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditjButton)
                            .addComponent(DeletejButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(UpdateSubmitjButton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void jComboBoxPatientTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPatientTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPatientTypeActionPerformed

    private void CommentjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommentjTextFieldActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
       // TODO add your handling code here:
       // 1- find which the row is selected for deletion
        int selectedRowIndex = this.PatientjTable.getSelectedRow();
        
        //2- to store the details(name, gender, ...) of the selected patient
        
        this.selectedPatient=this.patients.get(selectedRowIndex);
        try{
        DatabaseConnector.deletePatient(selectedPatient);
        //3- Print if it is successful
        System.out.println("Patient deleted successfully");
        //4- Repopulate the table
        populateTable();
        }catch (Exception e){
        System.out.println("Unable to delete the patient");
        System.out.println(e);   
        }
        
    }//GEN-LAST:event_DeletejButtonActionPerformed

    private void EditjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditjButtonActionPerformed
        // TODO add your handling code here:
        //1-to make the text boxes as editable
        enableAll();
        //2- get selected row values into the text boxes, ...
        int selectedRowIndex=this.PatientjTable.getSelectedRow();
        //3- to store the details of (firstname, lastname, gender, ...) of selected the patient
        this.selectedPatient=this.patients.get(selectedRowIndex);
        //4 - get the values of the selected row and place those values
        //   into the jTextFields, buttonGroups, ComboBoxes, ...
        //   Logic for this is already written in populateData method:
        populateData();
        
    }//GEN-LAST:event_EditjButtonActionPerformed

    private void UpdateSubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSubmitjButtonActionPerformed
        // TODO add your handling code here:
        // 1- Get the values from textboxes, radios, buttons etc
         Patient updatedPatient =new Patient();
         updatedPatient.setFirstname(this.jTextFieldFirstName.getText());
         updatedPatient.setLastname(this.jTextFieldLastName.getText());
         updatedPatient.setAge(this.jTextFieldAge.getText());
         updatedPatient.setPhonenumber(this.jTextFieldPhoneNumber.getText());
         updatedPatient.setEmailAddress(this.jTextFieldEmailAddress.getText());
         updatedPatient.setComment(this.CommentjTextField.getText());
         updatedPatient.setDateOfBirth(this.DateofBirthjDateChooser.getDate());
         updatedPatient.setGender(this.buttonGroupGender.getSelection().getActionCommand());
         updatedPatient.setPatientType(this.jComboBoxPatientType.getSelectedItem().toString());
        
//         try{
//         //2- Call the update patient method in the database connector
//        DatabaseConnector.updatePatient(selectedPatient, updatedPatient);
//         } catch (Exception e){
//             System.out.println("Error");
//         }
//        Patient updatedPatient=new Patient();
//        updatedPatient.setFirstname(this.jTextFieldFirstName.getText());
//        updatedPatient.setLastname(this.jTextFieldLastName.getText());
//        updatedPatient.setAge(this.jTextFieldAge.getText());
//        updatedPatient.setEmailAddress(this.jTextFieldEmailAddress.getText());
//        updatedPatient.setPhonenumber(this.jTextFieldPhoneNumber.getText());
//        updatedPatient.setPatientType(this.jComboBoxPatientType.getSelectedItem().toString());
//        updatedPatient.setGender(this.buttonGroupGender.getSelection ().getActionCommand());
//        updatedPatient.setDateOfBirth(this.DateofBirthjDateChooser.getDate());
//        updatedPatient.setComment(this.CommentjTextField.getText());
        
      
        
        try {
            // 2- Call the updated patient method in the database connector
            DatabaseConnector.updatePatient(selectedPatient, updatedPatient);
            System.out.println("The record has been updated");
            // repopulate the table
            populateTable();
        } catch (Exception e) {
            System.out.println("Error in updating values");
            System.out.println(e);
        }  
        
    }//GEN-LAST:event_UpdateSubmitjButtonActionPerformed

       public void populateTable(){
           this.patients=DatabaseConnector.getPatients();
           DefaultTableModel model=(DefaultTableModel)this.PatientjTable.getModel();
           model.setRowCount(0);
           for (Patient p1: patients){
               Object[] row = new Object[10];
               row[0]=p1.getId();
               row[1]=p1.getFirstname();
               row[2]=p1.getLastname();
               row[3]=p1.getAge();
               row[4]=p1.getEmailAddress();
               row[5]=p1.getPhonenumber();
               row[6]=p1.getPatientType();
               row[7]=p1.getGender();
               row[8]=p1.getDateOfBirth();
               row[9]=p1.getComment();
               model.addRow(row);
           }
            
       }
            
       //public void populateData(){
       //this.jTextFieldFirstName.setEnabled(true);
       //this.jTextFieldLastName.setEnabled(true);
       //this.jTextFieldAge.setEnabled(true);
       //this.jTextFieldPhoneNumber.setEnabled(true);
       //this.jTextFieldEmailAddress.setEnabled(true);
       //this.CommentjTextField.setEnabled(true);
       //this.DateofBirthjDateChooser.setEnabled(true);
       
       //String gender=selectedPatient.getGender();
       //if(gender.equals("MALE")){
       //this.buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
       //       }else if(gender.equals("FEMALE")){
       //this.buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
       //}else{
       //      this.buttonGroupGender.setSelected(this.jRadioButtonOther.getModel(), true);}
       //this.jComboBoxPatientType.setSelectedItem(p1.getPatientType());
       
      
       
       //Check
       
       public void populateData(){
       this.jTextFieldFirstName.setText(selectedPatient.getFirstname());
       this.jTextFieldLastName.setText(selectedPatient.getLastname());
       this.jTextFieldAge.setText(selectedPatient.getAge());
       this.jTextFieldPhoneNumber.setText(selectedPatient.getPhonenumber());
       this.jTextFieldEmailAddress.setText(selectedPatient.getEmailAddress());
       this.CommentjTextField.setText(selectedPatient.getComment());
       this.DateofBirthjDateChooser.setDate(selectedPatient.getDateOfBirth());
       String gender=selectedPatient.getGender();
       if(gender.equals("MALE")){
       this.buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
           }else if(gender.equals("FEMALE")){
       this.buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
       }else{
             this.buttonGroupGender.setSelected(this.jRadioButtonOther.getModel(), true);}
       this.jComboBoxPatientType.setSelectedItem(selectedPatient.getPatientType());   
       
       //Check end
       
       //this.imgJLabel.setIcon(p1.getProfilePicture());
}
       
           public void enableAll(){
       // setting the field, radio buttons and radio buttons to enable
       this.jTextFieldFirstName.setEnabled(true);
       this.jTextFieldLastName.setEnabled(true);
       this.jTextFieldAge.setEnabled(true);
       this.jTextFieldPhoneNumber.setEnabled(true);
       this.jTextFieldEmailAddress.setEnabled(true);
       this.jComboBoxPatientType.setEnabled(true);
       this.jRadioButtonMale.setEnabled(true);
       this.jRadioButtonFemale.setEnabled(true);
       this.jRadioButtonOther.setEnabled(true);
       this.CommentjTextField.setEnabled(true);
       this.DateofBirthjDateChooser.setEnabled(true);
       
       this.UpdateSubmitjButton.setVisible(true);
       }
       
       
       public void disableAll(){
       // setting the field, radio buttons and radio buttons to disable
       this.jTextFieldFirstName.setEnabled(false);
       this.jTextFieldLastName.setEnabled(false);
       this.jTextFieldAge.setEnabled(false);
       this.jTextFieldPhoneNumber.setEnabled(false);
       this.jTextFieldEmailAddress.setEnabled(false);
       this.jComboBoxPatientType.setEnabled(false);
       this.jRadioButtonMale.setEnabled(false);
       this.jRadioButtonFemale.setEnabled(false);
       this.jRadioButtonOther.setEnabled(false);
       this.CommentjTextField.setEnabled(false);
       this.DateofBirthjDateChooser.setEnabled(false);
       
       this.UpdateSubmitjButton.setVisible(false);
       }
       
                   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentjLabel;
    private javax.swing.JTextField CommentjTextField;
    private javax.swing.JLabel DateOfBirthjLabel;
    private com.toedter.calendar.JDateChooser DateofBirthjDateChooser;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton EditjButton;
    private javax.swing.JTable PatientjTable;
    private javax.swing.JLabel TitlejLabel1;
    private javax.swing.JButton UpdateSubmitjButton;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JComboBox<String> jComboBoxPatientType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelEmailAddress;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPatientType;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
