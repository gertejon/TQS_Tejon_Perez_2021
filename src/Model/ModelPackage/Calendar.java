package ModelPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ModelPackage.Event;

public class Calendar {

    private final List<Event> events = new ArrayList<Event>();


    public List<Event> getEvents() {return events;}

    public Event getEvent(Event E) {
        Event found = null;
        for (Event event : events) {
            if (event == E) {
                found = event;
            }
        }
        return found;
    }

    public boolean eventExists(Event E) {
        boolean found = false;
        for (Event event : events) {
            if (Objects.equals(event.getName(), E.getName())) {
                found = true;
            }
        }
        return found;
    }

    public boolean addEvent(Event E) { //sorted by event's priority
        return false;
    }

    public boolean eraseEvent(String N) { //N is event's name
        return false;
    }
}
