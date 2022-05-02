package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@SecondaryTable(name = "student", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
@SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class User implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    
    @Column(name = "role", table = "student",nullable = false)
    private String role;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String mobileNumber;
    @Column(nullable = false)
    private String password;

    @Column(name="motherName")
    private String mothername;

    @Column(name="fatherName")
    private String fathername;
    
    @Column(name="gender")
    private String gender;

    @Column(name="alternativeNumber")
    private String alternativeNumber;

    @Column(name = "dob", columnDefinition = "DATE")
    private java.sql.Date dob;

    @Column(nullable = false)
    private boolean active = true;
   
    @Column(name = "houseNo", table = "address")
    private String houseNo;
    @Column(name = "street", table = "address")
    private String street;
    @Column(name = "area", table = "address")
    private String area;
    @Column(name = "state", table = "address")
    private String state;
    @Column(name = "pincode", table = "address")
    private String pincode;
    @Column(name = "nationality", table = "address")
    private String nationality;

    
    
    // public User(Long id, String role, String email, String username, String mobileNumber, String password,
    //         boolean active) {
    //     this.id = id;
    //     this.role = role;
    //     this.email = email;
    //     this.username = username;
    //     this.mobileNumber = mobileNumber;
    //     this.password = password;
    //     this.active = active;
       
    // }


    public User(Long id, String role, String email, String username, String mobileNumber, String password,
            String mothername, String fathername, String gender, String alternativeNumber, Date dob, boolean active,
            String houseNo, String street, String area, String state, String pincode, String nationality) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.mothername = mothername;
        this.fathername = fathername;
        this.gender = gender;
        this.alternativeNumber = alternativeNumber;
        this.dob = dob;
        this.active = active;
        this.houseNo = houseNo;
        this.street = street;
        this.area = area;
        this.state = state;
        this.pincode = pincode;
        this.nationality = nationality;
    }


    public String getMothername() {
        return mothername;
    }


    public void setMothername(String mothername) {
        this.mothername = mothername;
    }


    public String getFathername() {
        return fathername;
    }


    public void setFathername(String fathername) {
        this.fathername = fathername;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAlternativeNumber() {
        return alternativeNumber;
    }


    public void setAlternativeNumber(String alternativeNumber) {
        this.alternativeNumber = alternativeNumber;
    }


    public java.sql.Date getDob() {
        return dob;
    }


    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }


    public String getHouseNo() {
        return houseNo;
    }


    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }


    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }


    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public String getPincode() {
        return pincode;
    }


    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    public String getNationality() {
        return nationality;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public User() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
   

    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User [active=" + active + ", alternativeNumber=" + alternativeNumber + ", area=" + area + ", dob=" + dob
                + ", email=" + email + ", fathername=" + fathername + ", gender=" + gender + ", houseNo=" + houseNo
                + ", id=" + id + ", mobileNumber=" + mobileNumber + ", mothername=" + mothername + ", nationality="
                + nationality + ", password=" + password + ", pincode=" + pincode + ", role=" + role + ", state="
                + state + ", street=" + street + ", username=" + username + "]";
    }
   

    
}