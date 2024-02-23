package study;

public class PlayResult {
    private int strikeCnt = 0;
    private int ballCnt = 0;

    public void report(BallStatus status) {
        if(status.isStrike()) strikeCnt += 1;
        if(status.isBall()) ballCnt += 1;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }

    public boolean isNothing() {
        return strikeCnt == 0 && ballCnt == 0;
    }

    public boolean isGameOver() {
        return strikeCnt == 3;
    }
}
