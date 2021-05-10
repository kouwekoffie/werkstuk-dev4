public class VolumeUpCommand implements Command {
    private Box box;

    public VolumeUpCommand(Box box) {
        this.box = box;
    }

    @Override
    public void execute() {
        box.volumeUp();
    }
}
