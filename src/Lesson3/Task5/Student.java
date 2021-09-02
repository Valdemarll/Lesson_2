package Lesson3.Task5;

public class Student {
    String firstName;
    String middleName;
    String lastName;
    int groupNum;
    String faculty;
    double averageMark;

    Student(String firstName, String middleName, String lastName,
             int groupNum, String faculty, double averageMark) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.groupNum = groupNum;
        this.faculty = faculty;
        this.averageMark = averageMark;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    String getLastName(){
        return this.lastName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    String getMiddleName(){
        return this.middleName;
    }

    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    String getFaculty(){
        return this.faculty;
    }

    public void setGroupNum(int groupNum){
        this.groupNum = groupNum;
    }
    int getGroupNum(){
        return this.groupNum;
    }

    public void setAverageMark(double averageMark){
        this.averageMark = averageMark;
    }
    double getAverageMark(){
        return this.averageMark;
    }

    public String toString(){
        return lastName + " " + firstName + " " + middleName + " - ученик группы №" + groupNum + ", " + faculty +
                " факультет со средней оценкой: " + averageMark;
    }
}
