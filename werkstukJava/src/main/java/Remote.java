public class Remote {
    private Command powerCommand;
    private Command volumeUp;
    private Command volumeDown;

    public Remote(Box box) {
        this.powerCommand = new PowerCommand(box);
        this.volumeDown = new VolumeDownCommand(box);
        this.volumeUp = new VolumeUpCommand(box);
    }

    public void powerButtonWasPressed(){
        powerCommand.execute();
    }

    public void volumeUpButtonWasPressed() {
        volumeUp.execute();
    }

    public void volumeDownButtonWasPressed() {
        volumeDown.execute();
    }
}
