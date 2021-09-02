package Lesson3.Task5;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Игорь", "Олегович", "Мишустин", 4, "филологический", 4.56),
                new Student("Тимофей", "Владиславович", "Виноградов", 3, "географический", 3.86),
                new Student("Дарья", "Вальеревна", "Владимирова", 3, "исторический", 4.16),
                new Student("Виктория", "Игоревна", "Воронова", 1, "социологический", 3.29)};
        StudentHelper helper = new StudentHelper();
        Student[] studentsAboveTheMark = helper.aboveTheMark(students, 3.9);
        Student[] studentsOfFaculty = helper.studentsOfFaculty(students, "географический");
        System.out.println("Ученики, средняя оценка которых больше 3.9:");
        for (Student stud : studentsAboveTheMark){
            System.out.println(stud);
        }
        System.out.println("Ученики географического факультета:");
        for (Student stud : studentsOfFaculty) {
            System.out.println(stud);
        }

    }
}
