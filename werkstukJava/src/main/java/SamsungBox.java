public class SamsungBox extends Box{
    public SamsungBox() {
        super.volumeStep = 1;
        super.maxVolume = 10;
    }

    @Override
    void nameBox() {
        System.out.println("SoundLink Mini II Special Edition"  + "\n");
    }

    @Override
    void stats() {
        System.out.println("BIG SOUND & DEEP BASS\n" +
                "UP TO 12 HOURS\n" +
                "ACCESS TO VOICE ASSISTANTS\n" +
                "SPEAKERPHONE\n" +
                "MAXVOLUME: " + maxVolume
                + "\n");
    }
}
