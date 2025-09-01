import com.example.capstone.Sulfur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is the unit test for the element sulfur
 */
class SulfurTest {
    @Test
    public void testSulfur(){
        Sulfur element = new Sulfur();

        assertEquals("com.example.capstone.Sulfur", element.getElementname());
        assertEquals(16, element.getAtomicnumber());
        assertEquals(32.07f, element.getAtomicmass());
        assertEquals(16, element.getGroupnumber());
        assertEquals(3, element.getPeriodnumber());
        assertEquals("Nonmetal", element.getFamilyname());
        assertEquals("S-base.png", element.getImagename());
    }

}