package lt.vtvpmc.ems.pw.ui.controllers;

import lt.vtvpmc.ems.pw.entities.Student;


import javax.validation.Valid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Minde on 2017.03.21.
 */
public class StudentPageData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Valid
    public Student newStudent;
    @Valid
    public Student currentStudent;

    private List<Student> foundStudents;



    public void init (){
        newStudent = new Student();
        foundStudents = new ArrayList<Student>();
        currentStudent = new Student();
    }

    public StudentPageData(){

    }
    
    public Student getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }

    public List<Student> getFoundStudents() {
        return foundStudents;
    }

    public void setFoundStudents(List<Student> foundStudents) {
        this.foundStudents = foundStudents;
    }
}
