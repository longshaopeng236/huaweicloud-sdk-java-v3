package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * URL鉴权查询响应体。
 */
public class UrlAuthGetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Integer expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_method")

    private String signMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_key")

    private String backupKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_arg")

    private String signArg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_format")

    private String timeFormat;

    public UrlAuthGetBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否开启URL鉴权，off：开启,on：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UrlAuthGetBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 鉴权方式， type_a：鉴权方式A， type_b：鉴权方式B， type_c1：鉴权方式C1， type_c2：鉴权方式C2。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UrlAuthGetBody withExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间，单位：秒。
     * @return expireTime
     */
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public UrlAuthGetBody withSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }

    /**
     * 加密算法。
     * @return signMethod
     */
    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public UrlAuthGetBody withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 鉴权范围。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public UrlAuthGetBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 鉴权KEY。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UrlAuthGetBody withBackupKey(String backupKey) {
        this.backupKey = backupKey;
        return this;
    }

    /**
     * 鉴权KEY（备）。
     * @return backupKey
     */
    public String getBackupKey() {
        return backupKey;
    }

    public void setBackupKey(String backupKey) {
        this.backupKey = backupKey;
    }

    public UrlAuthGetBody withSignArg(String signArg) {
        this.signArg = signArg;
        return this;
    }

    /**
     * 鉴权参数。
     * @return signArg
     */
    public String getSignArg() {
        return signArg;
    }

    public void setSignArg(String signArg) {
        this.signArg = signArg;
    }

    public UrlAuthGetBody withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * 时间格式， dec：十进制, hex：十六进制。
     * @return timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlAuthGetBody urlAuthGetBody = (UrlAuthGetBody) o;
        return Objects.equals(this.status, urlAuthGetBody.status) && Objects.equals(this.type, urlAuthGetBody.type)
            && Objects.equals(this.expireTime, urlAuthGetBody.expireTime)
            && Objects.equals(this.signMethod, urlAuthGetBody.signMethod)
            && Objects.equals(this.matchType, urlAuthGetBody.matchType) && Objects.equals(this.key, urlAuthGetBody.key)
            && Objects.equals(this.backupKey, urlAuthGetBody.backupKey)
            && Objects.equals(this.signArg, urlAuthGetBody.signArg)
            && Objects.equals(this.timeFormat, urlAuthGetBody.timeFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, expireTime, signMethod, matchType, key, backupKey, signArg, timeFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlAuthGetBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    signMethod: ").append(toIndentedString(signMethod)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    backupKey: ").append(toIndentedString(backupKey)).append("\n");
        sb.append("    signArg: ").append(toIndentedString(signArg)).append("\n");
        sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
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
