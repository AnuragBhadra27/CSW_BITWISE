import java.util.ArrayList;

public class Q16 {
    public static void main(String[] args) {
        int start = 10, end = 50; // Example range
        System.out.println("Prime numbers in range: " + findPrimesInRange(start, end));
    }

    public static ArrayList<Integer> findPrimesInRange(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
//output :Prime numbers in range: [11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]