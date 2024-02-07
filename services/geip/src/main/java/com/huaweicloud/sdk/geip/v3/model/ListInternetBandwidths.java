package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListInternetBandwidths
 */
public class ListInternetBandwidths {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isp")

    private String isp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_size")

    private Integer ingressSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_site")

    private String accessSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_95peak")

    private Integer ratio95peak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezen_info")

    private String freezenInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 状态
     */
    public static final class StatusEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("FREEZED", FREEZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_count")

    private Integer geipCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geip_segment_count")

    private Integer geipSegmentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pre_paid")

    private Boolean isPrePaid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<Tag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_infos")

    private List<LockInfo> lockInfos = null;

    public ListInternetBandwidths withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInternetBandwidths withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInternetBandwidths withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * 线路
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public ListInternetBandwidths withIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
        return this;
    }

    /**
     * 全域公网带宽大小（入云方向）
     * @return ingressSize
     */
    public Integer getIngressSize() {
        return ingressSize;
    }

    public void setIngressSize(Integer ingressSize) {
        this.ingressSize = ingressSize;
    }

    public ListInternetBandwidths withAccessSite(String accessSite) {
        this.accessSite = accessSite;
        return this;
    }

    /**
     * 接入点信息
     * @return accessSite
     */
    public String getAccessSite() {
        return accessSite;
    }

    public void setAccessSite(String accessSite) {
        this.accessSite = accessSite;
    }

    public ListInternetBandwidths withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 全域公网带宽大小（出云方向）
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListInternetBandwidths withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户自定义的资源描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListInternetBandwidths withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ListInternetBandwidths withRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
        return this;
    }

    /**
     * 增强95保底率
     * @return ratio95peak
     */
    public Integer getRatio95peak() {
        return ratio95peak;
    }

    public void setRatio95peak(Integer ratio95peak) {
        this.ratio95peak = ratio95peak;
    }

    public ListInternetBandwidths withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 订单信息
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public ListInternetBandwidths withFreezenInfo(String freezenInfo) {
        this.freezenInfo = freezenInfo;
        return this;
    }

    /**
     * 冻结原因
     * @return freezenInfo
     */
    public String getFreezenInfo() {
        return freezenInfo;
    }

    public void setFreezenInfo(String freezenInfo) {
        this.freezenInfo = freezenInfo;
    }

    public ListInternetBandwidths withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListInternetBandwidths withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListInternetBandwidths withGeipCount(Integer geipCount) {
        this.geipCount = geipCount;
        return this;
    }

    /**
     * 全域弹性公网IP个数
     * @return geipCount
     */
    public Integer getGeipCount() {
        return geipCount;
    }

    public void setGeipCount(Integer geipCount) {
        this.geipCount = geipCount;
    }

    public ListInternetBandwidths withGeipSegmentCount(Integer geipSegmentCount) {
        this.geipSegmentCount = geipSegmentCount;
        return this;
    }

    /**
     * 全域弹性公网IP段个数
     * @return geipSegmentCount
     */
    public Integer getGeipSegmentCount() {
        return geipSegmentCount;
    }

    public void setGeipSegmentCount(Integer geipSegmentCount) {
        this.geipSegmentCount = geipSegmentCount;
    }

    public ListInternetBandwidths withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ListInternetBandwidths withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ListInternetBandwidths withIsPrePaid(Boolean isPrePaid) {
        this.isPrePaid = isPrePaid;
        return this;
    }

    /**
     * 是否包周期
     * @return isPrePaid
     */
    public Boolean getIsPrePaid() {
        return isPrePaid;
    }

    public void setIsPrePaid(Boolean isPrePaid) {
        this.isPrePaid = isPrePaid;
    }

    public ListInternetBandwidths withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ListInternetBandwidths addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInternetBandwidths withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域公网带宽标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ListInternetBandwidths withSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListInternetBandwidths addSysTagsItem(Tag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListInternetBandwidths withSysTags(Consumer<List<Tag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签
     * @return sysTags
     */
    public List<Tag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
    }

    public ListInternetBandwidths withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源的企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListInternetBandwidths withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 全域公网带宽类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListInternetBandwidths withLockInfos(List<LockInfo> lockInfos) {
        this.lockInfos = lockInfos;
        return this;
    }

    public ListInternetBandwidths addLockInfosItem(LockInfo lockInfosItem) {
        if (this.lockInfos == null) {
            this.lockInfos = new ArrayList<>();
        }
        this.lockInfos.add(lockInfosItem);
        return this;
    }

    public ListInternetBandwidths withLockInfos(Consumer<List<LockInfo>> lockInfosSetter) {
        if (this.lockInfos == null) {
            this.lockInfos = new ArrayList<>();
        }
        lockInfosSetter.accept(this.lockInfos);
        return this;
    }

    /**
     * 全域公网带宽资源的锁状态
     * @return lockInfos
     */
    public List<LockInfo> getLockInfos() {
        return lockInfos;
    }

    public void setLockInfos(List<LockInfo> lockInfos) {
        this.lockInfos = lockInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInternetBandwidths that = (ListInternetBandwidths) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.isp, that.isp) && Objects.equals(this.ingressSize, that.ingressSize)
            && Objects.equals(this.accessSite, that.accessSite) && Objects.equals(this.size, that.size)
            && Objects.equals(this.description, that.description) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.ratio95peak, that.ratio95peak) && Objects.equals(this.billingInfo, that.billingInfo)
            && Objects.equals(this.freezenInfo, that.freezenInfo) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.geipCount, that.geipCount)
            && Objects.equals(this.geipSegmentCount, that.geipSegmentCount)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.isPrePaid, that.isPrePaid) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.lockInfos, that.lockInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            isp,
            ingressSize,
            accessSite,
            size,
            description,
            chargeMode,
            ratio95peak,
            billingInfo,
            freezenInfo,
            domainId,
            status,
            geipCount,
            geipSegmentCount,
            createdAt,
            updatedAt,
            isPrePaid,
            tags,
            sysTags,
            enterpriseProjectId,
            type,
            lockInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetBandwidths {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
        sb.append("    ingressSize: ").append(toIndentedString(ingressSize)).append("\n");
        sb.append("    accessSite: ").append(toIndentedString(accessSite)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    ratio95peak: ").append(toIndentedString(ratio95peak)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    freezenInfo: ").append(toIndentedString(freezenInfo)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    geipCount: ").append(toIndentedString(geipCount)).append("\n");
        sb.append("    geipSegmentCount: ").append(toIndentedString(geipSegmentCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    isPrePaid: ").append(toIndentedString(isPrePaid)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    lockInfos: ").append(toIndentedString(lockInfos)).append("\n");
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
