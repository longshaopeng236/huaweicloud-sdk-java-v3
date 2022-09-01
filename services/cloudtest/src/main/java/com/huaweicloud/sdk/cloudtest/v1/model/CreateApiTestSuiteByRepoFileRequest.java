package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateApiTestSuiteByRepoFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private CreateTestSuitByRepoFileInfo body;

    public CreateApiTestSuiteByRepoFileRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateApiTestSuiteByRepoFileRequest withBody(CreateTestSuitByRepoFileInfo body) {
        this.body = body;
        return this;
    }

    public CreateApiTestSuiteByRepoFileRequest withBody(Consumer<CreateTestSuitByRepoFileInfo> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTestSuitByRepoFileInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTestSuitByRepoFileInfo getBody() {
        return body;
    }

    public void setBody(CreateTestSuitByRepoFileInfo body) {
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
        CreateApiTestSuiteByRepoFileRequest createApiTestSuiteByRepoFileRequest =
            (CreateApiTestSuiteByRepoFileRequest) o;
        return Objects.equals(this.projectId, createApiTestSuiteByRepoFileRequest.projectId)
            && Objects.equals(this.body, createApiTestSuiteByRepoFileRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApiTestSuiteByRepoFileRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
