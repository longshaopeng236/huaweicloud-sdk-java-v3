package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDefaultConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_L7")

    @JacksonXmlProperty(localName = "enable_L7")

    private Boolean enableL7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_pos_id")

    @JacksonXmlProperty(localName = "traffic_pos_id")

    private Long trafficPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_request_pos_id")

    @JacksonXmlProperty(localName = "http_request_pos_id")

    private Long httpRequestPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleaning_access_pos_id")

    @JacksonXmlProperty(localName = "cleaning_access_pos_id")

    private Long cleaningAccessPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type_id")

    @JacksonXmlProperty(localName = "app_type_id")

    private Long appTypeId;

    public ShowDefaultConfigResponse withEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
        return this;
    }

    /**
     * 是否开启L7层防护
     * @return enableL7
     */
    public Boolean getEnableL7() {
        return enableL7;
    }

    public void setEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
    }

    public ShowDefaultConfigResponse withTrafficPosId(Long trafficPosId) {
        this.trafficPosId = trafficPosId;
        return this;
    }

    /**
     * 流量分段ID，取值范围：1～9
     * @return trafficPosId
     */
    public Long getTrafficPosId() {
        return trafficPosId;
    }

    public void setTrafficPosId(Long trafficPosId) {
        this.trafficPosId = trafficPosId;
    }

    public ShowDefaultConfigResponse withHttpRequestPosId(Long httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
        return this;
    }

    /**
     * HTTP请求数分段ID，取值范围：1～15
     * @return httpRequestPosId
     */
    public Long getHttpRequestPosId() {
        return httpRequestPosId;
    }

    public void setHttpRequestPosId(Long httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
    }

    public ShowDefaultConfigResponse withCleaningAccessPosId(Long cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
        return this;
    }

    /**
     * 清洗时访问限制分段ID，取值范围：1～8
     * @return cleaningAccessPosId
     */
    public Long getCleaningAccessPosId() {
        return cleaningAccessPosId;
    }

    public void setCleaningAccessPosId(Long cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
    }

    public ShowDefaultConfigResponse withAppTypeId(Long appTypeId) {
        this.appTypeId = appTypeId;
        return this;
    }

    /**
     * 应用类型ID，可选取值： - 0 - 1
     * @return appTypeId
     */
    public Long getAppTypeId() {
        return appTypeId;
    }

    public void setAppTypeId(Long appTypeId) {
        this.appTypeId = appTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDefaultConfigResponse showDefaultConfigResponse = (ShowDefaultConfigResponse) o;
        return Objects.equals(this.enableL7, showDefaultConfigResponse.enableL7)
            && Objects.equals(this.trafficPosId, showDefaultConfigResponse.trafficPosId)
            && Objects.equals(this.httpRequestPosId, showDefaultConfigResponse.httpRequestPosId)
            && Objects.equals(this.cleaningAccessPosId, showDefaultConfigResponse.cleaningAccessPosId)
            && Objects.equals(this.appTypeId, showDefaultConfigResponse.appTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableL7, trafficPosId, httpRequestPosId, cleaningAccessPosId, appTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultConfigResponse {\n");
        sb.append("    enableL7: ").append(toIndentedString(enableL7)).append("\n");
        sb.append("    trafficPosId: ").append(toIndentedString(trafficPosId)).append("\n");
        sb.append("    httpRequestPosId: ").append(toIndentedString(httpRequestPosId)).append("\n");
        sb.append("    cleaningAccessPosId: ").append(toIndentedString(cleaningAccessPosId)).append("\n");
        sb.append("    appTypeId: ").append(toIndentedString(appTypeId)).append("\n");
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
