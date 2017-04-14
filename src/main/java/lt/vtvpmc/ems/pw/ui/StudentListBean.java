
package lt.vtvpmc.ems.pw.ui;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

public class StudentListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<Student> getStudentList() {
        Query q = entityManager.createQuery("select c from Student c order by c.lastName");
        return q.getResultList();
    }
    
    @Transactional
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }

    @Transactional
    public void updateStudent(Student student) {
        entityManager.find(Student.class, student);
    }


    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
