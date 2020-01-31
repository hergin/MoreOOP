package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void testPolymorphicFullNameImplementationOfProfessor() {
        var someProfessor = new Professor("Huseyin", "Dr");
        assertEquals("Dr Huseyin", someProfessor.fullName());
    }

}