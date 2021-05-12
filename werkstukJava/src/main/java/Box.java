import java.util.Objects;

public abstract class Box implements State{

    protected State boxState;
    protected State onState = new OnState();
    protected State offState = new OffState();
    protected int volume = 0;
    protected int maxVolume = 10;
    protected int minVolume = 0;

    protected Box() {
        setBoxState(offState);
    }

    final String instructionManual(){
        String instructionManual = nameBox() +
                powerInstruction() +
                volumeInstruction() +
                stats();
        return instructionManual;
    }

    abstract String nameBox();

    abstract String stats();

    protected String powerInstruction() {
       return ("Press the powerButton on the remote to turn the box on or off" + "\n");
    }

    protected String volumeInstruction() {
        return ("Press the volumeUpButton on the remote to increase the volume. \n Press the volumeUpButton to increase the volume."+ "\n");
    };

    protected void turnOn() {
        this.setBoxState(onState);
    }

    protected void turnOff() {
        this.setBoxState(offState);
    }

    public void volumeUp() {
        if(boxState.equals(onState) && this.volume < maxVolume) {
            this.volume += 1;
            System.out.println("volume currently is : " + volume);
        }
    };

    public void volumeDown() {
        if(boxState.equals(onState) && this.volume > minVolume) {
            this.volume -= 1;
            System.out.println("volume currently is : " + volume);
        };
    };

    public State getBoxState() {
        return boxState;
    }

    public void setBoxState(State boxState) {
        this.boxState = boxState;
    }

    @Override
    public String doAction() {
        return boxState.doAction();
    }

}
