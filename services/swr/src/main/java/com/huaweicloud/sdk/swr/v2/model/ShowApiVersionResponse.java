package com.huaweicloud.sdk.swr.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.VersionDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowApiVersionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private VersionDetail version;

    public ShowApiVersionResponse withVersion(VersionDetail version) {
        this.version = version;
        return this;
    }

    public ShowApiVersionResponse withVersion(Consumer<VersionDetail> versionSetter) {
        if(this.version == null ){
            this.version = new VersionDetail();
            versionSetter.accept(this.version);
        }
        
        return this;
    }


    /**
     * Get version
     * @return version
     */
    public VersionDetail getVersion() {
        return version;
    }

    public void setVersion(VersionDetail version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApiVersionResponse showApiVersionResponse = (ShowApiVersionResponse) o;
        return Objects.equals(this.version, showApiVersionResponse.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiVersionResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

