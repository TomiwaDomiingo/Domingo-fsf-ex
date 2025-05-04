public int computeSumOfNums(int num) {
        
int digit1 = num / 1000;        
int digit2 = (num % 1000) / 100;  
int digit3 = (num % 100) / 10;   
int digit4 = num % 10;              
return digit1 + digit2 + digit3 + digit4;
}




public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a four.digit number:");
int num = input.nextInt();

Solution solution = new Solution();
int sum = solution.computeSumOfNumber(num);
System.out.println("The sum of the digits is: " + sum);

input.close();
}
}
