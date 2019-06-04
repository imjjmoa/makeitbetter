package Function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RRTest {

    @Test
    public void setRR() {
        RR test=new RR();
        test.setRR(1);
        assertEquals(test.disNum_getter(), 7);
    }
    @Test
    public void playRR() {
        RR test=new RR();
        test.playRR();
        assertEquals(test.disNum_getter(), 6);
    }
}