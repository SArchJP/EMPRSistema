package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Minde on 2017.04.16.
 */
public class StudentRequiredCoursesBean {
    public static final String NAV_LIST_STUDENTS = "main.xhtml";
    @PersistenceContext
    private EntityManager entityManager;

    private String studentFirstName;
    private String studentLastName;

    private StudentPageBean studentPageBean;

    public String createOrUpdate(Student student){

        entityManager.merge(student);

        return NAV_LIST_STUDENTS;
    }
}
