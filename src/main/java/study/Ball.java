package study;

import java.util.Objects;

public class Ball {
    private int position;
    private int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        } else if(this.value == ball.getValue()) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && value == ball.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }
}
