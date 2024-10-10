package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWhiteBlackIpRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<BwListIps> ips = null;

    public ListWhiteBlackIpRuleResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWhiteBlackIpRuleResponse withIps(List<BwListIps> ips) {
        this.ips = ips;
        return this;
    }

    public ListWhiteBlackIpRuleResponse addIpsItem(BwListIps ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public ListWhiteBlackIpRuleResponse withIps(Consumer<List<BwListIps>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * 名单列表
     * @return ips
     */
    public List<BwListIps> getIps() {
        return ips;
    }

    public void setIps(List<BwListIps> ips) {
        this.ips = ips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWhiteBlackIpRuleResponse that = (ListWhiteBlackIpRuleResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.ips, that.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhiteBlackIpRuleResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
