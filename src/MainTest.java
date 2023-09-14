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
        Assertions.assertEquals("(0, 3, 0) - N", spacecraft.getPositionAndDirection());
    }

}