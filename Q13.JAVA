import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
        int number = 112233; // Example number
        HashMap<Integer, Integer> frequency = countDigitFrequency(number);
        System.out.println("Digit frequency: " + frequency);
    }

    public static HashMap<Integer, Integer> countDigitFrequency(int n) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        while (n != 0) {
            int digit = n % 10;
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
            n /= 10;
        }
        return frequencyMap;
    }
}
//output : Digit frequency: {1=2, 2=2, 3=2}