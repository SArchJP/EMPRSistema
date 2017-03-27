package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;
import lt.vtvpmc.ems.pw.entities.repositories.StudentRepository;
import lt.vtvpmc.ems.pw.ui.controllers.StudentPageData;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


/**
 * Created by Minde on 2017.03.21.
 */

public class StudentPageBean {

    public StudentPageBean(){
    }

    public static final String NAV_LIST_STUDENTS = "main.xhtml";

    public StudentPageData studentPageData;

    public StudentRepository studentRepository;

//    Kaip pavyzdziuose bet neveikia
//    @Transactional
//    public String addNew() {
//        studentRepository.save(studentPageData.newStudent);
//        studentPageData.newStudent = new Student();
//        return NAV_LIST_STUDENTS;
//    }


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
}
