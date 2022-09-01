package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVariableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_id")

    @JacksonXmlProperty(localName = "test_suite_id")

    private Integer testSuiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private List<UpdateVariableRequestBody> body = null;

    public UpdateVariableRequest withTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuiteId
     */
    public Integer getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(Integer testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public UpdateVariableRequest withBody(List<UpdateVariableRequestBody> body) {
        this.body = body;
        return this;
    }

    public UpdateVariableRequest addBodyItem(UpdateVariableRequestBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public UpdateVariableRequest withBody(Consumer<List<UpdateVariableRequestBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<UpdateVariableRequestBody> getBody() {
        return body;
    }

    public void setBody(List<UpdateVariableRequestBody> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVariableRequest updateVariableRequest = (UpdateVariableRequest) o;
        return Objects.equals(this.testSuiteId, updateVariableRequest.testSuiteId)
            && Objects.equals(this.body, updateVariableRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testSuiteId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVariableRequest {\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
