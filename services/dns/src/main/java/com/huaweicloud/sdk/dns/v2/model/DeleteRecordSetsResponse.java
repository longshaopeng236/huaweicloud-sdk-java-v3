package com.huaweicloud.sdk.dns.v2.model;

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
public class DeleteRecordSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    @JacksonXmlProperty(localName = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    @JacksonXmlProperty(localName = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    @JacksonXmlProperty(localName = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    @JacksonXmlProperty(localName = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    @JacksonXmlProperty(localName = "default")

    private Boolean _default;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    @JacksonXmlProperty(localName = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check_id")

    @JacksonXmlProperty(localName = "health_check_id")

    private String healthCheckId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_target")

    @JacksonXmlProperty(localName = "alias_target")

    private AliasTarget aliasTarget;

    public DeleteRecordSetsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Record Set的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteRecordSetsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Record Set的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeleteRecordSetsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Record Set的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeleteRecordSetsResponse withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * 托管该记录的zone_id。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public DeleteRecordSetsResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 托管该记录的zone_name。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public DeleteRecordSetsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 记录类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DeleteRecordSetsResponse withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public DeleteRecordSetsResponse withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public DeleteRecordSetsResponse addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public DeleteRecordSetsResponse withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 域名解析后的值。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public DeleteRecordSetsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public DeleteRecordSetsResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DeleteRecordSetsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeleteRecordSetsResponse withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 标识是否由系统默认生成，系统默认生成的Record Set不能删除。
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public DeleteRecordSetsResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 该Record Set所属的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeleteRecordSetsResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public DeleteRecordSetsResponse withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    public DeleteRecordSetsResponse withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * 解析线路ID。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public DeleteRecordSetsResponse withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 解析记录的权重。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public DeleteRecordSetsResponse withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
        return this;
    }

    /**
     * 健康检查ID。
     * @return healthCheckId
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    public DeleteRecordSetsResponse withAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    public DeleteRecordSetsResponse withAliasTarget(Consumer<AliasTarget> aliasTargetSetter) {
        if (this.aliasTarget == null) {
            this.aliasTarget = new AliasTarget();
            aliasTargetSetter.accept(this.aliasTarget);
        }

        return this;
    }

    /**
     * Get aliasTarget
     * @return aliasTarget
     */
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }

    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteRecordSetsResponse deleteRecordSetsResponse = (DeleteRecordSetsResponse) o;
        return Objects.equals(this.id, deleteRecordSetsResponse.id)
            && Objects.equals(this.name, deleteRecordSetsResponse.name)
            && Objects.equals(this.description, deleteRecordSetsResponse.description)
            && Objects.equals(this.zoneId, deleteRecordSetsResponse.zoneId)
            && Objects.equals(this.zoneName, deleteRecordSetsResponse.zoneName)
            && Objects.equals(this.type, deleteRecordSetsResponse.type)
            && Objects.equals(this.ttl, deleteRecordSetsResponse.ttl)
            && Objects.equals(this.records, deleteRecordSetsResponse.records)
            && Objects.equals(this.createdAt, deleteRecordSetsResponse.createdAt)
            && Objects.equals(this.updatedAt, deleteRecordSetsResponse.updatedAt)
            && Objects.equals(this.status, deleteRecordSetsResponse.status)
            && Objects.equals(this._default, deleteRecordSetsResponse._default)
            && Objects.equals(this.projectId, deleteRecordSetsResponse.projectId)
            && Objects.equals(this.links, deleteRecordSetsResponse.links)
            && Objects.equals(this.line, deleteRecordSetsResponse.line)
            && Objects.equals(this.weight, deleteRecordSetsResponse.weight)
            && Objects.equals(this.healthCheckId, deleteRecordSetsResponse.healthCheckId)
            && Objects.equals(this.aliasTarget, deleteRecordSetsResponse.aliasTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            zoneId,
            zoneName,
            type,
            ttl,
            records,
            createdAt,
            updatedAt,
            status,
            _default,
            projectId,
            links,
            line,
            weight,
            healthCheckId,
            aliasTarget);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRecordSetsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    healthCheckId: ").append(toIndentedString(healthCheckId)).append("\n");
        sb.append("    aliasTarget: ").append(toIndentedString(aliasTarget)).append("\n");
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
