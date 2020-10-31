import java.util.ArrayList;
import java.util.List;

public class GameClient {

   public static void main(String[] args) {
      ScoreboardGame scoreboardGame = new ScoreboardGame10();
      GameClient gameClient = new GameClient();
      List<LaunchCommand> launchCommands = gameClient.readCommands("C:\\archivo.txt");
      for (LaunchCommand launchCommand : launchCommands) {
         scoreboardGame.applyCommand(launchCommand);
      }
      scoreboardGame.showResult();
   }

   public List<LaunchCommand> readCommands(String pathFileCommands){
      List<LaunchCommand> launchCommands = new ArrayList<LaunchCommand>();
      return launchCommands;
   }

}
