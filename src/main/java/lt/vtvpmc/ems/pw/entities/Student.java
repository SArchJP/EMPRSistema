package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private Boolean leftStudies;

    @OneToOne
    private LearningNotFirstTime learningNotFirstTime;

    @OneToOne
    private AdditionalInformation additionalInformation;

    @OneToOne
    private RequestForm requestForm;

    public Student() {
    }

    public Student(String firstName, String lastName, Date birthDate, Boolean leftStudies, LearningNotFirstTime learningNotFirstTime, AdditionalInformation additionalInformation, RequestForm requestForm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.leftStudies = leftStudies;
        this.learningNotFirstTime = learningNotFirstTime;
        this.additionalInformation = additionalInformation;
        this.requestForm = requestForm;
    }

    public Student(String firstName, String lastName, Date birthDate, Boolean leftStudies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.leftStudies = leftStudies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public LearningNotFirstTime getLearningNotFirstTime() {
        return learningNotFirstTime;
    }

    public void setLearningNotFirstTime(LearningNotFirstTime learningNotFirstTime) {
        this.learningNotFirstTime = learningNotFirstTime;
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
}
