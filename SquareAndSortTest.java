import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class SquareAndSortTest{

    @Test
void testBasicNumbers(){
int[] inputNumbers = {3, 1, 4};
int[] expectedResult = {1, 9, 16};
int[] actualResult = SquareAndSort.squareAndSort(inputNumbers);
assertArrayEquals(expectedResult, actualResult,       
}

    @Test
void testWithNegativeAndZero(){
int[] inputNumbers = {-7, 0, 2};
int[] expectedResult = {0, 4, 4};
int[] actualResult = SquareAndSort.squareAndSort(inputNumbers);
assertArrayEquals(expectedResult, actualResult, 
}
}