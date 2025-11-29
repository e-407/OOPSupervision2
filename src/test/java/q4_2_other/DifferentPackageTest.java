package q4_2_other;

import org.junit.jupiter.api.Test;
import q4_2.AccessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferentPackageTest {

    @Test
    void testAccessFromDifferentPackage() {
        AccessTest accessTest = new AccessTest();
        // assertEquals(407, accessTest.defaultValue);
        // Doesn't compile because defaultValue is not accessible
    }
}
