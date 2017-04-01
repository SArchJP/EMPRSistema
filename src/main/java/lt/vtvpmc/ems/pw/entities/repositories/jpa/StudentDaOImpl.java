package lt.vtvpmc.ems.pw.entities.repositories.jpa;

import lt.vtvpmc.ems.pw.entities.Student;
import lt.vtvpmc.ems.pw.entities.Student_;
import lt.vtvpmc.ems.pw.entities.repositories.StudentRepository;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by Minde on 2017.03.21.
 */


public class StudentDaOImpl implements StudentRepository {

    private EntityManagerFactory entityManagerFactory;
    @PersistenceContext
    private EntityManager entityManager;

    private LocalEntityManagerFactoryBean localEntityManagerFactoryBean;

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Transactional
    public void save(Student student) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            if (!entityManager.contains(student))
                student = entityManager.merge(student);
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }


    }

    @Transactional
    public void delete(Student student) {

    }

    @Transactional
    public List<Student> findAll() {
        return null;
    }

    @Transactional
    public Student find(String firstName, String lastName, Date birthDate) {
        EntityManager entityManager = getEntityManager();
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
            Root<Student> studentRoot = criteriaQuery.from(Student.class);
            criteriaQuery.select(studentRoot);
            criteriaQuery.where(criteriaBuilder.equal(studentRoot.get(Student_.firstName), firstName)).where(criteriaBuilder.equal(studentRoot.get(Student_.lastName), lastName)).where(criteriaBuilder.equal(studentRoot.get(Student_.birthDate), birthDate));
            TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
            return typedQuery.getSingleResult();

        } finally {
            entityManager.close();
        }
    }

    @Transactional
    public List<Student> findByName(String firstName) {
        EntityManager entityManager = getEntityManager();
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
            Root<Student> studentRoot = criteriaQuery.from(Student.class);
            criteriaQuery.select(studentRoot);
            criteriaQuery.where(criteriaBuilder.equal(studentRoot.get(Student_.firstName), firstName));
            TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
            List<Student> foundStudents = typedQuery.getResultList();
            return foundStudents;
        } finally {
            entityManager.close();
        }
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
