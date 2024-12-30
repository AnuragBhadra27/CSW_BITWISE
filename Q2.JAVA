public class Q2 {
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Parity: " + countParity(number));
    }

    public static int countParity(int n) {
        int parity = 0;
        while (n > 0) {
            parity ^= (n & 1);
            n >>= 1;
        }
        return parity;
    }
}
//Output Parity: 0