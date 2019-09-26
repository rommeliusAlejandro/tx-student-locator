package com.rloayza.classroom.studentlocaltor.visitor;

import com.rloayza.classroom.studentlocaltor.FoundStudentsStore;
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

        System.out.println("Checking "+student.toString());

        if(checkFirstQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(checkSecondQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(checkThirdQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

        if(checkFourthQuadrant(student.getLatitude(), student.getLongitude())) {
            FoundStudentsStore.getInstance().addStudent(student);
            System.out.println("Found "+student.getName()+" between "+classroomLatitude+":"+classroomLongitude);
            return;
        }

    }

    private Boolean checkFirstQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude + 10;
        Double longLimit = classroomLongitude - 10;

        Boolean betweenLatLimits = classroomLatitude <= latitude && latLimit >= latitude;
        Boolean betweenLongLimits = classroomLatitude >= longitude && longLimit <= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    private Boolean checkSecondQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude + 10;
        Double longLimit = classroomLongitude + 10;

        Boolean betweenLatLimits = classroomLatitude >= latitude && latLimit >= latitude;
        Boolean betweenLongLimits = classroomLatitude >= longitude && longLimit <= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    private Boolean checkThirdQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude - 10;
        Double longLimit = classroomLongitude + 10;

        Boolean betweenLatLimits = classroomLatitude >= latitude && latLimit <= latitude;
        Boolean betweenLongLimits = classroomLatitude <= longitude && longLimit >= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    private Boolean checkFourthQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude - 10;
        Double longLimit = classroomLongitude - 10;

        Boolean betweenLatLimits = classroomLatitude >= latitude && latLimit <= latitude;
        Boolean betweenLongLimits = classroomLatitude >= longitude && longLimit <= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

}