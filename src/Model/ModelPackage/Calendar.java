package ModelPackage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ModelPackage.Event;

public class Calendar {

    private final List<Event> events = new ArrayList<Event>();
    String fileName = "./src/model/DB.txt";
    FileWriter DB;
    File dataBase = new File(fileName);

    public void updateDB() throws IOException {
        //deleting old DB
        try {
            Files.delete(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //creating new FileWriter
        DB = new FileWriter(fileName);

        //loop that writes events in the DB
        for (Event event : events) {
            //saving event's members in variables
            String name = event.getName();
            String desc = event.getDesc();
            int priority = event.getPriority();
            Date date = event.getDate();

            String line = name + "|" + desc + "|" + priority + "|" + date.toString();

            DB.write(line);
            DB.write("\n");
        }
        DB.close();

    }

    public void getDBstate() throws IOException {
        FileReader fr = new FileReader(dataBase);
        BufferedReader br = new BufferedReader(fr);
        String line = "";

        while((line = br.readLine()) != null) {
            Event e = processLine(line);
            addEvent(e);
        }
    }

    public boolean separator(char c) {
        return(c == '|');
    }

    public Event processLine(String line) {

    }

    public List<Event> getEvents() {
        return events;
    }

    public Event getEvent(Event E) {
        Event found = null;
        for (Event event : events) {
            if (event == E) {
                found = event;
            }
        }
        return found;
    }

    public int getEventIndex(String name) {
        int pos = -1; //will return this if not found
        for (int i = 0; i < events.size(); i++) {
            if(Objects.equals(events.get(i).getName(), name)) {
                pos = i;
            }
        }
        return pos;
    }

    public boolean eventExists(String name) {
        boolean found = false;
        for (Event event : events) {
            if (Objects.equals(event.getName(), name)) {
                found = true;
            }
        }
        return found;
    }

    public boolean addEvent(Event E) throws IOException { //sorted by event's priority
        boolean added = false;

        if(E.validEvent()) {
            if(!eventExists(E.getName())) {
                int priority = E.getPriority();
                if(events.isEmpty()) {
                    events.add(0, E);
                    added = true;
                    updateDB();
                }
                else {
                    for(int i = 0; i< events.size() && !added; i++) {
                        if(priority < events.get(i).getPriority()) {
                            events.add(i, E);
                            added = true;
                            updateDB();
                        }
                        if(i == events.size()-1) {
                            events.add(i + 1, E);
                            added = true;
                            updateDB();
                        }
                    }
                }
            }
        }

        return added;
    }

    public boolean eraseEvent(String N) throws IOException { //N is event's name
        boolean erased = false;
        if(eventExists(N)) {
            int index = getEventIndex(N);
            events.remove(index);
            erased = true;
            updateDB();
        }
        return erased;
    }
}
