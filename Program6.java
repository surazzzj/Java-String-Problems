// Count Words in a Sentence

import java.util.Scanner;

public class Program6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = sc.nextLine();
        int count = 1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Words: " + count);
    }
}



// Using inbuilt Methods

public class Program6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");       // split at one or more consecutive spaces
        System.out.println("Words: " + words.length);
    }
}
