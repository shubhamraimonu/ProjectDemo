package com.springcore.dao;

import java.util.List;

import com.spring.Entity.Student;

public interface DaoInteface {

public int insert(Student student);

public List<Student> getStudent(int studentId);
}
