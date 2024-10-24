package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 输出编码扩展
 */
public class EncoderSettingsExpand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_descriptions")

    private List<EncoderSettingsExpandAudioDescriptions> audioDescriptions = null;

    public EncoderSettingsExpand withAudioDescriptions(List<EncoderSettingsExpandAudioDescriptions> audioDescriptions) {
        this.audioDescriptions = audioDescriptions;
        return this;
    }

    public EncoderSettingsExpand addAudioDescriptionsItem(
        EncoderSettingsExpandAudioDescriptions audioDescriptionsItem) {
        if (this.audioDescriptions == null) {
            this.audioDescriptions = new ArrayList<>();
        }
        this.audioDescriptions.add(audioDescriptionsItem);
        return this;
    }

    public EncoderSettingsExpand withAudioDescriptions(
        Consumer<List<EncoderSettingsExpandAudioDescriptions>> audioDescriptionsSetter) {
        if (this.audioDescriptions == null) {
            this.audioDescriptions = new ArrayList<>();
        }
        audioDescriptionsSetter.accept(this.audioDescriptions);
        return this;
    }

    /**
     * 音频输出配置的描述信息
     * @return audioDescriptions
     */
    public List<EncoderSettingsExpandAudioDescriptions> getAudioDescriptions() {
        return audioDescriptions;
    }

    public void setAudioDescriptions(List<EncoderSettingsExpandAudioDescriptions> audioDescriptions) {
        this.audioDescriptions = audioDescriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncoderSettingsExpand that = (EncoderSettingsExpand) obj;
        return Objects.equals(this.audioDescriptions, that.audioDescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioDescriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncoderSettingsExpand {\n");
        sb.append("    audioDescriptions: ").append(toIndentedString(audioDescriptions)).append("\n");
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
