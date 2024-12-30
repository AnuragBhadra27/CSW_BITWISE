public class Q14 {
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Is prime: " + isPrime(number));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
//output : Is prime: true