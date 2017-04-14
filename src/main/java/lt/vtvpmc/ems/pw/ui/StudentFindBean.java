
package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.RequestScope;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class StudentFindBean {
    
    @PersistenceContext
    private EntityManager entityManager;

    private String lastName;

    public StudentFindBean() {
    }

    @Transactional
    public List<Student> getStudentBySecondName(){
        return entityManager.createQuery(
                "SELECT s FROM Student s WHERE s.lastName LIKE :custName")
                .setParameter("custName", lastName)
                .getResultList();
    }


    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
