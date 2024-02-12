package study;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = new ArrayList<>();
        for(int i = 0; i < 3; ++i) {
            this.answers.add(new Ball(i + 1, answers.get(i)));
        }
    }


    public BallStatus play(Ball userBall) {
        return answers.stream().map(ball -> ball.play(userBall)).filter(status -> status != BallStatus.NOTHING).findFirst().orElse(BallStatus.NOTHING);
    }
}
