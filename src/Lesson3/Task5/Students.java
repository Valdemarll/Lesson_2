package Lesson3.Task5;

public enum Students {
    Student1("Игорь", "Олегович", "Мишустин", 4, "филологический", 4.56),
    Student2("Тимофей", "Владиславович", "Виноградов", 3, "географический", 3.86),
    Student3("Дарья", "Вальеревна", "Владимирова", 3, "исторический", 4.16),
    Student4("Виктория", "Игоревна", "Воронова", 1, "социологический", 3.29),
    Student5("Эмиль", "Андреевич", "Джафаров", 4, "исторический", 4.28),
    Student6("Елена", "Александровна", "Запруднова", 2, "социологический", 4.82),
    Student7("Светлана", "Валерьевна", "Злобина", 2, "филологического", 3.72),
    Student8("Федор", "Михайлович", "Казакевич", 2, "географический", 4.55),
    Student9("Полина", " Кирилловна", "Изукина", 1, "филологического", 3.58),
    Student10("Денис", "Евгеньевич", "Савельев", 3, "географический", 4.45);


    String firstName;
    String middleName;
    String lastName;
    int groupNum;
    String faculty;
    double averageMark;

    Students(String firstName, String middleName, String lastName,
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
