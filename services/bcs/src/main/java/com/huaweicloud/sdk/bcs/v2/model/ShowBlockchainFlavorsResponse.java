package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBlockchainFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_spec")

    @JacksonXmlProperty(localName = "enterprise_spec")

    private InstanceSpc enterpriseSpec;

    public ShowBlockchainFlavorsResponse withEnterpriseSpec(InstanceSpc enterpriseSpec) {
        this.enterpriseSpec = enterpriseSpec;
        return this;
    }

    public ShowBlockchainFlavorsResponse withEnterpriseSpec(Consumer<InstanceSpc> enterpriseSpecSetter) {
        if (this.enterpriseSpec == null) {
            this.enterpriseSpec = new InstanceSpc();
            enterpriseSpecSetter.accept(this.enterpriseSpec);
        }

        return this;
    }

    /**
     * Get enterpriseSpec
     * @return enterpriseSpec
     */
    public InstanceSpc getEnterpriseSpec() {
        return enterpriseSpec;
    }

    public void setEnterpriseSpec(InstanceSpc enterpriseSpec) {
        this.enterpriseSpec = enterpriseSpec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBlockchainFlavorsResponse showBlockchainFlavorsResponse = (ShowBlockchainFlavorsResponse) o;
        return Objects.equals(this.enterpriseSpec, showBlockchainFlavorsResponse.enterpriseSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlockchainFlavorsResponse {\n");
        sb.append("    enterpriseSpec: ").append(toIndentedString(enterpriseSpec)).append("\n");
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
