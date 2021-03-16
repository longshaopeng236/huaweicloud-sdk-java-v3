package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchAddMemberRequestV4
 */
public class BatchAddMemberRequestV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private Integer roleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;

    public BatchAddMemberRequestV4 withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * 用户在项目中的角色ID -1, 3, 4, 5, 6, 7 , 8
     * @return roleId
     */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    

    public BatchAddMemberRequestV4 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户32位uuid
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddMemberRequestV4 batchAddMemberRequestV4 = (BatchAddMemberRequestV4) o;
        return Objects.equals(this.roleId, batchAddMemberRequestV4.roleId) &&
            Objects.equals(this.userId, batchAddMemberRequestV4.userId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(roleId, userId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddMemberRequestV4 {\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

