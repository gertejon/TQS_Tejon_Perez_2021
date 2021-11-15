package ViewPackage;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void mainMenu() {
        clearScreen();
        System.out.println("------------ CALENDAR SOFTWARE ------------");
        System.out.println("Please, select one option:");
        System.out.println("1. View upcoming events");
        System.out.println("2. Create a new event");
        System.out.println("3. Delete an event");
        System.out.println("4. Exit");
        System.out.println("-------------------------------------------");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void invalidOption() throws InterruptedException {
        clearScreen();
        System.out.println("Option is not valid, must be an integer between 1 and 4.");
        Thread.sleep(3000);
    }
    public static void upcomingEvents() {
        System.out.println("This are the upcoming events:");
        System.out.println("");
    }

    public static void showEvent(String name, String desc, int priority, String date) {
        System.out.println("Name: " + name);
        System.out.println("Description: " + desc);
        System.out.println("Priority: " + priority);
        System.out.println("Date: " + date);
        System.out.println("");

    }

    public static void createEventTitle() {
        clearScreen();
        System.out.println("Creating new event...");
        System.out.println("");
    }
    public static void askEventsName() {
        System.out.print("Enter event's name: ");
    }

    public static void askEventsDesc() {
        System.out.print("Enter event's description: ");
    }

    public static void askEventsPriority() {
        System.out.print("Enter event's priority: ");
    }

    public static void askEventsDate() {
        System.out.print("Enter event's date: ");
    }

    public static void eventNotValid() {
        System.out.println("Could not create event.");
        System.out.println("Event's name can't be empty, priority can't be 0 or below and date must be a valid date (dd/mm/yyyy)");
    }

    public static void justThis(String that) {
        System.out.println(that);
    }

    public static void deleteEventTitle() {
        clearScreen();
        System.out.print("Please, write event's name you want to delete: ");
    }

    public static void cantErase() throws InterruptedException {
        clearScreen();
        System.out.println("Event could not be erased. Please, make sure event's name is correct.");
        Thread.sleep(3000);
    }

    public static void noEvents() throws InterruptedException {
        clearScreen();
        System.out.println("There are no events in the calendar.");
        Thread.sleep(3000);
    }

    public static void deletedSuccessfully(String name) throws InterruptedException {
        clearScreen();
        System.out.println("Event " + name + " was deleted succesfully.");
        Thread.sleep(3000);
    }

    public static void exit() throws InterruptedException {
        clearScreen();
        System.out.println("Exiting... See you soon!");
        Thread.sleep(3000);
    }

    public static void anyKey() {
        System.out.println("Press any key to go back to the main menu.");
        System.out.println("");
    }

    /*public void printMenu2() {
        System.out.print("Enter event's name: ");
        String name = capt.nextLine();
        System.out.println(name);

        System.out.print("Enter event's description: ");
        String desc = capt.nextLine();
        System.out.println(desc);

        System.out.print("Enter event's priority: ");
        int priority = capt.nextInt();
        System.out.println(priority);

        System.out.print("Enter event's date: ");
        String date = capt.nextLine();
        System.out.println(date);
    }*/
}
