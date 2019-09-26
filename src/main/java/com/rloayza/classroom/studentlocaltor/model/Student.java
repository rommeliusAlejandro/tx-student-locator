package com.rloayza.classroom.studentlocaltor.model;

import com.rloayza.classroom.studentlocaltor.visitor.Visitable;
import com.rloayza.classroom.studentlocaltor.visitor.Visitor;

public class Student implements Visitable {

    private String name;
    private Double latitude;
    private Double longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return new StringBuilder("{")
                .append("name: ")
                .append(getName())
                .append(", ")
                .append("latitude: ")
                .append(getLatitude())
                .append(", ")
                .append("longitude: ")
                .append(getLongitude())
                .append("}")
                .toString();
    }
}
