import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero =  0;
        
        //ask the user 10 times for a number
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt(); 
            
            if (number > 0) {
                System.out.println("Positive");
                positive++;
            } else if (number < 0) {
                System.out.println("Negative");
                negative++;
            } else {
                System.out.println("Zero");
                zero++;
            }
        } 
        
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);    
        scanner.close();    
    }
}