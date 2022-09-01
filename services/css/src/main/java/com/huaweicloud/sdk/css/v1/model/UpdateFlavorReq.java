package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateFlavorReq
 */
public class UpdateFlavorReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "needCheckReplica")

    @JacksonXmlProperty(localName = "needCheckReplica")

    private Boolean needCheckReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newFlavorId")

    @JacksonXmlProperty(localName = "newFlavorId")

    private String newFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    @JacksonXmlProperty(localName = "isAutoPay")

    private Integer isAutoPay;

    public UpdateFlavorReq withNeedCheckReplica(Boolean needCheckReplica) {
        this.needCheckReplica = needCheckReplica;
        return this;
    }

    /**
     * 是否需要检查副本，取值范围为true或false。默认开启校验。 - ture: 开启副本校验。 - false: 忽略副本校验。
     * @return needCheckReplica
     */
    public Boolean getNeedCheckReplica() {
        return needCheckReplica;
    }

    public void setNeedCheckReplica(Boolean needCheckReplica) {
        this.needCheckReplica = needCheckReplica;
    }

    public UpdateFlavorReq withNewFlavorId(String newFlavorId) {
        this.newFlavorId = newFlavorId;
        return this;
    }

    /**
     * 变更后节点规格ID。 该参数通过 [获取实例规格列表](ListFlavors.xml)接口获取根据name属性对比出比当前集群大的规格，选择对应的flavor_id。 仅支持同一个Esasticsearch引擎版本下的节点规格变更。
     * @return newFlavorId
     */
    public String getNewFlavorId() {
        return newFlavorId;
    }

    public void setNewFlavorId(String newFlavorId) {
        this.newFlavorId = newFlavorId;
    }

    public UpdateFlavorReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     *  是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。该参数适用于包周期集群。   - 1: 是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券)。   - 0: 否（需要客户手动去支付，客户可以选择折扣和优惠券）。默认值为“0”。
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlavorReq updateFlavorReq = (UpdateFlavorReq) o;
        return Objects.equals(this.needCheckReplica, updateFlavorReq.needCheckReplica)
            && Objects.equals(this.newFlavorId, updateFlavorReq.newFlavorId)
            && Objects.equals(this.isAutoPay, updateFlavorReq.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needCheckReplica, newFlavorId, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlavorReq {\n");
        sb.append("    needCheckReplica: ").append(toIndentedString(needCheckReplica)).append("\n");
        sb.append("    newFlavorId: ").append(toIndentedString(newFlavorId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
