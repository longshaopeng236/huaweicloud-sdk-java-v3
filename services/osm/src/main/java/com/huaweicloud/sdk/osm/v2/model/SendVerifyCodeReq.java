package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SendVerifyCodeReq
 */
public class SendVerifyCodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_value")

    @JacksonXmlProperty(localName = "contact_value")

    private String contactValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_way")

    @JacksonXmlProperty(localName = "contact_way")

    private Integer contactWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    @JacksonXmlProperty(localName = "area_code")

    private String areaCode;

    public SendVerifyCodeReq withContactValue(String contactValue) {
        this.contactValue = contactValue;
        return this;
    }

    /**
     * 联系方式的值
     * @return contactValue
     */
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public SendVerifyCodeReq withContactWay(Integer contactWay) {
        this.contactWay = contactWay;
        return this;
    }

    /**
     * 联系方式的类型。0：短信；1：邮件
     * minimum: 0
     * maximum: 1
     * @return contactWay
     */
    public Integer getContactWay() {
        return contactWay;
    }

    public void setContactWay(Integer contactWay) {
        this.contactWay = contactWay;
    }

    public SendVerifyCodeReq withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * 国家码
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendVerifyCodeReq sendVerifyCodeReq = (SendVerifyCodeReq) o;
        return Objects.equals(this.contactValue, sendVerifyCodeReq.contactValue)
            && Objects.equals(this.contactWay, sendVerifyCodeReq.contactWay)
            && Objects.equals(this.areaCode, sendVerifyCodeReq.areaCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactValue, contactWay, areaCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerifyCodeReq {\n");
        sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
        sb.append("    contactWay: ").append(toIndentedString(contactWay)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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
