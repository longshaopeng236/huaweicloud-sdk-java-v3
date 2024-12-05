package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePeerLinkRequestBody
 */
public class CreatePeerLinkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_link")

    private CreatePeerLinkRequestBodyPeerLink peerLink;

    public CreatePeerLinkRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 空运行 - true 是 - false 否
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreatePeerLinkRequestBody withPeerLink(CreatePeerLinkRequestBodyPeerLink peerLink) {
        this.peerLink = peerLink;
        return this;
    }

    public CreatePeerLinkRequestBody withPeerLink(Consumer<CreatePeerLinkRequestBodyPeerLink> peerLinkSetter) {
        if (this.peerLink == null) {
            this.peerLink = new CreatePeerLinkRequestBodyPeerLink();
            peerLinkSetter.accept(this.peerLink);
        }

        return this;
    }

    /**
     * Get peerLink
     * @return peerLink
     */
    public CreatePeerLinkRequestBodyPeerLink getPeerLink() {
        return peerLink;
    }

    public void setPeerLink(CreatePeerLinkRequestBodyPeerLink peerLink) {
        this.peerLink = peerLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePeerLinkRequestBody that = (CreatePeerLinkRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.peerLink, that.peerLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, peerLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePeerLinkRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    peerLink: ").append(toIndentedString(peerLink)).append("\n");
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
