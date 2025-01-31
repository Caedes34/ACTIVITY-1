import java.util.Scanner;
public class ReversingWord {
    public static void main(String args[]){
        
        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to reverse:");
        String word = sc.nextLine();

        String reversedWord = " ";

        //loop reversing the word
        for(int i = word.length() -1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }    
        // print reversed word
        System.out.println("Reversed word: " + reversedWord);

      sc.close();
      
    }
}
