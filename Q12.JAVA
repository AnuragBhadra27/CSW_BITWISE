public class Q12 {
    public static void main(String[] args) {
        int num1 = 45678, num2 = 312; // Example numbers
        System.out.println("Third number: " + createThirdNumber(num1, num2));
    }

    public static int createThirdNumber(int a, int b) {
        int firstTwoDigits = a / 100; // Get first two digits
        int lastTwoDigits = b % 100; // Get last two digits
        return firstTwoDigits * 100 + lastTwoDigits; // Combine them
    }
}
//output : Third number: 45612