package System_Support;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class System_ClockTest {

    @Test
    public void getClock() {
        System_Clock test=new System_Clock(0,0,0,0,0,0);
        int[] arr = test.getClock();
        assertEquals(arr[0], 0);
        assertEquals(arr[1], 0);
        assertEquals(arr[2], 0);
        assertEquals(arr[3], 0);
        assertEquals(arr[4], 0);
        assertEquals(arr[5], 0);
    }
}