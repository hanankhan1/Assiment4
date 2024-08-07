public class Task7 {
    public String reverse(String s,int length){
        if (length == 0) {
            return "";
            // Base case: if length is 0, return an empty string
        }
        // reverse the substring and add the last character
        return s.charAt(length - 1) + reverse(s, length - 1);
    }
    }
