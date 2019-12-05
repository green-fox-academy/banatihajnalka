package GreenFoxOrganization;

import java.util.ArrayList;

public class MainGreenFoxOrg {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Person person = new Person();
//        Person csabi = new Person("Csabi", 35, "male");
//
//        person.introduce();
//        csabi.introduce();
//
//        Student student = new Student();
//        Student reka = new Student("Reka", 34, "female", "ELTE");
//
//        student.introduce();
//        reka.introduce();
//
//        Mentor mentor = new Mentor("Jozsi", 45, "male", "senior");
//
//        mentor.introduce();
//        mentor.getGoal();
//
//        Sponsor sponsor = new Sponsor();
//        sponsor.hire();
//        sponsor.introduce();
//        sponsor.getGoal();
//
//        Cohort blabla = new Cohort("blabla");
//        blabla.addMentor(mentor);
//        blabla.addStudent(reka);

        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.setSkippedDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();

        Student johnTheClone = new Student();
        johnTheClone = (Student) john.clone();
        System.out.println(johnTheClone.getName());
        System.out.println(john.getName());



    }
}
