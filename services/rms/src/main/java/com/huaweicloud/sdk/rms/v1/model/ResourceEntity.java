package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源对象
 */
public class ResourceEntity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ep_id")
    
    private String epId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ep_name")
    
    private String epName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checksum")
    
    private String checksum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_state")
    
    private String provisioningState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private Map<String, String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Map<String, Object> properties = null;
    
    public ResourceEntity withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceEntity withName(String name) {
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

    public ResourceEntity withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * 云服务名称
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ResourceEntity withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceEntity withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * region id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceEntity withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * Openstack中的project id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ResourceEntity withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * Openstack中的project名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ResourceEntity withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    


    /**
     * 企业项目id
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ResourceEntity withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    


    /**
     * 企业项目名称
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ResourceEntity withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    


    /**
     * 资源详情摘要
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public ResourceEntity withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 资源创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ResourceEntity withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 资源更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ResourceEntity withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    


    /**
     * 资源发放状态
     * @return provisioningState
     */
    public String getProvisioningState() {
        return provisioningState;
    }

    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    public ResourceEntity withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    

    public ResourceEntity putTagsItem(String key, String tagsItem) {
         if (this.tags == null) {
            this.tags = new HashMap<>();
         }
        this.tags.put(key, tagsItem);
        return this;
    }

    public ResourceEntity withTags(Consumer<Map<String, String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }
    /**
     * 资源Tag
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public ResourceEntity withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    

    public ResourceEntity putPropertiesItem(String key, Object propertiesItem) {
         if (this.properties == null) {
            this.properties = new HashMap<>();
         }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ResourceEntity withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if(this.properties == null ){
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }
    /**
     * 资源详细属性
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceEntity resourceEntity = (ResourceEntity) o;
        return Objects.equals(this.id, resourceEntity.id) &&
            Objects.equals(this.name, resourceEntity.name) &&
            Objects.equals(this.provider, resourceEntity.provider) &&
            Objects.equals(this.type, resourceEntity.type) &&
            Objects.equals(this.regionId, resourceEntity.regionId) &&
            Objects.equals(this.projectId, resourceEntity.projectId) &&
            Objects.equals(this.projectName, resourceEntity.projectName) &&
            Objects.equals(this.epId, resourceEntity.epId) &&
            Objects.equals(this.epName, resourceEntity.epName) &&
            Objects.equals(this.checksum, resourceEntity.checksum) &&
            Objects.equals(this.created, resourceEntity.created) &&
            Objects.equals(this.updated, resourceEntity.updated) &&
            Objects.equals(this.provisioningState, resourceEntity.provisioningState) &&
            Objects.equals(this.tags, resourceEntity.tags) &&
            Objects.equals(this.properties, resourceEntity.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, provider, type, regionId, projectId, projectName, epId, epName, checksum, created, updated, provisioningState, tags, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

