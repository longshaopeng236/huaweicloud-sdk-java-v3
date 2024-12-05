package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListRmsGlobalDcGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rp_name")

    private String rpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_fields")

    private List<String> extFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    /**
     * Gets or Sets sortDir
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_center_network_id")

    private List<String> globalCenterNetworkId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private List<String> siteNetworkId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private List<String> cloudConnectionId = null;

    public ListRmsGlobalDcGatewayRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~2000。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRmsGlobalDcGatewayRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRmsGlobalDcGatewayRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条资源记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRmsGlobalDcGatewayRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * Get pageReverse
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListRmsGlobalDcGatewayRequest withRpName(String rpName) {
        this.rpName = rpName;
        return this;
    }

    /**
     * 通过rp_name过滤记录
     * @return rpName
     */
    public String getRpName() {
        return rpName;
    }

    public void setRpName(String rpName) {
        this.rpName = rpName;
    }

    public ListRmsGlobalDcGatewayRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domain_id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListRmsGlobalDcGatewayRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region_id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListRmsGlobalDcGatewayRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * resource_type
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListRmsGlobalDcGatewayRequest withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 显示字段列表
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ListRmsGlobalDcGatewayRequest withExtFields(List<String> extFields) {
        this.extFields = extFields;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addExtFieldsItem(String extFieldsItem) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        this.extFields.add(extFieldsItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withExtFields(Consumer<List<String>> extFieldsSetter) {
        if (this.extFields == null) {
            this.extFields = new ArrayList<>();
        }
        extFieldsSetter.accept(this.extFields);
        return this;
    }

    /**
     * show response ext-fields
     * @return extFields
     */
    public List<String> getExtFields() {
        return extFields;
    }

    public void setExtFields(List<String> extFields) {
        this.extFields = extFields;
    }

    public ListRmsGlobalDcGatewayRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListRmsGlobalDcGatewayRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 返回结果按照升序(asc)或降序(desc)排列，默认为asc
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    public ListRmsGlobalDcGatewayRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据资源ID过滤实例
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListRmsGlobalDcGatewayRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名字过滤查询，可查询多个名字。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListRmsGlobalDcGatewayRequest withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根椐资源状态过淲实例
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListRmsGlobalDcGatewayRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤资源实例
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListRmsGlobalDcGatewayRequest withGlobalCenterNetworkId(List<String> globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addGlobalCenterNetworkIdItem(String globalCenterNetworkIdItem) {
        if (this.globalCenterNetworkId == null) {
            this.globalCenterNetworkId = new ArrayList<>();
        }
        this.globalCenterNetworkId.add(globalCenterNetworkIdItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withGlobalCenterNetworkId(Consumer<List<String>> globalCenterNetworkIdSetter) {
        if (this.globalCenterNetworkId == null) {
            this.globalCenterNetworkId = new ArrayList<>();
        }
        globalCenterNetworkIdSetter.accept(this.globalCenterNetworkId);
        return this;
    }

    /**
     * 全球中心网络ID
     * @return globalCenterNetworkId
     */
    public List<String> getGlobalCenterNetworkId() {
        return globalCenterNetworkId;
    }

    public void setGlobalCenterNetworkId(List<String> globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
    }

    public ListRmsGlobalDcGatewayRequest withSiteNetworkId(List<String> siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addSiteNetworkIdItem(String siteNetworkIdItem) {
        if (this.siteNetworkId == null) {
            this.siteNetworkId = new ArrayList<>();
        }
        this.siteNetworkId.add(siteNetworkIdItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withSiteNetworkId(Consumer<List<String>> siteNetworkIdSetter) {
        if (this.siteNetworkId == null) {
            this.siteNetworkId = new ArrayList<>();
        }
        siteNetworkIdSetter.accept(this.siteNetworkId);
        return this;
    }

    /**
     * 站点网络ID
     * @return siteNetworkId
     */
    public List<String> getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(List<String> siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    public ListRmsGlobalDcGatewayRequest withCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    public ListRmsGlobalDcGatewayRequest addCloudConnectionIdItem(String cloudConnectionIdItem) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        this.cloudConnectionId.add(cloudConnectionIdItem);
        return this;
    }

    public ListRmsGlobalDcGatewayRequest withCloudConnectionId(Consumer<List<String>> cloudConnectionIdSetter) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        cloudConnectionIdSetter.accept(this.cloudConnectionId);
        return this;
    }

    /**
     * 云连接ID
     * @return cloudConnectionId
     */
    public List<String> getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRmsGlobalDcGatewayRequest that = (ListRmsGlobalDcGatewayRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.pageReverse, that.pageReverse)
            && Objects.equals(this.rpName, that.rpName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.fields, that.fields) && Objects.equals(this.extFields, that.extFields)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.globalCenterNetworkId, that.globalCenterNetworkId)
            && Objects.equals(this.siteNetworkId, that.siteNetworkId)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            marker,
            pageReverse,
            rpName,
            domainId,
            regionId,
            resourceType,
            fields,
            extFields,
            sortKey,
            sortDir,
            id,
            name,
            status,
            enterpriseProjectId,
            globalCenterNetworkId,
            siteNetworkId,
            cloudConnectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRmsGlobalDcGatewayRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    rpName: ").append(toIndentedString(rpName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    extFields: ").append(toIndentedString(extFields)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    globalCenterNetworkId: ").append(toIndentedString(globalCenterNetworkId)).append("\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
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
