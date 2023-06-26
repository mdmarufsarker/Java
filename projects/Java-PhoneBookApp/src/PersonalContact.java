/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maruf
 */
public class PersonalContact extends Contact{
    private String email;
    public PersonalContact(String name, String phoneNumber, String email) {
        super(name, phoneNumber);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
