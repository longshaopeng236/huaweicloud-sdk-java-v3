package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sa.v1.model.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Events
 */
public class Events  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="events")
    
    private List<Event> events = null;
    
    public Events withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    
    public Events addEventsItem(Event eventsItem) {
        this.events.add(eventsItem);
        return this;
    }

    public Events withEvents(Consumer<List<Event>> eventsSetter) {
        if(this.events == null ){
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * event 批量导入
     * @return events
     */
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Events events = (Events) o;
        return Objects.equals(this.events, events.events);
    }
    @Override
    public int hashCode() {
        return Objects.hash(events);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Events {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

