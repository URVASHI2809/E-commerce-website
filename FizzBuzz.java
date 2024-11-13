import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}
