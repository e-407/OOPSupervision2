package questions;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StudentMarksTest {

    @Test
    public void testMedianAndTopPercent() {
        StudentMarks studentMarks = new StudentMarks();

        studentMarks.add("A", 10);
        studentMarks.add("B", 20);
        studentMarks.add("C", 30);
        studentMarks.add("D", 40);
        studentMarks.add("E", 50);
        studentMarks.add("F", 60);

        assertEquals(35.0, studentMarks.getMedianMark());

        List<String> topStudents = studentMarks.getTopPPercent(50);
        assertEquals(3, topStudents.size());
        assertEquals("F", topStudents.get(0));
        assertEquals("E", topStudents.get(1));
        assertEquals("D", topStudents.get(2));
    }
}