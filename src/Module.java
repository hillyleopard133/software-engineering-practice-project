import java.time.LocalDate;
import java.util.Arrays;

public class Module {

    // Fields.
    private String name;
    private String[] lecturers;
    private String[] assignments;
    private int[] grades;
    private int code;
    private Student student;
    private LocalDate dateCompleted;

    // Getters and Setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLecturers() {
        return lecturers;
    }

    public void setLecturers(String[] lecturers) {
        this.lecturers = lecturers;
    }

    public String[] getAssignments() {
        return assignments;
    }

    public void setAssignments(String[] assignments) {
        this.assignments = assignments;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String listAllLecturers() {
        String list = "";
        for (String lecturer : lecturers) {
            list += lecturer + ", ";
        }
        return list;
    }

    public String listAllGrades() {
        String list = "********************************\n";
        int count = 0;
        for (String assignment: assignments){
            list += "Assignment: " + assignment + "\n Grade: " + grades[count] + "\n";
            count++;
        }
        list+="***********************************";
        return list;
    }

    public String toString() {
        return "---------------------------------------\n" +"Date completed: " + dateCompleted + "\nModule Name: " + getName() + "\nModule code:"+ getCode() + "\nLecturers: " + listAllLecturers() + "\n" + listAllGrades() + "--------------------------------------" ;
    }
}
