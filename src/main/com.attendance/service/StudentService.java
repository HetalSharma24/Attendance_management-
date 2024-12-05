// src/main/java/com/attendance/service/StudentService.java
package com.attendance.service;

import com.attendance.dao.StudentDao;
import com.attendance.model.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
