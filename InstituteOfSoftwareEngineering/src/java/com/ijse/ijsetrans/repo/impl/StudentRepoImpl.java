/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.repo.impl;

import com.ijse.ijsetrans.core.Student;
import com.ijse.ijsetrans.repo.StudentRepo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Sanu Vithanage
 */
@Repository
public class StudentRepoImpl implements StudentRepo{

    @Autowired
    private SessionFactory sessionFac;

    private Session getFactory() {
        return sessionFac.getCurrentSession();
    }

    @Override
    public boolean add(Student dto) throws Exception {
        Serializable save = getFactory().save(dto);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean merge(Student dto) throws Exception {
        getFactory().merge(dto);
        return true;
    }

    @Override
    public boolean saveUpdate(Student dto) throws Exception {
        getFactory().saveOrUpdate(dto);
        return true;
    }

    @Override
    public boolean delete(int id) throws Exception {
        getFactory().delete(id);
        return true;
    }

    @Override
    public boolean update(Student dto) throws Exception {
        getFactory().update(dto);
        return true;
    }

    @Override
    public Student search(int id) throws Exception {
        Student admin = (Student) getFactory().get(Student.class, id);
        return admin;
    }

    @Override
    public List<Student> getList() throws Exception {
        List<Student> list = getFactory().createQuery("From Student a").list();
        return list;
    }

    @Override
    public List<Student> advancedSearch(String name) throws Exception {
        List<Student> list = getFactory().createQuery("From Student u where u.studentID like '" + name + "%' or u.email like '" + name + "%' or u.nic like '" + name + "%'").list();
        return list;
    }

    @Override
    public Student searchForLogin(String email, String pass) throws Exception {
        List<Student> list = getFactory().createQuery("From Student a where a.email='" + email + "' and a.pass='" + pass + "'").list();
        Student temp = null;
        for (Student admin : list) {
            temp = admin;
        }
        return temp;
    }

    @Override
    public List<Student> getListA(String query) throws Exception {
        List<Student> list = getFactory().createQuery(query).list();
        return list;
    }

    @Override
    public void flush() throws Exception {
        getFactory().flush();
    }

}
