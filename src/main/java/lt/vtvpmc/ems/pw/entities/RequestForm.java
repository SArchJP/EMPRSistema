package lt.vtvpmc.ems.pw.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Minde on 2017.04.01.
 */
@Entity
public class RequestForm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date requestDate;
    private String requestToGroup;
    private String requestTier;
    private Boolean educationDocuments;
    private Boolean healthDocument;
    private Boolean photos;
    private Boolean passportCopy;
    private Boolean drafteeCertificate;
    private Boolean entranceFee;

    public RequestForm(){

    }

    public RequestForm(Date requestDate, String requestToGroup, String requestTier, Boolean educationDocuments, Boolean healthDocument, Boolean photos, Boolean passportCopy, Boolean drafteeCertificate, Boolean entranceFee) {
        this.requestDate = requestDate;
        this.requestToGroup = requestToGroup;
        this.requestTier = requestTier;
        this.educationDocuments = educationDocuments;
        this.healthDocument = healthDocument;
        this.photos = photos;
        this.passportCopy = passportCopy;
        this.drafteeCertificate = drafteeCertificate;
        this.entranceFee = entranceFee;
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

    public void setPassportCopy(Boolean pasportCopy) {
        this.passportCopy = pasportCopy;
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
