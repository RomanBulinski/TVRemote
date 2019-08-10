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

    @Test
    public void forTest() {
        assertEquals(12, MAin.tvRemote("for"));
    }

    @Test
    public void omTest() {
        assertEquals(12, MAin.tvRemote("om/"));
    }

    @Test
    public void exeTest() {
        assertEquals(12, MAin.tvRemote("om/l9t5mt"));
    }


}
