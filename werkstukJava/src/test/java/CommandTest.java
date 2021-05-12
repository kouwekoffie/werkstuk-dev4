import junit.framework.TestCase;
import org.junit.Assert;

public class CommandTest extends TestCase {

    public void testVolumeButtonWasPressed() {
        BoseBox boseBox = new BoseBox();
        Remote boseBoxRemote = new Remote(boseBox);
        boseBoxRemote.powerButtonWasPressed();
        int startVolume = boseBox.volume;
        boseBoxRemote.volumeUpButtonWasPressed();
        Assert.assertEquals(startVolume+1,boseBox.volume);
        startVolume = boseBox.volume;
        boseBoxRemote.volumeDownButtonWasPressed();
        Assert.assertEquals(startVolume-1,boseBox.volume);
    }
}