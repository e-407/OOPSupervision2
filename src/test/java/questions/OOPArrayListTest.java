package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OOPArrayListTest {

    @Test
    void testAddAndGet() {
        OOPArrayList list = new OOPArrayList();
        list.add(10);

        list.add(20);
        list.add(30);

        assertEquals(3, list.length());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    void testRemove() {
        OOPArrayList list = new OOPArrayList();
        list.add(10);
        list.add(20);

        list.remove();

        assertEquals(1, list.length());
        assertEquals(10, list.get(0));
    }

    @Test
    void testResizing() {
        OOPArrayList list = new OOPArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        assertEquals(15, list.length());
        assertEquals(14, list.get(14));
    }

    @Test
    void testOutOfBounds() {
        OOPArrayList list = new OOPArrayList();
        list.add(5);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
}