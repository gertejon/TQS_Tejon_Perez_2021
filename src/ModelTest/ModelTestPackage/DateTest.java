package ModelTestPackage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import ModelPackage.Date;

public class DateTest {

    static Date date;

    @BeforeAll
    public static void setUp() {
        date = new Date();
    }

    @Test
    public void esTraspasTest() {

        assertTrue(date.esTraspas(2020));
        assertFalse(date.esTraspas(2018));
        assertFalse(date.esTraspas(2019));
        assertFalse(date.esTraspas(2021));
        assertFalse(date.esTraspas(2095));
        assertTrue(date.esTraspas(2080));
        assertTrue(date.esTraspas(0));

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
        assertFalse(date.setDate(0, 0, 0));
        //gener traspas
        assertFalse(date.setDate(0, 1, 2020));
        assertTrue(date.setDate(1, 1, 2020));
        assertTrue(date.setDate(2, 1, 2020));
        assertTrue(date.setDate(30, 1, 2020));
        assertTrue(date.setDate(31, 1, 2020));
        assertFalse(date.setDate(32, 1, 2020));
        //gener no-traspas
        assertFalse(date.setDate(0, 1, 2022));
        assertTrue(date.setDate(1, 1, 2022));
        assertTrue(date.setDate(2, 1, 2022));
        assertTrue(date.setDate(30, 1, 2022));
        assertTrue(date.setDate(31, 1, 2022));
        assertFalse(date.setDate(32, 1, 2022));
        //febrer traspas
        assertFalse(date.setDate(0, 2, 2020));
        assertTrue(date.setDate(1, 2, 2020));
        assertTrue(date.setDate(2, 2, 2020));
        assertTrue(date.setDate(28, 2, 2020));
        assertTrue(date.setDate(29, 2, 2020));
        assertFalse(date.setDate(30, 2, 2020));
        //febrer no-traspas
        assertFalse(date.setDate(0, 2, 2022));
        assertTrue(date.setDate(1, 2, 2022));
        assertTrue(date.setDate(2, 2, 2022));
        assertTrue(date.setDate(27, 2, 2022));
        assertTrue(date.setDate(28, 2, 2022));
        assertFalse(date.setDate(29, 2, 2022));
        //març traspas
        assertFalse(date.setDate(0, 3, 2020));
        assertTrue(date.setDate(1, 3, 2020));
        assertTrue(date.setDate(2, 3, 2020));
        assertTrue(date.setDate(30, 3, 2020));
        assertTrue(date.setDate(31, 3, 2020));
        assertFalse(date.setDate(32, 3, 2020));
        //març no-traspas
        assertFalse(date.setDate(0, 3, 2022));
        assertTrue(date.setDate(1, 3, 2022));
        assertTrue(date.setDate(2, 3, 2022));
        assertTrue(date.setDate(30, 3, 2022));
        assertTrue(date.setDate(31, 3, 2022));
        assertFalse(date.setDate(32, 3, 2022));
        //abril traspas
        assertFalse(date.setDate(0, 4, 2020));
        assertTrue(date.setDate(1, 4, 2020));
        assertTrue(date.setDate(2, 4, 2020));
        assertTrue(date.setDate(29, 4, 2020));
        assertTrue(date.setDate(30, 4, 2020));
        assertFalse(date.setDate(31, 4, 2020));
        //abril no-traspas
        assertFalse(date.setDate(0, 4, 2022));
        assertTrue(date.setDate(1, 4, 2022));
        assertTrue(date.setDate(2, 4, 2022));
        assertTrue(date.setDate(29, 4, 2022));
        assertTrue(date.setDate(30, 4, 2022));
        assertFalse(date.setDate(31, 4, 2022));
        //maig traspas
        assertFalse(date.setDate(0, 5, 2020));
        assertTrue(date.setDate(1, 5, 2020));
        assertTrue(date.setDate(2, 5, 2020));
        assertTrue(date.setDate(30, 5, 2020));
        assertTrue(date.setDate(31, 5, 2020));
        assertFalse(date.setDate(32, 5, 2020));
        //maig no-traspas
        assertFalse(date.setDate(0, 5, 2022));
        assertTrue(date.setDate(1, 5, 2022));
        assertTrue(date.setDate(2, 5, 2022));
        assertTrue(date.setDate(30, 5, 2022));
        assertTrue(date.setDate(31, 5, 2022));
        assertFalse(date.setDate(32, 5, 2022));
        //juny traspas
        assertFalse(date.setDate(0, 6, 2020));
        assertTrue(date.setDate(1, 6, 2020));
        assertTrue(date.setDate(2, 6, 2020));
        assertTrue(date.setDate(29, 6, 2020));
        assertTrue(date.setDate(30, 6, 2020));
        assertFalse(date.setDate(31, 6, 2020));
        //juny no-traspas
        assertFalse(date.setDate(0, 6, 2022));
        assertTrue(date.setDate(1, 6, 2022));
        assertTrue(date.setDate(2, 6, 2022));
        assertTrue(date.setDate(29, 6, 2022));
        assertTrue(date.setDate(30, 6, 2022));
        assertFalse(date.setDate(31, 6, 2022));
        //juiol traspas
        assertFalse(date.setDate(0, 7, 2020));
        assertTrue(date.setDate(1, 7, 2020));
        assertTrue(date.setDate(2, 7, 2020));
        assertTrue(date.setDate(30, 7, 2020));
        assertTrue(date.setDate(31, 7, 2020));
        assertFalse(date.setDate(32, 7, 2020));
        //juliol no-traspas
        assertFalse(date.setDate(0, 7, 2022));
        assertTrue(date.setDate(1, 7, 2022));
        assertTrue(date.setDate(2, 7, 2022));
        assertTrue(date.setDate(30, 7, 2022));
        assertTrue(date.setDate(31, 7, 2022));
        assertFalse(date.setDate(32, 7, 2022));
        //agost traspas
        assertFalse(date.setDate(0, 8, 2020));
        assertTrue(date.setDate(1, 8, 2020));
        assertTrue(date.setDate(2, 8, 2020));
        assertTrue(date.setDate(30, 8, 2020));
        assertTrue(date.setDate(31, 8, 2020));
        assertFalse(date.setDate(32, 8, 2020));
        //agost no-traspas
        assertFalse(date.setDate(0, 8, 2022)); /////////////////////////////// CHECKPOINT //////////////////
        assertTrue(date.setDate(1, 8, 2022));
        assertTrue(date.setDate(2, 8, 2022));
        assertTrue(date.setDate(30, 8, 2022));
        assertTrue(date.setDate(31, 8, 2022));
        assertFalse(date.setDate(32, 8, 2022));
        //setembre traspas
        assertFalse(date.setDate(0, 9, 2020));
        assertTrue(date.setDate(1, 9, 2020));
        assertTrue(date.setDate(2, 9, 2020));
        assertTrue(date.setDate(29, 9, 2020));
        assertTrue(date.setDate(30, 9, 2020));
        assertFalse(date.setDate(31, 9, 2020));
        //setembre no-traspas
        assertFalse(date.setDate(0, 9, 2022));
        assertTrue(date.setDate(1, 9, 2022));
        assertTrue(date.setDate(2, 9, 2022));
        assertTrue(date.setDate(29, 9, 2022));
        assertTrue(date.setDate(30, 9, 2022));
        assertFalse(date.setDate(31, 9, 2022));
        //octubre traspas
        assertFalse(date.setDate(0, 10, 2020));
        assertTrue(date.setDate(1, 10, 2020));
        assertTrue(date.setDate(2, 10, 2020));
        assertTrue(date.setDate(30, 10, 2020));
        assertTrue(date.setDate(31, 10, 2020));
        assertFalse(date.setDate(32, 10, 2020));
        //octubre no-traspas
        assertFalse(date.setDate(0, 8, 2022));
        assertTrue(date.setDate(1, 8, 2022));
        assertTrue(date.setDate(2, 8, 2022));
        assertTrue(date.setDate(30, 8, 2022));
        assertTrue(date.setDate(31, 8, 2022));
        assertFalse(date.setDate(32, 8, 2022));
        //novembre traspas
        assertFalse(date.setDate(0, 11, 2020));
        assertTrue(date.setDate(1, 11, 2020));
        assertTrue(date.setDate(2, 11, 2020));
        assertTrue(date.setDate(29, 11, 2020));
        assertTrue(date.setDate(30, 11, 2020));
        assertFalse(date.setDate(31, 11, 2020));
        //novembre no-traspas
        assertFalse(date.setDate(0, 11, 2022));
        assertTrue(date.setDate(1, 11, 2022));
        assertTrue(date.setDate(2, 11, 2022));
        assertTrue(date.setDate(29, 11, 2022));
        assertTrue(date.setDate(30, 11, 2022));
        assertFalse(date.setDate(31, 11, 2022));
        //desembre traspas
        assertFalse(date.setDate(0, 12, 2020));
        assertTrue(date.setDate(1, 12, 2020));
        assertTrue(date.setDate(2, 12, 2020));
        assertTrue(date.setDate(30, 12, 2020));
        assertTrue(date.setDate(31, 12, 2020));
        assertFalse(date.setDate(32, 12, 2020));
        //desembre no-traspas
        assertFalse(date.setDate(0, 12, 2022));
        assertTrue(date.setDate(1, 12, 2022));
        assertTrue(date.setDate(2, 12, 2022));
        assertTrue(date.setDate(30, 12, 2022));
        assertTrue(date.setDate(31, 12, 2022));
        assertFalse(date.setDate(32, 12, 2022));
        //mes erroni
        assertFalse(date.setDate(0, 13, 0));
    }

}
