/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parth
 */

package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Staff;
import Business.Enterprise.*;
import Business.Networks.Networks;
import Business.Role.RoleEntAdmin;
import Business.Role.Role;
import Business.SystemUserAccount.SystemUsers;
import Business.SystemUserAccount.UsersDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private SystemUsers userAccount;
    private Staff employee;
    private UsersDirectory userAccountDirectory;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        txtUnm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtPswd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtRepwd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mtxtNm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populatentTbl();
        popNtwrkComboBox();
    }

    private void populatentTbl() {
        DefaultTableModel model = (DefaultTableModel) tblManageEnt.getModel();

        model.setRowCount(0);
        for (Networks network : system.getNetworks()) {
            for (Enterprise enterprise : network.getEntDir().getEnterpriseList()) {
                for (SystemUsers userAccount : enterprise.getUsrAccDir().getUsrAccList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetwrkName();
                    row[2] = userAccount.getUsrName();
                    row[3] = enterprise.getEntType().getValue();

                    model.addRow(row);
                }
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblManageEnt.setRowSorter(sorter);
            }
        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblManageEnt.setRowSorter(sorter);
    }

    private void popNtwrkComboBox() {
        cbNetwork.removeAllItems();

        for (Networks network : system.getNetworks()) {
            cbNetwork.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Networks network) {
        cbEnt.removeAllItems();

        for (Enterprise enterprise : network.getEntDir().getEnterpriseList()) {
            cbEnt.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageEnt = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        cbNetwork = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtUnm = new javax.swing.JTextField();
        lblEnt = new javax.swing.JLabel();
        cbEnt = new javax.swing.JComboBox();
        btnSbmt = new javax.swing.JButton();
        lblPwd = new javax.swing.JLabel();
        mtxtNm = new javax.swing.JTextField();
        lblNm = new javax.swing.JLabel();
        txtPswd = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        txtRepwd = new javax.swing.JPasswordField();
        lblRepwd = new javax.swing.JLabel();
        lblManageEntAdm = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(null);

        tblManageEnt.setBackground(new java.awt.Color(204, 204, 204));
        tblManageEnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblManageEnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageEnt);

        add(jScrollPane1);
        jScrollPane1.setBounds(26, 62, 671, 88);

        lblNetwork.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNetwork.setText("Network");
        add(lblNetwork);
        lblNetwork.setBounds(88, 168, 52, 17);

        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetworkActionPerformed(evt);
            }
        });
        add(cbNetwork);
        cbNetwork.setBounds(182, 166, 136, 22);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblUsername.setText("Username");
        add(lblUsername);
        lblUsername.setBounds(70, 232, 70, 17);

        txtUnm.setBackground(new java.awt.Color(204, 204, 204));
        add(txtUnm);
        txtUnm.setBounds(182, 228, 136, 25);

        lblEnt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEnt.setText("Enterprise");
        add(lblEnt);
        lblEnt.setBounds(73, 199, 70, 17);

        cbEnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbEnt);
        cbEnt.setBounds(182, 197, 136, 22);

        btnSbmt.setBackground(new java.awt.Color(0, 102, 102));
        btnSbmt.setForeground(new java.awt.Color(255, 255, 255));
        btnSbmt.setText("Submit");
        btnSbmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSbmtActionPerformed(evt);
            }
        });
        add(btnSbmt);
        btnSbmt.setBounds(182, 375, 80, 25);

        lblPwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPwd.setText("Password");
        add(lblPwd);
        lblPwd.setBounds(84, 268, 56, 17);

        mtxtNm.setBackground(new java.awt.Color(204, 204, 204));
        mtxtNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(mtxtNm);
        mtxtNm.setBounds(182, 341, 136, 28);

        lblNm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNm.setText("Name");
        add(lblNm);
        lblNm.setBounds(93, 347, 50, 17);

        txtPswd.setBackground(new java.awt.Color(204, 204, 204));
        add(txtPswd);
        txtPswd.setBounds(182, 264, 136, 25);

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 11, 90, 25);

        txtRepwd.setBackground(new java.awt.Color(204, 204, 204));
        txtRepwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(txtRepwd);
        txtRepwd.setBounds(182, 300, 136, 29);

        lblRepwd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblRepwd.setText("re-enter Password");
        add(lblRepwd);
        lblRepwd.setBounds(30, 306, 111, 17);

        lblManageEntAdm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblManageEntAdm.setText("Manage Enterprise Admin");
        add(lblManageEntAdm);
        lblManageEntAdm.setBounds(205, 27, 305, 29);

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage enterprise admin.gif"))); // NOI18N
        add(img);
        img.setBounds(90, 80, 1060, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void cbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetworkActionPerformed

        Networks network = (Networks) cbNetwork.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_cbNetworkActionPerformed

    private void btnSbmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSbmtActionPerformed

        Enterprise enterprise = (Enterprise) cbEnt.getSelectedItem();

        String username = txtUnm.getText();
        Role role = null;
        String password = String.valueOf(txtPswd.getPassword());
        String rePassword = String.valueOf(txtRepwd.getPassword());
        String name = mtxtNm.getText();

        if (username == null || username.equals("")) {
            txtUnm.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblUsername.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username can't be empty");
            return;
        }
        if (password == null || password.equals("")) {
            txtUnm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lblUsername.setForeground(Color.BLACK);
            txtPswd.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPwd.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password can't be empty");
            return;
        }

        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 Characters "
                    + "digits and a combination of number , uppercase letter, "
                    + "lowercase letter and Special characters are not allowed other than $, +, _");
            txtPswd.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPwd.setForeground(Color.RED);
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords don't match");
            txtPswd.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtRepwd.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPwd.setForeground(Color.RED);
            lblRepwd.setForeground(Color.RED);
            return;
        }

        if (name == null || name.equals("")) {
            txtPswd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtRepwd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lblPwd.setForeground(Color.BLACK);
            lblRepwd.setForeground(Color.BLACK);
            mtxtNm.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblNm.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Name can't be empty");
            return;
        } else {
            List<SystemUsers> userAccountList = enterprise.getUsrAccDir().getUsrAccList();
            for (SystemUsers userAccount : userAccountList) {
                if (userAccount.getUsrName().equals(username)) {
                    JOptionPane.showMessageDialog(null, "username already taken!!");
                    txtUnm.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }
            
            Staff employee = enterprise.getEmpDir().createEmployee(name);
            SystemUsers userAccount = enterprise.getUsrAccDir().createUserAccount(username, password, employee, new RoleEntAdmin());
            populatentTbl();

            lblPwd.setForeground(Color.BLACK);
            lblRepwd.setForeground(Color.BLACK);
            lblNm.setForeground(Color.BLACK);
            mtxtNm.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtPswd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtRepwd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            mtxtNm.setText("");
            txtPswd.setText("");
            txtRepwd.setText("");
            txtUnm.setText("");
        }

    }//GEN-LAST:event_btnSbmtActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(txtPswd.getPassword()));
        boolean b = m.matches();
        return b;
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSbmt;
    private javax.swing.JComboBox cbEnt;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnt;
    private javax.swing.JLabel lblManageEntAdm;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblNm;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblRepwd;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField mtxtNm;
    private javax.swing.JTable tblManageEnt;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JPasswordField txtRepwd;
    private javax.swing.JTextField txtUnm;
    // End of variables declaration//GEN-END:variables
}
