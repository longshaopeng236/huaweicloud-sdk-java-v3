package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务参数。
 */
public class AppRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventName")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostid")

    private List<String> hostid = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectid")

    private String projectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private AppRulesSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public AppRules withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 规则创建时间(创建时不传，修改时传查询返回的createTime)。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AppRules withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * true、false 规则是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public AppRules withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * aom_inventory_rules_event规则事件名称，对于服务发现固定为\"aom_inventory_rules_event\"。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public AppRules withHostid(List<String> hostid) {
        this.hostid = hostid;
        return this;
    }

    public AppRules addHostidItem(String hostidItem) {
        if (this.hostid == null) {
            this.hostid = new ArrayList<>();
        }
        this.hostid.add(hostidItem);
        return this;
    }

    public AppRules withHostid(Consumer<List<String>> hostidSetter) {
        if (this.hostid == null) {
            this.hostid = new ArrayList<>();
        }
        hostidSetter.accept(this.hostid);
        return this;
    }

    /**
     * 主机ID（暂不使用，传空即可）。
     * @return hostid
     */
    public List<String> getHostid() {
        return hostid;
    }

    public void setHostid(List<String> hostid) {
        this.hostid = hostid;
    }

    public AppRules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 创建时填空，修改时填规则ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称。 字符长度为4到63位，以小写字母a-z开头，只能包含0-9/a-z/-，不能以-结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppRules withProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }

    /**
     * 租户从IAM申请到的projectid，一般为32位字符串。
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public AppRules withSpec(AppRulesSpec spec) {
        this.spec = spec;
        return this;
    }

    public AppRules withSpec(Consumer<AppRulesSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new AppRulesSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public AppRulesSpec getSpec() {
        return spec;
    }

    public void setSpec(AppRulesSpec spec) {
        this.spec = spec;
    }

    public AppRules withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 自定义描述信息
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppRules that = (AppRules) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.eventName, that.eventName) && Objects.equals(this.hostid, that.hostid)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectid, that.projectid) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, enable, eventName, hostid, id, name, projectid, spec, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppRules {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    hostid: ").append(toIndentedString(hostid)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectid: ").append(toIndentedString(projectid)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
