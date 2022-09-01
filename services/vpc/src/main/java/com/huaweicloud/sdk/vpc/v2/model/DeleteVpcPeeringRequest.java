package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVpcPeeringRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering_id")

    @JacksonXmlProperty(localName = "peering_id")

    private String peeringId;

    public DeleteVpcPeeringRequest withPeeringId(String peeringId) {
        this.peeringId = peeringId;
        return this;
    }

    /**
     * 对等连接ID
     * @return peeringId
     */
    public String getPeeringId() {
        return peeringId;
    }

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteVpcPeeringRequest deleteVpcPeeringRequest = (DeleteVpcPeeringRequest) o;
        return Objects.equals(this.peeringId, deleteVpcPeeringRequest.peeringId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peeringId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVpcPeeringRequest {\n");
        sb.append("    peeringId: ").append(toIndentedString(peeringId)).append("\n");
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
