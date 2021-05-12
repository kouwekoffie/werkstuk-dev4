public class VolumeDownCommand implements Command {
    private final Box box;

    public VolumeDownCommand(Box box) {
        this.box = box;
    }

    @Override
    public void execute() {
        box.volumeDown();
    }
}
