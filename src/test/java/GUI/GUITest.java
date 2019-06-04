package GUI;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GUITest {

    @Test
    public void GUI_btn() {
        GUI test=new GUI();
        test.btn_input=2;
        assertEquals(test.GUI_btn(),2);
    }
}