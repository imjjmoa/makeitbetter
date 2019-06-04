package Function;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeTest {

    @Test
    public void getSystemClock() {
        Time test=new Time();
        assertEquals(test.getSystemClock()[0],1);
    }

    @Test
    public void timesetMode() {
        Time test =new Time();
        test.setNow_setter(3);
        test.timesetMode(1);
        assertEquals(1,test.hour_getter());
    }

    @Test
    public void updateTime() {
        Time test=new Time();
        test.updateTime();
        assertEquals(test.getSystemClock()[3],0);
    }

}