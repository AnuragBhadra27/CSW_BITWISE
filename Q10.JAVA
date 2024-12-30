public class Q10 {
    public static void main(String[] args) {
        float num1 = 0.1f, num2 = 0.10001f; // Example numbers
        float epsilon = 0.001f;
        System.out.println("Difference is less than ε: " + isDifferenceLessThanEpsilon(num1, num2, epsilon));
    }

    public static boolean isDifferenceLessThanEpsilon(float a, float b, float epsilon) {
        return Math.abs(a - b) < epsilon;
    }
}
//output : Difference is less than ?µ: true