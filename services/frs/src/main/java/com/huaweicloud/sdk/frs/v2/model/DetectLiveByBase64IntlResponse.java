package com.huaweicloud.sdk.frs.v2.model;

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
public class DetectLiveByBase64IntlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video-result")

    @JacksonXmlProperty(localName = "video-result")

    private LiveDetectRespVideoresult videoResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning-list")

    @JacksonXmlProperty(localName = "warning-list")

    private List<WarningList> warningList = null;

    public DetectLiveByBase64IntlResponse withVideoResult(LiveDetectRespVideoresult videoResult) {
        this.videoResult = videoResult;
        return this;
    }

    public DetectLiveByBase64IntlResponse withVideoResult(Consumer<LiveDetectRespVideoresult> videoResultSetter) {
        if (this.videoResult == null) {
            this.videoResult = new LiveDetectRespVideoresult();
            videoResultSetter.accept(this.videoResult);
        }

        return this;
    }

    /**
     * Get videoResult
     * @return videoResult
     */
    public LiveDetectRespVideoresult getVideoResult() {
        return videoResult;
    }

    public void setVideoResult(LiveDetectRespVideoresult videoResult) {
        this.videoResult = videoResult;
    }

    public DetectLiveByBase64IntlResponse withWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
        return this;
    }

    public DetectLiveByBase64IntlResponse addWarningListItem(WarningList warningListItem) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        this.warningList.add(warningListItem);
        return this;
    }

    public DetectLiveByBase64IntlResponse withWarningList(Consumer<List<WarningList>> warningListSetter) {
        if (this.warningList == null) {
            this.warningList = new ArrayList<>();
        }
        warningListSetter.accept(this.warningList);
        return this;
    }

    /**
     * [警告信息列表，WarningList结构见[WarningList](https://support.huaweicloud.com/api-face/face_02_0077.html)。调用失败时无此字段](tag:hc) [警告信息列表，WarningList结构见[WarningList](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0077.html)。调用失败时无此字段](tag:hk)
     * @return warningList
     */
    public List<WarningList> getWarningList() {
        return warningList;
    }

    public void setWarningList(List<WarningList> warningList) {
        this.warningList = warningList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetectLiveByBase64IntlResponse detectLiveByBase64IntlResponse = (DetectLiveByBase64IntlResponse) o;
        return Objects.equals(this.videoResult, detectLiveByBase64IntlResponse.videoResult)
            && Objects.equals(this.warningList, detectLiveByBase64IntlResponse.warningList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoResult, warningList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveByBase64IntlResponse {\n");
        sb.append("    videoResult: ").append(toIndentedString(videoResult)).append("\n");
        sb.append("    warningList: ").append(toIndentedString(warningList)).append("\n");
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
