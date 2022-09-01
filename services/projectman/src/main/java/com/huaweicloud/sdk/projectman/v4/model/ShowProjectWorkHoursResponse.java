package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectWorkHoursResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours")

    @JacksonXmlProperty(localName = "work_hours")

    private List<ShowProjectWorkHoursResponseBodyWorkHours> workHours = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ShowProjectWorkHoursResponse withWorkHours(List<ShowProjectWorkHoursResponseBodyWorkHours> workHours) {
        this.workHours = workHours;
        return this;
    }

    public ShowProjectWorkHoursResponse addWorkHoursItem(ShowProjectWorkHoursResponseBodyWorkHours workHoursItem) {
        if (this.workHours == null) {
            this.workHours = new ArrayList<>();
        }
        this.workHours.add(workHoursItem);
        return this;
    }

    public ShowProjectWorkHoursResponse withWorkHours(
        Consumer<List<ShowProjectWorkHoursResponseBodyWorkHours>> workHoursSetter) {
        if (this.workHours == null) {
            this.workHours = new ArrayList<>();
        }
        workHoursSetter.accept(this.workHours);
        return this;
    }

    /**
     * 工时列表
     * @return workHours
     */
    public List<ShowProjectWorkHoursResponseBodyWorkHours> getWorkHours() {
        return workHours;
    }

    public void setWorkHours(List<ShowProjectWorkHoursResponseBodyWorkHours> workHours) {
        this.workHours = workHours;
    }

    public ShowProjectWorkHoursResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectWorkHoursResponse showProjectWorkHoursResponse = (ShowProjectWorkHoursResponse) o;
        return Objects.equals(this.workHours, showProjectWorkHoursResponse.workHours)
            && Objects.equals(this.total, showProjectWorkHoursResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workHours, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWorkHoursResponse {\n");
        sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
