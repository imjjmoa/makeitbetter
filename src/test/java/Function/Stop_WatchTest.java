package Function;

import org.junit.Test;
import System_Support.System_Clock;
import static org.junit.Assert.*;

public class Stop_WatchTest {

    @Test
    public void record() {
        Stop_Watch sw = new Stop_Watch();
        System_Clock sc = new System_Clock(0, 0, 0, 0, 0, 0);
        int[] arr;
        sw.run(1);
        sw.run(3);
        arr = sw.getRecord();
        assertEquals(arr[0], sw.hour());
        assertEquals(arr[1], sw.minute());
        assertEquals(arr[2], sw.sec());
        sw.run(3);
        arr = sw.getRecord();
        assertEquals(arr[0], sw.hour());
        assertEquals(arr[1], sw.minute());
        assertEquals(arr[2], sw.sec());
        sw.run(3);
        arr = sw.getRecord();
        assertEquals(arr[0], sw.hour());
        assertEquals(arr[1], sw.minute());
        assertEquals(arr[2], sw.sec());
    }
}