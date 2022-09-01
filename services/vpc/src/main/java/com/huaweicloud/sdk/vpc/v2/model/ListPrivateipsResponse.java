package com.huaweicloud.sdk.vpc.v2.model;

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
public class ListPrivateipsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateips")

    @JacksonXmlProperty(localName = "privateips")

    private List<Privateip> privateips = null;

    public ListPrivateipsResponse withPrivateips(List<Privateip> privateips) {
        this.privateips = privateips;
        return this;
    }

    public ListPrivateipsResponse addPrivateipsItem(Privateip privateipsItem) {
        if (this.privateips == null) {
            this.privateips = new ArrayList<>();
        }
        this.privateips.add(privateipsItem);
        return this;
    }

    public ListPrivateipsResponse withPrivateips(Consumer<List<Privateip>> privateipsSetter) {
        if (this.privateips == null) {
            this.privateips = new ArrayList<>();
        }
        privateipsSetter.accept(this.privateips);
        return this;
    }

    /**
     * 私有IP列表对象
     * @return privateips
     */
    public List<Privateip> getPrivateips() {
        return privateips;
    }

    public void setPrivateips(List<Privateip> privateips) {
        this.privateips = privateips;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPrivateipsResponse listPrivateipsResponse = (ListPrivateipsResponse) o;
        return Objects.equals(this.privateips, listPrivateipsResponse.privateips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateipsResponse {\n");
        sb.append("    privateips: ").append(toIndentedString(privateips)).append("\n");
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
