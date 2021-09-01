package Lesson3.Task5;

public class StudentsGroup {

    Students[] aboveTheMark(Students[] values, double mark){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].averageMark > mark){
                count += 1;
            }
        }
        Students[] students = new Students[count];
        int j = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].averageMark > mark){
                students[j] = values[i];
                j += 1;
            }
        }
        return students;
    }

    Students[] studentsOfFaculty(Students[] values, String faculty){
        int count = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i].faculty == faculty){
                count += 1;
            }
        }
        Students[] students = new Students[count];
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
