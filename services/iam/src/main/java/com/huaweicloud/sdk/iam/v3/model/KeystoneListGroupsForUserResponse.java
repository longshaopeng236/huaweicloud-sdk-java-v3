package com.huaweicloud.sdk.iam.v3.model;

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
public class KeystoneListGroupsForUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    @JacksonXmlProperty(localName = "groups")

    private List<KeystoneGroupResult> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private Links links;

    public KeystoneListGroupsForUserResponse withGroups(List<KeystoneGroupResult> groups) {
        this.groups = groups;
        return this;
    }

    public KeystoneListGroupsForUserResponse addGroupsItem(KeystoneGroupResult groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public KeystoneListGroupsForUserResponse withGroups(Consumer<List<KeystoneGroupResult>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组信息列表。
     * @return groups
     */
    public List<KeystoneGroupResult> getGroups() {
        return groups;
    }

    public void setGroups(List<KeystoneGroupResult> groups) {
        this.groups = groups;
    }

    public KeystoneListGroupsForUserResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListGroupsForUserResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListGroupsForUserResponse keystoneListGroupsForUserResponse = (KeystoneListGroupsForUserResponse) o;
        return Objects.equals(this.groups, keystoneListGroupsForUserResponse.groups)
            && Objects.equals(this.links, keystoneListGroupsForUserResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListGroupsForUserResponse {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
