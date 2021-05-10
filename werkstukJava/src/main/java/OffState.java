public class OffState implements State {
    @Override
    public void doAction() {
        System.out.println("Box is turned off.");
    }
}
