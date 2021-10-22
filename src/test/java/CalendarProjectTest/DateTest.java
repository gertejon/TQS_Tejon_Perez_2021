package CalendarProjectTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import CalendarProject.Date;

public class DateTest {

    static Date date;

    @BeforeAll
    public static void setUp() {
        date = new Date();
    }

    @Test
    public void esTraspasTest() {


        assertEquals(date.esTraspas(2020), true);
        assertEquals(date.esTraspas(2018), false);
        assertEquals(date.esTraspas(2019), false);
        assertEquals(date.esTraspas(2021), false);
        assertEquals(date.esTraspas(2095), false);
        assertEquals(date.esTraspas(2080), true);

    }

    @Test
    public void daysMonthTest() {
        int anyTraspas = 2020;
        int anyNoTraspas = 2018;

        assertEquals(date.daysMonth(1, anyTraspas), 31);
        assertEquals(date.daysMonth(2, anyTraspas), 29);
        assertEquals(date.daysMonth(3, anyTraspas), 31);
        assertEquals(date.daysMonth(4, anyTraspas), 30);
        assertEquals(date.daysMonth(5, anyTraspas), 31);
        assertEquals(date.daysMonth(6, anyTraspas), 30);
        assertEquals(date.daysMonth(7, anyTraspas), 31);
        assertEquals(date.daysMonth(8, anyTraspas), 31);
        assertEquals(date.daysMonth(9, anyTraspas), 30);
        assertEquals(date.daysMonth(10, anyTraspas), 31);
        assertEquals(date.daysMonth(11, anyTraspas), 30);
        assertEquals(date.daysMonth(12, anyTraspas), 31);

        assertEquals(date.daysMonth(1, anyNoTraspas), 31);
        assertEquals(date.daysMonth(2, anyNoTraspas), 28);
        assertEquals(date.daysMonth(3, anyNoTraspas), 31);
        assertEquals(date.daysMonth(4, anyNoTraspas), 30);
        assertEquals(date.daysMonth(5, anyNoTraspas), 31);
        assertEquals(date.daysMonth(6, anyNoTraspas), 30);
        assertEquals(date.daysMonth(7, anyNoTraspas), 31);
        assertEquals(date.daysMonth(8, anyNoTraspas), 31);
        assertEquals(date.daysMonth(9, anyNoTraspas), 30);
        assertEquals(date.daysMonth(10, anyNoTraspas), 31);
        assertEquals(date.daysMonth(11, anyNoTraspas), 30);
        assertEquals(date.daysMonth(12, anyNoTraspas), 31);
    }

    @Test
    public void setDateTest() {
        date = new Date();


    }

}
