package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待创建云服务器的网卡信息。
 */
public class PostPaidServerNic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    @JacksonXmlProperty(localName = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    @JacksonXmlProperty(localName = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    @JacksonXmlProperty(localName = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth")

    @JacksonXmlProperty(localName = "ipv6_bandwidth")

    private PostPaidServerIpv6Bandwidth ipv6Bandwidth;

    public PostPaidServerNic withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 待创建云服务器所在的子网信息，需要指定vpcid对应VPC下的子网ID，UUID格式。  可以通过VPC服务 [查询子网](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=VPC&api=ListSubnets) 接口查询，该接口支持通过创建云服务器填写的vpcid进行过滤查询。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public PostPaidServerNic withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 待创建云服务器网卡的IP地址，IPv4格式。  约束：  - 不填或空字符串，默认在子网（subnet）中自动分配一个未使用的IP作网卡的IP地址。 - 若指定IP地址，该IP地址必须在子网（subnet）对应的网段内，且未被使用。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public PostPaidServerNic withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否支持ipv6。  取值为true时，标识此网卡支持ipv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public PostPaidServerNic withIpv6Bandwidth(PostPaidServerIpv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }

    public PostPaidServerNic withIpv6Bandwidth(Consumer<PostPaidServerIpv6Bandwidth> ipv6BandwidthSetter) {
        if (this.ipv6Bandwidth == null) {
            this.ipv6Bandwidth = new PostPaidServerIpv6Bandwidth();
            ipv6BandwidthSetter.accept(this.ipv6Bandwidth);
        }

        return this;
    }

    /**
     * Get ipv6Bandwidth
     * @return ipv6Bandwidth
     */
    public PostPaidServerIpv6Bandwidth getIpv6Bandwidth() {
        return ipv6Bandwidth;
    }

    public void setIpv6Bandwidth(PostPaidServerIpv6Bandwidth ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerNic postPaidServerNic = (PostPaidServerNic) o;
        return Objects.equals(this.subnetId, postPaidServerNic.subnetId)
            && Objects.equals(this.ipAddress, postPaidServerNic.ipAddress)
            && Objects.equals(this.ipv6Enable, postPaidServerNic.ipv6Enable)
            && Objects.equals(this.ipv6Bandwidth, postPaidServerNic.ipv6Bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress, ipv6Enable, ipv6Bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerNic {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6Bandwidth: ").append(toIndentedString(ipv6Bandwidth)).append("\n");
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
