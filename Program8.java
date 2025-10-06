// Swap Case (Upper ↔ Lower)

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = sc.nextLine();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                res += (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                res += (char) (ch - 32);
            } else {
                res += ch;
            }
        }
        System.out.print("Result: " + res);
    }
}

// using inbuilt Methods

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print("sb: " + sb);
    }
}