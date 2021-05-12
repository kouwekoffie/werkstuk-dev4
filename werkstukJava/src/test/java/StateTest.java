import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StateTest {
    @Test
    public void updatingStateTest(){
    Box samsungbox = new SamsungBox();
    Remote samsungboxRemote = new Remote(samsungbox);
    State onState = samsungbox.onState;
    State offState = samsungbox.offState;
    Assert.assertEquals(samsungbox.boxState, offState);
    Assert.assertEquals(samsungbox.boxState.doAction(),offState.doAction());
    samsungboxRemote.powerButtonWasPressed();
    Assert.assertEquals(samsungbox.boxState, onState);
    Assert.assertEquals(samsungbox.boxState.doAction(),onState.doAction());
    samsungbox.boxState.doAction();
    }
}