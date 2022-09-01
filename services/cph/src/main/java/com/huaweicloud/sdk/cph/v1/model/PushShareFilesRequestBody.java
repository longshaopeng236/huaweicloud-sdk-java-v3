package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PushShareFilesRequestBody
 */
public class PushShareFilesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_path")

    @JacksonXmlProperty(localName = "object_path")

    private String objectPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    @JacksonXmlProperty(localName = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_paths")

    @JacksonXmlProperty(localName = "file_paths")

    private String filePaths;

    public PushShareFilesRequestBody withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点组成。仅推送共享存储接口使用。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public PushShareFilesRequestBody withObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }

    /**
     * 合法的OBS对象key，最大长度1024字符。 推送的文件只支持tar文件类型。推送时，按tar文件解压后的文件目录结构推送到手机。当前只支持/data和/cache目录推送。仅推送共享存储接口使用。
     * @return objectPath
     */
    public String getObjectPath() {
        return objectPath;
    }

    public void setObjectPath(String objectPath) {
        this.objectPath = objectPath;
    }

    public PushShareFilesRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public PushShareFilesRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public PushShareFilesRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云手机服务器ID列表。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public PushShareFilesRequestBody withFilePaths(String filePaths) {
        this.filePaths = filePaths;
        return this;
    }

    /**
     * 所需删除的共享存储文件绝对路径。以/开头，最大长度4096字节，目前只支持大小写字母、数字、点（.）、斜线（/）、中划线（-）、空格、下划线（_）、等号（=），不支持中文。路径中不能包含.. 上层目录路径，防止跨目录攻击。仅删除共享存储接口使用。
     * @return filePaths
     */
    public String getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(String filePaths) {
        this.filePaths = filePaths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PushShareFilesRequestBody pushShareFilesRequestBody = (PushShareFilesRequestBody) o;
        return Objects.equals(this.bucketName, pushShareFilesRequestBody.bucketName)
            && Objects.equals(this.objectPath, pushShareFilesRequestBody.objectPath)
            && Objects.equals(this.serverIds, pushShareFilesRequestBody.serverIds)
            && Objects.equals(this.filePaths, pushShareFilesRequestBody.filePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, objectPath, serverIds, filePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushShareFilesRequestBody {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectPath: ").append(toIndentedString(objectPath)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
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
