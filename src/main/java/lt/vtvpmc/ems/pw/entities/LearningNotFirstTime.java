package lt.vtvpmc.ems.pw.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Minde on 2017.03.29.
 */
@Entity
public class LearningNotFirstTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gainedSpecialty;
    private String institution;
    private String institutionType;
    private int yearFinished;


    public LearningNotFirstTime() {

    }

    public LearningNotFirstTime(String gainedSpecialty, String institution, String institutionType, int yearFinished) {
        this.gainedSpecialty = gainedSpecialty;
        this.institution = institution;
        this.institutionType = institutionType;
        this.yearFinished = yearFinished;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
