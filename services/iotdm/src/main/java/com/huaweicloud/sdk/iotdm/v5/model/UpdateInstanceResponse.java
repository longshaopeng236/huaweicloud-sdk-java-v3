package com.huaweicloud.sdk.iotdm.v5.model;

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
public class UpdateInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_infos")

    private List<AccessInfo> accessInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_window")

    private OperateWindow operateWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_params")

    private AdditionalParamsResp additionalParams;

    public UpdateInstanceResponse withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数说明**：实例类型。 **取值范围**： - standard：标准版实例 - enterprise：企业版实例 
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public UpdateInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。 **取值范围**：长度不超过36，由小写字母[a-f]、数字、连接符（-）的组成。 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceResponse withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * **参数说明**：实例的付费方式。 **取值范围**： - prePaid：包年/包月 - postPaid：按需计费 
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public UpdateInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：实例名称 **取值范围**：由中文字符，英文字母、数字及“_”、“-”组成，且长度为[1-64]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstanceResponse withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public UpdateInstanceResponse withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public UpdateInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：实例状态。 **取值范围**： - CREATING：实例正在创建 - ACTIVE：实例正常 - FROZEN：实例冻结 - MODIFYING：实例正在变更规格 - FAILED：实例创建失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：设备接入实例的描述信息。 **取值范围**：由中文，字母，数字，句号，逗号，下划线（“_”），中划线（“-”），空格组成，且长度为[1-256]个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceResponse withAccessInfos(List<AccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
        return this;
    }

    public UpdateInstanceResponse addAccessInfosItem(AccessInfo accessInfosItem) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        this.accessInfos.add(accessInfosItem);
        return this;
    }

    public UpdateInstanceResponse withAccessInfos(Consumer<List<AccessInfo>> accessInfosSetter) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        accessInfosSetter.accept(this.accessInfos);
        return this;
    }

    /**
     * **参数说明**：设备接入实例的接入信息 
     * @return accessInfos
     */
    public List<AccessInfo> getAccessInfos() {
        return accessInfos;
    }

    public void setAccessInfos(List<AccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
    }

    public UpdateInstanceResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数说明**：实例的创建时间。时间格式例如：2023-01-28T06:57:52Z 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateInstanceResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数说明**：实例的最近一次更新的时间。时间格式例如：2023-01-28T06:57:52Z 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数说明**：企业项目Id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateInstanceResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateInstanceResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateInstanceResponse withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数说明**: 设备接入实例的标签信息。如果实例有标签，则会有该字段，否则该字段为空。 
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public UpdateInstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数说明**：订单号，仅包年包月实例返回该参数。[查看订单详情请参考[[查询订单详情](https://support.huaweicloud.com/api-bpconsole/zh-cn_topic_0075746564.html)。]](tag:hws)
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public UpdateInstanceResponse withOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
        return this;
    }

    public UpdateInstanceResponse withOperateWindow(Consumer<OperateWindow> operateWindowSetter) {
        if (this.operateWindow == null) {
            this.operateWindow = new OperateWindow();
            operateWindowSetter.accept(this.operateWindow);
        }

        return this;
    }

    /**
     * Get operateWindow
     * @return operateWindow
     */
    public OperateWindow getOperateWindow() {
        return operateWindow;
    }

    public void setOperateWindow(OperateWindow operateWindow) {
        this.operateWindow = operateWindow;
    }

    public UpdateInstanceResponse withAdditionalParams(AdditionalParamsResp additionalParams) {
        this.additionalParams = additionalParams;
        return this;
    }

    public UpdateInstanceResponse withAdditionalParams(Consumer<AdditionalParamsResp> additionalParamsSetter) {
        if (this.additionalParams == null) {
            this.additionalParams = new AdditionalParamsResp();
            additionalParamsSetter.accept(this.additionalParams);
        }

        return this;
    }

    /**
     * Get additionalParams
     * @return additionalParams
     */
    public AdditionalParamsResp getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(AdditionalParamsResp additionalParams) {
        this.additionalParams = additionalParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceResponse that = (UpdateInstanceResponse) obj;
        return Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description) && Objects.equals(this.accessInfos, that.accessInfos)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.operateWindow, that.operateWindow)
            && Objects.equals(this.additionalParams, that.additionalParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceType,
            instanceId,
            chargeMode,
            name,
            flavor,
            status,
            description,
            accessInfos,
            createTime,
            updateTime,
            enterpriseProjectId,
            tags,
            orderId,
            operateWindow,
            additionalParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceResponse {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    accessInfos: ").append(toIndentedString(accessInfos)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    operateWindow: ").append(toIndentedString(operateWindow)).append("\n");
        sb.append("    additionalParams: ").append(toIndentedString(additionalParams)).append("\n");
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
