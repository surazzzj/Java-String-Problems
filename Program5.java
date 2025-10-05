// Remove All Whitespaces

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text:");

        String str = sc.nextLine();
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}




// Using inbuilt Methods

public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text:");
        String str = sc.nextLine();
       System.out.println(str.replace(" ", ""));

    }
}

