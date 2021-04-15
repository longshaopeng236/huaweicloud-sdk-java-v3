package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.VideoSettings;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QualityEnhance
 */
public class QualityEnhance  {

    /**
     * 针对一般质量、无明显问题的普通片源，通过增强、锐化等技术明显提升主观效果。单纯该处理操作前后，分辨率、帧率等参数不发生变化。 可和old_repair、super_resolution、super_framerate、SDRToHDR组合使用。 
     */
    public static final class NormalEnhanceEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final NormalEnhanceEnum NORMAL = new NormalEnhanceEnum("normal");
        

        private static final Map<String, NormalEnhanceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NormalEnhanceEnum> createStaticFields() {
            Map<String, NormalEnhanceEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NormalEnhanceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NormalEnhanceEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NormalEnhanceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NormalEnhanceEnum(value);
            }
            return result;
        }

        public static NormalEnhanceEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NormalEnhanceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NormalEnhanceEnum) {
                return this.value.equals(((NormalEnhanceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="normal_enhance")
    
    private NormalEnhanceEnum normalEnhance;
    /**
     * 针对旧片、老片，画质主观质量比较低的片源，通过降噪、去压缩失真等视频增强技术，提升画质主观效果。 
     */
    public static final class ReviveEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final ReviveEnum NORMAL = new ReviveEnum("normal");
        

        private static final Map<String, ReviveEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReviveEnum> createStaticFields() {
            Map<String, ReviveEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReviveEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReviveEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ReviveEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReviveEnum(value);
            }
            return result;
        }

        public static ReviveEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ReviveEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ReviveEnum) {
                return this.value.equals(((ReviveEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="revive")
    
    private ReviveEnum revive;
    /**
     * 超动态范围，提升视频动态范围，明显提升片源动态范围。单纯该处理操作前后，分辨率、帧率等参数不发生变化，动态范围、色域范围、码率发生变化。 可和normal_ enhance组合使用。 取值范围： - SDRtoHDR10 ：转换模式1，为标准模式 - SDRtoHDRFLAT”：转换模式2，清新模式，基本不改变源片的饱和度，适用于饱和度高的SDR源片转换为HDR 
     */
    public static final class SdrToHdrEnum {

        
        /**
         * Enum SDRTOHDR10 for value: "SDRtoHDR10"
         */
        public static final SdrToHdrEnum SDRTOHDR10 = new SdrToHdrEnum("SDRtoHDR10");
        
        /**
         * Enum SDRTOHDR10FLAT for value: "SDRtoHDR10FLAT"
         */
        public static final SdrToHdrEnum SDRTOHDR10FLAT = new SdrToHdrEnum("SDRtoHDR10FLAT");
        

        private static final Map<String, SdrToHdrEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SdrToHdrEnum> createStaticFields() {
            Map<String, SdrToHdrEnum> map = new HashMap<>();
            map.put("SDRtoHDR10", SDRTOHDR10);
            map.put("SDRtoHDR10FLAT", SDRTOHDR10FLAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SdrToHdrEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SdrToHdrEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SdrToHdrEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SdrToHdrEnum(value);
            }
            return result;
        }

        public static SdrToHdrEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SdrToHdrEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SdrToHdrEnum) {
                return this.value.equals(((SdrToHdrEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdr_to_hdr")
    
    private SdrToHdrEnum sdrToHdr;
    /**
     * 视频增强模式。取值范围： - REGENERATION - CONVERSION_SDR - CONVERSION_HDR 
     */
    public static final class VideoEnhanceEnum {

        
        /**
         * Enum REGENERATION for value: "REGENERATION"
         */
        public static final VideoEnhanceEnum REGENERATION = new VideoEnhanceEnum("REGENERATION");
        
        /**
         * Enum CONVERSION_SDR for value: "CONVERSION_SDR"
         */
        public static final VideoEnhanceEnum CONVERSION_SDR = new VideoEnhanceEnum("CONVERSION_SDR");
        
        /**
         * Enum CONVERSION_HDR for value: "CONVERSION_HDR"
         */
        public static final VideoEnhanceEnum CONVERSION_HDR = new VideoEnhanceEnum("CONVERSION_HDR");
        

        private static final Map<String, VideoEnhanceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoEnhanceEnum> createStaticFields() {
            Map<String, VideoEnhanceEnum> map = new HashMap<>();
            map.put("REGENERATION", REGENERATION);
            map.put("CONVERSION_SDR", CONVERSION_SDR);
            map.put("CONVERSION_HDR", CONVERSION_HDR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoEnhanceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VideoEnhanceEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VideoEnhanceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VideoEnhanceEnum(value);
            }
            return result;
        }

        public static VideoEnhanceEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VideoEnhanceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VideoEnhanceEnum) {
                return this.value.equals(((VideoEnhanceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_enhance")
    
    private VideoEnhanceEnum videoEnhance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_settings")
    
    private VideoSettings videoSettings;

    public QualityEnhance withNormalEnhance(NormalEnhanceEnum normalEnhance) {
        this.normalEnhance = normalEnhance;
        return this;
    }

    


    /**
     * 针对一般质量、无明显问题的普通片源，通过增强、锐化等技术明显提升主观效果。单纯该处理操作前后，分辨率、帧率等参数不发生变化。 可和old_repair、super_resolution、super_framerate、SDRToHDR组合使用。 
     * @return normalEnhance
     */
    public NormalEnhanceEnum getNormalEnhance() {
        return normalEnhance;
    }

    public void setNormalEnhance(NormalEnhanceEnum normalEnhance) {
        this.normalEnhance = normalEnhance;
    }

    

    public QualityEnhance withRevive(ReviveEnum revive) {
        this.revive = revive;
        return this;
    }

    


    /**
     * 针对旧片、老片，画质主观质量比较低的片源，通过降噪、去压缩失真等视频增强技术，提升画质主观效果。 
     * @return revive
     */
    public ReviveEnum getRevive() {
        return revive;
    }

    public void setRevive(ReviveEnum revive) {
        this.revive = revive;
    }

    

    public QualityEnhance withSdrToHdr(SdrToHdrEnum sdrToHdr) {
        this.sdrToHdr = sdrToHdr;
        return this;
    }

    


    /**
     * 超动态范围，提升视频动态范围，明显提升片源动态范围。单纯该处理操作前后，分辨率、帧率等参数不发生变化，动态范围、色域范围、码率发生变化。 可和normal_ enhance组合使用。 取值范围： - SDRtoHDR10 ：转换模式1，为标准模式 - SDRtoHDRFLAT”：转换模式2，清新模式，基本不改变源片的饱和度，适用于饱和度高的SDR源片转换为HDR 
     * @return sdrToHdr
     */
    public SdrToHdrEnum getSdrToHdr() {
        return sdrToHdr;
    }

    public void setSdrToHdr(SdrToHdrEnum sdrToHdr) {
        this.sdrToHdr = sdrToHdr;
    }

    

    public QualityEnhance withVideoEnhance(VideoEnhanceEnum videoEnhance) {
        this.videoEnhance = videoEnhance;
        return this;
    }

    


    /**
     * 视频增强模式。取值范围： - REGENERATION - CONVERSION_SDR - CONVERSION_HDR 
     * @return videoEnhance
     */
    public VideoEnhanceEnum getVideoEnhance() {
        return videoEnhance;
    }

    public void setVideoEnhance(VideoEnhanceEnum videoEnhance) {
        this.videoEnhance = videoEnhance;
    }

    

    public QualityEnhance withVideoSettings(VideoSettings videoSettings) {
        this.videoSettings = videoSettings;
        return this;
    }

    public QualityEnhance withVideoSettings(Consumer<VideoSettings> videoSettingsSetter) {
        if(this.videoSettings == null ){
            this.videoSettings = new VideoSettings();
            videoSettingsSetter.accept(this.videoSettings);
        }
        
        return this;
    }


    /**
     * Get videoSettings
     * @return videoSettings
     */
    public VideoSettings getVideoSettings() {
        return videoSettings;
    }

    public void setVideoSettings(VideoSettings videoSettings) {
        this.videoSettings = videoSettings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityEnhance qualityEnhance = (QualityEnhance) o;
        return Objects.equals(this.normalEnhance, qualityEnhance.normalEnhance) &&
            Objects.equals(this.revive, qualityEnhance.revive) &&
            Objects.equals(this.sdrToHdr, qualityEnhance.sdrToHdr) &&
            Objects.equals(this.videoEnhance, qualityEnhance.videoEnhance) &&
            Objects.equals(this.videoSettings, qualityEnhance.videoSettings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(normalEnhance, revive, sdrToHdr, videoEnhance, videoSettings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityEnhance {\n");
        sb.append("    normalEnhance: ").append(toIndentedString(normalEnhance)).append("\n");
        sb.append("    revive: ").append(toIndentedString(revive)).append("\n");
        sb.append("    sdrToHdr: ").append(toIndentedString(sdrToHdr)).append("\n");
        sb.append("    videoEnhance: ").append(toIndentedString(videoEnhance)).append("\n");
        sb.append("    videoSettings: ").append(toIndentedString(videoSettings)).append("\n");
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

