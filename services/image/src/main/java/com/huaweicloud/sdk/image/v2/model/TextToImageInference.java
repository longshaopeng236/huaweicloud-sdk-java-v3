package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TextToImageInference
 */
public class TextToImageInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed")

    private Integer seed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    public TextToImageInference withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 文生图引导词
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public TextToImageInference withSeed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * 随机数种子
     * minimum: 0
     * maximum: 2147483648
     * @return seed
     */
    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public TextToImageInference withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 生成图片分辨率，限定字符串\"512*768\",\"768*512\",\"512*512\",\"1024*768\",\"768*1024\"，默认\"512*512\"
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextToImageInference textToImageInference = (TextToImageInference) o;
        return Objects.equals(this.prompt, textToImageInference.prompt)
            && Objects.equals(this.seed, textToImageInference.seed)
            && Objects.equals(this.resolution, textToImageInference.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prompt, seed, resolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextToImageInference {\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
