import junit.framework.TestCase;
import org.junit.Test;

public class BoseBoxTest extends TestCase {
    @Test
    public void createBox(){
        Box boseBox = new BoseBox();
        boseBox.getBoxState().doAction();
    }


    @Test
    public void testVolumeBoxOn(){
        Box boseBox = new BoseBox();
        Remote remote = new Remote(boseBox);
        remote.powerButtonWasPressed();
        for (int i = 0; i < 12; i++) {
            remote.volumeUpButtonWasPressed();
        }
        for (int i = 0; i < 12; i++) {
            remote.volumeDownButtonWasPressed();
        }
    }

    @Test
    public void testPower(){
        Box boseBox = new BoseBox();
        Remote remote = new Remote(boseBox);
        remote.powerButtonWasPressed();
        remote.powerButtonWasPressed();
    }

    @Test
    public void testInstructionManuald(){
        Box boseBox = new BoseBox();
        boseBox.instructionManual();
    }
}