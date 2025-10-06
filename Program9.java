// Find the Largest Word in a Sentence

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = sc.nextLine();
        str += " ";
        String word = "", largest = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                word += c;
            } else if (word.length() > largest.length()) {
                largest = word;
                word = " ";
            }
        }

        System.out.print("Largest:" + largest);
    }
}

// Using inbuilt Methods
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String largest = words[0];

        for (String w : words) {
            if (w.length() > largest.length()) {
                largest = w;
            }
        }
        System.out.println("Largest:" + largest);
    }
}
