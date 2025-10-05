// Count Vowels and Consonants

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine();
        int vowels = 0, consonants = 0;

        for (int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.print("Vowels: " + vowels + " Consonants: " + consonants);
    }
}

// Using inbuilt method

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = input.nextLine().toLowerCase();
        int vowels = 0;

        for (char c : str.toCharArray()) {
            if ("aeiou".contains(String.valueOf(c))) {
                vowels++;
            }
        }

        System.out.println("Vowels: " + vowels + " Consonants: " + (str.length() - vowels));

    }
}
