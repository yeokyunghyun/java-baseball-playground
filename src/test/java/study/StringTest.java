package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        String str1 = "1,2,3";
        String actual1[] = str1.split(",");

        assertThat(actual1).containsOnly("1","2","3","3");

        String str2 = "1";
        String actual2[] = str2.split(",");

        Assertions.assertThat(actual2).containsExactly("1");

    }

    @Test
    void substringTest() {
        String str1 = "(1,2)";
        String actual = str1.substring(1, 4);
        Assertions.assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("chatAt()메서드로 StringIndexOutOfBoundsException 예외 발생")
    void chatAtTest() {
        String str1 = "abc";
        assertThatThrownBy(() -> {
            str1.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    str1.charAt(3);
                }).withMessageContaining("String index out of range: 3");
    }

}
