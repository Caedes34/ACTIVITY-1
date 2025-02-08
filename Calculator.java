import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){

        //User input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");
        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose the operation you want to perform: /, *, +, -");
        char operator = sc.next().charAt(0);

   
        //Operations 

        //add
        if (operator == '+') {
            System.out.println("Addition of two numbers are: "+ (num1 + num2));
        }else if(operator == '-'){
            System.out.println("Subtraction of two numbers are: "+ (num1 - num2));
        }else if(operator == '*'){
            System.out.println("Multiplication of two numbers are: " + (num1 * num2));
        }else if(operator == '/'){
            System.out.println("Division of two numbers are: " + (num1 / num2));
        }else{
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}

