package questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ConstructorChainTest {

    @Test
    void testConstructorChaining() {
        assertDoesNotThrow(() -> new C());
    }
}