public class Project {
    private String name;
    private String description;
    private double initialCost;

    public String elevatorPitch() {
        return name + " (" + initalCost + ") " + ": " + description;
    }

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setInitialCost(double value) {
        this.initialCost = value;
    }
}
