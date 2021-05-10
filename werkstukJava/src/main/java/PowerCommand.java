public class PowerCommand implements Command{
    Box box;

    public PowerCommand(Box box) {
        this.box = box;
    }

    @Override
    public void execute() {
        if (box.getBoxState().equals(box.offState)) {box.turnOn();}
        else box.turnOff();
    }
}