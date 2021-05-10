public class BoseBox extends Box{
    public BoseBox() {
        super.volumeStep = 10;
        super.maxVolume = 100;
    }

    @Override
    void nameBox() {
        System.out.println("Samsung Level box Slim bluetooth speaker  " + "\n");
    }

    @Override
    void stats() {
        System.out.println("WATERPROOF\n" +
                "UP TO 30 HOURS\n" +
                "STEREO\n" +
                "COMPACT\n" +
                "MAXVOLUME: " + maxVolume + "\n");
    }
}
