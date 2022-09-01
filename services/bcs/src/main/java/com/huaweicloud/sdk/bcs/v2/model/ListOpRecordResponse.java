package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_records")

    @JacksonXmlProperty(localName = "operation_records")

    private List<RecordDetailInfo> operationRecords = null;

    public ListOpRecordResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 操作记录总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListOpRecordResponse withOperationRecords(List<RecordDetailInfo> operationRecords) {
        this.operationRecords = operationRecords;
        return this;
    }

    public ListOpRecordResponse addOperationRecordsItem(RecordDetailInfo operationRecordsItem) {
        if (this.operationRecords == null) {
            this.operationRecords = new ArrayList<>();
        }
        this.operationRecords.add(operationRecordsItem);
        return this;
    }

    public ListOpRecordResponse withOperationRecords(Consumer<List<RecordDetailInfo>> operationRecordsSetter) {
        if (this.operationRecords == null) {
            this.operationRecords = new ArrayList<>();
        }
        operationRecordsSetter.accept(this.operationRecords);
        return this;
    }

    /**
     * 操作记录列表
     * @return operationRecords
     */
    public List<RecordDetailInfo> getOperationRecords() {
        return operationRecords;
    }

    public void setOperationRecords(List<RecordDetailInfo> operationRecords) {
        this.operationRecords = operationRecords;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOpRecordResponse listOpRecordResponse = (ListOpRecordResponse) o;
        return Objects.equals(this.count, listOpRecordResponse.count)
            && Objects.equals(this.operationRecords, listOpRecordResponse.operationRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, operationRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpRecordResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    operationRecords: ").append(toIndentedString(operationRecords)).append("\n");
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
