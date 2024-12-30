public class Q3 {
    public static void main(String[] args) {
        int number = 29; // Example number
        int i = 1, j = 3; // Bit positions to swap
        System.out.println("Number after swapping: " + swapBits(number, i, j));
    }

    public static int swapBits(int n, int i, int j) {
        if (((n >> i) & 1) != ((n >> j) & 1)) {
            n ^= (1 << i) | (1 << j);
        }
        return n;
    }
}
//output : Number after swapping: 30