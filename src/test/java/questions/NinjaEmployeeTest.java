package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NinjaEmployeeTest {

    @Test
    void testNinjaEmployeeState() {
        NinjaEmployee ninja = new NinjaEmployee("Ninja1", 50000, 5);

        assertEquals("Ninja1", ninja.getName());
        assertEquals(5, ninja.getBattlesFought());

        ninja.setBattlesFought(10);
        assertEquals(10, ninja.getBattlesFought());

        // Demonstrating method visibility is working
        ninja.fight();
        ninja.hide();
        ninja.work();
    }
}