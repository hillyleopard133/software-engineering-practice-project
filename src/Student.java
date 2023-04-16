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
                count++;
                if (assignment.equals(assignment1))
                    return getModule(moduleName).getGrades()[count];
            }
        return -1;
    }

}
