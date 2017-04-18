package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.RequiredCourses;
import lt.vtvpmc.ems.pw.entities.Student;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Minde on 2017.04.16.
 */
public class StudentRequiredCoursesBean {
    public static final String NAV_LIST_STUDENTS = "main.xhtml";
    @PersistenceContext
    private EntityManager entityManager;

    private StudentPageBean studentPageBean;
    private Student student;
    @Transactional
    public String CreateOrUpdate(Student student){
        RequiredCourses requiredCourses = new RequiredCourses();
        student.setRequiredCourses(requiredCourses);
        entityManager.merge(student);

        return NAV_LIST_STUDENTS;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public StudentPageBean getStudentPageBean() {
        return studentPageBean;
    }

    public void setStudentPageBean(StudentPageBean studentPageBean) {
        this.studentPageBean = studentPageBean;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
