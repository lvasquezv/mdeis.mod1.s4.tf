import java.util.ArrayList;
import java.util.List;

public class InvokerGameClient {

   public static void main(String[] args) {
      ScoreboardGame scoreboardGame = new ScoreboardGame10();
      InvokerGameClient invokerGameClient = new InvokerGameClient();
      List<LaunchCommand> launchCommands = invokerGameClient.readCommands("C:\\archivo.txt");
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
