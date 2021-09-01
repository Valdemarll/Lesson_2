package Lesson3.Task3;

public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    public int DaysCount;

    Months(int DaysCount){
        this.DaysCount = DaysCount;
    }
    String getDaysCount(){
        return " - " + this.DaysCount + " days";
    }

    public Months next(){
        Months[] values = values();
        int ordinal = this.ordinal() + 1;
        if (ordinal >= values.length){
            ordinal = 0;
        }
        return values[ordinal];
    }
}
