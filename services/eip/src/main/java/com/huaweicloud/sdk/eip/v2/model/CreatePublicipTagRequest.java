package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePublicipTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    @JacksonXmlProperty(localName = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreatePublicipTagRequestBody body;

    public CreatePublicipTagRequest withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 资源ID
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public CreatePublicipTagRequest withBody(CreatePublicipTagRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePublicipTagRequest withBody(Consumer<CreatePublicipTagRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePublicipTagRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePublicipTagRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePublicipTagRequestBody body) {
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
        CreatePublicipTagRequest createPublicipTagRequest = (CreatePublicipTagRequest) o;
        return Objects.equals(this.publicipId, createPublicipTagRequest.publicipId)
            && Objects.equals(this.body, createPublicipTagRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicipTagRequest {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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
