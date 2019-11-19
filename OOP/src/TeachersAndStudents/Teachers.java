package TeachersAndStudents;

public class Teachers {
    String teacherName;

    public Teachers(String teacherName) {
        this.teacherName = teacherName;
    }

    public void answer() {
        System.out.println("Teacher is answering questions.");
    }

    public void teach(Student student) {
        System.out.println("Teacher wants " + student.studentName + "  to learn something.");
        student.learn();
    }


}
