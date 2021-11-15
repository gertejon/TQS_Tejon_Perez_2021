package ModelTestPackage;

import ModelPackage.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ModelPackage.Event;
import ModelPackage.Calendar;
import ModelTestPackage.EventMock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarTest {

    static Calendar calendar;

    static Date D1;
    static Date D2;
    static Date D3;

    static EventMock E1;
    static EventMock E2;
    static EventMock E3;


    @BeforeAll
    public static void setUp() throws IOException {
        calendar = new Calendar();

        D1 = new Date(1, 2, 2003);
        D2 = new Date(3, 5, 2005);
        D3 = new Date(4, 8, 1995);

        E1 = new EventMock("event1", "this is event1", 1, D1);
        E1.setName("event1");
        E1.setDesc("this is event1");
        E1.setPriority(1);
        E1.setDate(D1);

        E2 = new EventMock("event2", "this is event2", 3, D2);
        E2.setName("event2");
        E2.setDesc("this is event2");
        E2.setPriority(3);
        E2.setDate(D2);

        E3 = new EventMock("event3", "this is event3", 2, D3);
        E3.setName("event3");
        E3.setDesc("this is event3");
        E3.setPriority(2);
        E3.setDate(D3);
    }

    @Test
    public void addEventTest() throws IOException {
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
    public void eraseEventTest() throws IOException {
        Event E4 = new Event("event1", "this is event1", 1, D1);

        //adding events to erase
        calendar.addEvent(E1);
        calendar.addEvent(E2);
        calendar.addEvent(E3);
        calendar.addEvent(E4);

        //trying to erase events
        assertTrue(calendar.eraseEvent("event1"));
        assertTrue(calendar.eraseEvent("event2"));
        assertTrue(calendar.eraseEvent("event3"));
        assertFalse(calendar.eraseEvent("event1"));

        //trying to erase events that are already erased
        assertFalse(calendar.eraseEvent("event1"));
        assertFalse(calendar.eraseEvent("event2"));
        assertFalse(calendar.eraseEvent("event3"));
        assertFalse(calendar.eraseEvent("event1"));

        //trying to erase events that never have been added
        assertFalse(calendar.eraseEvent("event555"));
        assertFalse(calendar.eraseEvent("Event1"));
        assertFalse(calendar.eraseEvent("event"));

        //checking calendar's event list is empty
        assertEquals(calendar.getEvents().size(), 0);
    }

    @Test
    public void processLineTest() {
        String L1 = "event1|desc1|1|24/5/2007";
        Event E1 = calendar.processLine(L1);
        Event E1aux = new Event("event1", "desc1", 1, "24/5/2007");
        assertEquals(E1.getName(), E1aux.getName());
        assertEquals(E1.getDesc(), E1aux.getDesc());
        assertEquals(E1.getPriority(), E1aux.getPriority());
        assertEquals(E1.getDate().getDd(), E1aux.getDate().getDd());
        assertEquals(E1.getDate().getMm(), E1aux.getDate().getMm());
        assertEquals(E1.getDate().getYy(), E1aux.getDate().getYy());
    }

}
