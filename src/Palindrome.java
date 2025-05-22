public class Palindrome {
    public boolean isPalindrome(String s) {
        MyStack<Character> stack1 = new MyStack<>();
        MyStack<Character> stack2 = new MyStack<>();

        int len = s.length();
        int mid = len / 2;

        for (int i = 0; i < mid; i++) {
            stack1.push(s.charAt(i));
        }

        int startSecondHalf = (len % 2 == 0) ? mid : mid + 1;

        for (int i = len - 1; i >= startSecondHalf; i--) {
            stack2.push(s.charAt(i));
        }

        while (!stack1.empty() && !stack2.empty()) {
            if (!stack1.pop().equals(stack2.pop())) {
                return false;
            }
        }

        return true;
    }
}
