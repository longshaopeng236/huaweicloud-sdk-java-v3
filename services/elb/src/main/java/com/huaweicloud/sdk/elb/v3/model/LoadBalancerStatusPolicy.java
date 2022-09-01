package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LB状态树的转发策略状态信息
 */
public class LoadBalancerStatusPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    @JacksonXmlProperty(localName = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")

    private List<LoadBalancerStatusL7Rule> rules = null;

    public LoadBalancerStatusPolicy withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 匹配后动作。取值： - REDIRECT_TO_POOL：转发到后端服务器组。 - REDIRECT_TO_LISTENER：转发到监听器。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LoadBalancerStatusPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 转发策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerStatusPolicy withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 转发策略的配置状态。取值： - ACTIVE：使用中，默认值。 - ERROR：表示当前策略与同一监听器下的其他策略存在相同的规则配置。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerStatusPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 转发策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerStatusPolicy withRules(List<LoadBalancerStatusL7Rule> rules) {
        this.rules = rules;
        return this;
    }

    public LoadBalancerStatusPolicy addRulesItem(LoadBalancerStatusL7Rule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public LoadBalancerStatusPolicy withRules(Consumer<List<LoadBalancerStatusL7Rule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 转发规则状态信息。
     * @return rules
     */
    public List<LoadBalancerStatusL7Rule> getRules() {
        return rules;
    }

    public void setRules(List<LoadBalancerStatusL7Rule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerStatusPolicy loadBalancerStatusPolicy = (LoadBalancerStatusPolicy) o;
        return Objects.equals(this.action, loadBalancerStatusPolicy.action)
            && Objects.equals(this.id, loadBalancerStatusPolicy.id)
            && Objects.equals(this.provisioningStatus, loadBalancerStatusPolicy.provisioningStatus)
            && Objects.equals(this.name, loadBalancerStatusPolicy.name)
            && Objects.equals(this.rules, loadBalancerStatusPolicy.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, id, provisioningStatus, name, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusPolicy {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
