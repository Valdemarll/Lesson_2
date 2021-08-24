package L1_hw;

public class Human{
    String first_name = "Сергей";
    String last_name = "Телегин";
    String middle_name = "Павлович";

    Human(){
    }

    Human(String f_name, String l_name, String m_name){
        this.first_name = f_name;
        this.last_name = l_name;
        this.middle_name = m_name;
    }

    void setFirst_name(String f_name){
        this.first_name = f_name;
    }
    void setLast_name(String l_name){
        this.last_name = l_name;
    }
    void setMiddle_name(String m_name){
        this.middle_name = m_name;
    }

    String getFirst_name(){
        return first_name;
    }
    String getLast_name(){
        return last_name;
    }
    String getMiddle_name(){
        return middle_name;
    }

    @Override
    public String toString(){
        return "Вы " + last_name + " " + first_name + " " + middle_name;
    }

}
