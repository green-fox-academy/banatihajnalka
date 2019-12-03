package GreenFoxOrganization;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }
    public Sponsor() {
        super();
    }

    public Sponsor(String name, int age, String gender) {
        super(name, age, gender);
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("who represents %s and hired %d students so far.", company, hiredStudents);
    }

    public void hire() {
        hiredStudents += 1;
    }

    public void getGoal() {
        System.out.println(" Hire brilliant junior software developers.");
    }
}
