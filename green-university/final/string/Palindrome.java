public class Palindrome {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "abba";

        boolean isPalindrome1 = true;
        boolean isPalindrome2 = true;

        for(int i = 0; i < str1.length() / 2; i++){
            if(str1.charAt(i) != str1.charAt(str1.length() - i - 1)){
                isPalindrome1 = false;
                break;
            }
        }

        for(int i = 0; i < str2.length() / 2; i++){
            if(str2.charAt(i) != str2.charAt(str2.length() - i - 1)){
                isPalindrome2 = false;
                break;
            }
        }
        
        System.out.println(isPalindrome1); // false
        System.out.println(isPalindrome2); // true
    }
}
