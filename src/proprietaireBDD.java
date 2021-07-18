//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class proprietaireBDD extends LoginSuccess {
    private JFrame frame;
    private JTextField FirstName;
    private JTextField LastName;
    private JTextField sex;
    private JTextField age;
    private JTextField CIN;
    private JTextField PhoneNumber;
    private JTextField AnimalAdopte;
    private JTable table;
    DefaultTableModel model;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    proprietaireBDD window = new proprietaireBDD();
                    window.frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public proprietaireBDD() {
        this.initialize();
    }

    private void initialize() {
        this.frame = new JFrame();
        this.frame.setTitle("Base de données des propriétaires");
        this.frame.setBounds(100, 100, 1084, 654);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Prénom");
        lblNewLabel.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel.setBounds(27, 130, 120, 26);
        this.frame.getContentPane().add(lblNewLabel);
        JLabel lblCIN = new JLabel("Code Identité Nationale");
        lblCIN.setFont(new Font("Tahoma", 0, 12));
        lblCIN.setBounds(27, 168, 120, 26);
        this.frame.getContentPane().add(lblCIN);
        JLabel lblNewLabel_1_1 = new JLabel("Sexe");
        lblNewLabel_1_1.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel_1_1.setBounds(27, 204, 120, 26);
        this.frame.getContentPane().add(lblNewLabel_1_1);
        JLabel lblNewLabel_1_2 = new JLabel("Age");
        lblNewLabel_1_2.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel_1_2.setBounds(27, 240, 120, 26);
        this.frame.getContentPane().add(lblNewLabel_1_2);
        JLabel lblNewLabel_1_3 = new JLabel("N° de Telephone");
        lblNewLabel_1_3.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel_1_3.setBounds(27, 276, 120, 26);
        this.frame.getContentPane().add(lblNewLabel_1_3);
        JLabel lblNewLabel_1_6 = new JLabel("ID Animale adopté");
        lblNewLabel_1_6.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel_1_6.setBounds(27, 312, 120, 26);
        this.frame.getContentPane().add(lblNewLabel_1_6);
        this.FirstName = new JTextField();
        this.FirstName.setColumns(10);
        this.FirstName.setBounds(244, 137, 153, 19);
        this.frame.getContentPane().add(this.FirstName);
        this.LastName = new JTextField();
        this.LastName.setColumns(10);
        this.LastName.setBounds(244, 175, 153, 19);
        this.frame.getContentPane().add(this.LastName);
        this.CIN = new JTextField();
        this.CIN.setColumns(10);
        this.CIN.setBounds(244, 283, 153, 19);
        this.frame.getContentPane().add(this.CIN);
        this.sex = new JTextField();
        this.sex.setColumns(10);
        this.sex.setBounds(244, 211, 153, 19);
        this.frame.getContentPane().add(this.sex);
        this.age = new JTextField();
        this.age.setColumns(10);
        this.age.setBounds(244, 247, 153, 19);
        this.frame.getContentPane().add(this.age);
        this.PhoneNumber = new JTextField();
        this.PhoneNumber.setColumns(10);
        this.PhoneNumber.setBounds(244, 319, 153, 19);
        this.frame.getContentPane().add(this.PhoneNumber);
        JLabel lblNewLabel_1_12_1 = new JLabel("Nom");
        lblNewLabel_1_12_1.setFont(new Font("Tahoma", 0, 12));
        lblNewLabel_1_12_1.setBounds(27, 94, 120, 26);
        this.frame.getContentPane().add(lblNewLabel_1_12_1);
        this.AnimalAdopte = new JTextField();
        this.AnimalAdopte.setColumns(10);
        this.AnimalAdopte.setBounds(244, 101, 153, 19);
        this.frame.getContentPane().add(this.AnimalAdopte);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(407, 28, 653, 579);
        this.frame.getContentPane().add(scrollPane);
        this.table = new JTable();
        this.table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int i = proprietaireBDD.this.table.getSelectedRow();
                proprietaireBDD.this.AnimalAdopte.setText(proprietaireBDD.this.model.getValueAt(i, 0).toString());
                proprietaireBDD.this.FirstName.setText(proprietaireBDD.this.model.getValueAt(i, 1).toString());
                proprietaireBDD.this.LastName.setText(proprietaireBDD.this.model.getValueAt(i, 2).toString());
                proprietaireBDD.this.sex.setText(proprietaireBDD.this.model.getValueAt(i, 3).toString());
                proprietaireBDD.this.age.setText(proprietaireBDD.this.model.getValueAt(i, 4).toString());
                proprietaireBDD.this.CIN.setText(proprietaireBDD.this.model.getValueAt(i, 5).toString());
                proprietaireBDD.this.PhoneNumber.setText(proprietaireBDD.this.model.getValueAt(i, 6).toString());
            }
        });
        this.table.setBackground(UIManager.getColor("Button.light"));
        this.model = new DefaultTableModel();
        Object[] column = new Object[]{"Nom", "Prénom", "CIN", "Sexe", "Age", "N° de Telephone", "ID Animal Adopté"};
        final Object[] row = new Object[7];
        this.model.setColumnIdentifiers(column);
        this.table.setModel(this.model);
        scrollPane.setViewportView(this.table);
        this.model.addRow(new Object[]{"Laila", "Allam", "BE******", "F", "20", "0612345678", "1"});
        this.model.addRow(new Object[]{"Zineb", "Zoufir", "BE******", "F", "20", "0612345678", "5"});
        this.model.addRow(new Object[]{"Latifa", "Hammani", "BE******", "F", "20", "0612345678", "9"});
        JButton btnNewButton = new JButton("Ajouter");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!proprietaireBDD.this.AnimalAdopte.getText().equals("") && !proprietaireBDD.this.FirstName.getText().equals("") && !proprietaireBDD.this.LastName.getText().equals("") && !proprietaireBDD.this.sex.getText().equals("") && !proprietaireBDD.this.age.getText().equals("") && !proprietaireBDD.this.CIN.getText().equals("") && !proprietaireBDD.this.PhoneNumber.getText().equals("")) {
                    row[0] = proprietaireBDD.this.AnimalAdopte.getText();
                    row[1] = proprietaireBDD.this.FirstName.getText();
                    row[2] = proprietaireBDD.this.LastName.getText();
                    row[3] = proprietaireBDD.this.sex.getText();
                    row[4] = proprietaireBDD.this.age.getText();
                    row[5] = proprietaireBDD.this.CIN.getText();
                    row[6] = proprietaireBDD.this.PhoneNumber.getText();
                    proprietaireBDD.this.model.addRow(row);
                    proprietaireBDD.this.AnimalAdopte.setText("");
                    proprietaireBDD.this.FirstName.setText("");
                    proprietaireBDD.this.LastName.setText("");
                    proprietaireBDD.this.sex.setText("");
                    proprietaireBDD.this.age.setText("");
                    proprietaireBDD.this.CIN.setText("");
                    proprietaireBDD.this.PhoneNumber.setText("");
                    JOptionPane.showMessageDialog((Component)null, "Propriétaire ajouté avec succès !");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Veuillez remplir tous les champs");
                }

            }
        });
        btnNewButton.setFont(new Font("Tahoma", 0, 15));
        btnNewButton.setBounds(20, 411, 164, 42);
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.PINK);
        this.frame.getContentPane().add(btnNewButton);
        JButton btnMettreJour = new JButton("Mettre à jour");
        btnMettreJour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = proprietaireBDD.this.table.getSelectedRow();
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.AnimalAdopte.getText(), i, 0);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.FirstName.getText(), i, 1);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.LastName.getText(), i, 2);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.sex.getText(), i, 3);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.age.getText(), i, 4);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.CIN.getText(), i, 5);
                proprietaireBDD.this.model.setValueAt(proprietaireBDD.this.PhoneNumber.getText(), i, 6);
                JOptionPane.showMessageDialog((Component)null, "Informations mises à jour avec succès !");
            }
        });
        btnMettreJour.setFont(new Font("Tahoma", 0, 15));
        btnMettreJour.setBounds(225, 411, 164, 42);
        btnMettreJour.setForeground(Color.BLACK);
        btnMettreJour.setBackground(Color.PINK);
        this.frame.getContentPane().add(btnMettreJour);
        JButton btnback = new JButton("Page principale");
        btnback.setFont(new Font("Tahoma", 0, 15));
        btnback.setBounds(20, 476, 164, 42);
        btnback.setForeground(Color.BLACK);
        btnback.setBackground(Color.PINK);
        this.frame.getContentPane().add(btnback);
        btnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.main(new String[0]);
                proprietaireBDD.super.hide();
                proprietaireBDD.this.frame.dispose();
            }
        });
        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = proprietaireBDD.this.table.getSelectedRow();
                if (i >= 0) {
                    proprietaireBDD.this.model.removeRow(i);
                    JOptionPane.showMessageDialog((Component)null, "Propriètaire supprimé avec succès !");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Veuillez sélectionner une ligne");
                }

            }
        });
        btnSupprimer.setFont(new Font("Tahoma", 0, 15));
        btnSupprimer.setBounds(225, 476, 164, 42);
        btnSupprimer.setForeground(Color.BLACK);
        btnSupprimer.setBackground(Color.PINK);
        this.frame.getContentPane().add(btnSupprimer);
    }
}
