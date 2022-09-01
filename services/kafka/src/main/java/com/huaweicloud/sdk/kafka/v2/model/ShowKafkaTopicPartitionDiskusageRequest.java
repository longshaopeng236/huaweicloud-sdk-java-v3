package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowKafkaTopicPartitionDiskusageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minSize")

    @JacksonXmlProperty(localName = "minSize")

    private String minSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    @JacksonXmlProperty(localName = "top")

    private String top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    @JacksonXmlProperty(localName = "percentage")

    private String percentage;

    public ShowKafkaTopicPartitionDiskusageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowKafkaTopicPartitionDiskusageRequest withMinSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * 占用磁盘大小，默认值1G (1K ,1M , 1G)。
     * @return minSize
     */
    public String getMinSize() {
        return minSize;
    }

    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }

    public ShowKafkaTopicPartitionDiskusageRequest withTop(String top) {
        this.top = top;
        return this;
    }

    /**
     * 占用磁盘大小，查询top N。
     * @return top
     */
    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public ShowKafkaTopicPartitionDiskusageRequest withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 占用磁盘大小，查询大于占比的分区。
     * @return percentage
     */
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKafkaTopicPartitionDiskusageRequest showKafkaTopicPartitionDiskusageRequest =
            (ShowKafkaTopicPartitionDiskusageRequest) o;
        return Objects.equals(this.instanceId, showKafkaTopicPartitionDiskusageRequest.instanceId)
            && Objects.equals(this.minSize, showKafkaTopicPartitionDiskusageRequest.minSize)
            && Objects.equals(this.top, showKafkaTopicPartitionDiskusageRequest.top)
            && Objects.equals(this.percentage, showKafkaTopicPartitionDiskusageRequest.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, minSize, top, percentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaTopicPartitionDiskusageRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
