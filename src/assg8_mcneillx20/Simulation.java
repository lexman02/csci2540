/*
 * @author Xavier McNeill
 * Simulates a queue of customers in line at a bank
 */
package assg8_mcneillx20;

import java.util.*;
import java.io.*;

public class Simulation {
    public static void main(String[] args) {
        String filename = "assg8_input.txt";
        int totalProcessed = 1, totalWait = 0;
        Queue<Event> queue = new LinkedList<>();
        EventList eventList = new EventList();
        Scanner inputFile = null;

        try {
            inputFile = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Simulation begins");

        int firstArrival = inputFile.nextInt();
        int firstTransaction = inputFile.nextInt();
        Event firstEvent = new Event(firstArrival, firstTransaction);
        eventList.insert(firstEvent);

        while (!eventList.isEmpty()) {
            Event newEvent = eventList.retrieve();

            if (newEvent.getType() == 'A') {
                totalProcessed += processArrival(newEvent, inputFile, eventList, queue);
            } else {
                totalWait += processDeparture(newEvent, eventList, queue);
            }
        }

        System.out.println("Simulation ends");

        System.out.println("\nFinal Statistics:");
        System.out.println("Total number of people processed:       " + totalProcessed);
        System.out.println("Average of time spent waiting:          " + (double) totalWait / totalProcessed);
    }

    /*
     * Process an event with an arrival type ('A')
     * @param event The event to process
     * @param inputFile The file to read the next arrival and transaction times from
     * @param eventList The event list to insert new events into
     * @param queue The queue to insert new events into
     * @return 1 if a new line is read from the file, 0 otherwise
     */
    public static int processArrival(Event event, Scanner inputFile, EventList eventList, Queue<Event> queue) {
        int i = 0;
        boolean emptyLine = queue.isEmpty();

        queue.add(event);
        eventList.remove();

        if (emptyLine) {
            int time = event.getArrivalTime();
            time += event.getTransactionTime();
            eventList.insert(new Event(time));
        }

        if (inputFile.hasNextLine()) {
            int arrivalTime = inputFile.nextInt();
            int transactionTime = inputFile.nextInt();
            eventList.insert(new Event(arrivalTime, transactionTime));
            i++;
        }

        System.out.println(event);
        return i;
    }

    /*
     * Process an event with a departure type ('D')
     * @param event The event to process
     * @param eventList The event list to insert new events into
     * @param queue The queue to insert new events into
     * @return The time the customer waited in the queue, if any
     */
    public static int processDeparture(Event event, EventList eventList, Queue<Event> queue) {
        int wait = 0;

        queue.remove();
        eventList.remove();

        if (!queue.isEmpty()) {
            int time = event.getDepartureTime();
            wait = time - queue.peek().getArrivalTime();
            time += queue.peek().getTransactionTime();

            eventList.insert(new Event(time));
        }

        System.out.println(event);

        return wait;
    }
}
