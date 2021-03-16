package com.huaweicloud.sdk.devstar.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.RepositoryInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CodehubJobInfo
 */
public class CodehubJobInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_name")
    
    private String applicationName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code_url")
    
    private String codeUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;
    /**
     * 0 - 将生成的应用代码存储于 repo_info 指定的 CodeHub 仓库中。1 - 将生成的应用代码存储到华为云，任务创建人可以通过 ExportApplicationCode 下载代码压缩包
     */
    public static final class RepoTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RepoTypeEnum NUMBER_0 = new RepoTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final RepoTypeEnum NUMBER_1 = new RepoTypeEnum(1);
        

        private static final Map<Integer, RepoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RepoTypeEnum> createStaticFields() {
            Map<Integer, RepoTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RepoTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RepoTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RepoTypeEnum(value);
            }
            return result;
        }

        public static RepoTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            RepoTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RepoTypeEnum) {
                return this.value.equals(((RepoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_type")
    
    private RepoTypeEnum repoType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Map<String, String> properties = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repo_info")
    
    private RepositoryInfo repoInfo;

    public CodehubJobInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    


    /**
     * 应用名称
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    

    public CodehubJobInfo withCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }

    


    /**
     * 代码存放的ssh地址
     * @return codeUrl
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    

    public CodehubJobInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * CodeHub 仓库所在的 Region ID。华南-广州: cn-south-1, 华东-上海二：cn-east-2，华北-北京一： cn-north-1 ，华北-北京四：cn-north-4
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    

    public CodehubJobInfo withRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
        return this;
    }

    


    /**
     * 0 - 将生成的应用代码存储于 repo_info 指定的 CodeHub 仓库中。1 - 将生成的应用代码存储到华为云，任务创建人可以通过 ExportApplicationCode 下载代码压缩包
     * @return repoType
     */
    public RepoTypeEnum getRepoType() {
        return repoType;
    }

    public void setRepoType(RepoTypeEnum repoType) {
        this.repoType = repoType;
    }

    

    public CodehubJobInfo withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    

    public CodehubJobInfo putPropertiesItem(String key, String propertiesItem) {
        this.properties.put(key, propertiesItem);
        return this;
    }

    public CodehubJobInfo withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if(this.properties == null ){
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }
    /**
     * 可以根据 template-metadata.json 获取动态参数 ID 以及规则
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    

    public CodehubJobInfo withRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
        return this;
    }

    public CodehubJobInfo withRepoInfo(Consumer<RepositoryInfo> repoInfoSetter) {
        if(this.repoInfo == null ){
            this.repoInfo = new RepositoryInfo();
            repoInfoSetter.accept(this.repoInfo);
        }
        
        return this;
    }


    /**
     * Get repoInfo
     * @return repoInfo
     */
    public RepositoryInfo getRepoInfo() {
        return repoInfo;
    }

    public void setRepoInfo(RepositoryInfo repoInfo) {
        this.repoInfo = repoInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodehubJobInfo codehubJobInfo = (CodehubJobInfo) o;
        return Objects.equals(this.applicationName, codehubJobInfo.applicationName) &&
            Objects.equals(this.codeUrl, codehubJobInfo.codeUrl) &&
            Objects.equals(this.regionId, codehubJobInfo.regionId) &&
            Objects.equals(this.repoType, codehubJobInfo.repoType) &&
            Objects.equals(this.properties, codehubJobInfo.properties) &&
            Objects.equals(this.repoInfo, codehubJobInfo.repoInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationName, codeUrl, regionId, repoType, properties, repoInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodehubJobInfo {\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    codeUrl: ").append(toIndentedString(codeUrl)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    repoInfo: ").append(toIndentedString(repoInfo)).append("\n");
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

