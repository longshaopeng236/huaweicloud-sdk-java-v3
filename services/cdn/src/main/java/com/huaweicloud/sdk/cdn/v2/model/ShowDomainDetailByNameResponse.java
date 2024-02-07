package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainDetailByNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private DomainsDetail domain;

    public ShowDomainDetailByNameResponse withDomain(DomainsDetail domain) {
        this.domain = domain;
        return this;
    }

    public ShowDomainDetailByNameResponse withDomain(Consumer<DomainsDetail> domainSetter) {
        if (this.domain == null) {
            this.domain = new DomainsDetail();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public DomainsDetail getDomain() {
        return domain;
    }

    public void setDomain(DomainsDetail domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainDetailByNameResponse that = (ShowDomainDetailByNameResponse) obj;
        return Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainDetailByNameResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
