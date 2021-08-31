package Lesson3.Task3;

public class Main {
    public static void main(String[] args) {
        Months month = Months.JANUARY;
        for (int i = 0; i < 15; i++){
            System.out.println(month + month.getDaysCount());
            month = month.next();
        }
    }
}
