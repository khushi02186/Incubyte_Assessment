import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testInitialState() {
        Main spacecraft = new Main();
        Assertions.assertEquals("(0, 0, 0) - N", spacecraft.getPositionAndDirection());
    }

    @Test
    public void testForwardMovement() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'f','f','f'});
        Assertions.assertEquals("(0, 3, 0) - N", spacecraft.getPositionAndDirection());
    }
    @Test
    public void testBackwardMovement() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'b','b','b'});
        Assertions.assertEquals("(0, -3, 0) - N", spacecraft.getPositionAndDirection());
    }

    @Test
    public void testLeftTurn() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'l','l','l'});
        Assertions.assertEquals("(0, 0, 0) - E", spacecraft.getPositionAndDirection());
    }
    @Test
    public void testRightTurn() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'r','r','r'});
        Assertions.assertEquals("(0, 0, 0) - W", spacecraft.getPositionAndDirection());
    }
    @Test
    public void testUpwardTurn() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'u','u','u'});
        Assertions.assertEquals("(0, 0, 0) - U", spacecraft.getPositionAndDirection());
    }

}