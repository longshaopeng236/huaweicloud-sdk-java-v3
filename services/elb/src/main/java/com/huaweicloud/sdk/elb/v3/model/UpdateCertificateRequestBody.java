package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    @JacksonXmlProperty(localName = "certificate")

    private UpdateCertificateOption certificate;

    public UpdateCertificateRequestBody withCertificate(UpdateCertificateOption certificate) {
        this.certificate = certificate;
        return this;
    }

    public UpdateCertificateRequestBody withCertificate(Consumer<UpdateCertificateOption> certificateSetter) {
        if (this.certificate == null) {
            this.certificate = new UpdateCertificateOption();
            certificateSetter.accept(this.certificate);
        }

        return this;
    }

    /**
     * Get certificate
     * @return certificate
     */
    public UpdateCertificateOption getCertificate() {
        return certificate;
    }

    public void setCertificate(UpdateCertificateOption certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCertificateRequestBody updateCertificateRequestBody = (UpdateCertificateRequestBody) o;
        return Objects.equals(this.certificate, updateCertificateRequestBody.certificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateRequestBody {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
