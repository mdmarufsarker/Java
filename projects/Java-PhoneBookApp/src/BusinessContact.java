/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maruf
 */
public class BusinessContact extends Contact{
    private String organization;
    public BusinessContact(String name, String phoneNumber, String organization) {
        super(name, phoneNumber);
        this.organization = organization;
    }
    public String getOrganization() {
        return organization;
    }

}
