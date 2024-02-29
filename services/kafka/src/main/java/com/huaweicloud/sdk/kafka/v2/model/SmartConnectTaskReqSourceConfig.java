package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskReqSourceConfig
 */
public class SmartConnectTaskReqSourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_address")

    private String redisAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_type")

    private String redisType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_instance_id")

    private String dcsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_password")

    private String redisPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync_wait_ms")

    private Integer fullSyncWaitMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync_max_retry")

    private Integer fullSyncMaxRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratelimit")

    private Integer ratelimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cluster_name")

    private String currentClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_mechanism")

    private String saslMechanism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bootstrap_servers")

    private String bootstrapServers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protocol")

    private String securityProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_consumer_offsets_enabled")

    private Boolean syncConsumerOffsetsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_factor")

    private String replicationFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_num")

    private String taskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rename_topic_enable")

    private Boolean renameTopicEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provenance_header_enabled")

    private Boolean provenanceHeaderEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_strategy")

    private String consumerStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_type")

    private String compressionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics_mapping")

    private String topicsMapping;

    public SmartConnectTaskReqSourceConfig withRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
        return this;
    }

    /**
     * Redis实例地址。（仅源端类型为Redis时需要填写）
     * @return redisAddress
     */
    public String getRedisAddress() {
        return redisAddress;
    }

    public void setRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
    }

    public SmartConnectTaskReqSourceConfig withRedisType(String redisType) {
        this.redisType = redisType;
        return this;
    }

    /**
     * Redis实例类型。（仅源端类型为Redis时需要填写）
     * @return redisType
     */
    public String getRedisType() {
        return redisType;
    }

    public void setRedisType(String redisType) {
        this.redisType = redisType;
    }

    public SmartConnectTaskReqSourceConfig withDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
        return this;
    }

    /**
     * DCS实例ID。（仅源端类型为Redis时需要填写）
     * @return dcsInstanceId
     */
    public String getDcsInstanceId() {
        return dcsInstanceId;
    }

    public void setDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
    }

    public SmartConnectTaskReqSourceConfig withRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
        return this;
    }

    /**
     * Redis密码。（仅源端类型为Redis时需要填写）
     * @return redisPassword
     */
    public String getRedisPassword() {
        return redisPassword;
    }

    public void setRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
    }

    public SmartConnectTaskReqSourceConfig withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 同步类型，“RDB_ONLY”为全量同步，“CUSTOM_OFFSET”为全量同步+增量同步。（仅源端类型为Redis时需要填写）
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public SmartConnectTaskReqSourceConfig withFullSyncWaitMs(Integer fullSyncWaitMs) {
        this.fullSyncWaitMs = fullSyncWaitMs;
        return this;
    }

    /**
     * 全量同步重试间隔时间，单位：毫秒。（仅源端类型为Redis时需要填写）
     * @return fullSyncWaitMs
     */
    public Integer getFullSyncWaitMs() {
        return fullSyncWaitMs;
    }

    public void setFullSyncWaitMs(Integer fullSyncWaitMs) {
        this.fullSyncWaitMs = fullSyncWaitMs;
    }

    public SmartConnectTaskReqSourceConfig withFullSyncMaxRetry(Integer fullSyncMaxRetry) {
        this.fullSyncMaxRetry = fullSyncMaxRetry;
        return this;
    }

    /**
     * 全量同步最大重试次数。（仅源端类型为Redis时需要填写）
     * @return fullSyncMaxRetry
     */
    public Integer getFullSyncMaxRetry() {
        return fullSyncMaxRetry;
    }

    public void setFullSyncMaxRetry(Integer fullSyncMaxRetry) {
        this.fullSyncMaxRetry = fullSyncMaxRetry;
    }

    public SmartConnectTaskReqSourceConfig withRatelimit(Integer ratelimit) {
        this.ratelimit = ratelimit;
        return this;
    }

    /**
     * 限速，单位为KB/s。-1表示不限速。（仅源端类型为Redis时需要填写）
     * @return ratelimit
     */
    public Integer getRatelimit() {
        return ratelimit;
    }

    public void setRatelimit(Integer ratelimit) {
        this.ratelimit = ratelimit;
    }

    public SmartConnectTaskReqSourceConfig withCurrentClusterName(String currentClusterName) {
        this.currentClusterName = currentClusterName;
        return this;
    }

    /**
     * 当前Kafka实例别名。（仅源端类型为Kafka时需要填写）
     * @return currentClusterName
     */
    public String getCurrentClusterName() {
        return currentClusterName;
    }

    public void setCurrentClusterName(String currentClusterName) {
        this.currentClusterName = currentClusterName;
    }

    public SmartConnectTaskReqSourceConfig withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 对端Kafka实例别名。（仅源端类型为Kafka时需要填写）
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public SmartConnectTaskReqSourceConfig withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 对端Kafka开启SASL_SSL时设置的用户名，或者创建SASL_SSL用户时设置的用户名。（仅源端类型为Kafka且对端Kafka认证方式为“SASL_SSL”时需要填写）
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SmartConnectTaskReqSourceConfig withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 对端Kafka开启SASL_SSL时设置的密码，或者创建SASL_SSL用户时设置的密码。（仅源端类型为Kafka且对端Kafka认证方式为“SASL_SSL”时需要填写）
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SmartConnectTaskReqSourceConfig withSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * 对端Kafka认证机制。（仅源端类型为Kafka且“认证方式”为“SASL_SSL”时需要填写）
     * @return saslMechanism
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public SmartConnectTaskReqSourceConfig withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 对端Kafka实例ID。（仅源端类型为Kafka时需要填写，instance_id和bootstrap_servers仅需要填写其中一个）
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SmartConnectTaskReqSourceConfig withBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
        return this;
    }

    /**
     * 对端Kafka实例地址。（仅源端类型为Kafka时需要填写，instance_id和bootstrap_servers仅需要填写其中一个）
     * @return bootstrapServers
     */
    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public SmartConnectTaskReqSourceConfig withSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * 对端Kafka认证方式。（仅源端类型为Kafka需要填写） 支持以下两种认证方式：   - SASL_SSL：表示实例已开启SASL_SSL。   - PLAINTEXT：表示实例未开启SASL_SSL。 
     * @return securityProtocol
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public SmartConnectTaskReqSourceConfig withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 同步方向；pull为把对端Kafka实例数据复制到当前Kafka实例中，push为把当前Kafka实例数据复制到对端Kafka实例中，two-way为对两端Kafka实例数据进行双向复制。（仅源端类型为Kafka时需要填写）
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public SmartConnectTaskReqSourceConfig withSyncConsumerOffsetsEnabled(Boolean syncConsumerOffsetsEnabled) {
        this.syncConsumerOffsetsEnabled = syncConsumerOffsetsEnabled;
        return this;
    }

    /**
     * 是否同步消费进度。（仅源端类型为Kafka时需要填写）
     * @return syncConsumerOffsetsEnabled
     */
    public Boolean getSyncConsumerOffsetsEnabled() {
        return syncConsumerOffsetsEnabled;
    }

    public void setSyncConsumerOffsetsEnabled(Boolean syncConsumerOffsetsEnabled) {
        this.syncConsumerOffsetsEnabled = syncConsumerOffsetsEnabled;
    }

    public SmartConnectTaskReqSourceConfig withReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /**
     * 在对端实例中自动创建Topic时，指定Topic的副本数，此参数值不能超过对端实例的代理数。如果对端实例中设置了“default.replication.factor”，此参数的优先级高于“default.replication.factor”。（仅源端类型为Kafka时需要填写）
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public SmartConnectTaskReqSourceConfig withTaskNum(String taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    /**
     * 数据复制的任务数。默认值为2，建议保持默认值。如果“同步方式”为“双向”，实际任务数=设置的任务数*2。（仅源端类型为Kafka时需要填写）
     * @return taskNum
     */
    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public SmartConnectTaskReqSourceConfig withRenameTopicEnable(Boolean renameTopicEnable) {
        this.renameTopicEnable = renameTopicEnable;
        return this;
    }

    /**
     * 是否重命名Topic，在目标Topic名称前添加源端Kafka实例的别名，形成目标Topic新的名称。（仅源端类型为Kafka时需要填写）
     * @return renameTopicEnable
     */
    public Boolean getRenameTopicEnable() {
        return renameTopicEnable;
    }

    public void setRenameTopicEnable(Boolean renameTopicEnable) {
        this.renameTopicEnable = renameTopicEnable;
    }

    public SmartConnectTaskReqSourceConfig withProvenanceHeaderEnabled(Boolean provenanceHeaderEnabled) {
        this.provenanceHeaderEnabled = provenanceHeaderEnabled;
        return this;
    }

    /**
     * 目标Topic接收复制的消息，此消息header中包含消息来源。两端实例数据双向复制时，请开启“添加来源header”，防止循环复制。（仅源端类型为Kafka时需要填写）
     * @return provenanceHeaderEnabled
     */
    public Boolean getProvenanceHeaderEnabled() {
        return provenanceHeaderEnabled;
    }

    public void setProvenanceHeaderEnabled(Boolean provenanceHeaderEnabled) {
        this.provenanceHeaderEnabled = provenanceHeaderEnabled;
    }

    public SmartConnectTaskReqSourceConfig withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 启动偏移量，latest为获取最新的数据，earliest为获取最早的数据。（仅源端类型为Kafka时需要填写）
     * @return consumerStrategy
     */
    public String getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public SmartConnectTaskReqSourceConfig withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * 复制消息所使用的压缩算法。（仅源端类型为Kafka时需要填写） - none - gzip - snappy - lz4 - zstd 
     * @return compressionType
     */
    public String getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    public SmartConnectTaskReqSourceConfig withTopicsMapping(String topicsMapping) {
        this.topicsMapping = topicsMapping;
        return this;
    }

    /**
     * topic映射，用于自定义目标端Topic名称。不能同时设置“重命名Topic”和“topic映射”。topic映射请按照“源端topic:目的端topic”的格式填写，如涉及多个topic映射，请用“,”分隔开，例如：topic-sc-1:topic-sc-2,topic-sc-3:topic-sc-4。（仅源端类型为Kafka时需要填写）
     * @return topicsMapping
     */
    public String getTopicsMapping() {
        return topicsMapping;
    }

    public void setTopicsMapping(String topicsMapping) {
        this.topicsMapping = topicsMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectTaskReqSourceConfig that = (SmartConnectTaskReqSourceConfig) obj;
        return Objects.equals(this.redisAddress, that.redisAddress) && Objects.equals(this.redisType, that.redisType)
            && Objects.equals(this.dcsInstanceId, that.dcsInstanceId)
            && Objects.equals(this.redisPassword, that.redisPassword) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.fullSyncWaitMs, that.fullSyncWaitMs)
            && Objects.equals(this.fullSyncMaxRetry, that.fullSyncMaxRetry)
            && Objects.equals(this.ratelimit, that.ratelimit)
            && Objects.equals(this.currentClusterName, that.currentClusterName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.password, that.password) && Objects.equals(this.saslMechanism, that.saslMechanism)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.bootstrapServers, that.bootstrapServers)
            && Objects.equals(this.securityProtocol, that.securityProtocol)
            && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.syncConsumerOffsetsEnabled, that.syncConsumerOffsetsEnabled)
            && Objects.equals(this.replicationFactor, that.replicationFactor)
            && Objects.equals(this.taskNum, that.taskNum)
            && Objects.equals(this.renameTopicEnable, that.renameTopicEnable)
            && Objects.equals(this.provenanceHeaderEnabled, that.provenanceHeaderEnabled)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.compressionType, that.compressionType)
            && Objects.equals(this.topicsMapping, that.topicsMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisAddress,
            redisType,
            dcsInstanceId,
            redisPassword,
            syncMode,
            fullSyncWaitMs,
            fullSyncMaxRetry,
            ratelimit,
            currentClusterName,
            clusterName,
            userName,
            password,
            saslMechanism,
            instanceId,
            bootstrapServers,
            securityProtocol,
            direction,
            syncConsumerOffsetsEnabled,
            replicationFactor,
            taskNum,
            renameTopicEnable,
            provenanceHeaderEnabled,
            consumerStrategy,
            compressionType,
            topicsMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskReqSourceConfig {\n");
        sb.append("    redisAddress: ").append(toIndentedString(redisAddress)).append("\n");
        sb.append("    redisType: ").append(toIndentedString(redisType)).append("\n");
        sb.append("    dcsInstanceId: ").append(toIndentedString(dcsInstanceId)).append("\n");
        sb.append("    redisPassword: ").append(toIndentedString(redisPassword)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    fullSyncWaitMs: ").append(toIndentedString(fullSyncWaitMs)).append("\n");
        sb.append("    fullSyncMaxRetry: ").append(toIndentedString(fullSyncMaxRetry)).append("\n");
        sb.append("    ratelimit: ").append(toIndentedString(ratelimit)).append("\n");
        sb.append("    currentClusterName: ").append(toIndentedString(currentClusterName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    bootstrapServers: ").append(toIndentedString(bootstrapServers)).append("\n");
        sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    syncConsumerOffsetsEnabled: ").append(toIndentedString(syncConsumerOffsetsEnabled)).append("\n");
        sb.append("    replicationFactor: ").append(toIndentedString(replicationFactor)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    renameTopicEnable: ").append(toIndentedString(renameTopicEnable)).append("\n");
        sb.append("    provenanceHeaderEnabled: ").append(toIndentedString(provenanceHeaderEnabled)).append("\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    compressionType: ").append(toIndentedString(compressionType)).append("\n");
        sb.append("    topicsMapping: ").append(toIndentedString(topicsMapping)).append("\n");
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
