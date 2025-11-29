package questions;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentTest {

    @Test
    void testStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new CSStudent(15));
        students.add(new CSStudent(20));
        students.add(new NSStudent(5));
        students.add(new NSStudent(15));

        assertFalse(students.get(0).pass());
        assertTrue(students.get(1).pass());
        assertFalse(students.get(2).pass());
        assertTrue(students.get(3).pass());
    }
}