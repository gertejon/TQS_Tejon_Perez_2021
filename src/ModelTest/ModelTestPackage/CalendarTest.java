package ModelTestPackage;

import ModelPackage.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import ModelPackage.Event;
import ModelPackage.Calendar;

public class CalendarTest {

    static Calendar calendar;

    static Date D1;
    static Date D2;
    static Date D3;

    static Event E1;
    static Event E2;
    static Event E3;


    @BeforeAll
    public static void setUp() {
        calendar = new Calendar();

        D1 = new Date(1, 2, 2003);
        D2 = new Date(3, 5, 2005);
        D3 = new Date(4, 8, 1995);

        E1 = new Event("event1", "this is event1", 1, D1);
        E2 = new Event("event2", "this is event2", 3, D2);
        E3 = new Event("event3", "this is event3", 2, D3);
    }

    @Test
    public void addEventTest() {
        //adding events to calendar
        calendar.addEvent(E1);
        calendar.addEvent(E2);
        calendar.addEvent(E3);

        //testing
        assertEquals(calendar.getEvent(0), E1);
        assertEquals(calendar.getEvent(1), E3);
        assertEquals(calendar.getEvent(2), E2);
    }

    @Test
    public void eraseEventTest() {
        
    }

}
