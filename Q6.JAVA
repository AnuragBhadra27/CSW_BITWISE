public class Q6 {
    public static void main(String[] args) {
        int x = 20, y = 4; // Example numbers
        System.out.println("Quotient: " + divide(x, y));
    }

    public static int divide(int x, int y) {
        int quotient = 0;
        int temp = 1;
        int yTemp = y;

        while (x >= yTemp) {
            yTemp <<= 1;
            temp <<= 1;
        }

        while (temp > 1) {
            yTemp >>= 1;
            temp >>= 1;
            if (x >= yTemp) {
                x -= yTemp;
                quotient |= temp;
            }
        }
        return quotient;
    }
}
//output : Quotient: 5