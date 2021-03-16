package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GenerateAuditlogDownloadLinkRequest
 */
public class GenerateAuditlogDownloadLinkRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ids")
    
    private List<String> ids = null;
    
    public GenerateAuditlogDownloadLinkRequest withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    
    public GenerateAuditlogDownloadLinkRequest addIdsItem(String idsItem) {
        this.ids.add(idsItem);
        return this;
    }

    public GenerateAuditlogDownloadLinkRequest withIds(Consumer<List<String>> idsSetter) {
        if(this.ids == null ){
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 审计日志ID列表，限制50条以内。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateAuditlogDownloadLinkRequest generateAuditlogDownloadLinkRequest = (GenerateAuditlogDownloadLinkRequest) o;
        return Objects.equals(this.ids, generateAuditlogDownloadLinkRequest.ids);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateAuditlogDownloadLinkRequest {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

