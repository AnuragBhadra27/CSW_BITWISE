public class Q17 {
    public static void main(String[] args) {
        int number = 4; // Example number
        System.out.println("Is even: " + isEven(number));
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0; // Returns true if the least significant bit is 0
    }
}
//output : Is even: true