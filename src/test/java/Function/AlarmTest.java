package Function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlarmTest {

    @Test(timeout=1000)
    public void getInform() {
        Time t=new Time();
        Alarm test=new Alarm(t);
        int[] time = new int[3];
        time[0] = 0;
        time[1] = 0;
        time[2] = 0;
        int state = 10;
        int []inform = new int[]{2, time[0], time[1], time[2], 0, 0, state};
        test.getInform();
        int[] tarr = new int[]{2, time[0], time[1], time[2], 1, state};
        assertEquals(test.getInform()[1], tarr[1]);
        assertEquals(test.getInform()[2], tarr[2]);
        assertEquals(test.getInform()[3], tarr[3]);
    }

    @Test
    public void activate() {
        Time t=new Time();
        Alarm test=new Alarm(t);
        int state = 10;
        test.activate();
        assertEquals(test.state_getter(),9);
    }
}