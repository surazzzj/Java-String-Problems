// Check if String is Palindrome - A palindrome reads same backward & forward (like "madam", "racecar").

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine();
        boolean isPallindrome = true;

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPallindrome = false;
                break;
            }
        }
        System.out.println(isPallindrome ? "Pallindrome" : "Not Pallindrome");
    }
}



// Using inbuilt methods

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine();
        StringBuilder rev = new StringBuilder(str).reverse();
        String revString = rev.toString();

        if(str.equals(revString)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}