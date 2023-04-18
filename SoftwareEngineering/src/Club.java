import java.util.ArrayList;

public class Club {

    // Fields

    private String name = "";
    private String description = "";
    private ArrayList<String> meetingTimes = new ArrayList<>();

    // Constructor

    public Club(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Methods

    public void addMeetingTime(String time){
        meetingTimes.add(time);
    }

    public void removeMeetingTime(int index){
        meetingTimes.remove(index);
    }

    public String listAllMeetingTimes(){
        String list = "";

        for(String time : meetingTimes){
            list += time + "\n";
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getMeetingTimes() {
        return meetingTimes;
    }

    public void setMeetingTimes(ArrayList<String> meetingTimes) {
        this.meetingTimes = meetingTimes;
    }
}
