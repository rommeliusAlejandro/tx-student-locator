package com.rloayza.classroom.studentlocaltor.visitor;

import com.rloayza.classroom.studentlocaltor.FoundStudentsStore;
import com.rloayza.classroom.studentlocaltor.LocationChecker;
import com.rloayza.classroom.studentlocaltor.model.Student;

public class StudentVisitor implements Visitor{

    private Double classroomLatitude;
    private Double classroomLongitude;

    public StudentVisitor(Double classroomLatitude, Double classroomLongitude) {
        this.classroomLatitude = classroomLatitude;
        this.classroomLongitude = classroomLongitude;
    }

    public void visit(Visitable visitable) {
        Student student = (Student) visitable;

        if(FoundStudentsStore.getInstance().getStore().contains(student)) {
            return;
        }

        LocationChecker locationChecker = new LocationChecker(classroomLatitude, classroomLongitude);

        System.out.println("Checking "+student.toString());

        if(locationChecker.checkFirstQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(locationChecker.checkSecondQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(locationChecker.checkThirdQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(locationChecker.checkFourthQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

    }
}