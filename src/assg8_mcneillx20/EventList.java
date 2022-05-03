/*
 * @author Xavier McNeill
 * A class to temporarily store events while they are being processed
 */
package assg8_mcneillx20;

import java.util.*;

public class EventList {
    ArrayList<Event> eventList;

    /*
     * Default constructor
     */
    EventList() {
        eventList = new ArrayList<>();
    }

    /*
     * Check if the event list is empty
     * @return True if the event list is empty, false otherwise
     */
    public boolean isEmpty() {
        if (eventList.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Insert an event into the event list in sorted order
     * @param e The event to insert
     */
    public void insert(Event e) {
        if (isEmpty()) {
            eventList.add(e);
        } else {
            // Check if the event needs to be inserted at the beginning of the list
            if (e.compareTo(eventList.get(0)) < 0 || e.compareTo(eventList.get(0)) == 0) {
                eventList.add(0, e);
            } else if (e.compareTo(eventList.get(0)) > 0) {
                eventList.add(e);
            }
        }
    }

    /*
     * Remove the first event from the event list
     */
    public void remove() {
        eventList.remove(0);
    }

    /*
     * Retrieve the first event from the event list
     * @return The first event in the event list
     */
    public Event retrieve() {
        return eventList.get(0);
    }
}
