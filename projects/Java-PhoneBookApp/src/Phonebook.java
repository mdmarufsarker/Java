
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maruf
 */
public class Phonebook extends AbstractPhonebook{
    private ArrayList<Contact> contacts;
    public Phonebook() {
        contacts = new ArrayList<>();
    }
    // 6. Overriding: Implementing the abstract methods from AbstractPhonebook
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public void displayContacts(){
        // display contacts in a nice format in the JFrame
        JFrame frame = new JFrame();
        frame.setSize(1000, 500);
        frame.setTitle("Phonebook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        UIManager.put("Table.font", new Font("Arial", Font.PLAIN, 18));

        // 6. Overriding: Displaying additional information based on contact type
        String[] columnNames = {"Name", "Phone Number", "Email", "Organization"};
        String[][] data = new String[contacts.size()][4];

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            data[i][0] = contact.getName();
            data[i][1] = contact.getPhoneNumber();
            if (contact instanceof PersonalContact) {
                PersonalContact personalContact = (PersonalContact) contact;
                data[i][2] = personalContact.getEmail();
            } else if (contact instanceof BusinessContact) {
                BusinessContact businessContact = (BusinessContact) contact;
                data[i][3] = businessContact.getOrganization();
            }
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);    
    }
}
