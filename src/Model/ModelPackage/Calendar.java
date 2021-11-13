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
        boolean added = false;
        if(!eventExists(E)) {
            int priority = E.getPriority();
            if(events.isEmpty()) {
                events.add(0, E);
                added = true;
            }
            else {
                for(int i = 0; i< events.size() && !added; i++) { //////////// this must be sorted ////////////
                    if(priority < events.get(i).getPriority()) {
                        events.add(i, E);
                        added = true;
                    }
                    if(i == events.size()-1) {
                        events.add(i + 1, E);
                        added = true;
                    }
                }
            }
        }
        return added;
    }

    public boolean eraseEvent(String N) { //N is event's name
        return false;
    }
}
