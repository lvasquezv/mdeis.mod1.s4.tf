import java.util.ArrayList;
import java.util.List;

public class ScoreboardGame10 implements ScoreboardGame{
    private List<ScoreboardPlayer> scoreboardPlayers;
    private CalculateScorePlayerItem calculateScorePlayerItem;
    private ValidateLaunchAchievement validateLaunchAchievement;
    private TypeLaunchCommandState typeLaunchCommandState;
    private LaunchCommandState launchCommandState;

    public ScoreboardGame10() {
        this.scoreboardPlayers = new ArrayList<ScoreboardPlayer>();
        this.calculateScorePlayerItem = new CalculateScorePlayerItemGame10();
        this.validateLaunchAchievement = new ValidateLaunchAchievementGame10();
        this.typeLaunchCommandState = new TypeLaunchCommandStateNewPlayer();
        this.launchCommandState = new LaunchCommandStateGame10();
    }


    public boolean applyCommand(TypeLaunchCommand typeLaunchCommand){
        //this.typeLaunchCommandState = typeLaunchCommand;
        boolean existe = false;
        if (validateLaunchAchievement.validateTypeLaunchCommand(this,typeLaunchCommand)) {

        }else{ return false;}

        return true;
    }
    public void showResult(){

    }

    public void setCalculateScorePlayerItemStrategy(CalculateScorePlayerItem calculateScorePlayerItem) {
        this.calculateScorePlayerItem = calculateScorePlayerItem;
    }
    public void setValidateLaunchAchievementStrategy(ValidateLaunchAchievement validateLaunchAchievement) {
        this.validateLaunchAchievement = validateLaunchAchievement;
    }

    public List<ScoreboardPlayer> getScoreboardPlayers() {
        return scoreboardPlayers;
    }

    public void setScoreboardPlayers(List<ScoreboardPlayer> scoreboardPlayers) {
        this.scoreboardPlayers = scoreboardPlayers;
    }

    public CalculateScorePlayerItem getCalculateScorePlayerItem() {
        return calculateScorePlayerItem;
    }

    public void setCalculateScorePlayerItem(CalculateScorePlayerItem calculateScorePlayerItem) {
        this.calculateScorePlayerItem = calculateScorePlayerItem;
    }

    public ValidateLaunchAchievement getValidateLaunchAchievement() {
        return validateLaunchAchievement;
    }

    public void setValidateLaunchAchievement(ValidateLaunchAchievement validateLaunchAchievement) {
        this.validateLaunchAchievement = validateLaunchAchievement;
    }
}
