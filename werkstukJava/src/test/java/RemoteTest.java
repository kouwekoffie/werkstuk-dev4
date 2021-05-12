import org.junit.Test;

public class RemoteTest {

    @Test
    public void testState(){
        Box box = new BoseBox();
        box.doAction();
    }

    @Test
    public void testPower(){
        Box box = new BoseBox();
        Remote remote = new Remote(box);
        remote.powerButtonWasPressed();
        remote.powerButtonWasPressed();
    }

    @Test
    public void testVolumeBoxOn(){
        Box box = new BoseBox();
        Remote remote = new Remote(box);
        remote.powerButtonWasPressed();
        for (int i = 0; i < 5; i++) {
            remote.volumeUpButtonWasPressed();
            System.out.println(box.toString());
        }
        for (int i = 0; i < 5; i++) {
            remote.volumeDownButtonWasPressed();
            System.out.println(box.toString());
        }
    }

    @Test
    public void testVolumeBoxOff(){
        Box box = new BoseBox();
        Remote remote = new Remote(box);
        remote.powerButtonWasPressed();
        remote.powerButtonWasPressed();
        remote.volumeUpButtonWasPressed();
        System.out.println(box.toString());
        remote.volumeDownButtonWasPressed();
        System.out.println(box.toString());
    }

    @Test
    public void testVolumeExtendsMaxMin(){
        Box box = new BoseBox();
        Remote remote = new Remote(box);
        remote.powerButtonWasPressed();
        for (int i = 0; i < 13; i++) {
            remote.volumeUpButtonWasPressed();
            System.out.println(box.toString());
        }
        for (int i = 0; i < 13; i++) {
            remote.volumeDownButtonWasPressed();
            System.out.println(box.toString());
        }
    }
}