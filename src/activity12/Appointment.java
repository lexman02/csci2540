package activity12;

public class Appointment extends KeyedItem<Date> {
    String description;

    public Appointment(Date key, String description) {
        super(key);
        this.description = description;
    }

    @Override
    public String toString() {
        return super.getKey() + " " + description;
    }
}
