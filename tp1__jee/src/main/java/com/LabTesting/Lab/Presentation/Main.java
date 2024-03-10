package com.LabTesting.Lab.Presentation;

import com.LabTesting.Lab.DAO.Student;
import com.LabTesting.Lab.DAO.StudentDAO;
import com.LabTesting.Lab.Service.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        StudentManager studentManager = new StudentManager(studentDAO);
        Student S= new Student("Stud1","St");

        studentManager.addStudent(S);
        System.out.println(studentManager.AllStudents());
    }
}
