package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class MyClassCopyTest {

    @Test
    void testDeepCloneIntegrity() {
        int[] originalData = {10, 20, 30};
        MyClass original = new MyClass("TestObject", originalData);
        MyClass clone = original.clone();

        assertNotSame(original, clone);

        assertEquals("TestObject", clone.getMName());
        assertEquals(30, clone.getMData()[2]);

        // Showing different references
        assertNotSame(original.getMData(), clone.getMData());

        clone.getMData()[0] = 40;

        // Showing deep copy
        assertEquals(10, original.getMData()[0]);
        assertEquals(40, clone.getMData()[0]);
    }

    @Test
    void testCopyConstructorIntegrity() {
        int[] originalData = {10, 20, 30};
        MyClass original = new MyClass("ConstructorTest", originalData);

        MyClass copy = new MyClass(original);

        assertEquals("ConstructorTest", copy.getMName());
        assertEquals(30, copy.getMData()[2]);

        // Show different references
        assertNotSame(original.getMData(), copy.getMData());

        copy.getMData()[0] = 40;

        // Showing deep copy
        assertEquals(10, original.getMData()[0]);
        assertEquals(40, copy.getMData()[0]);
    }
}