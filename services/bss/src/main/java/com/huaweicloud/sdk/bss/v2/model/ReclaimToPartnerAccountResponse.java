package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ReclaimToPartnerAccountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_id")

    @JacksonXmlProperty(localName = "trans_id")

    private String transId;

    public ReclaimToPartnerAccountResponse withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    /**
     * 事务流水ID，只有成功响应才会返回。
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReclaimToPartnerAccountResponse reclaimToPartnerAccountResponse = (ReclaimToPartnerAccountResponse) o;
        return Objects.equals(this.transId, reclaimToPartnerAccountResponse.transId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimToPartnerAccountResponse {\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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
