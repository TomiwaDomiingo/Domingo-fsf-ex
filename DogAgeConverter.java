
public class DogAgeConverter{
public static void displayDogAge(String name, int humanYears){
int dogYears = humanYears * 7;
System.out.println(name + " is " + dogYears + " years old in dog years");
}




public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the dog's name: ");
String name = input.nextLine();

System.out.print("Enter the dog's age in human years: ");
int humanYears = input.nextInt();

displayDogAge(name, humanYears);

input.close(); 
}
}
