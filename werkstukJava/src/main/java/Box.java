public abstract class Box implements State{

    protected State boxState;
    protected State onState = new OnState();
    protected State offState = new OffState();
    protected int volume = 0;
    protected int maxVolume;
    protected int minVolume = 0;
    protected int volumeStep;

    protected Box() {
        setBoxState(offState);
    }

    final void instructionManual(){
        nameBox();
        powerInstruction();
        volumeInstruction();
        stats();
    }

    abstract void nameBox();

    abstract void stats();

    protected void powerInstruction() {
        System.out.println("Press the powerButton on the remote to turn the box on or off" + "\n");
    }

    protected void volumeInstruction() {
        System.out.println("Press the volumeUpButton on the remote to increase the volume. \nPress the volumeUpButton to increase the volume."+ "\n");
    };

    protected void turnOn() {
        this.setBoxState(onState);
        boxState.doAction();
    }

    protected void turnOff() {
        this.setBoxState(offState);
        boxState.doAction();
    }

    public void volumeUp() {
        if(boxState.equals(onState) && this.volume < maxVolume) {
            this.volume += volumeStep;
            System.out.println("volume went up with " + this.volumeStep + " volume currently is :" + volume);
        }
    };

    public void volumeDown() {
        if(boxState.equals(onState) && this.volume > minVolume) {
            this.volume -= volumeStep;
            System.out.println("volume went down with " + this.volumeStep + " volume currently is :" + volume);
        };
        //TODO else ...
    };

    public State getBoxState() {
        return boxState;
    }

    public void setBoxState(State boxState) {
        this.boxState = boxState;
    }

    @Override
    public void doAction() {
        this.boxState.doAction();
    }

/*    @Override
    public String toString() {
        return "Volume currently is: " + volume;
    }*/
}
