package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUpgradeClusterTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private UpgradeTaskMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<UpgradeTaskResponseBody> items = null;

    public ListUpgradeClusterTasksResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * api版本，默认为v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListUpgradeClusterTasksResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListUpgradeClusterTasksResponse withMetadata(UpgradeTaskMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListUpgradeClusterTasksResponse withMetadata(Consumer<UpgradeTaskMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new UpgradeTaskMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public UpgradeTaskMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UpgradeTaskMetadata metadata) {
        this.metadata = metadata;
    }

    public ListUpgradeClusterTasksResponse withItems(List<UpgradeTaskResponseBody> items) {
        this.items = items;
        return this;
    }

    public ListUpgradeClusterTasksResponse addItemsItem(UpgradeTaskResponseBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListUpgradeClusterTasksResponse withItems(Consumer<List<UpgradeTaskResponseBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 集群升级任务列表
     * @return items
     */
    public List<UpgradeTaskResponseBody> getItems() {
        return items;
    }

    public void setItems(List<UpgradeTaskResponseBody> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUpgradeClusterTasksResponse that = (ListUpgradeClusterTasksResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpgradeClusterTasksResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
