package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCloudPhoneDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    @JacksonXmlProperty(localName = "phone_id")

    private String phoneId;

    public ShowCloudPhoneDetailRequest withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机id。
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCloudPhoneDetailRequest showCloudPhoneDetailRequest = (ShowCloudPhoneDetailRequest) o;
        return Objects.equals(this.phoneId, showCloudPhoneDetailRequest.phoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneDetailRequest {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
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
