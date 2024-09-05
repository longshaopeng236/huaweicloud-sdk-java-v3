package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务器规格信息。
 */
public class FlavorQuasar {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private Integer disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpus")

    private List<GpuInfo> gpus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asic_accelerators")

    private List<ASICAcceleratorInfo> asicAccelerators = null;

    public FlavorQuasar withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器类型ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlavorQuasar withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlavorQuasar withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 该云服务器规格对应的CPU核数。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public FlavorQuasar withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 该云服务器规格对应的内存大小，单位为MB.
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public FlavorQuasar withDisk(Integer disk) {
        this.disk = disk;
        return this;
    }

    /**
     * 该云服务器规格对应要求系统盘大小，0为不限制。
     * @return disk
     */
    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public FlavorQuasar withGpus(List<GpuInfo> gpus) {
        this.gpus = gpus;
        return this;
    }

    public FlavorQuasar addGpusItem(GpuInfo gpusItem) {
        if (this.gpus == null) {
            this.gpus = new ArrayList<>();
        }
        this.gpus.add(gpusItem);
        return this;
    }

    public FlavorQuasar withGpus(Consumer<List<GpuInfo>> gpusSetter) {
        if (this.gpus == null) {
            this.gpus = new ArrayList<>();
        }
        gpusSetter.accept(this.gpus);
        return this;
    }

    /**
     * Get gpus
     * @return gpus
     */
    public List<GpuInfo> getGpus() {
        return gpus;
    }

    public void setGpus(List<GpuInfo> gpus) {
        this.gpus = gpus;
    }

    public FlavorQuasar withAsicAccelerators(List<ASICAcceleratorInfo> asicAccelerators) {
        this.asicAccelerators = asicAccelerators;
        return this;
    }

    public FlavorQuasar addAsicAcceleratorsItem(ASICAcceleratorInfo asicAcceleratorsItem) {
        if (this.asicAccelerators == null) {
            this.asicAccelerators = new ArrayList<>();
        }
        this.asicAccelerators.add(asicAcceleratorsItem);
        return this;
    }

    public FlavorQuasar withAsicAccelerators(Consumer<List<ASICAcceleratorInfo>> asicAcceleratorsSetter) {
        if (this.asicAccelerators == null) {
            this.asicAccelerators = new ArrayList<>();
        }
        asicAcceleratorsSetter.accept(this.asicAccelerators);
        return this;
    }

    /**
     * Get asicAccelerators
     * @return asicAccelerators
     */
    public List<ASICAcceleratorInfo> getAsicAccelerators() {
        return asicAccelerators;
    }

    public void setAsicAccelerators(List<ASICAcceleratorInfo> asicAccelerators) {
        this.asicAccelerators = asicAccelerators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorQuasar that = (FlavorQuasar) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.disk, that.disk) && Objects.equals(this.gpus, that.gpus)
            && Objects.equals(this.asicAccelerators, that.asicAccelerators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, vcpus, ram, disk, gpus, asicAccelerators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorQuasar {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    gpus: ").append(toIndentedString(gpus)).append("\n");
        sb.append("    asicAccelerators: ").append(toIndentedString(asicAccelerators)).append("\n");
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
