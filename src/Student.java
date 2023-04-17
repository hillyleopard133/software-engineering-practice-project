import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student{

    // Fields.
    private String name="";
    private int id;
    private String course;
    private Module[] modules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

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
        Collections.addAll(moduleList, modules);
        for (Module module: modules) {
            moduleList.add(module);
        }
        for (Module moduleL : moduleList) {
            ArrayList<Integer> grades = new ArrayList<>();
            for (int grade : moduleL.getGrades()) {
                grades.add(grade);
            }
            Collections.sort(grades);
            moduleL.setGrades(grades.stream().mapToInt(i->i).toArray());
        }
        modules = moduleList.toArray(new Module[moduleList.size()]);
        return getAllGrades();
    }
    public String sortGradesHighest() {
        ArrayList<Module> moduleList = new ArrayList<>();
        Collections.addAll(moduleList, modules);
        for (Module module: modules) {
            moduleList.add(module);
        }
        for (Module moduleL : moduleList) {
            ArrayList<Integer> grades = new ArrayList<>();
            for (int grade : moduleL.getGrades()) {
                grades.add(grade);
            }
            Collections.sort(grades);
            Collections.reverse(grades);
            moduleL.setGrades(grades.stream().mapToInt(i->i).toArray());
        }
        modules = moduleList.toArray(new Module[moduleList.size()]);
        return getAllGrades();
    }
}
