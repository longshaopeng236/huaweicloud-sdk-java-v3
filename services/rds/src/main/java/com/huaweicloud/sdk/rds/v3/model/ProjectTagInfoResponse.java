package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 项目标签信息。
 */
public class ProjectTagInfoResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private List<String> values = null;
    
    public ProjectTagInfoResponse withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签键。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ProjectTagInfoResponse withValues(List<String> values) {
        this.values = values;
        return this;
    }

    
    public ProjectTagInfoResponse addValuesItem(String valuesItem) {
        this.values.add(valuesItem);
        return this;
    }

    public ProjectTagInfoResponse withValues(Consumer<List<String>> valuesSetter) {
        if(this.values == null ){
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 标签值列表。
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectTagInfoResponse projectTagInfoResponse = (ProjectTagInfoResponse) o;
        return Objects.equals(this.key, projectTagInfoResponse.key) &&
            Objects.equals(this.values, projectTagInfoResponse.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectTagInfoResponse {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

