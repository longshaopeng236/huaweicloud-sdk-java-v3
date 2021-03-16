package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 维护时间窗结构体
 */
public class MaintainWindowsEntity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="seq")
    
    private Integer seq;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default")
    
    private Boolean _default;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin")
    
    private String begin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end")
    
    private String end;

    public MaintainWindowsEntity withSeq(Integer seq) {
        this.seq = seq;
        return this;
    }

    


    /**
     * 序号。
     * @return seq
     */
    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    

    public MaintainWindowsEntity withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    


    /**
     * 是否为默认时间段。
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    

    public MaintainWindowsEntity withBegin(String begin) {
        this.begin = begin;
        return this;
    }

    


    /**
     * 维护时间窗开始时间
     * @return begin
     */
    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    

    public MaintainWindowsEntity withEnd(String end) {
        this.end = end;
        return this;
    }

    


    /**
     * 维护时间窗结束时间。
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaintainWindowsEntity maintainWindowsEntity = (MaintainWindowsEntity) o;
        return Objects.equals(this.seq, maintainWindowsEntity.seq) &&
            Objects.equals(this._default, maintainWindowsEntity._default) &&
            Objects.equals(this.begin, maintainWindowsEntity.begin) &&
            Objects.equals(this.end, maintainWindowsEntity.end);
    }
    @Override
    public int hashCode() {
        return Objects.hash(seq, _default, begin, end);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaintainWindowsEntity {\n");
        sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

