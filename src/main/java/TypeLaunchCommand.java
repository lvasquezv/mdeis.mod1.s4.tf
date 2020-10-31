public class TypeLaunchCommand {
   private TypePlayerNameCommand playerName;
   private TypeNumberOfPineKnockdownsCommand numberOfPineKnockdowns;

    public TypeLaunchCommand(TypePlayerNameCommand playerName, TypeNumberOfPineKnockdownsCommand numberOfPineKnockdowns) {
        this.playerName = playerName;
        this.numberOfPineKnockdowns = numberOfPineKnockdowns;
    }

    public TypeNumberOfPineKnockdownsCommand getNumberOfPineKnockdowns() {
        return numberOfPineKnockdowns;
    }

    public void setNumberOfPineKnockdowns(TypeNumberOfPineKnockdownsCommand numberOfPineKnockdowns) {
        this.numberOfPineKnockdowns = numberOfPineKnockdowns;
    }

    public TypePlayerNameCommand getPlayerName() {
        return playerName;
    }

    public void setPlayerName(TypePlayerNameCommand playerName) {
        this.playerName = playerName;
    }
}
