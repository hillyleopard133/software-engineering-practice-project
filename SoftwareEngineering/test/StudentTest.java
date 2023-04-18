import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

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
    void joinClub() {
        assertEquals(0,student3.getClubsJoined().size());
        student3.joinClub(club1);
        student3.joinClub(club4);
        assertEquals(2,student3.getClubsJoined().size());
    }

    @Test
    void quitClub() {
        assertEquals(0,student3.getClubsJoined().size());
        student3.joinClub(club1);
        student3.joinClub(club4);
        assertEquals(2,student3.getClubsJoined().size());
        student3.quitClub(club4);
        assertEquals(1,student3.getClubsJoined().size());
    }

    @Test
    void listJoinedClubs() {
        assertEquals(0,student3.getClubsJoined().size());
        student3.joinClub(club1);
        student3.joinClub(club4);
        assertTrue(student3.listJoinedClubs().contains("Chess"));
        assertTrue(student3.listJoinedClubs().contains("supplies"));
        assertEquals(2,student3.getClubsJoined().size());
        student3.quitClub(club4);
        assertFalse(student3.listJoinedClubs().contains("supplies"));
        assertEquals(1,student3.getClubsJoined().size());
    }

    // Getters and Setters

    @Test
    void getName() {
        assertEquals("Emma",student2.getName());
        assertEquals("Bob",student4.getName());
    }

    @Test
    void setName() {
        assertEquals("Brona",student1.getName());
        student1.setName("Charlie");
        assertEquals("Charlie",student1.getName());
    }

    @Test
    void getStudentID() {
        assertEquals(66643891,student3.getStudentID());
        assertEquals(20098883,student1.getStudentID());
    }

    @Test
    void setStudentID() {
        assertEquals(66643891,student3.getStudentID());
        student3.setStudentID(28391176);
        assertEquals(28391176,student3.getStudentID());
    }

    @Test
    void getCourse() {
        assertEquals("Medicine",student3.getCourse());
        assertEquals("Sociology",student4.getCourse());
    }

    @Test
    void setCourse() {
        assertEquals("Sociology",student4.getCourse());
        student4.setCourse("Ghost Busting");
        assertEquals("Ghost Busting",student4.getCourse());
    }

    @Test
    void getClubsJoined() {
        assertEquals(0,student3.getClubsJoined().size());
        student3.joinClub(club1);
        student3.joinClub(club4);
        assertEquals(2,student3.getClubsJoined().size());
    }

    @Test
    void setClubsJoined() {
        assertEquals(0,student3.getClubsJoined().size());
        ArrayList<Club> clubsList = new ArrayList<>();
        clubsList.add(club2);
        clubsList.add(club4);
        clubsList.add(club1);
        student3.setClubsJoined(clubsList);
        assertEquals(3,student3.getClubsJoined().size());
    }
}
