public class Main {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        System.out.println(p.isPalindrome("RACECAR"));  // true
        System.out.println(p.isPalindrome("HELLO"));    // false
        System.out.println(p.isPalindrome("LEVEL"));    // true
    }
}