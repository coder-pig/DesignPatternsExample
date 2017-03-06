/**
 * Created by Administrator on 2017/3/6 0006.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("计算：1 + 1 = " + compute("+", 1, 1));
        System.out.println("计算：1 - 1 = " + compute("-", 1, 1));
        System.out.println("计算：1 * 1 = " + compute("*", 1, 1));
        System.out.println("计算：1 ? 1 = " + compute("/", 1, 1));
    }

    public static float compute(String operator, int first, int second) {
        switch (operator) {
            case "+": return first + second;
            case "-": return first - second;
            case "*": return first * second;
            case "/": return first / second;
            default: return 0.0f;
        }
    }
}
