public class ProjectTest {
    public static void main(String[] args) {
        Project nikeProject = new Project("Nike");
        String name = nikeProject.getName();
        System.out.println("The Project name is: " + name);
        Project uaProject = new Project("Under Armor", "Update shoeware");
        System.out.println("Under Armor project description: " + uaProject.getDescription());
    }
}