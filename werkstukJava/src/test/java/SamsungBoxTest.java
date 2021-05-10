import org.junit.Test;

public class SamsungBoxTest {
    @Test
     public void createSamsungBox(){
        Box samsungBox = new SamsungBox();
        samsungBox.getBoxState().doAction();
    }


    @Test
    public void testVolumeBoxOn(){
        Box samsungBox = new SamsungBox();
        Remote remote = new Remote(samsungBox);
        remote.powerButtonWasPressed();
        for (int i = 0; i < 15; i++) {
            remote.volumeUpButtonWasPressed();
        }
        for (int i = 0; i < 15; i++) {
            remote.volumeDownButtonWasPressed();
        }
    }

    @Test
    public void testPower(){
        Box samsungBox = new SamsungBox();
        Remote remote = new Remote(samsungBox);
        remote.powerButtonWasPressed();
        remote.powerButtonWasPressed();
    }

    @Test
    public void testInstructionManuald(){
        Box samsungBox = new SamsungBox();
        samsungBox.instructionManual();
    }
}