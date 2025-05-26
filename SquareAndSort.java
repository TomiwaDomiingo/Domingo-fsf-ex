public class SquareAndSort{

public static int[] squareAndSort(int[] numbers){
int[] squaredIndex = new int[numbers.length];
        
      
for (int position = 0; position < numbers.length; position++){
squaredIndex[position] = numbers[position] * numbers[position];
}
  
for (int outerLoop = 0; outerLoop < squaredIndex.length; outerLoop++){
for (int innerLoop = 0; innerLoop < squaredIndex.length - 1 - outerLoop; innerLoop++){
if (squaredIndex[innerLoop] > squaredIndex[innerLoop + 1]){
                
int temporary = squaredIndex[innerLoop];
squaredIndex[innerLoop] = squaredIndex[innerLoop + 1];
squaredIndex[innerLoop + 1] = temporary;
}
}
}     
return squaredIndex;
}
    
public static void main(String[] args){
        
int[] numbersArray = {9, 2, 7, 0, 5};
               
int[] result = squareAndSort(numbersArray);
        
System.out.print("Result: [");
for (int index = 0; index < result.length; index++){
System.out.print(result[index]);
if (index < result.length - 1){
System.out.print(", ");
}
}
System.out.println("]");
}
}

