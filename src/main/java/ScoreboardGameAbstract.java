import java.util.List;

public abstract class ScoreboardGameAbstract implements ScoreboardGame{
    private List<ScoreboardPlayer> scoreboardPlayerList;
    private UpdateScorePlayer updateScorePlayer;
    private ValidateLaunchAchievement validateLaunchAchievement;
    private CreateUpdatePlayerFrame createUpdatePlayerFrame;
    private TypeLaunchCommandState typeLaunchCommandState;
    private LaunchCommandState launchCommandState;
    private List<TypeLaunchCommand> typeLaunchCommandList;

    public boolean applyCommand(TypeLaunchCommand typeLaunchCommand){
        if (validateLaunchAchievement.validateTypeLaunchCommand(this.typeLaunchCommandList,typeLaunchCommand)) {
            boolean exist = false;
            for (ScoreboardPlayer scoreboardPlayer: scoreboardPlayerList                 ) {
                if (typeLaunchCommand.getPlayerName().equals(scoreboardPlayer.getPlayerName())){
                    createUpdatePlayerFrame.createFrame(scoreboardPlayer, typeLaunchCommand);
                    updateScorePlayer.process(scoreboardPlayer);
                    exist = true;
                    break;
                }
            }
            if(!exist) {
               addNewPlayer(typeLaunchCommand);
            }
        }else{ return false;}
        return true                ;
    }
    public abstract void addNewPlayer(TypeLaunchCommand typeLaunchCommand);
    public void showResult(PrinterPlayerFrame printer){
        for (ScoreboardPlayer scoreboardPlayer: scoreboardPlayerList ){
            printer.printer(scoreboardPlayer);
        }
    }
}
