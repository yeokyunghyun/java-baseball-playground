package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addTest() {
        int result = Calculator.calculate("1 + 2");
        Assertions.assertThat(3).isEqualTo(result);
    }

    @Test
    void subtractTest() {
        int result = Calculator.calculate("2 - 1");
        Assertions.assertThat(1).isEqualTo(result);
    }

    @Test
    void divideTest() {
        int result = Calculator.calculate("4 / 2");
        Assertions.assertThat(2).isEqualTo(result);
    }

    @Test
    @DisplayName("0을 나눴을 때 예외발생")
    void divideZeroTest() {
        Assertions.assertThatThrownBy(() -> {Calculator.calculate("4 / 0");}).isInstanceOf(ArithmeticException.class);
    }
}
