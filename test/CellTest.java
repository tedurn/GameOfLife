import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CellTest {

    Cell myCell = new Cell();

    @Test
    public void initializesDead() {
        assertFalse(myCell.isAlive());
    }

    @Test
    public void testPress() throws Exception {
        myCell.press();
        assertTrue(myCell.isAlive());

        myCell.press();
        assertFalse(myCell.isAlive());
    }
}
