package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallsTest {
    @Test
    void nothing() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(1, 4));
        Assertions.assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void strike() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(1, 1));
        Assertions.assertThat(status).isEqualTo(BallStatus.STRIKE);
    }


    @Test
    void ball() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status = balls.play(new Ball(2, 1));
        Assertions.assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void _3nothing() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(4, 5, 6)); //몇 스트라이크 몇 볼인지 담을 객체
        Assertions.assertThat(result.isNothing()).isTrue();
    }

    @Test
    void _strike() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 2, 3)); //몇 스트라이크 몇 볼인지 담을 객체
        Assertions.assertThat(result.isGameOver()).isTrue();
    }

    @Test
    void _2strike() {
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        PlayResult result = balls.play(Arrays.asList(1, 2, 4)); //몇 스트라이크 몇 볼인지 담을 객체
        Assertions.assertThat(result.getStrikeCnt() == 2).isTrue();
    }

}
