package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateExternalEntityResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    @JacksonXmlProperty(localName = "node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    @JacksonXmlProperty(localName = "space_id")
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_id")
    
    @JacksonXmlProperty(localName = "external_id")
    
    private String externalId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    @JacksonXmlProperty(localName = "protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_type")
    
    @JacksonXmlProperty(localName = "connection_type")
    
    private String connectionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_modify_time")
    
    @JacksonXmlProperty(localName = "last_modify_time")
    
    private String lastModifyTime;

    public CreateExternalEntityResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public CreateExternalEntityResponse withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的外部实体归属到IoDA哪个资源空间下的边缘节点设备下，否则创建的外部实体将会归属到默认资源空间下对应的边缘节点下,对应于IoDA的app_id.
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    

    public CreateExternalEntityResponse withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    


    /**
     * 外部实体ID
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    

    public CreateExternalEntityResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 接入协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public CreateExternalEntityResponse withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    


    /**
     * 连接类型(client和server)
     * @return connectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    

    public CreateExternalEntityResponse withCreateTime(String createTime) {
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

    

    public CreateExternalEntityResponse withLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    


    /**
     * 最后修改时间
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExternalEntityResponse createExternalEntityResponse = (CreateExternalEntityResponse) o;
        return Objects.equals(this.nodeId, createExternalEntityResponse.nodeId) &&
            Objects.equals(this.spaceId, createExternalEntityResponse.spaceId) &&
            Objects.equals(this.externalId, createExternalEntityResponse.externalId) &&
            Objects.equals(this.protocol, createExternalEntityResponse.protocol) &&
            Objects.equals(this.connectionType, createExternalEntityResponse.connectionType) &&
            Objects.equals(this.createTime, createExternalEntityResponse.createTime) &&
            Objects.equals(this.lastModifyTime, createExternalEntityResponse.lastModifyTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, spaceId, externalId, protocol, connectionType, createTime, lastModifyTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalEntityResponse {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifyTime: ").append(toIndentedString(lastModifyTime)).append("\n");
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

