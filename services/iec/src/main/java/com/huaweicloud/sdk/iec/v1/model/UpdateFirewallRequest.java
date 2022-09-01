package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFirewallRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_id")

    @JacksonXmlProperty(localName = "firewall_id")

    private String firewallId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFirewallRequestBody body;

    public UpdateFirewallRequest withFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }

    /**
     * 网络ACL ID
     * @return firewallId
     */
    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public UpdateFirewallRequest withBody(UpdateFirewallRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFirewallRequest withBody(Consumer<UpdateFirewallRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFirewallRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFirewallRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFirewallRequestBody body) {
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
        UpdateFirewallRequest updateFirewallRequest = (UpdateFirewallRequest) o;
        return Objects.equals(this.firewallId, updateFirewallRequest.firewallId)
            && Objects.equals(this.body, updateFirewallRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRequest {\n");
        sb.append("    firewallId: ").append(toIndentedString(firewallId)).append("\n");
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
