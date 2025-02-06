package kataSumArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrays {
    @Test
    void empty_array() {
        //Given
        double[] numbers= {};
        //When
        double result= sum_arrays(numbers);
        Assertions.assertEquals(0, result);

    }

    @Test
    void array_with_numbers() {
        //Given
        double[] numbers= {-2.398};
        //When
        double result = sum_arrays (numbers);
        //Then
        Assertions.assertEquals(-2.398, result);
    }
    private static double sum_arrays(double[] numbers) {
        if(numbers.length==0){
            return 0;
        }else if(numbers.length==1){
            return numbers[0];
        }else{
            int i=0;
            double sum=0;
            while(i< numbers.length){
                sum= sum+numbers[i];
                i++;
            }
            return sum;
        }

    }

    @Test
    void sum_numbers_in_array() {
      //Given
      double[] numbers={1,5.2,4,0,-1};
      //When
        double result= sum_arrays(numbers);
        Assertions.assertEquals(9.2, result);
    }
}
