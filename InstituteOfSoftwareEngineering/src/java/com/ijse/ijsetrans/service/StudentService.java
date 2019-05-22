/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service;

import com.ijse.ijsetrans.core.Student;
import java.util.List;

/**
 *
 * @author Sanu
 */
public interface StudentService {
     public boolean addStudent(Student dto) throws Exception;
    public boolean mergeStudent(Student dto) throws Exception;
    public boolean saveUpdateStudent(Student dto)throws Exception;
    public boolean deleteStudent(int id) throws Exception;
    public boolean updateStudent(Student dto) throws Exception;
    public Student searchStudent(int id) throws Exception;
    public List<Student> getStudentList() throws Exception; 
    public List<Student> advancedStudentSearch(String name) throws Exception; 
    public Student searchStudentForLogin(String email, String pass)throws Exception;
    public List<Student> getStudentListA(String query) throws Exception; 
    public void flushStudent()throws Exception;
}
