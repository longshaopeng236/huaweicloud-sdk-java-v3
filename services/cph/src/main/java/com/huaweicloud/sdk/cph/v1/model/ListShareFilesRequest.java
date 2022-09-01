package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListShareFilesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    @JacksonXmlProperty(localName = "server_ids")

    private String serverIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    public ListShareFilesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量为一个大于0小于资源总个数的整数，表示查询该偏移量后面的所有的资源数，默认值为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListShareFilesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的资源个数。取值范围：1~100（默认值为100），一般设置为10、20、50。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListShareFilesRequest withServerIds(String serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    /**
     * 云手机服务器ID列表，多个服务器ID用逗号（,）分隔。
     * @return serverIds
     */
    public String getServerIds() {
        return serverIds;
    }

    public void setServerIds(String serverIds) {
        this.serverIds = serverIds;
    }

    public ListShareFilesRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 待查询的目录名称 可以包含大小写字母、数字、“.”、“+”、“-”、“_”、“/”、\"=\"；必须以“/”开头，并且不能只包含“/”；不能包含“../”、“//”等。 示例：/data/data
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListShareFilesRequest listShareFilesRequest = (ListShareFilesRequest) o;
        return Objects.equals(this.offset, listShareFilesRequest.offset)
            && Objects.equals(this.limit, listShareFilesRequest.limit)
            && Objects.equals(this.serverIds, listShareFilesRequest.serverIds)
            && Objects.equals(this.path, listShareFilesRequest.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, serverIds, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareFilesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
