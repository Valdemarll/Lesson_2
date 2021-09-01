package Lesson3.Task5;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class StudentsTest {
    @Test
    public void TestStudent(){
        Students student = Students.Student1;
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
    public void TestStudentsGroup(){
        StudentsGroup group = new StudentsGroup();
        Students student1 = Students.Student1;
        Students student2 = Students.Student3;
        Students student3 = Students.Student1;

        Students[] students = {student1, student2, student3};
        Students[] studentsAboveTheMark2 = {student1,student3};
        Students[] studentsOfFaculty2 = {student2};

        Students[] studentsAboveTheMark = group.aboveTheMark(students, 3.9);
        Students[] studentsOfFaculty = group.studentsOfFaculty(Students.values(), "географический");

        //assertEquals(studentsAboveTheMark2, studentsAboveTheMark);
        assertEquals(studentsOfFaculty2, studentsOfFaculty);
    }


}