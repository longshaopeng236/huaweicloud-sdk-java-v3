package com.huaweicloud.sdk.evs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateVolumeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_ids")
    
    private List<String> volumeIds = null;
    
    public CreateVolumeResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID，云硬盘为按需计费时返回该参数。 > 说明： >  > 如果需要查询job的状态，请参考：\"[查询job的状态](https://support.huaweicloud.com/api-evs/evs_04_0054.html)\"。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public CreateVolumeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单ID，云硬盘为包周期计费时返回该参数。 > 说明： >  > - 如果您需要支付订单，请参考：\"[支付包周期产品订单](https://support.huaweicloud.com/api-oce/zh-cn_topic_0075746561.html)\"。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    public CreateVolumeResponse withVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }

    
    public CreateVolumeResponse addVolumeIdsItem(String volumeIdsItem) {
        this.volumeIds.add(volumeIdsItem);
        return this;
    }

    public CreateVolumeResponse withVolumeIds(Consumer<List<String>> volumeIdsSetter) {
        if(this.volumeIds == null ){
            this.volumeIds = new ArrayList<>();
        }
        volumeIdsSetter.accept(this.volumeIds);
        return this;
    }

    /**
     * 待创建的磁盘ID列表。
     * @return volumeIds
     */
    public List<String> getVolumeIds() {
        return volumeIds;
    }

    public void setVolumeIds(List<String> volumeIds) {
        this.volumeIds = volumeIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVolumeResponse createVolumeResponse = (CreateVolumeResponse) o;
        return Objects.equals(this.jobId, createVolumeResponse.jobId) &&
            Objects.equals(this.orderId, createVolumeResponse.orderId) &&
            Objects.equals(this.volumeIds, createVolumeResponse.volumeIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, orderId, volumeIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVolumeResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    volumeIds: ").append(toIndentedString(volumeIds)).append("\n");
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

