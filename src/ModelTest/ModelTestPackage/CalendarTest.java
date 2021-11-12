package ModelTestPackage;

import ModelPackage.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ModelPackage.Event;
import ModelPackage.Calendar;

import static org.junit.jupiter.api.Assertions.*;

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
        //creating aux event, which is the same as event E1
        Event E4 = new Event("event1", "this is event1", 1, D1);

        //testing
        //adding events
        assertTrue(calendar.addEvent(E1));
        assertTrue(calendar.addEvent(E2));
        assertTrue(calendar.addEvent(E3));
        assertFalse(calendar.addEvent(E4)); //E4 can't be added, function must return null value

        //checking if events are ordered by priority
        assertEquals(calendar.getEvents().get(0), E1);
        assertEquals(calendar.getEvents().get(1), E3);
        assertEquals(calendar.getEvents().get(2), E2);

        //checking if events are saved correctly
        assertNull(calendar.getEvent(E4));
        assertEquals(calendar.getEvent(E1), E1);
        assertEquals(calendar.getEvent(E2), E2);
        assertEquals(calendar.getEvent(E3), E3);

        //trying to add events again
        assertFalse(calendar.addEvent(E1));
        assertFalse(calendar.addEvent(E2));
        assertFalse(calendar.addEvent(E3));
        assertFalse(calendar.addEvent(E4));
    }

    @Test
    public void eraseEventTest() {

    }

}
