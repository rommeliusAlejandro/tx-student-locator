package com.rloayza.classroom.studentlocaltor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rloayza.classroom.studentlocaltor.model.Input;
import com.rloayza.classroom.studentlocaltor.model.Student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String dataLocation = args[0].split("=")[1];

        try {

            File file = new File(dataLocation);
            ObjectMapper objectMapper = new ObjectMapper();
            Input data = objectMapper.readValue(file, Input.class);

            StudentLocator locator = new StudentLocator();
            List<Student> studentInClass = locator.studentsInClasses(data.getStudents(), data.getClassrooms());

            for(Student student: studentInClass) {
                System.out.println(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
