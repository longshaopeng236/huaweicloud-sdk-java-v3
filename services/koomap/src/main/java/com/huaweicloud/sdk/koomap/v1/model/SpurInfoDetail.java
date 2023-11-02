package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SpurInfoDetail
 */
public class SpurInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageCode")

    private String imageCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pointWidth")

    private String pointWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pointHeight")

    private String pointHeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private String longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private String latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accuracy")

    private String accuracy;

    public SpurInfoDetail withImageCode(String imageCode) {
        this.imageCode = imageCode;
        return this;
    }

    /**
     * 图像ID。
     * @return imageCode
     */
    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public SpurInfoDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 刺点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SpurInfoDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 刺点所属任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SpurInfoDetail withPointWidth(String pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    /**
     * 刺点在图片中的横向像素值。
     * @return pointWidth
     */
    public String getPointWidth() {
        return pointWidth;
    }

    public void setPointWidth(String pointWidth) {
        this.pointWidth = pointWidth;
    }

    public SpurInfoDetail withPointHeight(String pointHeight) {
        this.pointHeight = pointHeight;
        return this;
    }

    /**
     * 刺点在图片中的纵向像素值。
     * @return pointHeight
     */
    public String getPointHeight() {
        return pointHeight;
    }

    public void setPointHeight(String pointHeight) {
        this.pointHeight = pointHeight;
    }

    public SpurInfoDetail withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 像控点经度。
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public SpurInfoDetail withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 像控点纬度。
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public SpurInfoDetail withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 像控点高度。
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public SpurInfoDetail withAccuracy(String accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 像控点精度。
     * @return accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpurInfoDetail that = (SpurInfoDetail) obj;
        return Objects.equals(this.imageCode, that.imageCode) && Objects.equals(this.id, that.id)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.pointWidth, that.pointWidth)
            && Objects.equals(this.pointHeight, that.pointHeight) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.latitude, that.latitude) && Objects.equals(this.height, that.height)
            && Objects.equals(this.accuracy, that.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCode, id, taskId, pointWidth, pointHeight, longitude, latitude, height, accuracy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpurInfoDetail {\n");
        sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    pointWidth: ").append(toIndentedString(pointWidth)).append("\n");
        sb.append("    pointHeight: ").append(toIndentedString(pointHeight)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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
