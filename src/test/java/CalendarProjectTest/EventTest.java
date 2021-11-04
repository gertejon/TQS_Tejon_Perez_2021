package CalendarProjectTest;
import CalendarProject.Date;
import org.junit.jupiter.api.Test;
import CalendarProject.Event;

import static org.junit.jupiter.api.Assertions.*;


public class EventTest {
    Event event;

    @Test
    public void getNameTest() {
        event = new Event();
        event.setName("nom");
        assertEquals(event.getName(),"nom");
    }

    @Test
    public void setNameTest() {
        event = new Event();
        event.setName("nom2");
        assertEquals(event.getName(),"nom2");
    }

    @Test
    public void getDescTest() {
        event = new Event();
        event.setDesc("Desc");
        assertEquals(event.getDesc(),"Desc");
    }

    @Test
    public void setDescTest() {
        event = new Event();
        event.setDesc("Desc1");
        assertEquals(event.getDesc(),"Desc1");
    }

    @Test
    public void getPriorityTest() {
        event = new Event();
        event.setPriority(1);
        assertEquals(event.getPriority(),1);
    }

    @Test
    public void setPriorityTest() {
        event = new Event();
        event.setPriority(2);
        assertEquals(event.getPriority(),2);
    }

    @Test
    public void getDateTest() {
        event = new Event();
        Date dt = new Date(12, 5, 2020);
        Date dt2 = new Date(45, 5, 2016);
        event.setDate(dt);
        assertEquals(event.getDate(), dt);
        assertNotEquals(event.getDate(), dt2);
    }

    @Test
    public void setDateTest() {
        event = new Event();
        Date dt = new Date(16, 9, 2018);
        Date dt2 = new Date(74, 8, 2015);
        event.setDate(dt);
        assertEquals(event.getDate(), dt);
        assertNotEquals(event.getDate(), dt2);
    }

}
