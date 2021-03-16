package com.huaweicloud.sdk.functiongraph.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateEventRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_id")
    
    private String eventId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_urn")
    
    private String functionUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateEventRequestBody body;

    public UpdateEventRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    


    /**
     * Get eventId
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    

    public UpdateEventRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    


    /**
     * Get functionUrn
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    

    public UpdateEventRequest withBody(UpdateEventRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEventRequest withBody(Consumer<UpdateEventRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateEventRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateEventRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEventRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEventRequest updateEventRequest = (UpdateEventRequest) o;
        return Objects.equals(this.eventId, updateEventRequest.eventId) &&
            Objects.equals(this.functionUrn, updateEventRequest.functionUrn) &&
            Objects.equals(this.body, updateEventRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eventId, functionUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventRequest {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

