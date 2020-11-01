import java.util.ArrayList;
import java.util.List;

public class ScoreboardGame10 extends ScoreboardGameAbstract{
    private List<ScoreboardPlayer> scoreboardPlayerList;
    private UpdateScorePlayer updateScorePlayer;
    private ValidateLaunchAchievement validateLaunchAchievement;
    private CreateUpdatePlayerFrame createUpdatePlayerFrame;
    private TypeLaunchCommandState typeLaunchCommandState;
    private LaunchCommandState launchCommandState;
    private List<TypeLaunchCommand> typeLaunchCommandList;


    public ScoreboardGame10() {
        this.scoreboardPlayerList = new ArrayList<ScoreboardPlayer>();
        this.updateScorePlayer = new UpdateScorePlayerGame10();
        this.validateLaunchAchievement = new ValidateLaunchAchievementGame10();
        this.typeLaunchCommandState = new TypeLaunchCommandStateNewPlayer();
        this.launchCommandState = new LaunchCommandStateGame10();
    }




}
