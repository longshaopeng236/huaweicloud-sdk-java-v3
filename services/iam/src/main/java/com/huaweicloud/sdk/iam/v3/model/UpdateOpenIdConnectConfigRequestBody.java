package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateOpenIdConnectConfig;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateOpenIdConnectConfigRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="openid_connect_config")
    
    private UpdateOpenIdConnectConfig openidConnectConfig;

    public UpdateOpenIdConnectConfigRequestBody withOpenidConnectConfig(UpdateOpenIdConnectConfig openidConnectConfig) {
        this.openidConnectConfig = openidConnectConfig;
        return this;
    }

    public UpdateOpenIdConnectConfigRequestBody withOpenidConnectConfig(Consumer<UpdateOpenIdConnectConfig> openidConnectConfigSetter) {
        if(this.openidConnectConfig == null ){
            this.openidConnectConfig = new UpdateOpenIdConnectConfig();
            openidConnectConfigSetter.accept(this.openidConnectConfig);
        }
        
        return this;
    }


    /**
     * Get openidConnectConfig
     * @return openidConnectConfig
     */
    public UpdateOpenIdConnectConfig getOpenidConnectConfig() {
        return openidConnectConfig;
    }

    public void setOpenidConnectConfig(UpdateOpenIdConnectConfig openidConnectConfig) {
        this.openidConnectConfig = openidConnectConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateOpenIdConnectConfigRequestBody updateOpenIdConnectConfigRequestBody = (UpdateOpenIdConnectConfigRequestBody) o;
        return Objects.equals(this.openidConnectConfig, updateOpenIdConnectConfigRequestBody.openidConnectConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(openidConnectConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpenIdConnectConfigRequestBody {\n");
        sb.append("    openidConnectConfig: ").append(toIndentedString(openidConnectConfig)).append("\n");
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

