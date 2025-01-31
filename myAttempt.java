import java.util.Scanner;

public class myAttempt {
    public static void main(String[] args) {
        int count = 0;
        int countForSub = 1;
        int sum = 0;

        //input for the student count
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student count: ");
        int numberOfStudent = sc.nextInt();
        
        
        //loop input for the 3 subject count
        for(;count < numberOfStudent; count++,countForSub++){

            Scanner subs= new Scanner(System.in);
            System.out.println("Enter Subject " + countForSub + " Grade" + ":");
            int subGrade = subs.nextInt();
            sum += subGrade;
         
        }
        

        //the summation of all 3 grades and divide them by 3
        int average = sum/3;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + average);

        // define condition of the average
        if (average >= 90 && average <=100) {
            System.out.println("Grade:  A");
            
        }else if(average >= 80 && average <=89) {
            System.out.println("Grade:  B");
            
        }else if(average >=60  && average <=79) {
            System.out.println("Grade:  C");
            
        }else if(average >= 40 && average <=59){
            System.out.println("Grade:  D");
        }else{
            System.out.println("Failed");
        }   
         
       
    }

      
}

