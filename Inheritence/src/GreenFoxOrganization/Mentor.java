package GreenFoxOrganization;

public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
    }

    public void getGoal() {
        System.out.println(" Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("%s mentor.", level);
    }
}
