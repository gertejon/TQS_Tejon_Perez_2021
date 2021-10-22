package CalendarProjectTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import CalendarProject.Date;

public class DateTest {
    Date date;

    @Test
    public void esTraspasTest() {
        date = new Date();

        assertEquals(date.esTraspas(2020), true);
        assertEquals(date.esTraspas(2018), false);
        assertEquals(date.esTraspas(2019), false);
        assertEquals(date.esTraspas(2021), false);
        assertEquals(date.esTraspas(2095), false);
        assertEquals(date.esTraspas(2080), true);

    }

    @Test
    public void setDateTest() {
        date = new Date();


    }

}
