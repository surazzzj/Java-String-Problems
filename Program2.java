// Check if String is Palindrome - A palindrome reads same backward & forward (like "madam", "racecar").

public class Program2 {
    public static void main(String[] args) {
        String str = "racecar";

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Using inbuilt methods-

public class Program2 {
    public static void main(String[] args) {

        String str = input.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(revString) ? "Palindrome" : "Not Palindrome");

    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)