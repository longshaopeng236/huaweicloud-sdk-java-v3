package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.CustomerInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSubCustomersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_infos")
    
    private List<CustomerInformation> customerInfos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListSubCustomersResponse withCustomerInfos(List<CustomerInformation> customerInfos) {
        this.customerInfos = customerInfos;
        return this;
    }

    
    public ListSubCustomersResponse addCustomerInfosItem(CustomerInformation customerInfosItem) {
        if(this.customerInfos == null) {
            this.customerInfos = new ArrayList<>();
        }
        this.customerInfos.add(customerInfosItem);
        return this;
    }

    public ListSubCustomersResponse withCustomerInfos(Consumer<List<CustomerInformation>> customerInfosSetter) {
        if(this.customerInfos == null) {
            this.customerInfos = new ArrayList<>();
        }
        customerInfosSetter.accept(this.customerInfos);
        return this;
    }

    /**
     * |参数名称：客户信息列表。具体请参见表 CustomerInfo| |参数约束以及描述：客户信息列表。具体请参见表 CustomerInfo|
     * @return customerInfos
     */
    public List<CustomerInformation> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInformation> customerInfos) {
        this.customerInfos = customerInfos;
    }

    

    public ListSubCustomersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * |参数名称：总记录数。| |参数的约束及描述：总记录数。|
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomersResponse listSubCustomersResponse = (ListSubCustomersResponse) o;
        return Objects.equals(this.customerInfos, listSubCustomersResponse.customerInfos) &&
            Objects.equals(this.count, listSubCustomersResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerInfos, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomersResponse {\n");
        sb.append("    customerInfos: ").append(toIndentedString(customerInfos)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

