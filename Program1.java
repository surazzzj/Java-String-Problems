// Reverse a String

// Efficient manual Two-pointer approach -
public class Program1 {
    public static void main(String[] args) {
        String str = "Suraj";
        char[] charArr = str.toCharArray();

        int left=0, right = charArr.length-1;

        while(left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }

        System.err.println("Rversed String: " + new String(charArr));
    }
}

// Time: O(n)
// Space: O(n)



// Using inbuilt Methods
public class Program1 {
    public static void main(String[] args) {
        String str = "rocky";
        String reversed = new StringBuilder(str).reverse().toString();
        System.err.println("Reversed String: " + reversed);
    }
}


// Time: O(n)
// Space: O(n)