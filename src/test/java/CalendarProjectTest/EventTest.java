package CalendarProjectTest;
import org.junit.Test;
import java.util.Date;
import CalendarProject.Event;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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


}
