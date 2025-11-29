package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OOPSortedLinkedListTest {

    @Test
    void testListOrder() {
        OOPSortedLinkedList list = new OOPSortedLinkedList();

        list.add(10);
        list.add(1);
        list.add(5);
        list.add(20);

        // Check order is correct
        assertEquals(1, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(10, list.get(2));
        assertEquals(20, list.get(3));
    }
}