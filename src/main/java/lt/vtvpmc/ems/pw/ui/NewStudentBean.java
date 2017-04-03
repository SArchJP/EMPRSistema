package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lt.vtvpmc.ems.pw.entities.LearningNotFirstTime;
import lt.vtvpmc.ems.pw.entities.Student;
import lt.vtvpmc.ems.pw.entities.AdditionalInformation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class NewStudentBean {

    @PersistenceContext
    private EntityManager entityManager;

    //    Base Fields
    private String studentFirstName;
    private String studentLastName;
    private Date studentBirthDate;

    //    Classes implementation
    private LearningNotFirstTime learningNotFirstTime;
    private AdditionalInformation additionalInformation;

    //    Additional information
    private String address;
    private String municipal;
    private long phone;
    private String email;
    private String education;
    private String nameOfFinishedSchool;
    private int yearFinishedEducation;
    private String maritalStatus;

    //    Learning not first time
    private String gainedSpecialty;
    private String institution;
    private String institutionType;
    private int yearFinished;

    private Boolean leftStudies;


    @Transactional
    public String save() {

        AdditionalInformation additionalInformationClass = new AdditionalInformation(address, municipal, phone, email, education, nameOfFinishedSchool, yearFinishedEducation, maritalStatus);
        entityManager.persist(additionalInformationClass);

        LearningNotFirstTime learningNotFirstTimeClass = new LearningNotFirstTime(gainedSpecialty, institution, institutionType, yearFinished);
        entityManager.persist(learningNotFirstTimeClass);

        Student student = new Student(studentFirstName, studentLastName, studentBirthDate, leftStudies);
        student.setAdditionalInformation(additionalInformationClass);
        student.setLearningNotFirstTime(learningNotFirstTimeClass);
        entityManager.persist(student);

        return "main.xhtml";
    }

    // Entity manager get/set
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //    Base fields get/set
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

    //    Additional information get/set
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
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

    public int getYearFinishedEducation() {
        return yearFinishedEducation;
    }

    public void setYearFinishedEducation(int yearFinishedEducation) {
        this.yearFinishedEducation = yearFinishedEducation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    //    Learning not first time get/set
    public LearningNotFirstTime getLearningNotFirstTime() {
        return learningNotFirstTime;
    }

    public void setLearningNotFirstTime(LearningNotFirstTime learningNotFirstTime) {
        this.learningNotFirstTime = learningNotFirstTime;
    }

    public String getGainedSpecialty() {
        return gainedSpecialty;
    }

    public void setGainedSpecialty(String gainedSpecialty) {
        this.gainedSpecialty = gainedSpecialty;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    public int getYearFinished() {
        return yearFinished;
    }

    public void setYearFinished(int yearFinished) {
        this.yearFinished = yearFinished;
    }

    public Boolean getLeftStudies() {
        return leftStudies;
    }

    public void setLeftStudies(Boolean leftStudies) {
        this.leftStudies = leftStudies;
    }
}
