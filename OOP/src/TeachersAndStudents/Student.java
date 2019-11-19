package TeachersAndStudents;

public class Student {
    String studentName;

    public Student (String studentName) {
        this.studentName = studentName;
    }

    public void learn() {
        System.out.println(studentName + " is learning something new.");
    }

    public void question(Teachers teachers) {
        System.out.println(studentName + " asks " + teachers.teacherName);
        teachers.answer();

    }


}
