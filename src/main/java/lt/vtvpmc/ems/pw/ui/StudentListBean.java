
package lt.vtvpmc.ems.pw.ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;

public class StudentListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<Student> getStudentList() {
        Query q = entityManager.createQuery("select c from Student c");
        return q.getResultList();
    }
    
    @Transactional
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
