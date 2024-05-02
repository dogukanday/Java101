package Week2;

public class PalindromeNumbers {

    static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int num = 4004;
        int originalNum = num;

        if (isPalindrome(num)) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}
