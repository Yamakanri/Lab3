import java.util.Objects;

public class Event {
    private final String eventName;


    public Event(String eventName) {

        this.eventName = eventName;
    }


    public void resultEvent(String personState) {
        System.out.println(getEventName() + personState);
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventName());
    }

    @Override
    public String toString() {
        return "EnvironmentObject{" + "name='" + eventName + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventName, event.eventName);
    }
}
