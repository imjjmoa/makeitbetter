package Manage;

import org.junit.Test;
import static org.junit.Assert.*;

public class Change_ModeTest {

    @Test
    public void changeMode() {
        Change_Mode test = new Change_Mode();
        assertEquals(test.getMode(),6);
    }
}