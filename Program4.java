// Count Occurrence of Each Character

import java.util.Scanner;

public class Program4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = input.nextLine();
        int[] freq = new int[256];

        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
              System.out.println((char)i + " = " + freq[i]);
            }
        }
    }
}





