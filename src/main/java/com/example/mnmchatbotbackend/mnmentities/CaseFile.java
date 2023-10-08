package com.example.mnmchatbotbackend.mnmentities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//C:\Users\Student\.m2\repository\javax\persistence\javax.persistence-api
@Entity
@Table(name = "casefiles")
public class CaseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private int age;
    private String legalcasetype;
    private String address;
    private String priority;
    private String casedescription;
    private String comments;

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLegalcasetype() {
        return legalcasetype;
    }

    public void setLegalcasetype(String legalcasetype) {
        this.legalcasetype = legalcasetype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCasedescription() {
        return casedescription;
    }

    public void setCasedescription(String casedescription) {
        this.casedescription = casedescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
