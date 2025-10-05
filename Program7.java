// Remove Duplicate Characters

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine();
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }

        System.out.println("Result: " + result);
    }
}



