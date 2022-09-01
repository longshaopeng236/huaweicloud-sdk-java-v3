package com.huaweicloud.sdk.nlp.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.LinkedEntity;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunEntityLinkingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    @JacksonXmlProperty(localName = "entities")
    
    private List<LinkedEntity> entities = null;
    
    public RunEntityLinkingResponse withEntities(List<LinkedEntity> entities) {
        this.entities = entities;
        return this;
    }

    
    public RunEntityLinkingResponse addEntitiesItem(LinkedEntity entitiesItem) {
        if(this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public RunEntityLinkingResponse withEntities(Consumer<List<LinkedEntity>> entitiesSetter) {
        if(this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 识别出的实体列表
     * @return entities
     */
    public List<LinkedEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<LinkedEntity> entities) {
        this.entities = entities;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunEntityLinkingResponse runEntityLinkingResponse = (RunEntityLinkingResponse) o;
        return Objects.equals(this.entities, runEntityLinkingResponse.entities);
    }
    @Override
    public int hashCode() {
        return Objects.hash(entities);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunEntityLinkingResponse {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

