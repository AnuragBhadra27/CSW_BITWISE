public class Q11 {
    public static void main(String[] args) {
        int number = 45678; // Example number
        System.out.println("Number of even digits: " + countEvenDigits(number));
    }

    public static int countEvenDigits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n % 10) % 2 == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
//output : Number of even digits: 3