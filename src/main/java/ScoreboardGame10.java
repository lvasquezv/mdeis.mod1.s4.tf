import java.util.ArrayList;
import java.util.List;

public class ScoreboardGame10 implements ScoreboardGame{
    private List<ScoreboardPlayer> scoreboardPlayers;

    public ScoreboardGame10() {
        this.scoreboardPlayers = new ArrayList<ScoreboardPlayer>();
    }



    public void applyCommand(TypeLaunchCommand typeLaunchCommand){
        boolean existe = false;
        for (ScoreboardPlayer scoreboardPlayer:scoreboardPlayers
             ) {
            if (scoreboardPlayer.playerName.equals(typeLaunchCommand.getPlayerName())){
                existe = true;
                LaunchCommad launchCommad = new LaunchCommandGame10();
                launchCommad.execute(typeLaunchCommand,scoreboardPlayer);
            }
        }
    }
    public void showResult(){

    }
}
