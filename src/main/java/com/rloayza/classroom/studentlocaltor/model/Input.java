package com.rloayza.classroom.studentlocaltor.model;

import java.util.List;

public class Input {

    private List<Student> students;

    private List<Classroom> classrooms;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }
}
