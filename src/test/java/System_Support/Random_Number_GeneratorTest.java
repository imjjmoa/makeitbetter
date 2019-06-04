package System_Support;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Random_Number_GeneratorTest {

    @Test
    public void setModeNum() {
        Random_Number_Generator test=new Random_Number_Generator();
        assertNotNull(test.getModeNum());

    }
}