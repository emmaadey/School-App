import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //  An instance of the outer class
        Sch school = new Sch();

        //  instances of inner classes using the outer class instance
        Sch.Principal principal = school.new Principal("Dr. Smith", 50, "Prin1");
        List<Sch.Student> students = new ArrayList<>();
        Sch.Applicant applicant1 = school.new Applicant("John Doe", 20);
        Sch.Applicant applicant2 = school.new Applicant("Jane Doe", 16);

        // Admit applicants
        principal.admitApplicant(applicant1, students);
        principal.admitApplicant(applicant2, students);

        // A teacher and student
        Sch.Teacher teacher = school.new Teacher("Mr. Brown", 35, "Teach1");
        Sch.Student student = school.new Student("Emily", 19, "Stud");

        // Test functionalities
        teacher.teachCourse("Mathematics");
        student.takeCourse("Physics");
        principal.expelStudent(student);

        // Display students
        System.out.println("Current Students:");
        for (Sch.Student s : students) {
            System.out.println(s);
        }
    }

}