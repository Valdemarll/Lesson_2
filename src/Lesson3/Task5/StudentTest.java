package Lesson3.Task5;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class StudentTest {
    @Test
    public void TestStudent(){
        Student student = new Student("Игорь", "Олегович", "Мишустин", 4, "филологический", 4.56);
        assertEquals("Игорь", student.getFirstName());
        assertEquals("Олегович", student.getMiddleName());
        assertEquals("Мишустин", student.getLastName());
        assertEquals(4.56, student.getAverageMark());
        assertEquals("филологический", student.getFaculty());
        assertEquals(4, student.getGroupNum());


        student.setFirstName("Степан");
        student.setLastName("Боряев");
        student.setMiddleName("Сергеевич");
        student.setFaculty("кибернетики");
        student.setAverageMark(3.7);
        student.setGroupNum(4);


        assertEquals("Степан", student.getFirstName());
        assertEquals("Сергеевич", student.getMiddleName());
        assertEquals("Боряев", student.getLastName());
        assertEquals(3.7, student.getAverageMark());
        assertEquals("кибернетики", student.getFaculty());
        assertEquals(4, student.getGroupNum());

        assertEquals("Боряев Степан Сергеевич - ученик группы №4, кибернетики факультет со средней оценкой: 3.7",
                student.toString());
    }
    @Test
    public void TestStudentHelper(){

        StudentHelper helper = new StudentHelper();
        Student student1 = new Student("Тимофей", "Владиславович", "Виноградов", 3, "географический", 3.86);
        Student student2 = new Student("Дарья", "Вальеревна", "Владимирова", 3, "исторический", 4.16);
        Student student3 = new Student("Виктория", "Игоревна", "Воронова", 1, "социологический", 3.29);

        Student[] students = {student1, student2, student3};
        Student[] studentsAboveTheMark2 = {student1,student3};
        Student[] studentsOfFaculty2 = {student2};

        Student[] studentsAboveTheMark = helper.aboveTheMark(students, 3.9);
        Student[] studentsOfFaculty = helper.studentsOfFaculty(students, "географический");

        assertEquals(studentsAboveTheMark2, studentsAboveTheMark);
        assertEquals(studentsOfFaculty2, studentsOfFaculty);
    }

}