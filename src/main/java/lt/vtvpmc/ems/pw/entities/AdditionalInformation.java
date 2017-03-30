package lt.vtvpmc.ems.pw.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Component
public class AdditionalInformation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String address;
    private String municipal;
    private String phone;
    private String email;
    private String education;
    private String nameOfFinishedSchool;
    @Temporal(TemporalType.DATE)
    private Date yearFinished;
    private String maritalStatus;

    // Drop down lists for municipal, education, maritalStatus
    @Transient List<String> municipalOption;
    @Transient List<String> educationOptions;
    @Transient List<String> martialStatusOption;


    // Create no-arg constructor

    public AdditionalInformation() {
        municipalOption = new ArrayList<String>();
        municipalOption.add("Alytaus m.");
        municipalOption.add("Alytaus raj.");
        municipalOption.add("Kauno m.");
        municipalOption.add("Kauno raj.");
        municipalOption.add("Klaipėdos m.");
        municipalOption.add("Klaipėdos raj.");
        municipalOption.add("Marijampolės m.");
        municipalOption.add("Panevėžio m.");
        municipalOption.add("Panevėžio raj.");
        municipalOption.add("Utenos raj.");
        municipalOption.add("Visagino m.");
        municipalOption.add("Vilniaus m.");
        municipalOption.add("Vilniaus raj.");

        educationOptions = new ArrayList<String>();
        educationOptions.add("Aukštasis išsilavinimas");
        educationOptions.add("Aukštesnysis išsilavinimas");
        educationOptions.add("Specialusis vidurinis išsilavinimas");
        educationOptions.add("Vidurinis išsilavinimas ");
        educationOptions.add("Pagrindinis išsilavinimas");
        educationOptions.add("Pradinis išsilavinimas");
        educationOptions.add("Nereglamentuojamas");
        educationOptions.add("Aukštasis universitetinis išsilavinimas");
        educationOptions.add("Aukštasis koleginis išsilavinimas");

        martialStatusOption = new ArrayList<String>();
        martialStatusOption.add("vedęs/ištekėjusi");
        martialStatusOption.add("nevedęs/neištekėjusi");
        martialStatusOption.add("našlaitis(-ė)");



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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public List<String> getMunicipalOption() {
        return municipalOption;
    }

    public List<String> getEducationOptions() {
        return educationOptions;
    }

    public List<String> getMartialStatusOption() {
        return martialStatusOption;
    }
}
