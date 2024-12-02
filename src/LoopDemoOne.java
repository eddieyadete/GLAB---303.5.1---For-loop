import java.util.Scanner;

public class LoopDemoOne {

    public void firstLoopDemo(){
        int n = 5;
        for( int i = 1; i <= n; i++){
            System.out.println("Java is fun");
        }
    }
    public void secondLoopDemo(){
        int sum = 0;
        int n = 1000;
        for( int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
    public void palindromeExample(){
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for(int i = length -1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public void pyramidExample(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
