package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateUserDisclaimerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_disclaimer_record")

    private CreateUserDisclaimerRecord userDisclaimerRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateUserDisclaimerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateUserDisclaimerResponse withUserDisclaimerRecord(CreateUserDisclaimerRecord userDisclaimerRecord) {
        this.userDisclaimerRecord = userDisclaimerRecord;
        return this;
    }

    public CreateUserDisclaimerResponse withUserDisclaimerRecord(
        Consumer<CreateUserDisclaimerRecord> userDisclaimerRecordSetter) {
        if (this.userDisclaimerRecord == null) {
            this.userDisclaimerRecord = new CreateUserDisclaimerRecord();
            userDisclaimerRecordSetter.accept(this.userDisclaimerRecord);
        }

        return this;
    }

    /**
     * Get userDisclaimerRecord
     * @return userDisclaimerRecord
     */
    public CreateUserDisclaimerRecord getUserDisclaimerRecord() {
        return userDisclaimerRecord;
    }

    public void setUserDisclaimerRecord(CreateUserDisclaimerRecord userDisclaimerRecord) {
        this.userDisclaimerRecord = userDisclaimerRecord;
    }

    public CreateUserDisclaimerResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserDisclaimerResponse that = (CreateUserDisclaimerResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.userDisclaimerRecord, that.userDisclaimerRecord)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, userDisclaimerRecord, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserDisclaimerResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    userDisclaimerRecord: ").append(toIndentedString(userDisclaimerRecord)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
