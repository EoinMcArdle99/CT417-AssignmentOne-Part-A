package college;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    @Test public void studentUserName() {
        Student student = new Student("Eoin McArdle", 21, "05/12/1999", 18413686, null, null);
        assertEquals("Username should be generated", "Eoin McArdle05/12/1999", student.getUsername());
    }
}
