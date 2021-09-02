package Lesson3.Task5;

public class StudentHelper {
    Student[] aboveTheMark(Student[] values, double mark){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].averageMark > mark){
                count += 1;
            }
        }
        Student[] students = new Student[count];
        int j = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].averageMark > mark){
                students[j] = values[i];
                j += 1;
            }
        }
        return students;
    }

    Student[] studentsOfFaculty(Student[] values, String faculty){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].faculty == faculty){
                count += 1;
            }
        }
        Student[] students = new Student[count];
        int j = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].faculty == faculty){
                students[j] = values[i];
                j += 1;
            }
        }
        return students;
    }
}
