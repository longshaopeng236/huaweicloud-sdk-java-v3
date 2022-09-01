package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broadcast")

    @JacksonXmlProperty(localName = "broadcast")

    private Boolean broadcast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    @JacksonXmlProperty(localName = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_time")

    @JacksonXmlProperty(localName = "retry_max_time")

    private BigDecimal retryMaxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_beginning")

    @JacksonXmlProperty(localName = "from_beginning")

    private Boolean fromBeginning;

    public ShowGroupResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowGroupResponse withBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    /**
     * 是否广播。
     * @return broadcast
     */
    public Boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
    }

    public ShowGroupResponse withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ShowGroupResponse addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowGroupResponse withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 关联的代理列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public ShowGroupResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowGroupResponse withRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
        return this;
    }

    /**
     * 最大重试次数。
     * @return retryMaxTime
     */
    public BigDecimal getRetryMaxTime() {
        return retryMaxTime;
    }

    public void setRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
    }

    public ShowGroupResponse withFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
        return this;
    }

    /**
     * 是否重头消费。
     * @return fromBeginning
     */
    public Boolean getFromBeginning() {
        return fromBeginning;
    }

    public void setFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGroupResponse showGroupResponse = (ShowGroupResponse) o;
        return Objects.equals(this.enabled, showGroupResponse.enabled)
            && Objects.equals(this.broadcast, showGroupResponse.broadcast)
            && Objects.equals(this.brokers, showGroupResponse.brokers)
            && Objects.equals(this.name, showGroupResponse.name)
            && Objects.equals(this.retryMaxTime, showGroupResponse.retryMaxTime)
            && Objects.equals(this.fromBeginning, showGroupResponse.fromBeginning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, broadcast, brokers, name, retryMaxTime, fromBeginning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupResponse {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retryMaxTime: ").append(toIndentedString(retryMaxTime)).append("\n");
        sb.append("    fromBeginning: ").append(toIndentedString(fromBeginning)).append("\n");
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
