import java.util.ArrayList;

public class Student {

    //Fields

    private String name = "";
    private int studentID = 0;
    private String course = "";
    private ArrayList<Club> clubsJoined = new ArrayList<>();

    // Constructor

    public Student(String name, int studentID, String course) {
        this.name = name;
        this.studentID = studentID;
        this.course = course;
    }

    // Methods

    public void joinClub(Club club){
        clubsJoined.add(club);
    }

    public void quitClub(Club club){
        clubsJoined.remove(club);
    }

    public String listJoinedClubs(){
        String list = "";

        for(Club club: clubsJoined){
            list += "Name: " + club.getName() + "\nDescription: " + club.getDescription() + "\n" + club.listAllMeetingTimes() + "\n";
        }

        return list;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList<Club> getClubsJoined() {
        return clubsJoined;
    }

    public void setClubsJoined(ArrayList<Club> clubsJoined) {
        this.clubsJoined = clubsJoined;
    }
}

