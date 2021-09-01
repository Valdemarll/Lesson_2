package Lesson3.Task4;

public enum WeekDays {
    WORKDAY{
        @Override
        public void WhatsDay(){
            System.out.println("Сегодня можно гулять");
        }
    },
    WEEKEND{
        @Override
        public void WhatsDay(){
            System.out.println("Сегодня нужно работать");
        }
    };

    public abstract void WhatsDay();

}
