package study;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calculate(sc.nextLine()));
    }
    
    static int calculate(String expression) {
        String[] expressionElement = expression.split(" ");

        int result = 0;
        result = toInt(expressionElement[0]);

        for (int i = 1; i < expressionElement.length; i += 2) {
            result = getCalculateResult(result, expressionElement[i], toInt(expressionElement[i + 1]));
        }

        return result;
    }

    private static int getCalculateResult(int o1, String sign, int o2) {
        if(sign.equals("+")) {
            return add(o1, o2);
        }
        if(sign.equals("-")) {
            return subtract(o1, o2);
        }
        if(sign.equals("*")) {
            return multiply(o1, o2);
        }
        if(sign.equals("/")) {
            return divide(o1, o2);
        }
        throw new IllegalArgumentException("사칙 연산 기호가 아닙니다.");
    }

    private static int toInt(String expressionElement) {
        return Integer.parseInt(expressionElement);
    }

    private static int add(int o1, int o2) {
        return o1 + o2;
    }
    private static int subtract(int o1, int o2) {
        return o1 - o2;
    }
    private static int multiply(int o1, int o2) {
        return o1 * o2;
    }
    private static int divide(int o1, int o2) {
        try {
            return o1 / o2;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

}
