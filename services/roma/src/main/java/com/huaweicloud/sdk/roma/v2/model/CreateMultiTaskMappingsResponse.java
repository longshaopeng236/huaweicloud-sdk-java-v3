package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateMultiTaskMappingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    @JacksonXmlProperty(localName = "mapping_id")

    private String mappingId;

    public CreateMultiTaskMappingsResponse withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 映射唯一ID
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMultiTaskMappingsResponse createMultiTaskMappingsResponse = (CreateMultiTaskMappingsResponse) o;
        return Objects.equals(this.mappingId, createMultiTaskMappingsResponse.mappingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mappingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMultiTaskMappingsResponse {\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
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
