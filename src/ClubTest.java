import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ClubTest {

    Student student1, student2, student3, student4;
    Club club1, club2, club3, club4;

    @BeforeEach
    void setUp() {
        student1 = new Student( "Brona", 20098883, "Applied Computing");
        student2 = new Student( "Emma", 12345678, "Business");
        student3 = new Student("Max", 66643891, "Medicine");
        student4 = new Student( "Bob", 39084372, "Sociology");

        club1 = new Club("Chess", "Slay the opponents king");
        club2 = new Club("Rowing", "Join us as we travel down the rivers");
        club3 = new Club("Handball", "Handball is a sport");
        club4 = new Club("Drawing", "Drawing supplies are not provided");
    }

    @AfterEach
    void tearDown() {
        student1 = student2 = student3 = student4 = null;
    }

    // Methods

    @Test
    void addMeetingTime() {
        assertEquals("", club4.listAllMeetingTimes());
        club4.addMeetingTime("Monday 18:00");
        assertNotEquals("", club4.listAllMeetingTimes());
        assertTrue(club4.listAllMeetingTimes().contains("Monday"));
    }

    @Test
    void removeMeetingTime() {
        assertEquals("", club2.listAllMeetingTimes());
        club2.addMeetingTime("Monday 18:00");
        club2.addMeetingTime("Friday 13:00");
        assertNotEquals("", club2.listAllMeetingTimes());
        assertTrue(club2.listAllMeetingTimes().contains("Monday"));
        assertTrue(club2.listAllMeetingTimes().contains("Friday"));
        club2.removeMeetingTime(0);
        assertFalse(club2.listAllMeetingTimes().contains("Monday"));
        assertTrue(club2.listAllMeetingTimes().contains("Friday"));
    }

    @Test
    void ListAllMeetingTimes() {
        assertEquals("", club2.listAllMeetingTimes());
        club2.addMeetingTime("Monday 18:00");
        club2.addMeetingTime("Friday 13:00");
        assertNotEquals("", club2.listAllMeetingTimes());
        assertTrue(club2.listAllMeetingTimes().contains("Monday"));
        assertTrue(club2.listAllMeetingTimes().contains("Friday"));
    }


    // Getters and Setters

    @Test
    void getName() {
        assertEquals("Chess",club1.getName());
        assertEquals("Drawing",club4.getName());
    }
    @Test
    void setName() {
        assertEquals("Rowing",club2.getName());
        club2.setName("Pizza");
        assertEquals("Pizza",club2.getName());
    }

    @Test
    void getDescription() {
        assertTrue(club3.getDescription().contains("sport"));
        assertTrue(club1.getDescription().contains("king"));
    }

    @Test
    void setDescription() {
        assertTrue(club1.getDescription().contains("king"));
        club1.setDescription("Sometimes you need to sacrifice your pawns");
        assertTrue(club1.getDescription().contains("sacrifice"));
    }

    @Test
    void getMeetingTimes() {
        assertEquals(0, club4.getMeetingTimes().size());
        club4.addMeetingTime("Monday 18:00");
        club4.addMeetingTime("Friday 13:00");
        assertEquals(2, club4.getMeetingTimes().size());
    }

    @Test
    void setMeetingTimes() {
        ArrayList<String> meetings = new ArrayList<>();
        meetings.add("Wednesday 20:00");
        meetings.add("Saturday 9:30");
        assertEquals(0, club1.getMeetingTimes().size());
        club1.setMeetingTimes(meetings);
        assertEquals(2, club1.getMeetingTimes().size());
    }
}
