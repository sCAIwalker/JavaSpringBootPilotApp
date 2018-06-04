package com.kevin.Service;

import com.kevin.Entity.Student;
import com.kevin.Dao.FakeStudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private FakeStudentDaoImpl fakeStudentDaoImpl;

    public Collection<Student> getAllStudents() {
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id) {
        //check if the student exists, this is the logic layer
        return this.fakeStudentDaoImpl.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.fakeStudentDaoImpl.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        this.fakeStudentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        fakeStudentDaoImpl.insertStudentToDb(student);
    }
}
