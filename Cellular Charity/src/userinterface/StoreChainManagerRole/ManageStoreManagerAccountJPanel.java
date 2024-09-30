/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreChainManagerRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.RetailChain;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Validations;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageStoreManagerAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoreManagerAccountJPanel
     */
    private JPanel userProcessContainer;
    private RetailChain storeChain;
    private Enterprise enterprise;
    private UserAccount userAccountSelected;


    ManageStoreManagerAccountJPanel(JPanel userProcessContainer, RetailChain storeChain) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeChain = storeChain;
        popStoreComboBox();
        popData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        storeJComboBox = new javax.swing.JComboBox();
        employeeJComboBox = new javax.swing.JComboBox();
        createUserJButton = new javax.swing.JButton();
        roleJComboBox = new javax.swing.JComboBox();
        updateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Store:");

        passwordJTextField.setBackground(new java.awt.Color(204, 255, 204));
        passwordJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordJTextField.setForeground(new java.awt.Color(51, 0, 51));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Role:");

        backjButton1.setBackground(new java.awt.Color(204, 255, 204));
        backjButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(51, 0, 51));
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Employee:");

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("User Name:");

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 50));

        userJTable.setBackground(new java.awt.Color(204, 255, 204));
        userJTable.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        userJTable.setForeground(new java.awt.Color(51, 0, 51));
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        nameJTextField.setBackground(new java.awt.Color(204, 255, 204));
        nameJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(51, 0, 51));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Password:");

        storeJComboBox.setBackground(new java.awt.Color(204, 255, 204));
        storeJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        storeJComboBox.setForeground(new java.awt.Color(51, 0, 51));
        storeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        storeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeJComboBoxActionPerformed(evt);
            }
        });

        employeeJComboBox.setBackground(new java.awt.Color(204, 255, 204));
        employeeJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeeJComboBox.setForeground(new java.awt.Color(51, 0, 51));
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createUserJButton.setBackground(new java.awt.Color(204, 255, 204));
        createUserJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(51, 0, 51));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        roleJComboBox.setBackground(new java.awt.Color(204, 255, 204));
        roleJComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        roleJComboBox.setForeground(new java.awt.Color(51, 0, 51));
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        updateJButton.setBackground(new java.awt.Color(204, 255, 204));
        updateJButton.setForeground(new java.awt.Color(51, 0, 51));
        updateJButton.setText("Update ");
        updateJButton.setEnabled(false);
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(204, 255, 204));
        saveJButton.setForeground(new java.awt.Color(51, 0, 51));
        saveJButton.setText("Save");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateJButton)
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createUserJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveJButton))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateJButton)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(storeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton1)
                    .addComponent(createUserJButton)
                    .addComponent(saveJButton))
                .addGap(132, 132, 132))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void storeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeJComboBoxActionPerformed
        Store store = (Store) storeJComboBox.getSelectedItem();
        if (store != null) {
            populateEmployeeComboBox(store);
            populateRoleComboBox(store);
        }
    }//GEN-LAST:event_storeJComboBoxActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        boolean userFlag = false;
        boolean passFlag = false;
        if (nameJTextField.getText().isEmpty()) {
            userFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your user name", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
                boolean userFlagValid = false;
                userFlagValid = Validations.isValidUsername(nameJTextField.getText());
                if(!userFlagValid && !userAccountSelected.getUsername().equals(nameJTextField.getText())){
                        userFlag=true;
                        JOptionPane.showMessageDialog(null, "The username is already in use. Please enter a different username.","Error", JOptionPane.ERROR_MESSAGE);
                    }
            }

        if (passwordJTextField.getText().isEmpty()) {
            passFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter a password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!userFlag & !passFlag){
            String userName = nameJTextField.getText();
            String password = passwordJTextField.getText();
            Store store = (Store) storeJComboBox.getSelectedItem();
            Employee employee = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();

            store.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

            popData();

            JOptionPane.showMessageDialog(null, "User Account added successfully.");
            nameJTextField.setText("");
            passwordJTextField.setText("");
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = userJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            UserAccount ua =(UserAccount)  userJTable.getValueAt(selectedRow, 0);
            userAccountSelected = ua;
            Role employeeRole = (Role) userJTable.getValueAt(selectedRow, 1);
            roleJComboBox.setSelectedItem(employeeRole);
            
            for (Store store : storeChain.getStoreChain()) {
                for (UserAccount uac : store.getUserAccountDirectory().getUserAccountList()) {
                    if(uac.equals(ua)){
                        storeJComboBox.setSelectedItem(store);
                    }
                }
            }
            
            employeeJComboBox.setSelectedItem(ua.getEmployee());
            roleJComboBox.setSelectedItem(employeeRole);
            nameJTextField.setText(ua.getUsername());

            storeJComboBox.setEnabled(false);
            employeeJComboBox.setEnabled(false);
            roleJComboBox.setEnabled(false);
            saveJButton.setEnabled(true);
            createUserJButton.setEnabled(false);
        }
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        boolean userFlag = false;
        boolean passFlag = false;

        if (nameJTextField.getText().isEmpty()) {
                userFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter your user name", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean userFlagValid = false;
                userFlagValid = Validations.isValidUsername(nameJTextField.getText());
                if(!userFlagValid && !userAccountSelected.getUsername().equals(nameJTextField.getText())){
                        userFlag=true;
                        JOptionPane.showMessageDialog(null, "The username is already in use. Please enter a different username.","Error", JOptionPane.ERROR_MESSAGE);
                    }
            }

        if (passwordJTextField.getText().isEmpty()) {
                passFlag = true;
                JOptionPane.showMessageDialog(null, "Please enter a password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        if (!userFlag & !passFlag){
                String userName = passwordJTextField.getText();
                String password = String.valueOf(passwordJTextField.getPassword());

                userAccountSelected.setUsername(userName);
                userAccountSelected.setPassword(password);

                JOptionPane.showMessageDialog(null, "User Account saved successfully.");
                nameJTextField.setText("");
                passwordJTextField.setText("");
                storeJComboBox.setEnabled(true);
                employeeJComboBox.setEnabled(true);
                roleJComboBox.setEnabled(true);
                saveJButton.setEnabled(false);
                createUserJButton.setEnabled(true);

                popData();
            }
    }//GEN-LAST:event_saveJButtonActionPerformed

    public void popStoreComboBox() {
        storeJComboBox.removeAllItems();

        for (Store store : storeChain.getStoreChain()) {
            System.out.println("store" + store.getName());
            storeJComboBox.addItem(store);
        }
    }

    public void populateEmployeeComboBox(Store store) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : store.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Store store) {
        roleJComboBox.removeAllItems();
        for (Role role : store.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Store store : storeChain.getStoreChain()) {
            for (UserAccount ua : store.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
        if(model.getRowCount()>0){
            updateJButton.setEnabled(true);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JButton saveJButton;
    private javax.swing.JComboBox storeJComboBox;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
