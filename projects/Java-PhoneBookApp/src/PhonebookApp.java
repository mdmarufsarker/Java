
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maruf
 */
public final class PhonebookApp extends JFrame{
    private AbstractPhonebook phonebook;
    private JTextArea contactDisplayArea;

    public PhonebookApp() {
        phonebook = new Phonebook();
        setTitle("Phonebook");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
    }
    private void createGUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        contactDisplayArea = new JTextArea();
        contactDisplayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(contactDisplayArea);
        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });
        JButton displayButton = new JButton("Display Contacts");
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayContacts();
            }
        });
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.SOUTH);
        panel.add(displayButton, BorderLayout.NORTH);
        add(panel);
    }
    private void addContact() {
        String name = JOptionPane.showInputDialog("Enter contact name:");
        String phoneNumber = JOptionPane.showInputDialog("Enter contact phone number:");
        String contactType = JOptionPane.showInputDialog("Enter contact type (Personal/Business):");
        Contact contact;
        if (contactType.equalsIgnoreCase("Personal")) {
            String email = JOptionPane.showInputDialog("Enter email:");
            contact = new PersonalContact(name, phoneNumber, email);
        } else {
            String organization = JOptionPane.showInputDialog("Enter organization:");
            contact = new BusinessContact(name, phoneNumber, organization);
        }
        phonebook.addContact(contact);
    }
    private void displayContacts() {
        contactDisplayArea.setText("");
        // Calling the overridden displayContacts method from Phonebook
        phonebook.displayContacts();
    }
    public void start() {
        setVisible(true);
    }
}
