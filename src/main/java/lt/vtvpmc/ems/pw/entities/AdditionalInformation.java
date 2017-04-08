package lt.vtvpmc.ems.pw.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class AdditionalInformation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String address;
    private String municipal;
    private long phone;
    private String email;
    private String education;
    private String nameOfFinishedSchool;
    @Temporal(TemporalType.DATE)
    private Date yearFinished;
    private String maritalStatus;

    // Create no-arg constructor

    public AdditionalInformation() {
    }

    //    Arg true constructor
    public AdditionalInformation(String address, String municipal, long phone, String email, String education, String nameOfFinishedSchool, Date yearFinished, String maritalStatus) {
        this.address = address;
        this.municipal = municipal;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.nameOfFinishedSchool = nameOfFinishedSchool;
        this.yearFinished = yearFinished;
        this.maritalStatus = maritalStatus;
    }

    //    Generate getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipal() {
        return municipal;
    }

    public void setMunicipal(String municipal) {
        this.municipal = municipal;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNameOfFinishedSchool() {
        return nameOfFinishedSchool;
    }

    public void setNameOfFinishedSchool(String nameOfFinishedSchool) {
        this.nameOfFinishedSchool = nameOfFinishedSchool;
    }

    public Date getYearFinished() {
        return yearFinished;
    }

    public void setYearFinished(Date yearFinished) {
        this.yearFinished = yearFinished;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

}
