package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];
    public boolean addStudent(Student stu) {

        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }else {
            stus[index] = stu;
            return true;
        }
    }

    public Student[] fingAllStudent() {
        return stus;
    }

    public void deleteStudentById(String delId) {
        int intdex = getIndex(delId);
        stus[intdex] = null;
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updataStudent(String updataId, Student newStu) {
        int index = getIndex(updataId);
        stus[index] = newStu;
    }
}
