package Lesson3.Task5;

public class Main {
    public static void main(String[] args) {
        Students student = Students.Student1;
        System.out.println(student);
        StudentsGroup group = new StudentsGroup();
        Students[] studentsAboveTheMark = group.aboveTheMark(Students.values(), 3.9);
        Students[] studentsOfFaculty = group.studentsOfFaculty(Students.values(), "географический");
        System.out.println("Ученики, средняя оценка которых больше 3.9:");
        for (int i = 0; i < studentsAboveTheMark.length; i++){
            System.out.println(studentsAboveTheMark[i]);
        }
        System.out.println("Ученики географического факультета:");
        for (int i = 0; i < studentsOfFaculty.length; i++){
            System.out.println(studentsOfFaculty[i]);
        }
    }
}
