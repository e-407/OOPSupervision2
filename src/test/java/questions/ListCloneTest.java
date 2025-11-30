package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListCloneTest {

    @Test
    void testDeepCopy() {
        OOPLinkedList original = new OOPLinkedList();
        original.add(10);
        original.add(20);
        original.add(30);

        OOPLinkedList clone = (OOPLinkedList) original.clone();

        assertEquals(original.length(), clone.length());
        assertEquals(original.get(0), clone.get(0));
        assertEquals(original.get(1), clone.get(1));
        assertEquals(original.get(2), clone.get(2));

        clone.remove();

        assertEquals(2, clone.length());
        assertEquals(20, clone.get(0));

        assertEquals(3, original.length());
        assertEquals(30, original.get(0));
    }
}