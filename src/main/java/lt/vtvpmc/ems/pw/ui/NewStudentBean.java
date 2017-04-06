package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lt.vtvpmc.ems.pw.entities.LearningNotFirstTime;
import lt.vtvpmc.ems.pw.entities.RequestForm;
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
    private RequestForm requestForm;

    //    Additional information
    private String address;
    private String municipal;
    private long phone;
    private String email;
    private String education;
    private String nameOfFinishedSchool;
    private Date yearFinishedEducation;
    private String maritalStatus;

    //    Learning not first time
    private String gainedSpecialty;
    private String institution;
    private String institutionType;
    private Date yearFinished;
    private Boolean leftStudies;

//    Request Form
    private Date requestDate;
    private String requestToGroup;
    private String requestTier;
    private Boolean educationDocuments;
    private Boolean healthDocument;
    private Boolean photos;
    private Boolean passportCopy;
    private Boolean drafteeCertificate;
    private Boolean entranceFee;


    @Transactional
    public String save() {

        AdditionalInformation additionalInformationClass = new AdditionalInformation(address, municipal, phone, email, education, nameOfFinishedSchool, yearFinishedEducation, maritalStatus);
        entityManager.persist(additionalInformationClass);

        LearningNotFirstTime learningNotFirstTimeClass = new LearningNotFirstTime(gainedSpecialty, institution, institutionType, yearFinished);
        entityManager.persist(learningNotFirstTimeClass);

        RequestForm requestForm = new RequestForm();

//        RequestForm requestForm = new RequestForm(requestDate, requestToGroup, requestTier, educationDocuments, healthDocument, photos, passportCopy, drafteeCertificate, entranceFee);
        entityManager.persist(requestForm);

        Student student = new Student(studentFirstName, studentLastName, studentBirthDate, leftStudies);
        student.setAdditionalInformation(additionalInformationClass);
        student.setLearningNotFirstTime(learningNotFirstTimeClass);
        student.setRequestForm(requestForm);
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

    public Date getYearFinishedEducation() {
        return yearFinishedEducation;
    }

    public void setYearFinishedEducation(Date yearFinishedEducation) {
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

    public Date getYearFinished() {
        return yearFinished;
    }

    public void setYearFinished(Date yearFinished) {
        this.yearFinished = yearFinished;
    }

    public Boolean getLeftStudies() {
        return leftStudies;
    }

    public void setLeftStudies(Boolean leftStudies) {
        this.leftStudies = leftStudies;
    }

    public RequestForm getRequestForm() {
        return requestForm;
    }

    public void setRequestForm(RequestForm requestForm) {
        this.requestForm = requestForm;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestToGroup() {
        return requestToGroup;
    }

    public void setRequestToGroup(String requestToGroup) {
        this.requestToGroup = requestToGroup;
    }

    public String getRequestTier() {
        return requestTier;
    }

    public void setRequestTier(String requestTier) {
        this.requestTier = requestTier;
    }

    public Boolean getEducationDocuments() {
        return educationDocuments;
    }

    public void setEducationDocuments(Boolean educationDocuments) {
        this.educationDocuments = educationDocuments;
    }

    public Boolean getHealthDocument() {
        return healthDocument;
    }

    public void setHealthDocument(Boolean healthDocument) {
        this.healthDocument = healthDocument;
    }

    public Boolean getPhotos() {
        return photos;
    }

    public void setPhotos(Boolean photos) {
        this.photos = photos;
    }

    public Boolean getPassportCopy() {
        return passportCopy;
    }

    public void setPassportCopy(Boolean passportCopy) {
        this.passportCopy = passportCopy;
    }

    public Boolean getDrafteeCertificate() {
        return drafteeCertificate;
    }

    public void setDrafteeCertificate(Boolean drafteeCertificate) {
        this.drafteeCertificate = drafteeCertificate;
    }

    public Boolean getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(Boolean entranceFee) {
        this.entranceFee = entranceFee;
    }
}
