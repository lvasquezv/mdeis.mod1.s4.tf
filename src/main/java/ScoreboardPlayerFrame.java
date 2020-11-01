import java.util.ArrayList;
import java.util.List;

public class ScoreboardPlayerFrame {
    private List<TypeNumberOfPineKnockdownsBoard> numberOfPineKnockdownsBoards;
    private int cumulativeScore;

    public ScoreboardPlayerFrame() {
        this.numberOfPineKnockdownsBoards = new ArrayList<TypeNumberOfPineKnockdownsBoard>();
        this.cumulativeScore = 0;
    }

    public ScoreboardPlayerFrame(List<TypeNumberOfPineKnockdownsBoard> numberOfPineKnockdownsBoards, int cumulativeScore) {
        this.numberOfPineKnockdownsBoards = numberOfPineKnockdownsBoards;
        this.cumulativeScore = cumulativeScore;
    }

    public List<TypeNumberOfPineKnockdownsBoard> getNumberOfPineKnockdownsBoards() {
        return numberOfPineKnockdownsBoards;
    }
    public void setNumberOfPineKnockdownsBoards(List<TypeNumberOfPineKnockdownsBoard> numberOfPineKnockdownsBoards) {
        this.numberOfPineKnockdownsBoards = numberOfPineKnockdownsBoards;
    }
    public int getCumulativeScore() {
        return cumulativeScore;
    }
    public void setCumulativeScore(int cumulativeScore) {
        this.cumulativeScore = cumulativeScore;
    }
}
