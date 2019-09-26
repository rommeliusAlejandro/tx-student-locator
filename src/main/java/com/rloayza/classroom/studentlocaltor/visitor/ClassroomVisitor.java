package com.rloayza.classroom.studentlocaltor.visitor;

import com.rloayza.classroom.studentlocaltor.model.Classroom;
import com.rloayza.classroom.studentlocaltor.model.Student;

import java.util.List;

public class ClassroomVisitor implements Visitor {

    private List<Student> students;

    public ClassroomVisitor(List<Student> students) {
        this.students = students;
    }

    public void visit(Visitable visitable) {
        Classroom classroom = (Classroom) visitable;

        StudentVisitor studentVisitor = new StudentVisitor(classroom.getLatitude(), classroom.getLongitude());

        for (Student student: students) {
            studentVisitor.visit(student);
        }

    }
}
