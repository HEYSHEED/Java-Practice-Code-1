package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

@Test
    void add_numbers(){
    //Given
    int number_1=2;
    int number_2=5;
    //When
    int result = add(number_1, number_2);
    //Then
    assertEquals(result, 7);

}

    private int add(int number_1, int number_2) {
        int result = number_1 + number_2;
        return result;
    }
@Test
    void multiple_number(){
    //Given
    int number_1=5;
    int number_2=6;
    //When
    int result = multiple(number_1, number_2);
    //Then
    assertEquals(result, 30);
}

    private int multiple(int number_1, int number_2) {
        int result= number_1 * number_2;
        return result;
    }
    @Test
    void divide_number(){
    //Given
    int number_1=10;
    int number_2=2;
    //When
        int result = divide(number_1, number_2);
        //Then
    assertEquals(result, 5);
    }

    private static int divide(int number_1, int number_2) {
        int result= number_1 / number_2;
        return result;
    }
    @Test
    void minus(){
    //Given
    int number_1=5;
    int number_2=6;
    //When
        int result = minus(number_1, number_2);
        //Then
     assertEquals(result, -1);
    }

    private static int minus(int number_1, int number_2) {
        int result= number_1 - number_2;
        return result;
    }

}
