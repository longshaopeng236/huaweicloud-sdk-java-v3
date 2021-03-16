package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 插件基本信息，集合类的元素类型，包含一组由不同名称定义的属性。
 */
public class Metadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="annotations")
    
    private Map<String, String> annotations = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creationTimestamp")
    
    private LocalDate creationTimestamp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private Map<String, String> labels = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uid")
    
    private String uid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateTimestamp")
    
    private LocalDate updateTimestamp;

    public Metadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    

    public Metadata putAnnotationsItem(String key, String annotationsItem) {
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public Metadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if(this.annotations == null ){
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }
    /**
     * 插件注解，由key/value组成 - 安装：固定值为{\"addon.install/type\":\"install\"} - 升级：固定值为{\"addon.upgrade/type\":\"upgrade\"} 
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    

    public Metadata withCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    


    /**
     * 创建时间
     * @return creationTimestamp
     */
    public LocalDate getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    

    public Metadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    

    public Metadata putLabelsItem(String key, String labelsItem) {
        this.labels.put(key, labelsItem);
        return this;
    }

    public Metadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if(this.labels == null ){
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }
    /**
     * 插件标签，key/value对格式
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    

    public Metadata withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 插件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Metadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    


    /**
     * 唯一id标识
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    

    public Metadata withUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTimestamp
     */
    public LocalDate getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.annotations, metadata.annotations) &&
            Objects.equals(this.creationTimestamp, metadata.creationTimestamp) &&
            Objects.equals(this.labels, metadata.labels) &&
            Objects.equals(this.name, metadata.name) &&
            Objects.equals(this.uid, metadata.uid) &&
            Objects.equals(this.updateTimestamp, metadata.updateTimestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(annotations, creationTimestamp, labels, name, uid, updateTimestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
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

