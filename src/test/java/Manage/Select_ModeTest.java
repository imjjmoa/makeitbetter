package Manage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Select_ModeTest {

    @Test
    public void run() {
        Select_Mode test=new Select_Mode();
        test.run(1);
        assertEquals(test.now_getter(), 1);
        test.run(2);
        assertEquals(test.now_getter(), 0);
        test.run(3);
        assertEquals(test.mode_getter()[0], 1);
        test.run(1); test.run(3);
        test.run(1); test.run(3);
        test.run(1); test.run(3);
        assertEquals(test.run(4), 1);
    }

    @Test
    public void checkMode() {
        Select_Mode test=new Select_Mode();
        assertEquals(test.checkMode(0), 0);
        test.run(3);
        assertEquals(test.checkMode(0), 1);
    }
}