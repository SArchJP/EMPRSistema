package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class NewStudentBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String studentFirstName;
    private String studentLastName;
    private Date studentBirthDate;

    @Transactional
    public String save() {


        Student student = new Student(studentFirstName, studentLastName, studentBirthDate);
        entityManager.persist(student);
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
}
