package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 实例数量统计信息。
 */
public class StatusStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paying_count")

    @JacksonXmlProperty(localName = "paying_count")

    private Integer payingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freezing_count")

    @JacksonXmlProperty(localName = "freezing_count")

    private Integer freezingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrating_count")

    @JacksonXmlProperty(localName = "migrating_count")

    private Integer migratingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flushing_count")

    @JacksonXmlProperty(localName = "flushing_count")

    private Integer flushingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrading_count")

    @JacksonXmlProperty(localName = "upgrading_count")

    private Integer upgradingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restoring_count")

    @JacksonXmlProperty(localName = "restoring_count")

    private Integer restoringCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extending_count")

    @JacksonXmlProperty(localName = "extending_count")

    private Integer extendingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creating_count")

    @JacksonXmlProperty(localName = "creating_count")

    private Integer creatingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    @JacksonXmlProperty(localName = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    @JacksonXmlProperty(localName = "error_count")

    private Integer errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_count")

    @JacksonXmlProperty(localName = "frozen_count")

    private Integer frozenCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createfailed_count")

    @JacksonXmlProperty(localName = "createfailed_count")

    private Integer createfailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restarting_count")

    @JacksonXmlProperty(localName = "restarting_count")

    private Integer restartingCount;

    public StatusStatistic withPayingCount(Integer payingCount) {
        this.payingCount = payingCount;
        return this;
    }

    /**
     * 支付中的实例数。
     * @return payingCount
     */
    public Integer getPayingCount() {
        return payingCount;
    }

    public void setPayingCount(Integer payingCount) {
        this.payingCount = payingCount;
    }

    public StatusStatistic withFreezingCount(Integer freezingCount) {
        this.freezingCount = freezingCount;
        return this;
    }

    /**
     * 冻结中的实例数。
     * @return freezingCount
     */
    public Integer getFreezingCount() {
        return freezingCount;
    }

    public void setFreezingCount(Integer freezingCount) {
        this.freezingCount = freezingCount;
    }

    public StatusStatistic withMigratingCount(Integer migratingCount) {
        this.migratingCount = migratingCount;
        return this;
    }

    /**
     * 迁移中的实例数。
     * @return migratingCount
     */
    public Integer getMigratingCount() {
        return migratingCount;
    }

    public void setMigratingCount(Integer migratingCount) {
        this.migratingCount = migratingCount;
    }

    public StatusStatistic withFlushingCount(Integer flushingCount) {
        this.flushingCount = flushingCount;
        return this;
    }

    /**
     * 清空中的实例数。
     * @return flushingCount
     */
    public Integer getFlushingCount() {
        return flushingCount;
    }

    public void setFlushingCount(Integer flushingCount) {
        this.flushingCount = flushingCount;
    }

    public StatusStatistic withUpgradingCount(Integer upgradingCount) {
        this.upgradingCount = upgradingCount;
        return this;
    }

    /**
     * 升级中的实例数。
     * @return upgradingCount
     */
    public Integer getUpgradingCount() {
        return upgradingCount;
    }

    public void setUpgradingCount(Integer upgradingCount) {
        this.upgradingCount = upgradingCount;
    }

    public StatusStatistic withRestoringCount(Integer restoringCount) {
        this.restoringCount = restoringCount;
        return this;
    }

    /**
     * 恢复中的实例数。
     * @return restoringCount
     */
    public Integer getRestoringCount() {
        return restoringCount;
    }

    public void setRestoringCount(Integer restoringCount) {
        this.restoringCount = restoringCount;
    }

    public StatusStatistic withExtendingCount(Integer extendingCount) {
        this.extendingCount = extendingCount;
        return this;
    }

    /**
     * 扩容中的实例数。
     * @return extendingCount
     */
    public Integer getExtendingCount() {
        return extendingCount;
    }

    public void setExtendingCount(Integer extendingCount) {
        this.extendingCount = extendingCount;
    }

    public StatusStatistic withCreatingCount(Integer creatingCount) {
        this.creatingCount = creatingCount;
        return this;
    }

    /**
     * 正在创建的实例数。
     * @return creatingCount
     */
    public Integer getCreatingCount() {
        return creatingCount;
    }

    public void setCreatingCount(Integer creatingCount) {
        this.creatingCount = creatingCount;
    }

    public StatusStatistic withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * 正在运行的实例数。
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public StatusStatistic withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 异常的实例数。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public StatusStatistic withFrozenCount(Integer frozenCount) {
        this.frozenCount = frozenCount;
        return this;
    }

    /**
     * 已冻结的实例数。
     * @return frozenCount
     */
    public Integer getFrozenCount() {
        return frozenCount;
    }

    public void setFrozenCount(Integer frozenCount) {
        this.frozenCount = frozenCount;
    }

    public StatusStatistic withCreatefailedCount(Integer createfailedCount) {
        this.createfailedCount = createfailedCount;
        return this;
    }

    /**
     * 创建失败的实例数。
     * @return createfailedCount
     */
    public Integer getCreatefailedCount() {
        return createfailedCount;
    }

    public void setCreatefailedCount(Integer createfailedCount) {
        this.createfailedCount = createfailedCount;
    }

    public StatusStatistic withRestartingCount(Integer restartingCount) {
        this.restartingCount = restartingCount;
        return this;
    }

    /**
     * 正在重启的实例数。
     * @return restartingCount
     */
    public Integer getRestartingCount() {
        return restartingCount;
    }

    public void setRestartingCount(Integer restartingCount) {
        this.restartingCount = restartingCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusStatistic statusStatistic = (StatusStatistic) o;
        return Objects.equals(this.payingCount, statusStatistic.payingCount)
            && Objects.equals(this.freezingCount, statusStatistic.freezingCount)
            && Objects.equals(this.migratingCount, statusStatistic.migratingCount)
            && Objects.equals(this.flushingCount, statusStatistic.flushingCount)
            && Objects.equals(this.upgradingCount, statusStatistic.upgradingCount)
            && Objects.equals(this.restoringCount, statusStatistic.restoringCount)
            && Objects.equals(this.extendingCount, statusStatistic.extendingCount)
            && Objects.equals(this.creatingCount, statusStatistic.creatingCount)
            && Objects.equals(this.runningCount, statusStatistic.runningCount)
            && Objects.equals(this.errorCount, statusStatistic.errorCount)
            && Objects.equals(this.frozenCount, statusStatistic.frozenCount)
            && Objects.equals(this.createfailedCount, statusStatistic.createfailedCount)
            && Objects.equals(this.restartingCount, statusStatistic.restartingCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payingCount,
            freezingCount,
            migratingCount,
            flushingCount,
            upgradingCount,
            restoringCount,
            extendingCount,
            creatingCount,
            runningCount,
            errorCount,
            frozenCount,
            createfailedCount,
            restartingCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusStatistic {\n");
        sb.append("    payingCount: ").append(toIndentedString(payingCount)).append("\n");
        sb.append("    freezingCount: ").append(toIndentedString(freezingCount)).append("\n");
        sb.append("    migratingCount: ").append(toIndentedString(migratingCount)).append("\n");
        sb.append("    flushingCount: ").append(toIndentedString(flushingCount)).append("\n");
        sb.append("    upgradingCount: ").append(toIndentedString(upgradingCount)).append("\n");
        sb.append("    restoringCount: ").append(toIndentedString(restoringCount)).append("\n");
        sb.append("    extendingCount: ").append(toIndentedString(extendingCount)).append("\n");
        sb.append("    creatingCount: ").append(toIndentedString(creatingCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    frozenCount: ").append(toIndentedString(frozenCount)).append("\n");
        sb.append("    createfailedCount: ").append(toIndentedString(createfailedCount)).append("\n");
        sb.append("    restartingCount: ").append(toIndentedString(restartingCount)).append("\n");
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
