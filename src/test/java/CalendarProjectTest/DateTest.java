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
        assertEquals(date.esTraspas(0), true);

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
        //mes erroni
        assertEquals(date.setDate(0, 0, 0), false);
        //gener traspas
        assertEquals(date.setDate(0, 1, 2020), false);
        assertEquals(date.setDate(1, 1, 2020), true);
        assertEquals(date.setDate(2, 1, 2020), true);
        assertEquals(date.setDate(30, 1, 2020), true);
        assertEquals(date.setDate(31, 1, 2020), true);
        assertEquals(date.setDate(32, 1, 2020), false);
        //gener no-traspas
        assertEquals(date.setDate(0, 1, 2022), false);
        assertEquals(date.setDate(1, 1, 2022), true);
        assertEquals(date.setDate(2, 1, 2022), true);
        assertEquals(date.setDate(30, 1, 2022), true);
        assertEquals(date.setDate(31, 1, 2022), true);
        assertEquals(date.setDate(32, 1, 2022), false);
        //febrer traspas
        assertEquals(date.setDate(0, 2, 2020), false);
        assertEquals(date.setDate(1, 2, 2020), true);
        assertEquals(date.setDate(2, 2, 2020), true);
        assertEquals(date.setDate(28, 2, 2020), true);
        assertEquals(date.setDate(29, 2, 2020), true);
        assertEquals(date.setDate(30, 2, 2020), false);
        //febrer no-traspas
        assertEquals(date.setDate(0, 2, 2022), false);
        assertEquals(date.setDate(1, 2, 2022), true);
        assertEquals(date.setDate(2, 2, 2022), true);
        assertEquals(date.setDate(27, 2, 2022), true);
        assertEquals(date.setDate(28, 2, 2022), true);
        assertEquals(date.setDate(29, 2, 2022), false);
        //març traspas
        assertEquals(date.setDate(0, 3, 2020), false);
        assertEquals(date.setDate(1, 3, 2020), true);
        assertEquals(date.setDate(2, 3, 2020), true);
        assertEquals(date.setDate(30, 3, 2020), true);
        assertEquals(date.setDate(31, 3, 2020), true);
        assertEquals(date.setDate(32, 3, 2020), false);
        //març no-traspas
        assertEquals(date.setDate(0, 3, 2022), false);
        assertEquals(date.setDate(1, 3, 2022), true);
        assertEquals(date.setDate(2, 3, 2022), true);
        assertEquals(date.setDate(30, 3, 2022), true);
        assertEquals(date.setDate(31, 3, 2022), true);
        assertEquals(date.setDate(32, 3, 2022), false);
        //abril traspas
        assertEquals(date.setDate(0, 4, 2020), false);
        assertEquals(date.setDate(1, 4, 2020), true);
        assertEquals(date.setDate(2, 4, 2020), true);
        assertEquals(date.setDate(29, 4, 2020), true);
        assertEquals(date.setDate(30, 4, 2020), true);
        assertEquals(date.setDate(31, 4, 2020), false);
        //abril no-traspas
        assertEquals(date.setDate(0, 4, 2022), false);
        assertEquals(date.setDate(1, 4, 2022), true);
        assertEquals(date.setDate(2, 4, 2022), true);
        assertEquals(date.setDate(29, 4, 2022), true);
        assertEquals(date.setDate(30, 4, 2022), true);
        assertEquals(date.setDate(31, 4, 2022), false);
        //maig traspas
        assertEquals(date.setDate(0, 5, 2020), false);
        assertEquals(date.setDate(1, 5, 2020), true);
        assertEquals(date.setDate(2, 5, 2020), true);
        assertEquals(date.setDate(30, 5, 2020), true);
        assertEquals(date.setDate(31, 5, 2020), true);
        assertEquals(date.setDate(32, 5, 2020), false);
        //maig no-traspas
        assertEquals(date.setDate(0, 5, 2022), false);
        assertEquals(date.setDate(1, 5, 2022), true);
        assertEquals(date.setDate(2, 5, 2022), true);
        assertEquals(date.setDate(30, 5, 2022), true);
        assertEquals(date.setDate(31, 5, 2022), true);
        assertEquals(date.setDate(32, 5, 2022), false);
        //juny traspas
        assertEquals(date.setDate(0, 6, 2020), false);
        assertEquals(date.setDate(1, 6, 2020), true);
        assertEquals(date.setDate(2, 6, 2020), true);
        assertEquals(date.setDate(29, 6, 2020), true);
        assertEquals(date.setDate(30, 6, 2020), true);
        assertEquals(date.setDate(31, 6, 2020), false);
        //juny no-traspas
        assertEquals(date.setDate(0, 6, 2022), false);
        assertEquals(date.setDate(1, 6, 2022), true);
        assertEquals(date.setDate(2, 6, 2022), true);
        assertEquals(date.setDate(29, 6, 2022), true);
        assertEquals(date.setDate(30, 6, 2022), true);
        assertEquals(date.setDate(31, 6, 2022), false);
        //juiol traspas
        assertEquals(date.setDate(0, 7, 2020), false);
        assertEquals(date.setDate(1, 7, 2020), true);
        assertEquals(date.setDate(2, 7, 2020), true);
        assertEquals(date.setDate(30, 7, 2020), true);
        assertEquals(date.setDate(31, 7, 2020), true);
        assertEquals(date.setDate(32, 7, 2020), false);
        //juliol no-traspas
        assertEquals(date.setDate(0, 7, 2022), false);
        assertEquals(date.setDate(1, 7, 2022), true);
        assertEquals(date.setDate(2, 7, 2022), true);
        assertEquals(date.setDate(30, 7, 2022), true);
        assertEquals(date.setDate(31, 7, 2022), true);
        assertEquals(date.setDate(32, 7, 2022), false);
        //agost traspas
        assertEquals(date.setDate(0, 8, 2020), false);
        assertEquals(date.setDate(1, 8, 2020), true);
        assertEquals(date.setDate(2, 8, 2020), true);
        assertEquals(date.setDate(30, 8, 2020), true);
        assertEquals(date.setDate(31, 8, 2020), true);
        assertEquals(date.setDate(32, 8, 2020), false);
        //agost no-traspas
        assertEquals(date.setDate(0, 8, 2022), false);
        assertEquals(date.setDate(1, 8, 2022), true);
        assertEquals(date.setDate(2, 8, 2022), true);
        assertEquals(date.setDate(30, 8, 2022), true);
        assertEquals(date.setDate(31, 8, 2022), true);
        assertEquals(date.setDate(32, 8, 2022), false);
        //setembre traspas
        assertEquals(date.setDate(0, 9, 2020), false);
        assertEquals(date.setDate(1, 9, 2020), true);
        assertEquals(date.setDate(2, 9, 2020), true);
        assertEquals(date.setDate(29, 9, 2020), true);
        assertEquals(date.setDate(30, 9, 2020), true);
        assertEquals(date.setDate(31, 9, 2020), false);
        //setembre no-traspas
        assertEquals(date.setDate(0, 9, 2022), false);
        assertEquals(date.setDate(1, 9, 2022), true);
        assertEquals(date.setDate(2, 9, 2022), true);
        assertEquals(date.setDate(29, 9, 2022), true);
        assertEquals(date.setDate(30, 9, 2022), true);
        assertEquals(date.setDate(31, 9, 2022), false);
        //octubre traspas
        assertEquals(date.setDate(0, 10, 2020), false);
        assertEquals(date.setDate(1, 10, 2020), true);
        assertEquals(date.setDate(2, 10, 2020), true);
        assertEquals(date.setDate(30, 10, 2020), true);
        assertEquals(date.setDate(31, 10, 2020), true);
        assertEquals(date.setDate(32, 10, 2020), false);
        //octubre no-traspas
        assertEquals(date.setDate(0, 8, 2022), false);
        assertEquals(date.setDate(1, 8, 2022), true);
        assertEquals(date.setDate(2, 8, 2022), true);
        assertEquals(date.setDate(30, 8, 2022), true);
        assertEquals(date.setDate(31, 8, 2022), true);
        assertEquals(date.setDate(32, 8, 2022), false);
        //novembre traspas
        assertEquals(date.setDate(0, 11, 2020), false);
        assertEquals(date.setDate(1, 11, 2020), true);
        assertEquals(date.setDate(2, 11, 2020), true);
        assertEquals(date.setDate(29, 11, 2020), true);
        assertEquals(date.setDate(30, 11, 2020), true);
        assertEquals(date.setDate(31, 11, 2020), false);
        //novembre no-traspas
        assertEquals(date.setDate(0, 11, 2022), false);
        assertEquals(date.setDate(1, 11, 2022), true);
        assertEquals(date.setDate(2, 11, 2022), true);
        assertEquals(date.setDate(29, 11, 2022), true);
        assertEquals(date.setDate(30, 11, 2022), true);
        assertEquals(date.setDate(31, 11, 2022), false);
        //desembre traspas
        assertEquals(date.setDate(0, 12, 2020), false);
        assertEquals(date.setDate(1, 12, 2020), true);
        assertEquals(date.setDate(2, 12, 2020), true);
        assertEquals(date.setDate(30, 12, 2020), true);
        assertEquals(date.setDate(31, 12, 2020), true);
        assertEquals(date.setDate(32, 12, 2020), false);
        //desembre no-traspas
        assertEquals(date.setDate(0, 12, 2022), false);
        assertEquals(date.setDate(1, 12, 2022), true);
        assertEquals(date.setDate(2, 12, 2022), true);
        assertEquals(date.setDate(30, 12, 2022), true);
        assertEquals(date.setDate(31, 12, 2022), true);
        assertEquals(date.setDate(32, 12, 2022), false);
        //mes erroni
        assertEquals(date.setDate(0, 13, 0), false);
    }

}
