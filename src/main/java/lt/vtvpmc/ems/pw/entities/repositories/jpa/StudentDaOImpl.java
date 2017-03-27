package lt.vtvpmc.ems.pw.entities.repositories.jpa;

import lt.vtvpmc.ems.pw.entities.Student;
import lt.vtvpmc.ems.pw.entities.repositories.StudentRepository;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Date;
import java.util.List;

/**
 * Created by Minde on 2017.03.21.
 */


public class StudentDaOImpl implements StudentRepository {

    private EntityManagerFactory entityManagerFactory;

    private LocalEntityManagerFactoryBean localEntityManagerFactoryBean;

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    public void save(Student student) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            if(!entityManager.contains(student))
                student = entityManager.merge(student);
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }



    }

    public void delete(Student student) {

    }

    public List<Student> findAll() {
        return null;
    }

    public Student find(String firstName, String lastName, Date birthDate) {
        return null;
    }

    private EntityManager getEntityManager() {

        return entityManagerFactory.createEntityManager();
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
        return localEntityManagerFactoryBean;
    }

    public void setLocalEntityManagerFactoryBean(LocalEntityManagerFactoryBean localEntityManagerFactoryBean) {
        this.localEntityManagerFactoryBean = localEntityManagerFactoryBean;
    }
}
