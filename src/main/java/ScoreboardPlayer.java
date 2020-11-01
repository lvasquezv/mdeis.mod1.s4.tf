public class ScoreboardPlayer {
    private TypePlayerNameCommand playerName;
    private ScoreboardPlayerFrame[] scoreboardPlayerFrames;
    private int currentFrame = 0;
    private int totalScore;

    public ScoreboardPlayer(TypePlayerNameCommand playerName, int quantityFrames) {
        this.playerName = playerName;
        this.scoreboardPlayerFrames = new ScoreboardPlayerFrame[quantityFrames];
        this.totalScore = 0;
    }

    public ScoreboardPlayer(TypePlayerNameCommand playerName, ScoreboardPlayerFrame[] scoreboardPlayerFrames, int currentFrame, int totalScore) {
        this.playerName = playerName;
        this.scoreboardPlayerFrames = scoreboardPlayerFrames;
        this.currentFrame = currentFrame;
        this.totalScore = totalScore;
    }

    public TypePlayerNameCommand getPlayerName() {
        return playerName;
    }
    public void setPlayerName(TypePlayerNameCommand playerName) {
        this.playerName = playerName;
    }
    public ScoreboardPlayerFrame[] getScoreboardPlayerFrames() {
        return scoreboardPlayerFrames;
    }
    public void setScoreboardPlayerFrames(ScoreboardPlayerFrame[] scoreboardPlayerFrames) {
        this.scoreboardPlayerFrames = scoreboardPlayerFrames;
    }
    public int getCurrentFrame() {
        return currentFrame;
    }
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }
    public int getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
