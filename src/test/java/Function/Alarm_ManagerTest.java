package Function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Alarm_ManagerTest {

    @Test
    public void selectAlarm() {
        Alarm_Manager test=new Alarm_Manager(new Time());
        test.selectAlarm(1);
        assertEquals(test.armindex_getter(),1);
    }
}