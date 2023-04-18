import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MySETUTest {

    MySETU mySETU = new MySETU();
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
    void listAllClubs() {
        mySETU.addNewClub(club3);
        mySETU.addNewClub(club1);
        String list = mySETU.listAllClubs();
        assertTrue(list.contains("Handball"));
        assertTrue(list.contains("opponents"));
    }

    @Test
    void addNewClub() {
        assertEquals(0, mySETU.getClubs().size());
        mySETU.addNewClub(club3);
        assertEquals(1, mySETU.getClubs().size());
        mySETU.addNewClub(club1);
        assertEquals(2, mySETU.getClubs().size());
    }
    @Test
    void removeClub() {
        assertEquals(0, mySETU.getClubs().size());
        mySETU.addNewClub(club3);
        mySETU.addNewClub(club1);
        mySETU.addNewClub(club2);
        assertEquals(3, mySETU.getClubs().size());
        assertEquals(club1, mySETU.getClubs().get(1));
        mySETU.removeClub(1);
        assertEquals(2, mySETU.getClubs().size());
        assertEquals(club2, mySETU.getClubs().get(1));
        assertFalse(mySETU.getClubs().contains(club1));
        mySETU.removeClub(club2);
        assertEquals(1, mySETU.getClubs().size());
        assertFalse(mySETU.getClubs().contains(club2));
    }

    @Test
    void getClubByIndex() {
        mySETU.addNewClub(club3);
        mySETU.addNewClub(club1);
        mySETU.addNewClub(club4);
        assertEquals(club3, mySETU.getClubByIndex(0));
        assertEquals(club1, mySETU.getClubByIndex(1));
        assertEquals(club4, mySETU.getClubByIndex(2));
    }

    // Getters and Setters

    @Test
    void getClubs() {
        assertEquals(0, mySETU.getClubs().size());
        mySETU.addNewClub(club3);
        mySETU.addNewClub(club1);
        assertEquals(2, mySETU.getClubs().size());
    }

    @Test
    void setClubs() {
        ArrayList<Club> clubs = new ArrayList<>();
        clubs.add(club2);
        clubs.add(club4);
        assertEquals(0, mySETU.getClubs().size());
        mySETU.setClubs(clubs);
        assertEquals(2, mySETU.getClubs().size());
        clubs.add(club1);
        mySETU.setClubs(clubs);
        assertEquals(3, mySETU.getClubs().size());
    }

    @Test
    void getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student4);
        assertEquals(0, mySETU.getStudents().size());
        mySETU.setStudents(students);
        assertEquals(2, mySETU.getStudents().size());
    }

    @Test
    void setStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student4);
        assertEquals(0, mySETU.getStudents().size());
        mySETU.setStudents(students);
        assertEquals(2, mySETU.getStudents().size());
    }
}
