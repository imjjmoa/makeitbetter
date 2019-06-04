package Function;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimerTest {

    @Test
    public void changeTimer() {
        Timer test=new Timer();
        test.setNow_setter(1);
        test.changeTimer(3);
        assertEquals(test.setNow_getter(),2);
    }

    @Test
    public void updateTimer() {
        Timer test=new Timer();
        test.updateTimer();
        assertEquals(test.hour_getter(),1);
    }

    @Test
    public void resetTimer() {
        Timer test=new Timer();
        test.resetTimer();
        assertEquals(test.isRun_getter(),0);
    }
}