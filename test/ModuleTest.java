import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModuleTest {
    Module module;
    @BeforeEach
    void setUp() {
        module = new Module();
        module.setName("Potatology");
        String[] lecturers = new String[1];
        lecturers[0] = "George Pomodoro";
        String[] assigments = new String[1];
        assigments[0] = "Name: Starch Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.";
        module.setAssignments(assigments);
        int[] grades = new int[1];
        grades[0] = 55;
        module.setGrades(grades);
        module.setCode(55290);
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
        assertEquals("Totmatology",module.getName());
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
        assertEquals("Name: Protein Experiment, Description: You are required to write a 1200 word paper on the effects of starch on potatoes. Use Harvard referencing. Due Date: 12/04/2023. Document type: PDF.",module.getAssignments()[0]);
    }

    @Test
    void getGrades() {
    }

    @Test
    void setGrades() {
    }

    @Test
    void getCode() {
    }

    @Test
    void setCode() {
    }

    @Test
    void getStudent() {
    }

    @Test
    void setStudent() {
    }

    @Test
    void getDateCompleted() {
    }

    @Test
    void setDateCompleted() {
    }

    @Test
    void listAllLecturers() {
    }

    @Test
    void listAllGrades() {
    }

    @Test
    void testToString() {
    }
}