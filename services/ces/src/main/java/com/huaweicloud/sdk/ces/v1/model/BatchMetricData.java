package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.DatapointForBatchMetric;
import com.huaweicloud.sdk.ces.v1.model.MetricsDimension;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class BatchMetricData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datapoints")
    
    private List<DatapointForBatchMetric> datapoints = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    private List<MetricsDimension> dimensions = null;
    
    public BatchMetricData withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * 指标单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    

    public BatchMetricData withDatapoints(List<DatapointForBatchMetric> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    
    public BatchMetricData addDatapointsItem(DatapointForBatchMetric datapointsItem) {
        this.datapoints.add(datapointsItem);
        return this;
    }

    public BatchMetricData withDatapoints(Consumer<List<DatapointForBatchMetric>> datapointsSetter) {
        if(this.datapoints == null ){
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 指标数据列表。由于查询数据时，云监控会根据所选择的聚合粒度向前取整from参数，所以datapoints中包含的数据点有可能会多于预期。
     * @return datapoints
     */
    public List<DatapointForBatchMetric> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<DatapointForBatchMetric> datapoints) {
        this.datapoints = datapoints;
    }

    

    public BatchMetricData withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 指标命名空间，格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32；各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public BatchMetricData withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * 指标名称，例如弹性云服务器监控指标中的cpu_util；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public BatchMetricData withDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public BatchMetricData addDimensionsItem(MetricsDimension dimensionsItem) {
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public BatchMetricData withDimensions(Consumer<List<MetricsDimension>> dimensionsSetter) {
        if(this.dimensions == null ){
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度列表
     * @return dimensions
     */
    public List<MetricsDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<MetricsDimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchMetricData batchMetricData = (BatchMetricData) o;
        return Objects.equals(this.unit, batchMetricData.unit) &&
            Objects.equals(this.datapoints, batchMetricData.datapoints) &&
            Objects.equals(this.namespace, batchMetricData.namespace) &&
            Objects.equals(this.metricName, batchMetricData.metricName) &&
            Objects.equals(this.dimensions, batchMetricData.dimensions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(unit, datapoints, namespace, metricName, dimensions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchMetricData {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

