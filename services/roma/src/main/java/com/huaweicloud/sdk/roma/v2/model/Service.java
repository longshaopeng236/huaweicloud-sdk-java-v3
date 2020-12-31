package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.CreatedUser;
import com.huaweicloud.sdk.roma.v2.model.LastUpdatedUser;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Service
 */
public class Service  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_template_id")
    
    private Integer productTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private Integer productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private Integer serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 服务状态 0-启用 1-停用
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user")
    
    private CreatedUser createdUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_user")
    
    private LastUpdatedUser lastUpdatedUser = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_datetime")
    
    private Long createdDatetime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_updated_datetime")
    
    private Long lastUpdatedDatetime;

    public Service withProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
        return this;
    }

    


    /**
     * 服务归属的产品模板ID
     * @return productTemplateId
     */
    public Integer getProductTemplateId() {
        return productTemplateId;
    }

    public void setProductTemplateId(Integer productTemplateId) {
        this.productTemplateId = productTemplateId;
    }

    public Service withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 服务归属的产品ID
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Service withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * 服务ID
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Service withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 服务名称，支持中文,英文大小写，数字，下划线和中划线,长度2-64
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Service withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 服务描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Service withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 服务状态 0-启用 1-停用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Service withCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Service withCreatedUser(Consumer<CreatedUser> createdUserSetter) {
        if(this.createdUser == null ){
            this.createdUser = new CreatedUser();
            createdUserSetter.accept(this.createdUser);
        }
        
        return this;
    }


    /**
     * Get createdUser
     * @return createdUser
     */
    public CreatedUser getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(CreatedUser createdUser) {
        this.createdUser = createdUser;
    }

    public Service withLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
        return this;
    }

    public Service withLastUpdatedUser(Consumer<LastUpdatedUser> lastUpdatedUserSetter) {
        if(this.lastUpdatedUser == null ){
            this.lastUpdatedUser = new LastUpdatedUser();
            lastUpdatedUserSetter.accept(this.lastUpdatedUser);
        }
        
        return this;
    }


    /**
     * Get lastUpdatedUser
     * @return lastUpdatedUser
     */
    public LastUpdatedUser getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(LastUpdatedUser lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public Service withCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
        return this;
    }

    


    /**
     * 创建时间止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDatetime
     */
    public Long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Service withLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
        return this;
    }

    


    /**
     * 最后修改时间止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return lastUpdatedDatetime
     */
    public Long getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(Long lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Service service = (Service) o;
        return Objects.equals(this.productTemplateId, service.productTemplateId) &&
            Objects.equals(this.productId, service.productId) &&
            Objects.equals(this.serviceId, service.serviceId) &&
            Objects.equals(this.serviceName, service.serviceName) &&
            Objects.equals(this.description, service.description) &&
            Objects.equals(this.status, service.status) &&
            Objects.equals(this.createdUser, service.createdUser) &&
            Objects.equals(this.lastUpdatedUser, service.lastUpdatedUser) &&
            Objects.equals(this.createdDatetime, service.createdDatetime) &&
            Objects.equals(this.lastUpdatedDatetime, service.lastUpdatedDatetime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productTemplateId, productId, serviceId, serviceName, description, status, createdUser, lastUpdatedUser, createdDatetime, lastUpdatedDatetime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Service {\n");
        sb.append("    productTemplateId: ").append(toIndentedString(productTemplateId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
        sb.append("    lastUpdatedUser: ").append(toIndentedString(lastUpdatedUser)).append("\n");
        sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
        sb.append("    lastUpdatedDatetime: ").append(toIndentedString(lastUpdatedDatetime)).append("\n");
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

