public class Q4 {
    public static void main(String[] args) {
        long number = 0b1010101010101010101010101010101010101010101010101010101010101010L; // Example number
        System.out.println("Reversed bits: " + Long.toBinaryString(reverseBits(number)));
    }

    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 64; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
//output : Reversed bits: 101010101010101010101010101010101010101010101010101010101010101