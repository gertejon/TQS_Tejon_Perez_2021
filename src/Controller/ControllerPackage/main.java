package ControllerPackage;

import ModelPackage.Calendar;
import ModelPackage.Event;
import ViewPackage.View;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Calendar calendar = new Calendar();
        calendar.getDBstate();
        Scanner capt = new Scanner(System.in);
        int option = 0;

        while(option != 4) {  ////////// main loop //////////

            View.mainMenu();
            option = capt.nextInt();

            switch (option) {
                case 1: //view events
                    View.upcomingEvents();
                    if(calendar.getEvents().isEmpty()) {
                        View.noEvents();
                    }
                    for (int i = 0; i < calendar.getEvents().size(); i++) {
                        Event E = calendar.getEvents().get(i);
                        String name = E.getName();
                        String desc = E.getDesc();
                        int priority = E.getPriority();
                        String date = E.getDate().toString();

                        View.showEvent(name, desc, priority, date);
                    }
                    View.anyKey();
                    capt.next();
                    break;
                case 2: //create new event
                    boolean added = false;
                    while(!added) {
                        View.createEventTitle();

                        View.askEventsName();
                        String name = capt.next();
                        View.justThis(name);

                        View.askEventsDesc();
                        String desc = capt.next();
                        View.justThis(desc);

                        View.askEventsPriority();
                        int priority = capt.nextInt();
                        View.justThis(Integer.toString(priority));

                        View.askEventsDate();
                        String date = capt.next();
                        View.justThis(date);

                        Event E = new Event(name, desc, priority, date);
                        added = calendar.addEvent(E);
                        if(!added) {
                            View.eventNotValid();
                        }
                    }
                    break;
                case 3: //delete event
                    if(calendar.getEvents().size() == 0) {
                        View.noEvents();
                    }
                    else {
                        boolean erased = false;
                        while(!erased) {
                            View.deleteEventTitle();
                            String name = capt.next();
                            erased = calendar.eraseEvent(name);
                            if(!erased) {
                                View.cantErase();
                            }
                            else {
                                View.deletedSuccessfully(name);
                            }
                        }
                    }
                    break;
                case 4: //exit
                    View.exit();
                    break;
                default:
                    View.invalidOption();
            }
        }
    }

}
