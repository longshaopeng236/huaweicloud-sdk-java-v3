package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.EnvResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEnvironmentsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="envs")
    
    private List<EnvResp> envs = null;
    
    public ListEnvironmentsV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 符合条件的环境总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListEnvironmentsV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListEnvironmentsV2Response withEnvs(List<EnvResp> envs) {
        this.envs = envs;
        return this;
    }

    
    public ListEnvironmentsV2Response addEnvsItem(EnvResp envsItem) {
        this.envs.add(envsItem);
        return this;
    }

    public ListEnvironmentsV2Response withEnvs(Consumer<List<EnvResp>> envsSetter) {
        if(this.envs == null ){
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 本次返回的环境列表
     * @return envs
     */
    public List<EnvResp> getEnvs() {
        return envs;
    }

    public void setEnvs(List<EnvResp> envs) {
        this.envs = envs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnvironmentsV2Response listEnvironmentsV2Response = (ListEnvironmentsV2Response) o;
        return Objects.equals(this.total, listEnvironmentsV2Response.total) &&
            Objects.equals(this.size, listEnvironmentsV2Response.size) &&
            Objects.equals(this.envs, listEnvironmentsV2Response.envs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, envs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvironmentsV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
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

