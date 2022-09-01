package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ErrorCount
 */
public class ErrorCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty")

    @JacksonXmlProperty(localName = "empty")

    private Boolean empty;

    public ErrorCount withEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }

    /**
     * 为空。
     * @return empty
     */
    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorCount errorCount = (ErrorCount) o;
        return Objects.equals(this.empty, errorCount.empty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorCount {\n");
        sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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
