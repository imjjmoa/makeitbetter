package Function;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TimerTest {

    @Test
    public void getBuzzerFlag() {
        Timer test=new Timer();
        assertNotNull(test.getBuzzerFlag());
    }
}