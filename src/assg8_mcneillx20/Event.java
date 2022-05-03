/*
 * @author Xavier McNeill
 * A class for arrival and departure event objects
 */
package assg8_mcneillx20;

public class Event implements Comparable<Event> {
    private char type;
    private int arrivalTime;
    private int transactionTime;
    private int departureTime;

    /*
     * Arrival event constructor
     */
    public Event(int arrivalTime, int transactionTime) {
        this.type = 'A';
        this.arrivalTime = arrivalTime;
        this.transactionTime = transactionTime;
    }

    /*
     * Departure event constructor
     */
    public Event(int departureTime) {
        this.type = 'D';
        this.departureTime = departureTime;
    }

    /*
     * Get the type of the event
     * @return Type of the event
     */
    public char getType() {
        return type;
    }

    /*
     * Get the arrival time of the event
     * @return Arrival time of the event
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /*
     * Get the transaction time of the event
     * @return Transaction time of the event
     */
    public int getTransactionTime() {
        return transactionTime;
    }

    /*
     * Get the departure time of the event
     * @return Departure time of the event
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /*
     * Compare this events time to another events time
     * @param e The event to compare to
     * @return -1 if this event is before the other, 0 if they are the same, or 1 if this event is after the other
     */
    @Override
    public int compareTo(Event e) {
        // Check if the current event type is an arrival
        if (this.type == 'A') {
            // Check if the other event type is an arrival
            if (e.type == 'A') {
                // Compare the current arrival time with the other arrival time
                if (this.arrivalTime < e.arrivalTime) {
                    return -1;
                } else if (this.arrivalTime > e.arrivalTime) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                // Compare the current arrival time with the other departure time
                if (this.arrivalTime < e.departureTime) {
                    return -1;
                } else if (this.arrivalTime > e.departureTime) {
                    return 1;
                } else {
                    return 0;
                }
            }
        } else {
            // Check if the other event type is an arrival
            if (e.type == 'A') {
                // Compare the current departure time with the other arrival time
                if (this.departureTime < e.arrivalTime) {
                    return -1;
                } else if (this.departureTime > e.arrivalTime) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                // Compare the current departure time with the other departure time
                if (this.departureTime < e.departureTime) {
                    return -1;
                } else if (this.departureTime > e.departureTime) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /*
     * Return a formatted string representation of the events type and time
     * @return Formatted string representation of the events type and time
     */
    @Override
    public String toString() {
        if (type == 'A') {
            return "Processing an arrival event at time:    " + arrivalTime;
        } else {
            return "Processing a departure event at time:   " + departureTime;
        }
    }
}
