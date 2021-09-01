package Lesson3.Task2;

public class Calculator {
    int value;
    
    Calculator(int value){
        this.value = value;
    }

    Calculator add(Calculator calc){
        return new Calculator(this.value + calc.value);
    }
    Calculator sub(Calculator calc){
        return new Calculator(this.value - calc.value);
    }
    Calculator multiply(Calculator calc){
        return new Calculator(this.value * calc.value);
    }
    Calculator div(Calculator calc){
        return new Calculator(this.value / calc.value);
    }
     void setValue(int value){
        this.value = value;
     }
     int getValue(){
        return this.value;
     }
}
