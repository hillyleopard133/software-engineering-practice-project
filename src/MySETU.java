import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class MySETU {

    // Fields

    private ArrayList<Club> clubs = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    // Methods

    public String listAllClubs(){
        String list = "";

        for(Club club: clubs){
            list += "Name: " + club.getName() + "\nDescription: " + club.getDescription() + "\n" + club.listAllMeetingTimes() + "\n";
        }

        return list;
    }

    public void addNewClub(Club club){
        clubs.add(club);
    }

    public void removeClub(int index){
        clubs.remove(index);
        for(Student student : students){
            student.quitClub(getClubByIndex(index));
        }
    }

    public void removeClub(Club club){
        clubs.remove(club);
        for(Student student : students){
            student.quitClub(club);
        }
    }

    public Club getClubByIndex(int index){
        return clubs.get(index);
    }

    public void sortClubsAlphabetically(){

    }

    // Getters and Setters

    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
