package questions;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point3DTest {

    @Test
    void testOrdering() {
        ArrayList<Point3D> points = new ArrayList<>();

        Point3D pA = new Point3D(10, 30, 20);
        Point3D pB = new Point3D(10, 10, 10);
        Point3D pC = new Point3D(30, 30, 20);
        Point3D pD = new Point3D(30, 10, 10);

        points.add(pA);
        points.add(pB);
        points.add(pC);
        points.add(pD);

        Collections.sort(points);

        assertEquals(10, points.get(0).getX());
        assertEquals(10, points.get(0).getY());
        assertEquals(10, points.get(0).getZ());

        assertEquals(30, points.get(1).getX());
        assertEquals(10, points.get(1).getY());
        assertEquals(10, points.get(1).getZ());

        assertEquals(10, points.get(2).getX());
        assertEquals(30, points.get(2).getY());
        assertEquals(20, points.get(2).getZ());

        assertEquals(30, points.get(3).getX());
        assertEquals(30, points.get(3).getY());
        assertEquals(20, points.get(3).getZ());
    }
}