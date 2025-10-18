// Check if String is Pangram - A pangram is a sentence that contains every letter of the English alphabet at least once.

public class Program11 {

    public static boolean checkIfPangram(String sentence){
        boolean[] seen = new boolean[26];
        sentence = sentence.toLowerCase();

        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                seen[ch - 'a'] = true;
            }
        }

        for(boolean value:seen){
            if(!value) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfPangram(sentence));
    }
}
