import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    Module[] modules;
    @BeforeEach
    void setUp() {
        student = new Student();
        student.setName("John");
        student.setId(25);
        student.setCourse("BSc Computing");
        modules = new Module[3];
        modules[0] = new Module();
        modules[0].setName("Programming");
        modules[0].setCode(123);
        modules[0].setAssignments(new String[]{"Assignment 1", "Assignment 2", "Assignment 3"});
        modules[0].setGrades(new int[]{50, 60, 70});
        modules[0].setLecturers(new String[]{"Mr. Smith", "Mr. Jones"});
        modules[1] = new Module();
        modules[1].setName("Maths");
        modules[1].setCode(456);
        modules[1].setAssignments(new String[]{"Assignment 1", "Assignment 2", "Assignment 3"});
        modules[1].setGrades(new int[]{50, 60, 70});
        modules[1].setLecturers(new String[]{"Mr. Smith", "Mr. Jones"});
        modules[2] = new Module();
        modules[2].setName("English");
        modules[2].setCode(789);
        modules[2].setAssignments(new String[]{"Assignment 1", "Assignment 2", "Assignment 3"});
        modules[2].setGrades(new int[]{50, 60, 70});
        modules[2].setLecturers(new String[]{"Mr. Smith", "Mr. Jones"});
        student.setModules(modules);
    }

    @AfterEach
    void tearDown() {
        student = null;
        modules = null;
    }

    @Test
    void getModule() {
        assertEquals(modules[0], student.getModule("Programming"));
        assertEquals(modules[1], student.getModule("Maths"));
        assertEquals(modules[2], student.getModule("English"));
        assertNull(student.getModule("Science"));
    }

    @Test
    void getGrade() {
        assertEquals(50, student.getGrade("Programming", "Assignment 1"));
        assertEquals(60, student.getGrade("Programming", "Assignment 2"));
        assertEquals(70, student.getGrade("Programming", "Assignment 3"));
        assertEquals(50, student.getGrade("Maths", "Assignment 1"));
        assertEquals(60, student.getGrade("Maths", "Assignment 2"));
        assertEquals(70, student.getGrade("Maths", "Assignment 3"));
        assertEquals(50, student.getGrade("English", "Assignment 1"));
        assertEquals(60, student.getGrade("English", "Assignment 2"));
        assertEquals(70, student.getGrade("English", "Assignment 3"));
        assertEquals(-1, student.getGrade("Science", "Assignment 1"));
        assertEquals(-1, student.getGrade("Science", "Assignment 2"));
        assertEquals(-1, student.getGrade("Science", "Assignment 3"));
    }

    @Test
    void getAllGrades() {
        assertTrue(student.getAllGrades().contains("Programming"));
    }

    @Test
    void sortGradesLowest() {
        student.sortGradesLowest();
        assertEquals(50, student.getGrade("Programming", "Assignment 1"));
    }

    @Test
    void sortGradesHighest() {
        student.sortGradesHighest();
        assertEquals(70, student.getGrade("Programming", "Assignment 1"));
    }
}