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

    //
//    tvRemote(final String word)
    @Test
    public void abTest() {
        assertEquals(1, MAin.tvRemote("ab"));
    }

    @Test
    public void afTest() {
        assertEquals(1, MAin.tvRemote("af"));
    }

    @Test
    public void a3Test() {
        assertEquals(7, MAin.tvRemote("a3"));
    }

    @Test
    public void auTest() {
        assertEquals(4, MAin.tvRemote("au"));
    }

    @Test
    public void agTest() {
        assertEquals(2, MAin.tvRemote("ag"));
    }


}
