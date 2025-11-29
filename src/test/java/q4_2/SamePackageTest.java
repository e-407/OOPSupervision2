package q4_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SamePackageTest {

    @Test
    void testAccessFromSamePackage() {
        AccessTest accessTest = new AccessTest();
        assertEquals(407, accessTest.defaultValue);
    }
}
