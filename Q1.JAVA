public class Q1 {
   public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int number = 29; // Example number
        System.out.println("Number of set bits: " + countSetBits(number));
    }
}
// Output: Number of set bits: 4