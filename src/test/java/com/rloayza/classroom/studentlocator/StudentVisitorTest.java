package com.rloayza.classroom.studentlocator;

import com.rloayza.classroom.studentlocaltor.FoundStudentsStore;
import com.rloayza.classroom.studentlocaltor.model.Student;
import com.rloayza.classroom.studentlocaltor.visitor.StudentVisitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentVisitorTest {

    private StudentVisitor studentVisitor;

    @Before
    public void init() {
        studentVisitor = new StudentVisitor(10.0d, 10.0d);
    }

    @Test
    public void visitStudentSuccessful() {
        Student student = new Student();
        student.setName("Rommel");
        student.setLatitude(5.0d);
        student.setLongitude(2.0d);

        studentVisitor.visit(student);

        Assert.assertTrue(FoundStudentsStore.getInstance().getStore().contains(student));
    }

    @Test
    public void visitStudentFailed() {
        Student student = new Student();
        student.setName("Rommel");
        student.setLatitude(35.0d);
        student.setLongitude(-2.0d);

        studentVisitor.visit(student);

        Assert.assertFalse(FoundStudentsStore.getInstance().getStore().contains(student));
    }
}
