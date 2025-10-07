// Check if Two Strings are Anagrams - Two strings are anagrams if they contain the same letters in different order (like “listen” & “silent”).

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1 = input.nextLine();

        System.out.print("Enter String2:");
        String str2 = input.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are Not Anagram");
        } else {

            char[] String1 = str1.toCharArray();
            char[] String2 = str2.toCharArray();

            Arrays.sort(String1);
            Arrays.sort(String2);

            if (Arrays.equals(String1, String2)) {
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Strings are Not Anagram");
            }

        }
    }
}
