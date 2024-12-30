public class Q9 {
    public static void main(String[] args) {
        int number = 121; // Example number
        System.out.println("Is palindrome: " + isPalindrome(number));
    }

    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}
//output : Is palindrome: true