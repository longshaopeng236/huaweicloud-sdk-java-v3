package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.AccessRomaBriefInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowNaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="na_id")
    
    @JacksonXmlProperty(localName = "na_id")
    
    private String naId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint")
    
    @JacksonXmlProperty(localName = "endpoint")
    
    private String endpoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    @JacksonXmlProperty(localName = "auth_type")
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_type")
    
    @JacksonXmlProperty(localName = "access_type")
    
    private String accessType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_roma_info")
    
    @JacksonXmlProperty(localName = "access_roma_info")
    
    private AccessRomaBriefInfo accessRomaInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    @JacksonXmlProperty(localName = "update_time")
    
    private String updateTime;

    public ShowNaResponse withNaId(String naId) {
        this.naId = naId;
        return this;
    }

    


    /**
     * NA系统ID，提供给其他系统访问的唯一标识
     * @return naId
     */
    public String getNaId() {
        return naId;
    }

    public void setNaId(String naId) {
        this.naId = naId;
    }

    

    public ShowNaResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * NA系统名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowNaResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 北向NA系统描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowNaResponse withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    


    /**
     * 访问URL地址
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    

    public ShowNaResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 鉴权方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public ShowNaResponse withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    


    /**
     * 接入类型
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    

    public ShowNaResponse withAccessRomaInfo(AccessRomaBriefInfo accessRomaInfo) {
        this.accessRomaInfo = accessRomaInfo;
        return this;
    }

    public ShowNaResponse withAccessRomaInfo(Consumer<AccessRomaBriefInfo> accessRomaInfoSetter) {
        if(this.accessRomaInfo == null ){
            this.accessRomaInfo = new AccessRomaBriefInfo();
            accessRomaInfoSetter.accept(this.accessRomaInfo);
        }
        
        return this;
    }


    /**
     * Get accessRomaInfo
     * @return accessRomaInfo
     */
    public AccessRomaBriefInfo getAccessRomaInfo() {
        return accessRomaInfo;
    }

    public void setAccessRomaInfo(AccessRomaBriefInfo accessRomaInfo) {
        this.accessRomaInfo = accessRomaInfo;
    }

    

    public ShowNaResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ShowNaResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNaResponse showNaResponse = (ShowNaResponse) o;
        return Objects.equals(this.naId, showNaResponse.naId) &&
            Objects.equals(this.name, showNaResponse.name) &&
            Objects.equals(this.description, showNaResponse.description) &&
            Objects.equals(this.endpoint, showNaResponse.endpoint) &&
            Objects.equals(this.authType, showNaResponse.authType) &&
            Objects.equals(this.accessType, showNaResponse.accessType) &&
            Objects.equals(this.accessRomaInfo, showNaResponse.accessRomaInfo) &&
            Objects.equals(this.createTime, showNaResponse.createTime) &&
            Objects.equals(this.updateTime, showNaResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(naId, name, description, endpoint, authType, accessType, accessRomaInfo, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNaResponse {\n");
        sb.append("    naId: ").append(toIndentedString(naId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    accessRomaInfo: ").append(toIndentedString(accessRomaInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

