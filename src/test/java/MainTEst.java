import org.junit.jupiter.api.Test;
import sun.applet.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTEst {

    @Test
    public void example() {
        assertEquals(36, MAin.tvRemote("codewars"));
    }

    @Test
    public void misc() {
        assertEquals(16, MAin.tvRemote("does"));
        assertEquals(23, MAin.tvRemote("your"));
        assertEquals(33, MAin.tvRemote("solution"));
        assertEquals(20, MAin.tvRemote("work"));
        assertEquals(12, MAin.tvRemote("for"));
        assertEquals(27, MAin.tvRemote("these"));
        assertEquals(25, MAin.tvRemote("words"));
    }


}
