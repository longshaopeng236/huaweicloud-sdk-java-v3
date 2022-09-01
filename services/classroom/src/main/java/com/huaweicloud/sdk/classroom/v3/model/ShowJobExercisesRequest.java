package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobExercisesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_from")

    @JacksonXmlProperty(localName = "source_from")

    private String sourceFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    @JacksonXmlProperty(localName = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ShowJobExercisesRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobExercisesRequest withSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }

    /**
     * 作业来源于课堂或课程。 取值范围： classroom:课堂作业 course:课程作业
     * @return sourceFrom
     */
    public String getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public ShowJobExercisesRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 课堂ID或者课程ID。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public ShowJobExercisesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 信息记录的起始编号
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowJobExercisesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页包含的信息记录数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobExercisesRequest showJobExercisesRequest = (ShowJobExercisesRequest) o;
        return Objects.equals(this.jobId, showJobExercisesRequest.jobId)
            && Objects.equals(this.sourceFrom, showJobExercisesRequest.sourceFrom)
            && Objects.equals(this.sourceId, showJobExercisesRequest.sourceId)
            && Objects.equals(this.offset, showJobExercisesRequest.offset)
            && Objects.equals(this.limit, showJobExercisesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, sourceFrom, sourceId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobExercisesRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    sourceFrom: ").append(toIndentedString(sourceFrom)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
