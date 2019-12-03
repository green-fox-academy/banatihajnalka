package GreenFoxOrganization;

public class MainGreenFoxOrg {
    public static void main(String[] args) {
        Person person = new Person();
        Person csabi = new Person("Csabi", 35, "male");

        person.introduce();
        csabi.introduce();

        Student student = new Student();
        Student reka = new Student("Reka", 34, "female", "ELTE");

        student.introduce();
        reka.introduce();

        Mentor mentor = new Mentor("Jozsi", 45, "male", "senior");

        mentor.introduce();
        mentor.getGoal();
    }
}
