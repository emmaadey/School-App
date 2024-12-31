import java.util.ArrayList;
import java.util.List;
public class Sch {

    public class Staff {
        protected String name;
        protected int age;

        public Staff(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }
    }



    public class Teacher extends Staff {
        private String staffId;

        public Teacher(String name, int age, String staffId) {
            super(name, age);
            this.staffId = staffId;
        }

        public String getStaffId() {
            return staffId;
        }

        public void teachCourse(String courseName) {
            System.out.println(name + " is teaching the course: " + courseName);
        }
    }

    public class Student  extends Staff{
        private String studentId;
//        private String name;
//        private int age;
        public Student(String name, int age, String studentId) {
            super(name, age);
            this.studentId = studentId;
        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getAge() {
//            return age;
//        }

        public String getStudentId() {
            return studentId;
        }

        public void takeCourse(String courseName) {
            System.out.println(name + " is taking the course: " + courseName);
        }
    }

    public class Principal extends Staff {
        private String principalId;

        public Principal(String name, int age, String principalId) {
            super(name,age);
            this.principalId = principalId;
        }

        public String getPrincipalId() {
            return principalId;
        }

        public void expelStudent(Student student) {
            System.out.println("Principal " + name + " has expelled the student: " + student.getName());
        }

        public void admitApplicant(Applicant applicant, List<Student> studentList) {
            if (applicant.getAge() >= 18) {
                Student newStudent = new Student(applicant.getName(), applicant.getAge(), "STU" + (studentList.size() + 1));
                studentList.add(newStudent);
                System.out.println("Applicant " + applicant.getName() + " has been admitted as a student.");
            } else {
                System.out.println("Applicant " + applicant.getName() + " is underage and cannot be admitted.");
            }
        }
    }

    public class Applicant extends Staff {
        public Applicant(String name, int age) {
            super(name, age);
        }
    }
}

