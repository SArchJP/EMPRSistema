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

    private String studentFirstName;
    private String studentLastName;
    private Date studentBirthDate;
    private LearningNotFirstTime learningNotFirstTime;
    private AdditionalInformation additionalInformation;
    private String gainedSpecialty;
    private String institution;
    private String institutionType;
    private Date yearFinished;
    private Boolean leftStudies;


    @Transactional
    public String save() {
//        LearningNotFirstTime learningNotFirstTimeClass = new LearningNotFirstTime(gainedSpecialty, institution, institutionType, yearFinished);
//        entityManager.persist(learningNotFirstTimeClass);
//        Student student = new Student(studentFirstName, studentLastName, studentBirthDate, leftStudies);
//        student.setLearningNotFirstTime(learningNotFirstTimeClass);
//        entityManager.persist(student);
        Student student = new Student(studentFirstName, studentLastName, studentBirthDate, Boolean leftStudies, LearningNotFirstTime lerningNotFirstTime, AdditionalInformation additionalInformation);
        return "main.xhtml";
    }

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

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Date getStudentBirthDate() {
        return studentBirthDate;
    }

    public void setStudentBirthDate(Date studentBirthDate) {
        this.studentBirthDate = studentBirthDate;
    }

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
}
