package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentsShouldHaveConsecutiveIDs() {
        Student student1 = new Student("Student1", 1.0);
        Student student2 = new Student("Student2", 2.0);
        Student student3 = new Student("Student3", 3.0);

        assertEquals(student2.getId(), student1.getId() + 1);
        assertEquals(student3.getId(), student2.getId() + 1);
    }

}