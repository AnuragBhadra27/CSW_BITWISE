public class Q8 {
    public static void main(String[] args) {
        int number = -245; // Example number
        System.out.println("Reversed number: " + reverseNumber(number));
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);
        
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        
        return isNegative ? -reversed : reversed;
    }
}
//output : Reversed number: -542