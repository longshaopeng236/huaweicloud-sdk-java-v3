package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.NodePool;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNodePoolsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<NodePool> items = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind;

    public ListNodePoolsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API version. The value is fixed to v3.
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    

    public ListNodePoolsResponse withItems(List<NodePool> items) {
        this.items = items;
        return this;
    }

    
    public ListNodePoolsResponse addItemsItem(NodePool itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    public ListNodePoolsResponse withItems(Consumer<List<NodePool>> itemsSetter) {
        if(this.items == null ){
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * /
     * @return items
     */
    public List<NodePool> getItems() {
        return items;
    }

    public void setItems(List<NodePool> items) {
        this.items = items;
    }

    

    public ListNodePoolsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API type. The value is fixed to List.
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNodePoolsResponse listNodePoolsResponse = (ListNodePoolsResponse) o;
        return Objects.equals(this.apiVersion, listNodePoolsResponse.apiVersion) &&
            Objects.equals(this.items, listNodePoolsResponse.items) &&
            Objects.equals(this.kind, listNodePoolsResponse.kind);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, items, kind);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodePoolsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

