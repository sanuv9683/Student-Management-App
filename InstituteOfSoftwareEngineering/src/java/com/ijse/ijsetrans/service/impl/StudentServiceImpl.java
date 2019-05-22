/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.service.impl;

import com.ijse.ijsetrans.core.Student;
import com.ijse.ijsetrans.repo.StudentRepo;
import com.ijse.ijsetrans.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sanu Vithanage
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public boolean addStudent(Student dto) throws Exception {
        return studentRepo.add(dto);
    }

    @Override
    public boolean mergeStudent(Student dto) throws Exception {
        return studentRepo.merge(dto);
    }

    @Override
    public boolean saveUpdateStudent(Student dto) throws Exception {
        return studentRepo.saveUpdate(dto);
    }

    @Override
    public boolean deleteStudent(int id) throws Exception {
        return studentRepo.delete(id);
    }

    @Override
    public boolean updateStudent(Student dto) throws Exception {
        return studentRepo.update(dto);
    }

    @Override
    public Student searchStudent(int id) throws Exception {
        return studentRepo.search(id);
    }

    @Override
    public List<Student> getStudentList() throws Exception {
        return studentRepo.getList();
    }

    @Override
    public List<Student> advancedStudentSearch(String name) throws Exception {
        return studentRepo.advancedSearch(name);
    }

    @Override
    public Student searchStudentForLogin(String email, String pass) throws Exception {
        return studentRepo.searchForLogin(email, pass);
    }

    @Override
    public List<Student> getStudentListA(String query) throws Exception {
        return studentRepo.getListA(query);
    }

    @Override
    public void flushStudent() throws Exception {
        studentRepo.flush();
    }

}
