package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddOrRemoveServicePermissionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_service_id")

    @JacksonXmlProperty(localName = "vpc_endpoint_service_id")

    private String vpcEndpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private AddOrRemoveServicePermissionsRequestBody body;

    public AddOrRemoveServicePermissionsRequest withVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
        return this;
    }

    /**
     * 终端节点服务的ID。
     * @return vpcEndpointServiceId
     */
    public String getVpcEndpointServiceId() {
        return vpcEndpointServiceId;
    }

    public void setVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    public AddOrRemoveServicePermissionsRequest withBody(AddOrRemoveServicePermissionsRequestBody body) {
        this.body = body;
        return this;
    }

    public AddOrRemoveServicePermissionsRequest withBody(
        Consumer<AddOrRemoveServicePermissionsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddOrRemoveServicePermissionsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddOrRemoveServicePermissionsRequestBody getBody() {
        return body;
    }

    public void setBody(AddOrRemoveServicePermissionsRequestBody body) {
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
        AddOrRemoveServicePermissionsRequest addOrRemoveServicePermissionsRequest =
            (AddOrRemoveServicePermissionsRequest) o;
        return Objects.equals(this.vpcEndpointServiceId, addOrRemoveServicePermissionsRequest.vpcEndpointServiceId)
            && Objects.equals(this.body, addOrRemoveServicePermissionsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcEndpointServiceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrRemoveServicePermissionsRequest {\n");
        sb.append("    vpcEndpointServiceId: ").append(toIndentedString(vpcEndpointServiceId)).append("\n");
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
