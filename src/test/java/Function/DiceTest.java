package Function;

import org.junit.Test;

import static org.junit.Assert.*;


public class DiceTest {


    @Test
    public void setDice() {
        Dice test = new Dice();
        test.setDice(1);
        assertEquals(test.getdisNum(),2);
    }
    @Test
    public void changeDice() {
        Dice test = new Dice();
        assertEquals(test.getdiceNum(),1);
    }

}