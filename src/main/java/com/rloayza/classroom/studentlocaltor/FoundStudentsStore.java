package com.rloayza.classroom.studentlocaltor;

import com.rloayza.classroom.studentlocaltor.model.Student;

import java.util.ArrayList;
import java.util.List;

public class FoundStudentsStore {

    private static FoundStudentsStore instance;

    private List<Student> store;

    public static FoundStudentsStore getInstance() {
        if(null == instance) {
            instance = new FoundStudentsStore();
        }

        return instance;
    }

    public List<Student> getStore() {

        if(null == store) {
            store = new ArrayList<Student>();
        }
        return store;
    }

    public void addStudent(Student student) {
        if(null == store) {
            store = new ArrayList<Student>();
        }

        store.add(student);
    }
}
