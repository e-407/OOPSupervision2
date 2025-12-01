package questions;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testBothSorts() {
        Car car1 = new Car("B", 20);
        Car car2 = new Car("A", 10);
        Car car3 = new Car("B", 10);
        List<Car> cars = new ArrayList<>(Arrays.asList(car3, car2, car1));

        Collections.sort(cars);
        assertEquals("A", cars.get(0).getManufacturer());
        assertEquals("B", cars.get(1).getManufacturer());
        assertEquals("B", cars.get(2).getManufacturer());

        Collections.sort(cars, new CarComparator());
        assertEquals("A", cars.get(0).getManufacturer());
        assertEquals("B", cars.get(1).getManufacturer());
        assertEquals(10, cars.get(1).getAge());
        assertEquals("B", cars.get(2).getManufacturer());
        assertEquals(20, cars.get(2).getAge());
    }
}