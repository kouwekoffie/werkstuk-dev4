import junit.framework.TestCase;
import org.junit.Assert;

public class TemplateMethodTest extends TestCase {

    public void testInstructionManual() {
        Box samsungBox = new SamsungBox();
        Box boseBox = new BoseBox();
        Assert.assertNotEquals(samsungBox.instructionManual(), boseBox.instructionManual());
        Assert.assertNotEquals(samsungBox.stats(), boseBox.stats());
        // despite both manuals being different they do have similar parts like the power instructions
        // which is found in the abstract class "Box"
        Assert.assertEquals(samsungBox.powerInstruction(), boseBox.powerInstruction());

    }
}