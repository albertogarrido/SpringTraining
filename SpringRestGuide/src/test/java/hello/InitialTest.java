package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InitialTest {
    @Test
    public void testAssertion() {
        assertEquals(5, 3 + 2);
        assertNotEquals(3, 3 + 2);
    }
}
