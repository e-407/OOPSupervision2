package questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testShapeDrawing() {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        assertSame("Rectangle", rectangle.getType());
        assertNotEquals("Rectangle", circle.getType());
    }
}