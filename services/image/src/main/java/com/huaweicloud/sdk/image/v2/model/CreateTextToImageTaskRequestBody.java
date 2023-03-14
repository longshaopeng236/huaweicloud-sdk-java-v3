package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTextToImageTaskRequestBody
 */
public class CreateTextToImageTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private TextToImageTaskConfig config;

    public CreateTextToImageTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateTextToImageTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public CreateTextToImageTaskRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public CreateTextToImageTaskRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
        if (this.callback == null) {
            this.callback = new TaskCallback();
            callbackSetter.accept(this.callback);
        }

        return this;
    }

    /**
     * Get callback
     * @return callback
     */
    public TaskCallback getCallback() {
        return callback;
    }

    public void setCallback(TaskCallback callback) {
        this.callback = callback;
    }

    public CreateTextToImageTaskRequestBody withConfig(TextToImageTaskConfig config) {
        this.config = config;
        return this;
    }

    public CreateTextToImageTaskRequestBody withConfig(Consumer<TextToImageTaskConfig> configSetter) {
        if (this.config == null) {
            this.config = new TextToImageTaskConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public TextToImageTaskConfig getConfig() {
        return config;
    }

    public void setConfig(TextToImageTaskConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTextToImageTaskRequestBody createTextToImageTaskRequestBody = (CreateTextToImageTaskRequestBody) o;
        return Objects.equals(this.output, createTextToImageTaskRequestBody.output)
            && Objects.equals(this.callback, createTextToImageTaskRequestBody.callback)
            && Objects.equals(this.config, createTextToImageTaskRequestBody.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output, callback, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTextToImageTaskRequestBody {\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
