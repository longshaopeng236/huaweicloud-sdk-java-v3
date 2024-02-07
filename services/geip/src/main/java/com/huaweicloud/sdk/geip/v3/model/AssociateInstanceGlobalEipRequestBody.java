package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociateInstanceGlobalEipRequestBody
 */
public class AssociateInstanceGlobalEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip")

    private AssociateInstanceGlobalEipRequestBodyGlobalEip globalEip;

    public AssociateInstanceGlobalEipRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Get dryRun
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public AssociateInstanceGlobalEipRequestBody withGlobalEip(
        AssociateInstanceGlobalEipRequestBodyGlobalEip globalEip) {
        this.globalEip = globalEip;
        return this;
    }

    public AssociateInstanceGlobalEipRequestBody withGlobalEip(
        Consumer<AssociateInstanceGlobalEipRequestBodyGlobalEip> globalEipSetter) {
        if (this.globalEip == null) {
            this.globalEip = new AssociateInstanceGlobalEipRequestBodyGlobalEip();
            globalEipSetter.accept(this.globalEip);
        }

        return this;
    }

    /**
     * Get globalEip
     * @return globalEip
     */
    public AssociateInstanceGlobalEipRequestBodyGlobalEip getGlobalEip() {
        return globalEip;
    }

    public void setGlobalEip(AssociateInstanceGlobalEipRequestBodyGlobalEip globalEip) {
        this.globalEip = globalEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateInstanceGlobalEipRequestBody that = (AssociateInstanceGlobalEipRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.globalEip, that.globalEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, globalEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateInstanceGlobalEipRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    globalEip: ").append(toIndentedString(globalEip)).append("\n");
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
