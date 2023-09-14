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
    public void testLeftMovement() {
        Main spacecraft = new Main();
        spacecraft.executeCommands(new char[]{'l','l','l'});
        Assertions.assertEquals("(0, 0, 0) - E", spacecraft.getPositionAndDirection());
    }

}