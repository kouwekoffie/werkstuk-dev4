public class Remote {
    private final Command powerCommand;
    private final Command volumeUpCommand;
    private final Command volumeDownCommand;

    public Remote(Box box) {
        this.powerCommand = new PowerCommand(box);
        this.volumeUpCommand = new VolumeUpCommand(box);
        this.volumeDownCommand = new VolumeDownCommand(box);
    }

    public void powerButtonWasPressed(){
        powerCommand.execute();
    }

    public void volumeUpButtonWasPressed() {
        volumeUpCommand.execute();
    }

    public void volumeDownButtonWasPressed() {
        volumeDownCommand.execute();
    }
}
