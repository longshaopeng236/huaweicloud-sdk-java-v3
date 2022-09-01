package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateElasticResourcePoolQueueInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    @JacksonXmlProperty(localName = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateElasticResourcePoolQueueScalingPolicyInfo body;

    public UpdateElasticResourcePoolQueueInfoRequest withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 弹性资源池名称
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    public UpdateElasticResourcePoolQueueInfoRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public UpdateElasticResourcePoolQueueInfoRequest withBody(UpdateElasticResourcePoolQueueScalingPolicyInfo body) {
        this.body = body;
        return this;
    }

    public UpdateElasticResourcePoolQueueInfoRequest withBody(
        Consumer<UpdateElasticResourcePoolQueueScalingPolicyInfo> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateElasticResourcePoolQueueScalingPolicyInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateElasticResourcePoolQueueScalingPolicyInfo getBody() {
        return body;
    }

    public void setBody(UpdateElasticResourcePoolQueueScalingPolicyInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateElasticResourcePoolQueueInfoRequest updateElasticResourcePoolQueueInfoRequest =
            (UpdateElasticResourcePoolQueueInfoRequest) o;
        return Objects.equals(this.elasticResourcePoolName,
            updateElasticResourcePoolQueueInfoRequest.elasticResourcePoolName)
            && Objects.equals(this.queueName, updateElasticResourcePoolQueueInfoRequest.queueName)
            && Objects.equals(this.body, updateElasticResourcePoolQueueInfoRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName, queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateElasticResourcePoolQueueInfoRequest {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
