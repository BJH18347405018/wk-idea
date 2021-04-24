package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {

        Student[] stus = studentDao.fingAllStudent();
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        Student[] allStudent = studentDao.fingAllStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null){
                flag = true;
            }
        }
        if (flag){
            return allStudent;
        }else {
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updataStudent(String updataId, Student newStu) {
        studentDao.updataStudent(updataId,newStu);
    }
}
