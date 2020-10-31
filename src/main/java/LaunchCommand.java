public class LaunchCommand {
   private TypePlayerName playerName;
   private TypeNumberOfPineKnockdowns numberOfPineKnockdowns;

    public LaunchCommand(TypePlayerName playerName, TypeNumberOfPineKnockdowns numberOfPineKnockdowns) {
        this.playerName = playerName;
        this.numberOfPineKnockdowns = numberOfPineKnockdowns;
    }

    public TypeNumberOfPineKnockdowns getNumberOfPineKnockdowns() {
        return numberOfPineKnockdowns;
    }

    public void setNumberOfPineKnockdowns(TypeNumberOfPineKnockdowns numberOfPineKnockdowns) {
        this.numberOfPineKnockdowns = numberOfPineKnockdowns;
    }

    public TypePlayerName getPlayerName() {
        return playerName;
    }

    public void setPlayerName(TypePlayerName playerName) {
        this.playerName = playerName;
    }
}
