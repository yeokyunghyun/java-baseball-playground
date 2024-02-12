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
}
