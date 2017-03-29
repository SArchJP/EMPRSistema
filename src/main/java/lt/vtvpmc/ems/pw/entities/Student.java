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
    @OneToOne
    private LearningNotFirstTime learningNotFirstTime;

    public Student(String firstName, String lastName, Date birthDate,LearningNotFirstTime learningNotFirstTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.learningNotFirstTime = learningNotFirstTime;
    }

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Student() {
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

    public LearningNotFirstTime getLearningNotFirstTime() {
        return learningNotFirstTime;
    }

    public void setLearningNotFirstTime(LearningNotFirstTime learningNotFirstTime) {
        this.learningNotFirstTime = learningNotFirstTime;
    }
}
