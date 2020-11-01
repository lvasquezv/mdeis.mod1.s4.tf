import java.util.ArrayList;
import java.util.List;

public class ScoreboardGame10 implements ScoreboardGame{
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


    public boolean applyCommand(TypeLaunchCommand typeLaunchCommand){
        //this.typeLaunchCommandState = typeLaunchCommand;
        boolean existe = false;
        if (validateLaunchAchievement.validateTypeLaunchCommand(this.typeLaunchCommandList,typeLaunchCommand)) {
            for (ScoreboardPlayer scoreboardPlayer: scoreboardPlayerList                 ) {
                if (typeLaunchCommand.getPlayerName().equals(scoreboardPlayer.getPlayerName())){
                    createUpdatePlayerFrame.createFrame(scoreboardPlayer, typeLaunchCommand);
                    updateScorePlayer.process(scoreboardPlayer);
                    break;
                }
            }
        }else{ return false;}

        return true;
    }
    public void showResult(){

    }


}
