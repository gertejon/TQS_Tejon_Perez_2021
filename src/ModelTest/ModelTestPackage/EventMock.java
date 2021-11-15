package ModelTestPackage;

import ModelPackage.Date;
import ModelPackage.Event;

public class EventMock extends Event {
    public EventMock(String name, String desc, int priority, Date date) {

    }

    public boolean validEvent() {
        return true;
    }
}
