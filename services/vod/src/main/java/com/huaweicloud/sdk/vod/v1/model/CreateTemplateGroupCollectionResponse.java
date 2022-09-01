package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateTemplateGroupCollectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_collection_id")

    @JacksonXmlProperty(localName = "group_collection_id")

    private String groupCollectionId;

    public CreateTemplateGroupCollectionResponse withGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
        return this;
    }

    /**
     * 模板组集合ID<br/> 
     * @return groupCollectionId
     */
    public String getGroupCollectionId() {
        return groupCollectionId;
    }

    public void setGroupCollectionId(String groupCollectionId) {
        this.groupCollectionId = groupCollectionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemplateGroupCollectionResponse createTemplateGroupCollectionResponse =
            (CreateTemplateGroupCollectionResponse) o;
        return Objects.equals(this.groupCollectionId, createTemplateGroupCollectionResponse.groupCollectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupCollectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateGroupCollectionResponse {\n");
        sb.append("    groupCollectionId: ").append(toIndentedString(groupCollectionId)).append("\n");
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
