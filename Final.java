public class Final {
    private String name;
    private String position;
    private String empID;
    private Project[] projects;

    public Final(String name, String position, String empID, Project[] projects) {
        this.name = name;
        this.position = position;
        this.empID = empID;
        this.projects = projects;
    }

    //Getter methods for name, position, empID, and projects

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmpID() {
        return empID;
    }

    public Project[] getProjects() {
        return projects;
    }
}

public class Project{
    private String name;
    private String description;

    public Project(String name, String description) {
        this.name = name; 
        this.description = description;
    }

    // Getter methods for name and description

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
