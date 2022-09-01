package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class CreateSecurityGroupRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    @JacksonXmlProperty(localName = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    @JacksonXmlProperty(localName = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethertype")

    @JacksonXmlProperty(localName = "ethertype")

    private String ethertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multiport")

    @JacksonXmlProperty(localName = "multiport")

    private String multiport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ip_prefix")

    @JacksonXmlProperty(localName = "remote_ip_prefix")

    private String remoteIpPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_group_id")

    @JacksonXmlProperty(localName = "remote_group_id")

    private String remoteGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_address_group_id")

    @JacksonXmlProperty(localName = "remote_address_group_id")

    private String remoteAddressGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    @JacksonXmlProperty(localName = "priority")

    private String priority;

    public CreateSecurityGroupRuleOption withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 功能说明：安全组规则所属的安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateSecurityGroupRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：安全组的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecurityGroupRuleOption withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 功能说明：安全组规则的出入控制方向 取值范围：ingress 表示入方向；egress 表示出方向
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public CreateSecurityGroupRuleOption withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    /**
     * 功能说明：IP地址协议类型 取值范围：IPv4，IPv6 约束：不填默认值为IPv4
     * @return ethertype
     */
    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    public CreateSecurityGroupRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 功能说明：协议类型 取值范围：icmp、tcp、udp、icmpv6或IP协议号(0~255) 约束：为空表示支持所有协议。协议为icmpv6时，网络类型应该为IPv6；协议为icmp时，网络类型应该为IPv4
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateSecurityGroupRuleOption withMultiport(String multiport) {
        this.multiport = multiport;
        return this;
    }

    /**
     * 功能说明：端口取值范围 取值范围：支持单端口(80)，连续端口(1-30)以及不连续端口(22,3389,80) 约束：端口值的范围1~65535
     * @return multiport
     */
    public String getMultiport() {
        return multiport;
    }

    public void setMultiport(String multiport) {
        this.multiport = multiport;
    }

    public CreateSecurityGroupRuleOption withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    /**
     * 功能说明：远端IP地址，当direction是egress时为虚拟机访问端的地址，当direction是ingress时为访问虚拟机的地址 取值范围：IP地址，或者cidr格式 约束：与remote_group_id、remote_address_group_id互斥
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    public CreateSecurityGroupRuleOption withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    /**
     * 功能说明：远端安全组ID，表示该安全组内的流量允许或拒绝 取值范围：租户下存在的安全组ID 约束：与remote_ip_prefix，remote_address_group_id功能互斥
     * @return remoteGroupId
     */
    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    public CreateSecurityGroupRuleOption withRemoteAddressGroupId(String remoteAddressGroupId) {
        this.remoteAddressGroupId = remoteAddressGroupId;
        return this;
    }

    /**
     * 功能说明：远端地址组ID 取值范围：租户下存在的地址组ID 约束：与remote_ip_prefix，remote_group_id功能互斥
     * @return remoteAddressGroupId
     */
    public String getRemoteAddressGroupId() {
        return remoteAddressGroupId;
    }

    public void setRemoteAddressGroupId(String remoteAddressGroupId) {
        this.remoteAddressGroupId = remoteAddressGroupId;
    }

    public CreateSecurityGroupRuleOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 功能说明：安全组规则生效策略 取值范围：allow 允许，deny 拒绝 约束：默认值为allow 
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateSecurityGroupRuleOption withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 功能说明：规则在安全组中的优先级 取值范围：1~100，1代表最高优先级 约束：默认值为100
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecurityGroupRuleOption createSecurityGroupRuleOption = (CreateSecurityGroupRuleOption) o;
        return Objects.equals(this.securityGroupId, createSecurityGroupRuleOption.securityGroupId)
            && Objects.equals(this.description, createSecurityGroupRuleOption.description)
            && Objects.equals(this.direction, createSecurityGroupRuleOption.direction)
            && Objects.equals(this.ethertype, createSecurityGroupRuleOption.ethertype)
            && Objects.equals(this.protocol, createSecurityGroupRuleOption.protocol)
            && Objects.equals(this.multiport, createSecurityGroupRuleOption.multiport)
            && Objects.equals(this.remoteIpPrefix, createSecurityGroupRuleOption.remoteIpPrefix)
            && Objects.equals(this.remoteGroupId, createSecurityGroupRuleOption.remoteGroupId)
            && Objects.equals(this.remoteAddressGroupId, createSecurityGroupRuleOption.remoteAddressGroupId)
            && Objects.equals(this.action, createSecurityGroupRuleOption.action)
            && Objects.equals(this.priority, createSecurityGroupRuleOption.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupId,
            description,
            direction,
            ethertype,
            protocol,
            multiport,
            remoteIpPrefix,
            remoteGroupId,
            remoteAddressGroupId,
            action,
            priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleOption {\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    multiport: ").append(toIndentedString(multiport)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    remoteAddressGroupId: ").append(toIndentedString(remoteAddressGroupId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
