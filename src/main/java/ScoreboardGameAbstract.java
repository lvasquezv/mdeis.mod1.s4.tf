import java.util.List;

public abstract class ScoreboardGameAbstract {
    private List<ScoreboardPlayer> scoreboardPlayerList;
    private UpdateScorePlayer updateScorePlayer;
    private ValidateLaunchAchievement validateLaunchAchievement;
    private CreateUpdatePlayerFrame createUpdatePlayerFrame;
    //private TypeLaunchCommandState typeLaunchCommandState;
    //private LaunchCommandState launchCommandState;
    private List<TypeLaunchCommand> typeLaunchCommandList;

    public boolean applyCommand(TypeLaunchCommand typeLaunchCommand){
        if (validateLaunchAchievement.validateTypeLaunchCommand(this.typeLaunchCommandList,typeLaunchCommand)) {
            ScoreboardPlayer scoreboardPlayerSelect = null;
            for (ScoreboardPlayer scoreboardPlayer: scoreboardPlayerList                 ) {
                if (typeLaunchCommand.getPlayerName().equals(scoreboardPlayer.getPlayerName())){
                    scoreboardPlayerSelect = scoreboardPlayer;
                    break;
                }
            }
            if(scoreboardPlayerSelect==null)
                scoreboardPlayerSelect = new ScoreboardPlayer(typeLaunchCommand.getPlayerName(),0);

            createUpdatePlayerFrame.createFrame(scoreboardPlayerSelect, typeLaunchCommand);
            updateScorePlayer.process(scoreboardPlayerSelect);
        }else{ return false;}

        typeLaunchCommandList.add(typeLaunchCommand);
        return true                ;
    }

    public void showResultPlayers(PrinterPlayerFrame printer){
        for (ScoreboardPlayer scoreboardPlayer: scoreboardPlayerList ){
            printer.printer(scoreboardPlayer);
        }
    }

}
