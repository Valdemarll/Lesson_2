package L1_hw;

import static junit.framework.TestCase.assertEquals;
import  org.junit.Test;

public class MatrixTest {
    @Test
    public void toString_test() {
        Matrix matrix = new Matrix();
        matrix._matrix_[0][0] = 1;
        matrix._matrix_[0][1] = 2;
        matrix._matrix_[0][2] = 3;
        matrix._matrix_[1][0] = 4;
        matrix._matrix_[1][1] = 5;
        matrix._matrix_[1][2] = 6;

        assertEquals("\n1 2 3 \n4 5 6 \n", matrix.toString());
    }

    @Test
    public void add_test() {
        Matrix matrix = new Matrix();
        matrix._matrix_[0][0] = 1;
        matrix._matrix_[0][1] = 2;
        matrix._matrix_[0][2] = 3;
        matrix._matrix_[1][0] = 4;
        matrix._matrix_[1][1] = 5;
        matrix._matrix_[1][2] = 6;

        assertEquals("2 4 6 \n8 10 12 \n", matrix.add(matrix));
    }
    @Test
    public void multiply_test() {
        Matrix matrix = new Matrix();
        matrix._matrix_[0][0] = 1;
        matrix._matrix_[0][1] = 2;
        matrix._matrix_[0][2] = 3;
        matrix._matrix_[1][0] = 4;
        matrix._matrix_[1][1] = 5;
        matrix._matrix_[1][2] = 6;

        assertEquals("1 4 9 \n16 25 36 \n", matrix.multiply(matrix));
    }
}