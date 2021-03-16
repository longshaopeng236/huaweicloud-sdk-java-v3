package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateRecordSetsReq
 */
public class UpdateRecordSetsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl")
    
    private Integer ttl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<String> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    private Integer weight;

    public UpdateRecordSetsReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 域名，后缀需以zone name结束且为FQDN（即以“.”号结束的完整主机名）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateRecordSetsReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 可选配置，对域名的描述。  长度不超过255个字符。  如果为空，表示维持原值。  默认值为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateRecordSetsReq withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Record Set的类型。  取值范围：A、AAAA、MX、CNAME、TXT、NS、SRV、CAA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public UpdateRecordSetsReq withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    


    /**
     * 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    

    public UpdateRecordSetsReq withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    
    public UpdateRecordSetsReq addRecordsItem(String recordsItem) {
        this.records.add(recordsItem);
        return this;
    }

    public UpdateRecordSetsReq withRecords(Consumer<List<String>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 解析记录的值。不同类型解析记录对应的值的规则不同。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    

    public UpdateRecordSetsReq withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    


    /**
     * 解析记录的权重。  当weight不填时，表示该解析记录将保持原有设置的权重。 当weight=0，表示该解析记录为备用域名解析记录。 当weight>0，表示该解析记录为主用域名解析记录。 取值范围：0~100  默认值为空。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRecordSetsReq updateRecordSetsReq = (UpdateRecordSetsReq) o;
        return Objects.equals(this.name, updateRecordSetsReq.name) &&
            Objects.equals(this.description, updateRecordSetsReq.description) &&
            Objects.equals(this.type, updateRecordSetsReq.type) &&
            Objects.equals(this.ttl, updateRecordSetsReq.ttl) &&
            Objects.equals(this.records, updateRecordSetsReq.records) &&
            Objects.equals(this.weight, updateRecordSetsReq.weight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, ttl, records, weight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordSetsReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

