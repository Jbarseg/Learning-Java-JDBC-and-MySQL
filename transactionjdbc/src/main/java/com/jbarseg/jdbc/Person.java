package com.jbarseg.jdbc;

public class Person {
    private int usernameid;
    private String name;
    private String lastname;
    private String email;
    private String phonenumber;
    
    public Person() {
    }
    
    public Person(int usernameid) {
        this.usernameid = usernameid;
    }

    public Person(String name, String lastname, String email, String phonenumber) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public Person(int usernameid, String name, String lastname, String email, String phonenumber) {
        this.usernameid = usernameid;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public int getUsernameid() {
        return usernameid;
    }

    public void setUsernameid(int usernameid) {
        this.usernameid = usernameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Person [usernameid=" + usernameid + ", name=" + name + ", lastname=" + lastname + ", email=" + email
                + ", phonenumber=" + phonenumber + "]";
    }
        
    
}
