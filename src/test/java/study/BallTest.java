package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {
    @Test
    void strike() {
        Ball ball = new Ball(1, 1);
        BallStatus status = ball.play(new Ball(1, 1));
        Assertions.assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void nothing() {
        Ball ball = new Ball(1, 1);
        BallStatus status = ball.play(new Ball(2, 2));
        Assertions.assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Ball ball = new Ball(1, 1);
        BallStatus status = ball.play(new Ball(2, 1));
        Assertions.assertThat(status).isEqualTo(BallStatus.BALL);
    }
}
