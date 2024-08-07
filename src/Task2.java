public class Task2 {
    public boolean checkPalindrome(String s) {
        // to convert every letter to small if it is cpital like ASad->asad
       String s1=s.toLowerCase();
        //  If the string is empty or has only one character, it's a palindrome
        if (s1.isEmpty() || s1.length() == 1) {
            return true;
        }
        // Compare the first and last characters
        char first = Character.toLowerCase(s1.charAt(0));
        char last = Character.toLowerCase(s1.charAt(s1.length() - 1));

        // If they don't match, it's not a palindrome
        if (first != last) {
            return false;
        }
        // Recursive call to check the substring excluding the first and last characters
        return checkPalindrome(s1.substring(1, s1.length() - 1));
    }
}

