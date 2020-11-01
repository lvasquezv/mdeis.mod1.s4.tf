import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvokerGameClient {

   public static void main(String[] args)  {

      InvokerGameClient invokerGameClient = new InvokerGameClient();
      List<TypeLaunchCommand> launchCommands = invokerGameClient.readCommands("D:\\archivo.txt");

      ScoreboardGameAbstract scoreboardGame = new ScoreboardGame10();
      for (TypeLaunchCommand launchCommand : launchCommands) {
         if(!scoreboardGame.applyCommand(launchCommand)){
            System.out.println("Error al aplicar el comando:  " + launchCommand.toString() );
            return;
         }
      }
      System.out.println("Comandos cargas satisfactoriamente:  ");
      scoreboardGame.showResult();

   }

   public List<TypeLaunchCommand> readCommands(String pathFileCommands){
      List<TypeLaunchCommand> launchCommands = new ArrayList<TypeLaunchCommand>();
      // This will reference one line at a time
      String line = null;
      try {
         // FileReader reads text files in the default encoding.
         FileReader fileReader = new FileReader(pathFileCommands);
         // Always wrap FileReader in BufferedReader.
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String[] valores = line.split(" ");
            launchCommands.add(new TypeLaunchCommand(new TypePlayerNameCommand(valores[0]),new TypeNumberOfPineKnockdownsCommand(valores[1])));
         }
         // Always close files.
         bufferedReader.close();
      }
      catch(FileNotFoundException ex) {
         System.out.println(
                 "Unable to open file '" +
                         pathFileCommands + "'");
      }
      catch(IOException ex) {
         System.out.println(
                 "Error reading file '"
                         + pathFileCommands + "'");
         // Or we could just do this:
         // ex.printStackTrace();
      }

      return launchCommands;
   }

}
