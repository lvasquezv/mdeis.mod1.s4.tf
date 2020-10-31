import java.util.ArrayList;
import java.util.List;

public class InvokerGameClient {

   public static void main(String[] args) {
      ScoreboardGame scoreboardGame = new ScoreboardGame10();
      InvokerGameClient invokerGameClient = new InvokerGameClient();
      List<TypeLaunchCommand> launchCommands = invokerGameClient.readCommands("C:\\archivo.txt");
      for (TypeLaunchCommand launchCommand : launchCommands) {
         scoreboardGame.applyCommand(launchCommand);
      }
      scoreboardGame.showResult();
   }

   public List<TypeLaunchCommand> readCommands(String pathFileCommands){
      List<TypeLaunchCommand> launchCommands = new ArrayList<TypeLaunchCommand>();
      return launchCommands;
   }

}
