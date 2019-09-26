package com.rloayza.classroom.studentlocaltor;

import com.rloayza.classroom.studentlocaltor.model.Classroom;
import com.rloayza.classroom.studentlocaltor.model.Student;
import com.rloayza.classroom.studentlocaltor.visitor.ClassroomVisitor;

import java.util.List;

public class StudentLocator {

    public List<Student> studentsInClasses(List<Student> students, List<Classroom> classrooms) {
        ClassroomVisitor classroomVisitor = new ClassroomVisitor(students);

        for(Classroom classroom: classrooms) {
            classroom.accept(classroomVisitor);
        }

        return FoundStudentsStore.getInstance().getStore();
    }

}
