package com.examly.springapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Academy implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    
    private String emailId;
    
    private String academyName;
  
    private String contactNumber;
    
    private String imageUrl;
    
    private String academyLocation;
  
    private String academyDesctipriton;

    
    public Academy() {
    }


    public Academy(Long id, String emailId, String academyName, String contactNumber, String imageUrl,
            String academyLocation, String academyDesctipriton) {
        this.id = id;
        this.emailId = emailId;
        this.academyName = academyName;
        this.contactNumber = contactNumber;
        this.imageUrl = imageUrl;
        this.academyLocation = academyLocation;
        this.academyDesctipriton = academyDesctipriton;
    }


    @Override
    public String toString() {
        return "Academy [academyDesctipriton=" + academyDesctipriton + ", academyLocation=" + academyLocation
                + ", academyName=" + academyName + ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", id="
                + id + ", imageUrl=" + imageUrl + "]";
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getEmailId() {
        return emailId;
    }


    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public String getAcademyName() {
        return academyName;
    }


    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }


    public String getContactNumber() {
        return contactNumber;
    }


    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getAcademyLocation() {
        return academyLocation;
    }


    public void setAcademyLocation(String academyLocation) {
        this.academyLocation = academyLocation;
    }


    public String getAcademyDesctipriton() {
        return academyDesctipriton;
    }


    public void setAcademyDesctipriton(String academyDesctipriton) {
        this.academyDesctipriton = academyDesctipriton;
    }
    
 

}