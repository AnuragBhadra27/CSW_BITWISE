public class Q15 {
    public static void main(String[] args) {
        System.out.println("100th prime number: " + findNthPrime(100));
    }

    public static int findNthPrime(int n) {
        int count = 0, num = 1, prime = 0;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
                prime = num;
            }
        }
        return prime;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
//output : 100th prime number: 541