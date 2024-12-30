public class Q5 {
    public static void main(String[] args) {
        int x = 5, y = 3; // Example numbers
        System.out.println("Product: " + multiply(x, y));
    }

    public static int multiply(int x, int y) {
        int result = 0;
        while (y != 0) {
            if ((y & 1) != 0) {
                result += x;
            }
            x <<= 1; // Double x
            y >>= 1; // Halve y
        }
        return result;
    }
}
//output : Product: 15