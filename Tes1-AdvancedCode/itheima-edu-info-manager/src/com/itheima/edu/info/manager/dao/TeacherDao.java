package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teachers = new Teacher[5];
    public static int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void deleteTeacherById(String id) {int index = getIndex(id);
        teachers[index] = null;

    }

    public boolean addTeacher(Teacher t) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher == null){
                index = i;
                break;
            }
        }
        if (index == -1){
            return false;
        }else {
            teachers[index] = t;
            return true;
        }
    }

    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public void updataTeacher(String id, Teacher newTeacher) {
        int index = getIndex(id);
        teachers[index] = newTeacher;
    }
}
