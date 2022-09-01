package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class UpdateAssetNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    @JacksonXmlProperty(localName = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_id")

    @JacksonXmlProperty(localName = "asset_model_id")

    private String assetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_name")

    @JacksonXmlProperty(localName = "asset_model_name")

    private String assetModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private List<PropertyResponse> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyses")

    @JacksonXmlProperty(localName = "analyses")

    private List<AnalysisResponse> analyses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root")

    @JacksonXmlProperty(localName = "root")

    private String root;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    @JacksonXmlProperty(localName = "parent")

    private String parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    @JacksonXmlProperty(localName = "children")

    private List<String> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_state")

    @JacksonXmlProperty(localName = "publish_state")

    private String publishState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    @JacksonXmlProperty(localName = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "published_time")

    @JacksonXmlProperty(localName = "published_time")

    private String publishedTime;

    public UpdateAssetNewResponse withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public UpdateAssetNewResponse withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * 资产模型ID
     * @return assetModelId
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    public UpdateAssetNewResponse withAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
        return this;
    }

    /**
     * 资产模型名称
     * @return assetModelName
     */
    public String getAssetModelName() {
        return assetModelName;
    }

    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    public UpdateAssetNewResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAssetNewResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 资产显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UpdateAssetNewResponse withProperties(List<PropertyResponse> properties) {
        this.properties = properties;
        return this;
    }

    public UpdateAssetNewResponse addPropertiesItem(PropertyResponse propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public UpdateAssetNewResponse withProperties(Consumer<List<PropertyResponse>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 属性集
     * @return properties
     */
    public List<PropertyResponse> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyResponse> properties) {
        this.properties = properties;
    }

    public UpdateAssetNewResponse withAnalyses(List<AnalysisResponse> analyses) {
        this.analyses = analyses;
        return this;
    }

    public UpdateAssetNewResponse addAnalysesItem(AnalysisResponse analysesItem) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        this.analyses.add(analysesItem);
        return this;
    }

    public UpdateAssetNewResponse withAnalyses(Consumer<List<AnalysisResponse>> analysesSetter) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        analysesSetter.accept(this.analyses);
        return this;
    }

    /**
     * 分析任务集
     * @return analyses
     */
    public List<AnalysisResponse> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalysisResponse> analyses) {
        this.analyses = analyses;
    }

    public UpdateAssetNewResponse withRoot(String root) {
        this.root = root;
        return this;
    }

    /**
     * 根资产ID
     * @return root
     */
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public UpdateAssetNewResponse withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 父资产ID，根资产的父资产ID为null
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public UpdateAssetNewResponse withChildren(List<String> children) {
        this.children = children;
        return this;
    }

    public UpdateAssetNewResponse addChildrenItem(String childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public UpdateAssetNewResponse withChildren(Consumer<List<String>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子资产ID集
     * @return children
     */
    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public UpdateAssetNewResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 资产状态，正常状态（ACTIVE），异常状态（INACTIVE）；只有草稿态（SKETCH）资产有此状态；资产处于异常状态的场景有：1、该资产存在未填写设备ID的测量数据类别的属性；2、该资产存在未填写静态值的静态配置类别的属性；3、该资产存在分析任务，该分析任务的输入参数存在属性引用类型为引用其他资产属性，且没有为该输入参数配置引用的其他资产的资产ID
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UpdateAssetNewResponse withPublishState(String publishState) {
        this.publishState = publishState;
        return this;
    }

    /**
     * 资产发布状态，发布中（PUBLISHING），发布完成（PUBLISHED）；只能对草稿态（SKETCH）的根资产进行发布，也只有草稿态的根资产有此字段；如果根资产从未发布过则值为null
     * @return publishState
     */
    public String getPublishState() {
        return publishState;
    }

    public void setPublishState(String publishState) {
        this.publishState = publishState;
    }

    public UpdateAssetNewResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间，格式\"yyyy-MM-dd'T'HH:mm:ss'Z'\"
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public UpdateAssetNewResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 修改时间，格式\"yyyy-MM-dd'T'HH:mm:ss'Z'\"
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public UpdateAssetNewResponse withPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }

    /**
     * 发布时间，只能对草稿态（SKETCH）的根资产进行发布，也只有草稿态的根资产有此字段；如果从未发布过则值为null；格式\"yyyy-MM-dd'T'HH:mm:ss'Z'\"
     * @return publishedTime
     */
    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAssetNewResponse updateAssetNewResponse = (UpdateAssetNewResponse) o;
        return Objects.equals(this.assetId, updateAssetNewResponse.assetId)
            && Objects.equals(this.assetModelId, updateAssetNewResponse.assetModelId)
            && Objects.equals(this.assetModelName, updateAssetNewResponse.assetModelName)
            && Objects.equals(this.name, updateAssetNewResponse.name)
            && Objects.equals(this.displayName, updateAssetNewResponse.displayName)
            && Objects.equals(this.properties, updateAssetNewResponse.properties)
            && Objects.equals(this.analyses, updateAssetNewResponse.analyses)
            && Objects.equals(this.root, updateAssetNewResponse.root)
            && Objects.equals(this.parent, updateAssetNewResponse.parent)
            && Objects.equals(this.children, updateAssetNewResponse.children)
            && Objects.equals(this.state, updateAssetNewResponse.state)
            && Objects.equals(this.publishState, updateAssetNewResponse.publishState)
            && Objects.equals(this.createdTime, updateAssetNewResponse.createdTime)
            && Objects.equals(this.modifiedTime, updateAssetNewResponse.modifiedTime)
            && Objects.equals(this.publishedTime, updateAssetNewResponse.publishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId,
            assetModelId,
            assetModelName,
            name,
            displayName,
            properties,
            analyses,
            root,
            parent,
            children,
            state,
            publishState,
            createdTime,
            modifiedTime,
            publishedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssetNewResponse {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetModelId: ").append(toIndentedString(assetModelId)).append("\n");
        sb.append("    assetModelName: ").append(toIndentedString(assetModelName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    analyses: ").append(toIndentedString(analyses)).append("\n");
        sb.append("    root: ").append(toIndentedString(root)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    publishState: ").append(toIndentedString(publishState)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
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
