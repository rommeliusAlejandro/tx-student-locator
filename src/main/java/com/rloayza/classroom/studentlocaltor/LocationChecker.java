package com.rloayza.classroom.studentlocaltor;

public class LocationChecker {

    private Double classroomLatitude;
    private Double classroomLongitude;

    public LocationChecker(Double classroomLatitude, Double classroomLongitude) {
        this.classroomLatitude = classroomLatitude;
        this.classroomLongitude = classroomLongitude;
    }

    public Boolean checkFirstQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude + 10;
        Double longLimit = classroomLongitude - 10;

        Boolean betweenLatLimits = classroomLatitude <= latitude && latLimit >= latitude;
        Boolean betweenLongLimits = classroomLongitude >= longitude && longLimit <= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    public Boolean checkSecondQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude + 10;
        Double longLimit = classroomLongitude + 10;

        Boolean betweenLatLimits = classroomLatitude <= latitude && latLimit >= latitude;
        Boolean betweenLongLimits = classroomLongitude <= longitude && longLimit >= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    public Boolean checkThirdQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude - 10;
        Double longLimit = classroomLongitude + 10;

        Boolean betweenLatLimits = classroomLatitude >= latitude && latLimit <= latitude;
        Boolean betweenLongLimits = classroomLongitude <= longitude && longLimit >= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }

    public Boolean checkFourthQuadrant(Double latitude, Double longitude) {

        Double latLimit = classroomLatitude - 10;
        Double longLimit = classroomLongitude - 10;

        Boolean betweenLatLimits = classroomLatitude >= latitude && latLimit <= latitude;
        Boolean betweenLongLimits = classroomLongitude >= longitude && longLimit <= longitude;
        if(betweenLatLimits && betweenLongLimits) {
            return true;
        }

        return false;
    }
}
