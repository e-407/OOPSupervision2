package questions;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        int manufacturerResult = c1.getManufacturer().compareTo(c2.getManufacturer());
        if (manufacturerResult == 0) {
            return Integer.compare(c1.getAge(), c2.getAge());

        } else {
            return manufacturerResult;
        }
    }
}
