import java.util.ArrayList;
import java.util.Collections;

public class Student {

    // Fields.
    private String name="";
    private int id;
    private String course;
    private Module[] modules;
    public Module getModule(String moduleName) {
        for (Module module: modules){
            if (module.getName().equals(moduleName))
                return module;
        }
        return null;
    }
    public int getGrade(String moduleName, String assignment) {
        int count = 0;
        if (getModule(moduleName) != null)
            for (String assignment1: getModule(moduleName).getAssignments()) {
                if (assignment.equals(assignment1))
                    return getModule(moduleName).getGrades()[count];
                count++;
            }
        return -1;
    }
    public String getAllGrades(){
        String allGrades = "";
        for (Module module: modules) {
            allGrades += module.toString();
        }
        return allGrades;
    }
    public String sortGradesLowest() {
        ArrayList<Module> moduleList = new ArrayList<>();
        for (Module module: modules) {
            moduleList.add(module);
        }
        moduleList.sort((a,b)->a.getDateCompleted().compareTo(b.getDateCompleted()));
        modules = (Module[]) moduleList.toArray();
        return getAllGrades();
    }
    public String sortGradesHighest() {
        ArrayList<Module> moduleList = new ArrayList<>();
        for (Module module: modules) {
            moduleList.add(module);
        }
        moduleList.sort((a,b)->b.getDateCompleted().compareTo(a.getDateCompleted()));
        modules = (Module[]) moduleList.toArray();
        return getAllGrades();
    }
}
