package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * app详情
 */
public class AppVersionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    @JacksonXmlProperty(localName = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    @JacksonXmlProperty(localName = "envs")

    private List<Env> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    @JacksonXmlProperty(localName = "volumes")

    private List<Volumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    @JacksonXmlProperty(localName = "configs")

    private AppConfigs configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    @JacksonXmlProperty(localName = "resources")

    private Resources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    @JacksonXmlProperty(localName = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    @JacksonXmlProperty(localName = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    @JacksonXmlProperty(localName = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    @JacksonXmlProperty(localName = "liveness_probe")

    private ProbeDetail livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    @JacksonXmlProperty(localName = "readiness_probe")

    private ProbeDetail readinessProbe;

    public AppVersionDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用版本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppVersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppVersionDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public AppVersionDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间 只有更新后才会出现该字段
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AppVersionDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AppVersionDetail withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 镜像存储地址
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AppVersionDetail withEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public AppVersionDetail addEnvsItem(Env envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public AppVersionDetail withEnvs(Consumer<List<Env>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 环境变量
     * @return envs
     */
    public List<Env> getEnvs() {
        return envs;
    }

    public void setEnvs(List<Env> envs) {
        this.envs = envs;
    }

    public AppVersionDetail withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public AppVersionDetail addVolumesItem(Volumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public AppVersionDetail withVolumes(Consumer<List<Volumes>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 卷配置
     * @return volumes
     */
    public List<Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
    }

    public AppVersionDetail withConfigs(AppConfigs configs) {
        this.configs = configs;
        return this;
    }

    public AppVersionDetail withConfigs(Consumer<AppConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new AppConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public AppConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(AppConfigs configs) {
        this.configs = configs;
    }

    public AppVersionDetail withResources(Resources resources) {
        this.resources = resources;
        return this;
    }

    public AppVersionDetail withResources(Consumer<Resources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new Resources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public AppVersionDetail withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public AppVersionDetail withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public AppVersionDetail addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public AppVersionDetail withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * 启动命令
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public AppVersionDetail withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public AppVersionDetail addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public AppVersionDetail withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 参数
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public AppVersionDetail withLivenessProbe(ProbeDetail livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public AppVersionDetail withLivenessProbe(Consumer<ProbeDetail> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new ProbeDetail();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public ProbeDetail getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(ProbeDetail livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public AppVersionDetail withReadinessProbe(ProbeDetail readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public AppVersionDetail withReadinessProbe(Consumer<ProbeDetail> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new ProbeDetail();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public ProbeDetail getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(ProbeDetail readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppVersionDetail appVersionDetail = (AppVersionDetail) o;
        return Objects.equals(this.id, appVersionDetail.id) && Objects.equals(this.version, appVersionDetail.version)
            && Objects.equals(this.createdAt, appVersionDetail.createdAt)
            && Objects.equals(this.updatedAt, appVersionDetail.updatedAt)
            && Objects.equals(this.projectId, appVersionDetail.projectId)
            && Objects.equals(this.imageUrl, appVersionDetail.imageUrl)
            && Objects.equals(this.envs, appVersionDetail.envs)
            && Objects.equals(this.volumes, appVersionDetail.volumes)
            && Objects.equals(this.configs, appVersionDetail.configs)
            && Objects.equals(this.resources, appVersionDetail.resources)
            && Objects.equals(this.arch, appVersionDetail.arch)
            && Objects.equals(this.command, appVersionDetail.command)
            && Objects.equals(this.args, appVersionDetail.args)
            && Objects.equals(this.livenessProbe, appVersionDetail.livenessProbe)
            && Objects.equals(this.readinessProbe, appVersionDetail.readinessProbe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            version,
            createdAt,
            updatedAt,
            projectId,
            imageUrl,
            envs,
            volumes,
            configs,
            resources,
            arch,
            command,
            args,
            livenessProbe,
            readinessProbe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppVersionDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
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
