package L1_hw;
import java.util.Scanner;

public class Matrix{
    int length = 3;
    int width = 2;
    int[][] _matrix_ = new int[width][length];

    void setElements(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                System.out.println("Введите новый элемент матрицы:");
                this._matrix_[i][j] = scanner.nextInt();
            }
        }

    }
    @Override
    public String toString(){
        String str = "\n";
        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                str += Integer.toString(this._matrix_[i][j]) + " ";
            }
            str += "\n";
        }
        return str;
    }

    String add(Matrix m2){
        String new_matrix = "";

        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                new_matrix += Integer.toString(this._matrix_[i][j] + m2._matrix_[i][j]) + " ";
            }
            new_matrix += "\n";
        }
        return new_matrix;
    }

    String multiply(Matrix m2){
        String new_matrix = "";

        for(int i = 0; i < width; i++){
            for(int j = 0; j < length; j++){
                new_matrix += Integer.toString(this._matrix_[i][j] * m2._matrix_[i][j]) + " ";
            }
            new_matrix += "\n";
        }
        return new_matrix;
    }
}
