import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    Module module;
    Student student;
    @BeforeEach
    void setUp() {
        module = new Module();
        module.setName("Potatology");
        String[] lecturers = new String[1];
        lecturers[0] = "George Pomodoro";
        module.setLecturers(lecturers);
        String[] assigments = new String[1];
        assigments[0] = "Name: Starch Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.";
        module.setAssignments(assigments);
        int[] grades = new int[1];
        grades[0] = 55;
        module.setGrades(grades);
        module.setCode(55290);
        module.setStudent(new Student());
        module.setDateCompleted(LocalDate.of(2023,04,12));
    }

    @AfterEach
    void tearDown() {
        module = null;
    }

    @Test
    void getName() {
        assertEquals("Potatology",module.getName());
    }

    @Test
    void setName() {
        module.setName("Tomatology");
        assertEquals("Tomatology",module.getName());
    }

    @Test
    void getLecturers() {
        assertEquals("George Pomodoro", module.getLecturers()[0]);
    }

    @Test
    void setLecturers() {
        String[] lecturers = new String[1];
        lecturers[0] = "Thomas Rooibos";
        module.setLecturers(lecturers);
        assertEquals("Thomas Rooibos", module.getLecturers()[0]);
    }

    @Test
    void getAssignments() {
        assertEquals("Name: Starch Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.",module.getAssignments()[0]);
    }

    @Test
    void setAssignments() {
        String[] assignments = new String[1];
        assignments[0] = "Name: Protein Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.";
        module.setAssignments(assignments);
        assertEquals("Name: Protein Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.",module.getAssignments()[0]);
    }

    @Test
    void getGrades() {
        assertEquals(55,module.getGrades()[0]);
    }

    @Test
    void setGrades() {
        int[] grades = new int[1];
        grades[0]=12;
        module.setGrades(grades);
        assertEquals(12,module.getGrades()[0]);
    }

    @Test
    void getCode() {
        assertEquals(55290,module.getCode());
    }

    @Test
    void setCode() {
        module.setCode(1234);
        assertEquals(1234,module.getCode());
    }

    @Test
    void getStudent() {
        assertEquals(new Student().getName(),module.getStudent().getName());
    }

    @Test
    void setStudent() {
        student = new Student();
        student.setName("Harry");
        module.setStudent(student);
        assertEquals("Harry", module.getStudent().getName());
    }

    @Test
    void getDateCompleted() {
        assertEquals(LocalDate.of(2023,04,12),module.getDateCompleted());
    }

    @Test
    void setDateCompleted() {
        module.setDateCompleted(LocalDate.of(2023,04,13));
        assertEquals(LocalDate.of(2023,04,13),module.getDateCompleted());
    }

    @Test
    void listAllLecturers() {
        assertEquals("George Pomodoro, ",module.listAllLecturers());
    }

    @Test
    void listAllGrades() {
        assertTrue(module.listAllGrades().contains("55"));
    }

    @Test
    void testToString() {
        assertTrue(module.toString().contains("Potatology"));
    }
}