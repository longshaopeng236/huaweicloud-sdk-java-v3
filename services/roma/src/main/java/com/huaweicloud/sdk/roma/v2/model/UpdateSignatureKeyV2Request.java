package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.SignatureReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateSignatureKeyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_id")
    
    private String signId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private SignatureReq body = null;

    public UpdateSignatureKeyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateSignatureKeyV2Request withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    


    /**
     * Get signId
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public UpdateSignatureKeyV2Request withBody(SignatureReq body) {
        this.body = body;
        return this;
    }

    public UpdateSignatureKeyV2Request withBody(Consumer<SignatureReq> bodySetter) {
        if(this.body == null ){
            this.body = new SignatureReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SignatureReq getBody() {
        return body;
    }

    public void setBody(SignatureReq body) {
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
        UpdateSignatureKeyV2Request updateSignatureKeyV2Request = (UpdateSignatureKeyV2Request) o;
        return Objects.equals(this.instanceId, updateSignatureKeyV2Request.instanceId) &&
            Objects.equals(this.signId, updateSignatureKeyV2Request.signId) &&
            Objects.equals(this.body, updateSignatureKeyV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, signId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSignatureKeyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
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

