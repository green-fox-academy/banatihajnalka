package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> studentList;
    private  List<Mentor> mentorsList;

    public Cohort(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        mentorsList = new ArrayList<>();
    }
    public void addStudent(Student member) {
        studentList.add(member);
    }
    public void addMentor(Mentor member) {
        mentorsList.add(member);
    }

    public void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.\n", name, studentList.size(), mentorsList.size());
    }
}
