package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PolicyParameterDefinition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBuiltInPolicyDefinitionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_type")
    
    private String policyType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_rule_type")
    
    private String policyRuleType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_rule")
    
    private Object policyRule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    private List<String> keywords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private Map<String, PolicyParameterDefinition> parameters = null;
    
    public ShowBuiltInPolicyDefinitionResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 策略名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    


    /**
     * 策略类型
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withPolicyRuleType(String policyRuleType) {
        this.policyRuleType = policyRuleType;
        return this;
    }

    


    /**
     * 策略语法类型
     * @return policyRuleType
     */
    public String getPolicyRuleType() {
        return policyRuleType;
    }

    public void setPolicyRuleType(String policyRuleType) {
        this.policyRuleType = policyRuleType;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    


    /**
     * 策略规则
     * @return policyRule
     */
    public Object getPolicyRule() {
        return policyRule;
    }

    public void setPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    
    public ShowBuiltInPolicyDefinitionResponse addKeywordsItem(String keywordsItem) {
        this.keywords.add(keywordsItem);
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse withKeywords(Consumer<List<String>> keywordsSetter) {
        if(this.keywords == null ){
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 关键词列表
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    

    public ShowBuiltInPolicyDefinitionResponse withParameters(Map<String, PolicyParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    

    public ShowBuiltInPolicyDefinitionResponse putParametersItem(String key, PolicyParameterDefinition parametersItem) {
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse withParameters(Consumer<Map<String, PolicyParameterDefinition>> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }
    /**
     * 策略参数
     * @return parameters
     */
    public Map<String, PolicyParameterDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterDefinition> parameters) {
        this.parameters = parameters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBuiltInPolicyDefinitionResponse showBuiltInPolicyDefinitionResponse = (ShowBuiltInPolicyDefinitionResponse) o;
        return Objects.equals(this.id, showBuiltInPolicyDefinitionResponse.id) &&
            Objects.equals(this.name, showBuiltInPolicyDefinitionResponse.name) &&
            Objects.equals(this.policyType, showBuiltInPolicyDefinitionResponse.policyType) &&
            Objects.equals(this.description, showBuiltInPolicyDefinitionResponse.description) &&
            Objects.equals(this.policyRuleType, showBuiltInPolicyDefinitionResponse.policyRuleType) &&
            Objects.equals(this.policyRule, showBuiltInPolicyDefinitionResponse.policyRule) &&
            Objects.equals(this.keywords, showBuiltInPolicyDefinitionResponse.keywords) &&
            Objects.equals(this.parameters, showBuiltInPolicyDefinitionResponse.parameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, policyType, description, policyRuleType, policyRule, keywords, parameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuiltInPolicyDefinitionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyRuleType: ").append(toIndentedString(policyRuleType)).append("\n");
        sb.append("    policyRule: ").append(toIndentedString(policyRule)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

