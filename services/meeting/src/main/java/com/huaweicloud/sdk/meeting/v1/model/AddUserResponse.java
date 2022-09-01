package com.huaweicloud.sdk.meeting.v1.model;

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
public class AddUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userAccount")

    @JacksonXmlProperty(localName = "userAccount")

    private String userAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "englishName")

    @JacksonXmlProperty(localName = "englishName")

    private String englishName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    @JacksonXmlProperty(localName = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    @JacksonXmlProperty(localName = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    @JacksonXmlProperty(localName = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sipNum")

    @JacksonXmlProperty(localName = "sipNum")

    private String sipNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrList")

    @JacksonXmlProperty(localName = "vmrList")

    private List<UserVmrDTO> vmrList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    @JacksonXmlProperty(localName = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    @JacksonXmlProperty(localName = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptNamePath")

    @JacksonXmlProperty(localName = "deptNamePath")

    private String deptNamePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userType")

    @JacksonXmlProperty(localName = "userType")

    private Integer userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminType")

    @JacksonXmlProperty(localName = "adminType")

    private Integer adminType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    @JacksonXmlProperty(localName = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    @JacksonXmlProperty(localName = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    @JacksonXmlProperty(localName = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corp")

    @JacksonXmlProperty(localName = "corp")

    private CorpBasicInfoDTO corp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    @JacksonXmlProperty(localName = "function")

    private UserFunctionDTO function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devType")

    @JacksonXmlProperty(localName = "devType")

    private QueryDeviceInfoResultDTO devType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    @JacksonXmlProperty(localName = "sortLevel")

    private Integer sortLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hidePhone")

    @JacksonXmlProperty(localName = "hidePhone")

    private Boolean hidePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visionAccount")

    @JacksonXmlProperty(localName = "visionAccount")

    private String visionAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdAccount")

    @JacksonXmlProperty(localName = "thirdAccount")

    private String thirdAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license")

    @JacksonXmlProperty(localName = "license")

    private Integer license;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activeTime")

    @JacksonXmlProperty(localName = "activeTime")

    private Long activeTime;

    public AddUserResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddUserResponse withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    /**
     * 账号
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public AddUserResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddUserResponse withEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }

    /**
     * 英文名称
     * @return englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public AddUserResponse withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 联系电话
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddUserResponse withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 联系电话所属的国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddUserResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddUserResponse withSipNum(String sipNum) {
        this.sipNum = sipNum;
        return this;
    }

    /**
     * SIP号码
     * @return sipNum
     */
    public String getSipNum() {
        return sipNum;
    }

    public void setSipNum(String sipNum) {
        this.sipNum = sipNum;
    }

    public AddUserResponse withVmrList(List<UserVmrDTO> vmrList) {
        this.vmrList = vmrList;
        return this;
    }

    public AddUserResponse addVmrListItem(UserVmrDTO vmrListItem) {
        if (this.vmrList == null) {
            this.vmrList = new ArrayList<>();
        }
        this.vmrList.add(vmrListItem);
        return this;
    }

    public AddUserResponse withVmrList(Consumer<List<UserVmrDTO>> vmrListSetter) {
        if (this.vmrList == null) {
            this.vmrList = new ArrayList<>();
        }
        vmrListSetter.accept(this.vmrList);
        return this;
    }

    /**
     * 云会议室列表
     * @return vmrList
     */
    public List<UserVmrDTO> getVmrList() {
        return vmrList;
    }

    public void setVmrList(List<UserVmrDTO> vmrList) {
        this.vmrList = vmrList;
    }

    public AddUserResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * 部门编码
     * @return deptCode
     */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public AddUserResponse withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public AddUserResponse withDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
        return this;
    }

    /**
     * 部门完整名称
     * @return deptNamePath
     */
    public String getDeptNamePath() {
        return deptNamePath;
    }

    public void setDeptNamePath(String deptNamePath) {
        this.deptNamePath = deptNamePath;
    }

    public AddUserResponse withUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 用户类型 - 2：企业成员账户
     * @return userType
     */
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public AddUserResponse withAdminType(Integer adminType) {
        this.adminType = adminType;
        return this;
    }

    /**
     * 管理员类型 - 0：默认（超级）管理员 - 1：普通管理员 - 2：非管理员（即为普通企业成员，UserType是2时有效）
     * @return adminType
     */
    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public AddUserResponse withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public AddUserResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 职位
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AddUserResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 备注
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AddUserResponse withCorp(CorpBasicInfoDTO corp) {
        this.corp = corp;
        return this;
    }

    public AddUserResponse withCorp(Consumer<CorpBasicInfoDTO> corpSetter) {
        if (this.corp == null) {
            this.corp = new CorpBasicInfoDTO();
            corpSetter.accept(this.corp);
        }

        return this;
    }

    /**
     * Get corp
     * @return corp
     */
    public CorpBasicInfoDTO getCorp() {
        return corp;
    }

    public void setCorp(CorpBasicInfoDTO corp) {
        this.corp = corp;
    }

    public AddUserResponse withFunction(UserFunctionDTO function) {
        this.function = function;
        return this;
    }

    public AddUserResponse withFunction(Consumer<UserFunctionDTO> functionSetter) {
        if (this.function == null) {
            this.function = new UserFunctionDTO();
            functionSetter.accept(this.function);
        }

        return this;
    }

    /**
     * Get function
     * @return function
     */
    public UserFunctionDTO getFunction() {
        return function;
    }

    public void setFunction(UserFunctionDTO function) {
        this.function = function;
    }

    public AddUserResponse withDevType(QueryDeviceInfoResultDTO devType) {
        this.devType = devType;
        return this;
    }

    public AddUserResponse withDevType(Consumer<QueryDeviceInfoResultDTO> devTypeSetter) {
        if (this.devType == null) {
            this.devType = new QueryDeviceInfoResultDTO();
            devTypeSetter.accept(this.devType);
        }

        return this;
    }

    /**
     * Get devType
     * @return devType
     */
    public QueryDeviceInfoResultDTO getDevType() {
        return devType;
    }

    public void setDevType(QueryDeviceInfoResultDTO devType) {
        this.devType = devType;
    }

    public AddUserResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 用户状态 * 0、正常 * 1、停用 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AddUserResponse withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 通讯录排序等级，序号越低优先级越高
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    public AddUserResponse withHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
        return this;
    }

    /**
     * 是否隐藏手机号码
     * @return hidePhone
     */
    public Boolean getHidePhone() {
        return hidePhone;
    }

    public void setHidePhone(Boolean hidePhone) {
        this.hidePhone = hidePhone;
    }

    public AddUserResponse withVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
        return this;
    }

    /**
     * 智慧屏唯一账号
     * @return visionAccount
     */
    public String getVisionAccount() {
        return visionAccount;
    }

    public void setVisionAccount(String visionAccount) {
        this.visionAccount = visionAccount;
    }

    public AddUserResponse withThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
        return this;
    }

    /**
     * 第三方账号，自动开户的第三方账号、Ideahub账号的sn等
     * @return thirdAccount
     */
    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
    }

    public AddUserResponse withLicense(Integer license) {
        this.license = license;
        return this;
    }

    /**
     * 许可证 * 0：商用； * 1：免费试用。 
     * @return license
     */
    public Integer getLicense() {
        return license;
    }

    public void setLicense(Integer license) {
        this.license = license;
    }

    public AddUserResponse withActiveTime(Long activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 激活时间，utc时间戳
     * @return activeTime
     */
    public Long getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Long activeTime) {
        this.activeTime = activeTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddUserResponse addUserResponse = (AddUserResponse) o;
        return Objects.equals(this.id, addUserResponse.id)
            && Objects.equals(this.userAccount, addUserResponse.userAccount)
            && Objects.equals(this.name, addUserResponse.name)
            && Objects.equals(this.englishName, addUserResponse.englishName)
            && Objects.equals(this.phone, addUserResponse.phone)
            && Objects.equals(this.country, addUserResponse.country)
            && Objects.equals(this.email, addUserResponse.email) && Objects.equals(this.sipNum, addUserResponse.sipNum)
            && Objects.equals(this.vmrList, addUserResponse.vmrList)
            && Objects.equals(this.deptCode, addUserResponse.deptCode)
            && Objects.equals(this.deptName, addUserResponse.deptName)
            && Objects.equals(this.deptNamePath, addUserResponse.deptNamePath)
            && Objects.equals(this.userType, addUserResponse.userType)
            && Objects.equals(this.adminType, addUserResponse.adminType)
            && Objects.equals(this.signature, addUserResponse.signature)
            && Objects.equals(this.title, addUserResponse.title) && Objects.equals(this.desc, addUserResponse.desc)
            && Objects.equals(this.corp, addUserResponse.corp)
            && Objects.equals(this.function, addUserResponse.function)
            && Objects.equals(this.devType, addUserResponse.devType)
            && Objects.equals(this.status, addUserResponse.status)
            && Objects.equals(this.sortLevel, addUserResponse.sortLevel)
            && Objects.equals(this.hidePhone, addUserResponse.hidePhone)
            && Objects.equals(this.visionAccount, addUserResponse.visionAccount)
            && Objects.equals(this.thirdAccount, addUserResponse.thirdAccount)
            && Objects.equals(this.license, addUserResponse.license)
            && Objects.equals(this.activeTime, addUserResponse.activeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userAccount,
            name,
            englishName,
            phone,
            country,
            email,
            sipNum,
            vmrList,
            deptCode,
            deptName,
            deptNamePath,
            userType,
            adminType,
            signature,
            title,
            desc,
            corp,
            function,
            devType,
            status,
            sortLevel,
            hidePhone,
            visionAccount,
            thirdAccount,
            license,
            activeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddUserResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sipNum: ").append(toIndentedString(sipNum)).append("\n");
        sb.append("    vmrList: ").append(toIndentedString(vmrList)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    deptNamePath: ").append(toIndentedString(deptNamePath)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    adminType: ").append(toIndentedString(adminType)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    corp: ").append(toIndentedString(corp)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    devType: ").append(toIndentedString(devType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
        sb.append("    hidePhone: ").append(toIndentedString(hidePhone)).append("\n");
        sb.append("    visionAccount: ").append(toIndentedString(visionAccount)).append("\n");
        sb.append("    thirdAccount: ").append(toIndentedString(thirdAccount)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
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
