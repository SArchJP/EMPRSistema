package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;
import lt.vtvpmc.ems.pw.entities.Student_;
import lt.vtvpmc.ems.pw.entities.repositories.StudentRepository;
import lt.vtvpmc.ems.pw.ui.controllers.StudentPageData;
import org.hibernate.type.EntityType;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.Metamodel;
import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by Minde on 2017.03.21.
 */

public class StudentPageBean {
    public StudentPageBean(){
    }

    public static final String NAV_LIST_STUDENTS = "main.xhtml";

    public StudentPageData studentPageData;

    public StudentRepository studentRepository;
    @PersistenceContext
    private EntityManager entityManager;

    private String firstName;
    private String lastName;
//    Kaip pavyzdziuose bet neveikia
//    @Transactional
//    public String addNew() {
//        studentRepository.save(studentPageData.newStudent);
//        studentPageData.newStudent = new Student();
//        return NAV_LIST_STUDENTS;
//    }


    @Transactional
    public List<Student> getfindByName(){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> studentRoot = criteriaQuery.from(Student.class);
        criteriaQuery.select(studentRoot);
        criteriaQuery.where(criteriaBuilder.and(criteriaBuilder.equal(studentRoot.get(Student_.firstName),firstName)),(criteriaBuilder.equal(studentRoot.get(Student_.lastName),lastName)));

        TypedQuery<Student> typedQuery = entityManager.createQuery(criteriaQuery);
        List<Student> foundStudents = typedQuery.getResultList();
    return foundStudents;
    }


    public StudentPageData getStudentPageData() {
        return studentPageData;
    }

    public void setStudentPageData(StudentPageData studentPageData) {
        this.studentPageData = studentPageData;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
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
}
