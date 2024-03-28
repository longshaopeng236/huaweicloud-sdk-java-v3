package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBatchTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_mode")

    private String taskMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ext_info")

    private Object taskExtInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<String> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets_filter")

    private Map<String, Object> targetsFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document")

    private Object document;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_policy")

    private TaskPolicy taskPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_desc")

    private String statusDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_progress")

    private TaskProgress taskProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public CreateBatchTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 批量任务ID，创建批量任务时由物联网平台分配获得。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateBatchTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 批量任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateBatchTaskResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 批量任务类型，取值范围：firmwareUpgrade，softwareUpgrade，createDevices，deleteDevices，freezeDevices，unfreezeDevices，createCommands，createAsyncCommands，createMessages，updateDeviceShadows。 - softwareUpgrade: 软件升级任务 - firmwareUpgrade: 固件升级任务 - createDevices: 批量创建设备任务 - deleteDevices: 批量删除设备任务 - freezeDevices: 批量冻结设备任务 - unfreezeDevices: 批量解冻设备任务 - createCommands: 批量创建同步命令任务 - createAsyncCommands: 批量创建异步命令任务 - createMessages: 批量创建消息任务 - updateDeviceShadows: 批量配置设备影子任务 - updateDevices：批量更新设备任务
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public CreateBatchTaskResponse withTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    /**
     * **参数说明**：批量任务的模式，当前只支持网关模式，当task_type为firmwareUpgrade，softwareUpgrade支持该参数。软固件升级的场景下，若升级的设备为某个网关的子设备，则平台下发获取版本信息通知和平台下发升级通知将携带task_id（软固件升级批量任务的任务ID）和sub_device_count（批量任务中网关设备包含的升级子设备数量）字段。 **取值范围**：GATEWAY: 网关模式。
     * @return taskMode
     */
    public String getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(String taskMode) {
        this.taskMode = taskMode;
    }

    public CreateBatchTaskResponse withTaskExtInfo(Object taskExtInfo) {
        this.taskExtInfo = taskExtInfo;
        return this;
    }

    /**
     * **参数说明**：批量任务额外扩展信息，当task_type为firmwareUpgrade，softwareUpgrade支持该参数。软固件升级的场景下，平台下发获取版本信息通知和平台下发升级通知将携带该字段。 **取值范围**：最长不超过512个字符。
     * @return taskExtInfo
     */
    public Object getTaskExtInfo() {
        return taskExtInfo;
    }

    public void setTaskExtInfo(Object taskExtInfo) {
        this.taskExtInfo = taskExtInfo;
    }

    public CreateBatchTaskResponse withTargets(List<String> targets) {
        this.targets = targets;
        return this;
    }

    public CreateBatchTaskResponse addTargetsItem(String targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public CreateBatchTaskResponse withTargets(Consumer<List<String>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 执行批量任务的目标，当task_type为firmwareUpgrade，softwareUpgrade，deleteDevices，freezeDevices，unfreezeDevices，createCommands，createAsyncCommands，createMessages，updateDeviceShadows，此处填写device_id列表。
     * @return targets
     */
    public List<String> getTargets() {
        return targets;
    }

    public void setTargets(List<String> targets) {
        this.targets = targets;
    }

    public CreateBatchTaskResponse withTargetsFilter(Map<String, Object> targetsFilter) {
        this.targetsFilter = targetsFilter;
        return this;
    }

    public CreateBatchTaskResponse putTargetsFilterItem(String key, Object targetsFilterItem) {
        if (this.targetsFilter == null) {
            this.targetsFilter = new HashMap<>();
        }
        this.targetsFilter.put(key, targetsFilterItem);
        return this;
    }

    public CreateBatchTaskResponse withTargetsFilter(Consumer<Map<String, Object>> targetsFilterSetter) {
        if (this.targetsFilter == null) {
            this.targetsFilter = new HashMap<>();
        }
        targetsFilterSetter.accept(this.targetsFilter);
        return this;
    }

    /**
     * 任务目标筛选参数。Json格式，里面是一个个键值对，（K,V）格式标识筛选targets需要的参数，目前支持的K有group_ids（V填写group_id数组，eg:[\"e495cf17-ff79-4294-8f64-4d367919d665\"]，任务则会筛选出来符合该群组条件的设备作为目标）
     * @return targetsFilter
     */
    public Map<String, Object> getTargetsFilter() {
        return targetsFilter;
    }

    public void setTargetsFilter(Map<String, Object> targetsFilter) {
        this.targetsFilter = targetsFilter;
    }

    public CreateBatchTaskResponse withDocument(Object document) {
        this.document = document;
        return this;
    }

    /**
     * 执行任务数据文档，Json格式。(当task_type为softwareUpgrade|firmwareUpgrade，也就是软固件升级任务时，Json里面是(K,V)键值对，需要填写key为package_id，value为在平台上传的软固件附件id，id由portal软件库包管理上传并查询获得。当task_type为createCommands，也就是批量创建同步命令任务时，Json里面是命令相关参数，eg：{\"service_id\":\"water\",\"command_name\":\"ON_OFF\",\"paras\":{\"value\":\"ON\"}}，参考[[设备同步命令](https://support.huaweicloud.com/api-iothub/iot_06_v5_0038.html)](tag:hws)[[设备同步命令](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0038.html)](tag:hws_hk))。当task_type为createAsyncCommands，也就是批量创建异步命令任务时，Json里面是命令相关参数，eg：{\"service_id\":\"water\",\"command_name\":\"ON_OFF\",\"paras\":{\"value\":\"ON\"},\"expire_time\":0,\"send_strategy\":\"immediately\"}，参考[[设备异步命令](https://support.huaweicloud.com/api-iothub/iot_06_v5_0040.html)](tag:hws)[[设备异步命令](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0040.html)](tag:hws_hk))。当task_type为updateDeviceShadows，也就是批量配置设备影子任务时，Json里面是命令相关参数，eg：{\"shadow\": [{\"service_id\": \"WaterMeter\",\"desired\": {\"temperature\": \"60\"}}]}，参考[[配置设备影子预期数据](https://support.huaweicloud.com/api-iothub/iot_06_v5_0072.html)](tag:hws)[[配置设备影子预期数据](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0072.html)](tag:hws_hk))。
     * @return document
     */
    public Object getDocument() {
        return document;
    }

    public void setDocument(Object document) {
        this.document = document;
    }

    public CreateBatchTaskResponse withTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
        return this;
    }

    public CreateBatchTaskResponse withTaskPolicy(Consumer<TaskPolicy> taskPolicySetter) {
        if (this.taskPolicy == null) {
            this.taskPolicy = new TaskPolicy();
            taskPolicySetter.accept(this.taskPolicy);
        }

        return this;
    }

    /**
     * Get taskPolicy
     * @return taskPolicy
     */
    public TaskPolicy getTaskPolicy() {
        return taskPolicy;
    }

    public void setTaskPolicy(TaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
    }

    public CreateBatchTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 批量任务的状态，可选参数，取值范围：Success|Fail|Processing|PartialSuccess|Stopped|Waitting|Initializing|Stopping。 - Initializing: 初始化中。 - Waitting: 等待中。 - Processing: 执行中。 - Success: 成功。 - Fail: 失败。 - PartialSuccess: 部分成功。 - Stopped: 停止。 - Stopping 停止中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateBatchTaskResponse withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * 批量任务状态描述(包含主任务失败错误信息)
     * @return statusDesc
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public CreateBatchTaskResponse withTaskProgress(TaskProgress taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }

    public CreateBatchTaskResponse withTaskProgress(Consumer<TaskProgress> taskProgressSetter) {
        if (this.taskProgress == null) {
            this.taskProgress = new TaskProgress();
            taskProgressSetter.accept(this.taskProgress);
        }

        return this;
    }

    /**
     * Get taskProgress
     * @return taskProgress
     */
    public TaskProgress getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(TaskProgress taskProgress) {
        this.taskProgress = taskProgress;
    }

    public CreateBatchTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 批量任务的创建时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBatchTaskResponse that = (CreateBatchTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskMode, that.taskMode)
            && Objects.equals(this.taskExtInfo, that.taskExtInfo) && Objects.equals(this.targets, that.targets)
            && Objects.equals(this.targetsFilter, that.targetsFilter) && Objects.equals(this.document, that.document)
            && Objects.equals(this.taskPolicy, that.taskPolicy) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusDesc, that.statusDesc) && Objects.equals(this.taskProgress, that.taskProgress)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            taskType,
            taskMode,
            taskExtInfo,
            targets,
            targetsFilter,
            document,
            taskPolicy,
            status,
            statusDesc,
            taskProgress,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskMode: ").append(toIndentedString(taskMode)).append("\n");
        sb.append("    taskExtInfo: ").append(toIndentedString(taskExtInfo)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    targetsFilter: ").append(toIndentedString(targetsFilter)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    taskPolicy: ").append(toIndentedString(taskPolicy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
        sb.append("    taskProgress: ").append(toIndentedString(taskProgress)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
