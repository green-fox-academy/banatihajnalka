package GreenFoxOrganization;

public class Student extends Person {
    private String previousOrganisation;
    private int skippedDays;

    public void getGoal() {
        System.out.println("\nBe a junior software developer.");
    }
    public void introduce() {
        super.introduce();
        System.out.printf("from %s who skipped %d days from the course already.", previousOrganisation, skippedDays);
    }
    public void setSkippedDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }
    public Student() {
        super();
        this.previousOrganisation = "The School of Life";
        this.skippedDays = 0;
    }

    public int setSkippedDays() {
        return skippedDays;
    }
}

