package lt.vtvpmc.ems.pw.entities.repositories;

import lt.vtvpmc.ems.pw.entities.Student;

import java.util.Date;
import java.util.List;

/**
 * Created by Minde on 2017.03.21.
 */
public interface StudentRepository {

    public void save (Student newStudent);

    public void delete (Student student);

    public List<Student> findAll();

    public Student find(String firstName, String lastName, Date birthDate);

}
