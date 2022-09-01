package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateResponseHeaderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    @JacksonXmlProperty(localName = "headers")

    private HeaderMap headers;

    public UpdateResponseHeaderResponse withHeaders(HeaderMap headers) {
        this.headers = headers;
        return this;
    }

    public UpdateResponseHeaderResponse withHeaders(Consumer<HeaderMap> headersSetter) {
        if (this.headers == null) {
            this.headers = new HeaderMap();
            headersSetter.accept(this.headers);
        }

        return this;
    }

    /**
     * Get headers
     * @return headers
     */
    public HeaderMap getHeaders() {
        return headers;
    }

    public void setHeaders(HeaderMap headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResponseHeaderResponse updateResponseHeaderResponse = (UpdateResponseHeaderResponse) o;
        return Objects.equals(this.headers, updateResponseHeaderResponse.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResponseHeaderResponse {\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
