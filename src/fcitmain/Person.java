/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitmain;

import java.util.Date;

/**
 *
 * @author AHMED 50070
 */
public class Person {
    
    private int id ;
    private String name ;
    private String nationality;
    private Date dateOfBirt ;
    private char gender ;
    private int phone;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
   
    
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirt() {
        
        return dateOfBirt;
    }

    public void setDateOfBirt(Date dateOfBirt) {
        this.dateOfBirt = dateOfBirt;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PERSON{" + "id=" + id + ", name=" + name + ", nationality=" + nationality + ", dateOfBirt=" + dateOfBirt + ", gender=" + gender + ", phone=" + phone + ", address=" + address + '}';
    }
    
    
    
}
