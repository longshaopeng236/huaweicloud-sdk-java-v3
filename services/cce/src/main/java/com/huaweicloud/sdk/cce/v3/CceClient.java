package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.AddNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.AddNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ContinueUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterMasterSnapshotResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateKubernetesClusterCertResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePostCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.CreatePreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteChartResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteCloudPersistentVolumeClaimsResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.DeleteReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.DownloadChartResponse;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.HibernateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListChartsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListChartsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterMasterSnapshotTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradeFeatureGatesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClusterUpgradePathsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListClustersRequest;
import com.huaweicloud.sdk.cce.v3.model.ListClustersResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodePoolsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListNodesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListNodesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPartitionsResponse;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListPreCheckTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesRequest;
import com.huaweicloud.sdk.cce.v3.model.ListReleasesResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeClusterTasksResponse;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsRequest;
import com.huaweicloud.sdk.cce.v3.model.ListUpgradeWorkFlowsResponse;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.RetryUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.RollbackAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowChartValuesResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterConfigurationDetailsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterEndpointsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowClusterUpgradeInfoResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowJobRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowJobResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolConfigurationsResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowPreCheckResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseHistoryResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUpgradeWorkFlowResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowUserChartsQuotasResponse;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionRequest;
import com.huaweicloud.sdk.cce.v3.model.ShowVersionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterEipResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterLogConfigResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolConfigurationResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodePoolResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdatePartitionResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateResponse;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UploadChartResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CceClient {

    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        ClientBuilder<CceClient> clientBuilder = new ClientBuilder<>(CceClient::new);
        return clientBuilder;
    }

    /**
     * 纳管节点
     *
     * 该API用于在指定集群下纳管节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNodeRequest 请求对象
     * @return AddNodeResponse
     */
    public AddNodeResponse addNode(AddNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.addNode);
    }

    /**
     * 纳管节点
     *
     * 该API用于在指定集群下纳管节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddNodeRequest 请求对象
     * @return SyncInvoker<AddNodeRequest, AddNodeResponse>
     */
    public SyncInvoker<AddNodeRequest, AddNodeResponse> addNodeInvoker(AddNodeRequest request) {
        return new SyncInvoker<AddNodeRequest, AddNodeResponse>(request, CceMeta.addNode, hcClient);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return AwakeClusterResponse
     */
    public AwakeClusterResponse awakeCluster(AwakeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.awakeCluster);
    }

    /**
     * 集群唤醒
     *
     * 集群唤醒用于唤醒已休眠的集群，唤醒后，将继续收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AwakeClusterRequest 请求对象
     * @return SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>
     */
    public SyncInvoker<AwakeClusterRequest, AwakeClusterResponse> awakeClusterInvoker(AwakeClusterRequest request) {
        return new SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>(request, CceMeta.awakeCluster, hcClient);
    }

    /**
     * 批量添加指定集群的资源标签
     *
     * 该API用于批量添加指定集群的资源标签。
     * &gt; - 每个集群支持最多20个资源标签。
     * &gt; - 此接口为幂等接口：创建时，如果创建的标签已经存在（key/value均相同视为重复），默认处理成功；key相同，value不同时会覆盖原有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return BatchCreateClusterTagsResponse
     */
    public BatchCreateClusterTagsResponse batchCreateClusterTags(BatchCreateClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.batchCreateClusterTags);
    }

    /**
     * 批量添加指定集群的资源标签
     *
     * 该API用于批量添加指定集群的资源标签。
     * &gt; - 每个集群支持最多20个资源标签。
     * &gt; - 此接口为幂等接口：创建时，如果创建的标签已经存在（key/value均相同视为重复），默认处理成功；key相同，value不同时会覆盖原有标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>
     */
    public SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTagsInvoker(
        BatchCreateClusterTagsRequest request) {
        return new SyncInvoker<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse>(request,
            CceMeta.batchCreateClusterTags, hcClient);
    }

    /**
     * 批量删除指定集群的资源标签
     *
     * 该API用于批量删除指定集群的资源标签。
     * &gt; - 此接口为幂等接口：删除时，如果删除的标签key不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return BatchDeleteClusterTagsResponse
     */
    public BatchDeleteClusterTagsResponse batchDeleteClusterTags(BatchDeleteClusterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.batchDeleteClusterTags);
    }

    /**
     * 批量删除指定集群的资源标签
     *
     * 该API用于批量删除指定集群的资源标签。
     * &gt; - 此接口为幂等接口：删除时，如果删除的标签key不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteClusterTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>
     */
    public SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTagsInvoker(
        BatchDeleteClusterTagsRequest request) {
        return new SyncInvoker<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse>(request,
            CceMeta.batchDeleteClusterTags, hcClient);
    }

    /**
     * 继续执行集群升级任务
     *
     * 继续执行被暂停的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueUpgradeClusterTaskRequest 请求对象
     * @return ContinueUpgradeClusterTaskResponse
     */
    public ContinueUpgradeClusterTaskResponse continueUpgradeClusterTask(ContinueUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.continueUpgradeClusterTask);
    }

    /**
     * 继续执行集群升级任务
     *
     * 继续执行被暂停的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ContinueUpgradeClusterTaskRequest 请求对象
     * @return SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>
     */
    public SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTaskInvoker(
        ContinueUpgradeClusterTaskRequest request) {
        return new SyncInvoker<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse>(request,
            CceMeta.continueUpgradeClusterTask, hcClient);
    }

    /**
     * 创建AddonInstance
     *
     * 根据提供的插件模板，安装插件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return CreateAddonInstanceResponse
     */
    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    /**
     * 创建AddonInstance
     *
     * 根据提供的插件模板，安装插件实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAddonInstanceRequest 请求对象
     * @return SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>
     */
    public SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceInvoker(
        CreateAddonInstanceRequest request) {
        return new SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>(request,
            CceMeta.createAddonInstance, hcClient);
    }

    /**
     * 创建PVC（待废弃）
     *
     * 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。该API待废弃，请使用Kubernetes PVC相关接口。
     * 
     * 
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return CreateCloudPersistentVolumeClaimsResponse
     */
    public CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaims(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
    }

    /**
     * 创建PVC（待废弃）
     *
     * 该API用于在指定的Namespace下通过云存储服务中的云存储（EVS、SFS、OBS）去创建PVC（PersistentVolumeClaim）。该API待废弃，请使用Kubernetes PVC相关接口。
     * 
     * 
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCloudPersistentVolumeClaimsRequest 请求对象
     * @return SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>
     */
    public SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsInvoker(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.createCloudPersistentVolumeClaims, hcClient);
    }

    /**
     * 创建集群
     *
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[创建节点](cce_02_0242.xml)添加节点。
     * 
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 调用该接口创建集群时，默认不安装ICAgent，若需安装ICAgent，可在请求Body参数的annotations中加入\&quot;cluster.install.addons.external/install\&quot;:\&quot;[{\&quot;addonTemplateName\&quot;:\&quot;icagent\&quot;}]\&quot;的集群注解，将在创建集群时自动安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCluster);
    }

    /**
     * 创建集群
     *
     * 该API用于创建一个空集群（即只有控制节点Master，没有工作节点Node）。请在调用本接口完成集群创建之后，通过[创建节点](cce_02_0242.xml)添加节点。
     * 
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   - 调用该接口创建集群时，默认不安装ICAgent，若需安装ICAgent，可在请求Body参数的annotations中加入\&quot;cluster.install.addons.external/install\&quot;:\&quot;[{\&quot;addonTemplateName\&quot;:\&quot;icagent\&quot;}]\&quot;的集群注解，将在创建集群时自动安装ICAgent。ICAgent是应用性能管理APM的采集代理，运行在应用所在的服务器上，用于实时采集探针所获取的数据，安装ICAgent是使用应用性能管理APM的前提。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterRequest 请求对象
     * @return SyncInvoker<CreateClusterRequest, CreateClusterResponse>
     */
    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CceMeta.createCluster, hcClient);
    }

    /**
     * 集群备份
     *
     * 集群备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterMasterSnapshotRequest 请求对象
     * @return CreateClusterMasterSnapshotResponse
     */
    public CreateClusterMasterSnapshotResponse createClusterMasterSnapshot(CreateClusterMasterSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createClusterMasterSnapshot);
    }

    /**
     * 集群备份
     *
     * 集群备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateClusterMasterSnapshotRequest 请求对象
     * @return SyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse>
     */
    public SyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> createClusterMasterSnapshotInvoker(
        CreateClusterMasterSnapshotRequest request) {
        return new SyncInvoker<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse>(request,
            CceMeta.createClusterMasterSnapshot, hcClient);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return CreateKubernetesClusterCertResponse
     */
    public CreateKubernetesClusterCertResponse createKubernetesClusterCert(CreateKubernetesClusterCertRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    /**
     * 获取集群证书
     *
     * 该API用于获取指定集群的证书信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKubernetesClusterCertRequest 请求对象
     * @return SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>
     */
    public SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCertInvoker(
        CreateKubernetesClusterCertRequest request) {
        return new SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>(request,
            CceMeta.createKubernetesClusterCert, hcClient);
    }

    /**
     * 创建节点
     *
     * 该API用于在指定集群下创建节点。
     * &gt; - 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNode);
    }

    /**
     * 创建节点
     *
     * 该API用于在指定集群下创建节点。
     * &gt; - 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodeRequest 请求对象
     * @return SyncInvoker<CreateNodeRequest, CreateNodeResponse>
     */
    public SyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeInvoker(CreateNodeRequest request) {
        return new SyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, CceMeta.createNode, hcClient);
    }

    /**
     * 创建节点池
     *
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。
     * 
     * 更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * 
     * &gt; 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodePoolRequest 请求对象
     * @return CreateNodePoolResponse
     */
    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNodePool);
    }

    /**
     * 创建节点池
     *
     * 该API用于在指定集群下创建节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 1.21版本的集群创建节点池时支持绑定安全组，每个节点池最多绑定五个安全组。
     * 
     * 更新节点池的安全组后，只针对新创的pod生效，建议驱逐节点上原有的pod。
     * 
     * &gt; 若无集群，请先[创建集群](cce_02_0236.xml)。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNodePoolRequest 请求对象
     * @return SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>
     */
    public SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolInvoker(
        CreateNodePoolRequest request) {
        return new SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>(request, CceMeta.createNodePool,
            hcClient);
    }

    /**
     * 创建分区
     *
     * 创建分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return CreatePartitionResponse
     */
    public CreatePartitionResponse createPartition(CreatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createPartition);
    }

    /**
     * 创建分区
     *
     * 创建分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePartitionRequest 请求对象
     * @return SyncInvoker<CreatePartitionRequest, CreatePartitionResponse>
     */
    public SyncInvoker<CreatePartitionRequest, CreatePartitionResponse> createPartitionInvoker(
        CreatePartitionRequest request) {
        return new SyncInvoker<CreatePartitionRequest, CreatePartitionResponse>(request, CceMeta.createPartition,
            hcClient);
    }

    /**
     * 集群升级后确认
     *
     * 集群升级后确认，该接口建议配合Console使用，主要用于升级步骤完成后，客户确认集群状态和业务正常后做反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostCheckRequest 请求对象
     * @return CreatePostCheckResponse
     */
    public CreatePostCheckResponse createPostCheck(CreatePostCheckRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createPostCheck);
    }

    /**
     * 集群升级后确认
     *
     * 集群升级后确认，该接口建议配合Console使用，主要用于升级步骤完成后，客户确认集群状态和业务正常后做反馈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePostCheckRequest 请求对象
     * @return SyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse>
     */
    public SyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse> createPostCheckInvoker(
        CreatePostCheckRequest request) {
        return new SyncInvoker<CreatePostCheckRequest, CreatePostCheckResponse>(request, CceMeta.createPostCheck,
            hcClient);
    }

    /**
     * 集群升级前检查
     *
     * 集群升级前检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreCheckRequest 请求对象
     * @return CreatePreCheckResponse
     */
    public CreatePreCheckResponse createPreCheck(CreatePreCheckRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createPreCheck);
    }

    /**
     * 集群升级前检查
     *
     * 集群升级前检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreCheckRequest 请求对象
     * @return SyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse>
     */
    public SyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse> createPreCheckInvoker(
        CreatePreCheckRequest request) {
        return new SyncInvoker<CreatePreCheckRequest, CreatePreCheckResponse>(request, CceMeta.createPreCheck,
            hcClient);
    }

    /**
     * 创建模板实例
     *
     * 创建模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReleaseRequest 请求对象
     * @return CreateReleaseResponse
     */
    public CreateReleaseResponse createRelease(CreateReleaseRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createRelease);
    }

    /**
     * 创建模板实例
     *
     * 创建模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateReleaseRequest 请求对象
     * @return SyncInvoker<CreateReleaseRequest, CreateReleaseResponse>
     */
    public SyncInvoker<CreateReleaseRequest, CreateReleaseResponse> createReleaseInvoker(CreateReleaseRequest request) {
        return new SyncInvoker<CreateReleaseRequest, CreateReleaseResponse>(request, CceMeta.createRelease, hcClient);
    }

    /**
     * 开启集群升级流程引导任务
     *
     * 该API用于创建一个集群升级流程引导任务。请在调用本接口完成引导任务创建之后，通过集群升级前检查开始检查任务。
     * 升级流程任务用于控制集群升级任务的执行流程，执行流程为 升级前检查 &#x3D;&gt; 集群升级 &#x3D;&gt; 升级后检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUpgradeWorkFlowRequest 请求对象
     * @return CreateUpgradeWorkFlowResponse
     */
    public CreateUpgradeWorkFlowResponse createUpgradeWorkFlow(CreateUpgradeWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createUpgradeWorkFlow);
    }

    /**
     * 开启集群升级流程引导任务
     *
     * 该API用于创建一个集群升级流程引导任务。请在调用本接口完成引导任务创建之后，通过集群升级前检查开始检查任务。
     * 升级流程任务用于控制集群升级任务的执行流程，执行流程为 升级前检查 &#x3D;&gt; 集群升级 &#x3D;&gt; 升级后检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUpgradeWorkFlowRequest 请求对象
     * @return SyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse>
     */
    public SyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> createUpgradeWorkFlowInvoker(
        CreateUpgradeWorkFlowRequest request) {
        return new SyncInvoker<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse>(request,
            CceMeta.createUpgradeWorkFlow, hcClient);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return DeleteAddonInstanceResponse
     */
    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    /**
     * 删除AddonInstance
     *
     * 删除插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddonInstanceRequest 请求对象
     * @return SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>
     */
    public SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceInvoker(
        DeleteAddonInstanceRequest request) {
        return new SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>(request,
            CceMeta.deleteAddonInstance, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChartRequest 请求对象
     * @return DeleteChartResponse
     */
    public DeleteChartResponse deleteChart(DeleteChartRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteChart);
    }

    /**
     * 删除模板
     *
     * 删除模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChartRequest 请求对象
     * @return SyncInvoker<DeleteChartRequest, DeleteChartResponse>
     */
    public SyncInvoker<DeleteChartRequest, DeleteChartResponse> deleteChartInvoker(DeleteChartRequest request) {
        return new SyncInvoker<DeleteChartRequest, DeleteChartResponse>(request, CceMeta.deleteChart, hcClient);
    }

    /**
     * 删除PVC（待废弃）
     *
     * 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。该API待废弃，请使用Kubernetes PVC相关接口。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return DeleteCloudPersistentVolumeClaimsResponse
     */
    public DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaims(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
    }

    /**
     * 删除PVC（待废弃）
     *
     * 该API用于删除指定Namespace下的PVC（PersistentVolumeClaim）对象，并可以选择保留后端的云存储。该API待废弃，请使用Kubernetes PVC相关接口。
     * &gt;存储管理的URL格式为：https://{clusterid}.Endpoint/uri。其中{clusterid}为集群ID，uri为资源路径，也即API访问的路径。如果使用https://Endpoint/uri，则必须指定请求header中的X-Cluster-ID参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCloudPersistentVolumeClaimsRequest 请求对象
     * @return SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>
     */
    public SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsInvoker(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.deleteCloudPersistentVolumeClaims, hcClient);
    }

    /**
     * 删除集群
     *
     * 该API用于删除一个指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCluster);
    }

    /**
     * 删除集群
     *
     * 该API用于删除一个指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteClusterRequest 请求对象
     * @return SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>
     */
    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CceMeta.deleteCluster, hcClient);
    }

    /**
     * 删除节点
     *
     * 该API用于删除指定的节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNode);
    }

    /**
     * 删除节点
     *
     * 该API用于删除指定的节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodeRequest 请求对象
     * @return SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>
     */
    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, CceMeta.deleteNode, hcClient);
    }

    /**
     * 删除节点池
     *
     * 该API用于删除指定的节点池。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return DeleteNodePoolResponse
     */
    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNodePool);
    }

    /**
     * 删除节点池
     *
     * 该API用于删除指定的节点池。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteNodePoolRequest 请求对象
     * @return SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>
     */
    public SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolInvoker(
        DeleteNodePoolRequest request) {
        return new SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>(request, CceMeta.deleteNodePool,
            hcClient);
    }

    /**
     * 删除指定模板实例
     *
     * 删除指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReleaseRequest 请求对象
     * @return DeleteReleaseResponse
     */
    public DeleteReleaseResponse deleteRelease(DeleteReleaseRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteRelease);
    }

    /**
     * 删除指定模板实例
     *
     * 删除指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteReleaseRequest 请求对象
     * @return SyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse>
     */
    public SyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse> deleteReleaseInvoker(DeleteReleaseRequest request) {
        return new SyncInvoker<DeleteReleaseRequest, DeleteReleaseResponse>(request, CceMeta.deleteRelease, hcClient);
    }

    /**
     * 下载模板
     *
     * 下载模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadChartRequest 请求对象
     * @return DownloadChartResponse
     */
    public DownloadChartResponse downloadChart(DownloadChartRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.downloadChart);
    }

    /**
     * 下载模板
     *
     * 下载模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadChartRequest 请求对象
     * @return SyncInvoker<DownloadChartRequest, DownloadChartResponse>
     */
    public SyncInvoker<DownloadChartRequest, DownloadChartResponse> downloadChartInvoker(DownloadChartRequest request) {
        return new SyncInvoker<DownloadChartRequest, DownloadChartResponse>(request, CceMeta.downloadChart, hcClient);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return HibernateClusterResponse
     */
    public HibernateClusterResponse hibernateCluster(HibernateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    /**
     * 集群休眠
     *
     * 集群休眠用于将运行中的集群置于休眠状态，休眠后，将不再收取控制节点资源费用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param HibernateClusterRequest 请求对象
     * @return SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>
     */
    public SyncInvoker<HibernateClusterRequest, HibernateClusterResponse> hibernateClusterInvoker(
        HibernateClusterRequest request) {
        return new SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>(request, CceMeta.hibernateCluster,
            hcClient);
    }

    /**
     * 获取AddonInstance列表
     *
     * 获取集群所有已安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return ListAddonInstancesResponse
     */
    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    /**
     * 获取AddonInstance列表
     *
     * 获取集群所有已安装插件实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonInstancesRequest 请求对象
     * @return SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>
     */
    public SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesInvoker(
        ListAddonInstancesRequest request) {
        return new SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>(request,
            CceMeta.listAddonInstances, hcClient);
    }

    /**
     * 查询AddonTemplates列表
     *
     * 插件模板查询接口，查询插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    /**
     * 查询AddonTemplates列表
     *
     * 插件模板查询接口，查询插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddonTemplatesRequest 请求对象
     * @return SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>
     */
    public SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesInvoker(
        ListAddonTemplatesRequest request) {
        return new SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>(request,
            CceMeta.listAddonTemplates, hcClient);
    }

    /**
     * 获取模板列表
     *
     * 获取模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return ListChartsResponse
     */
    public ListChartsResponse listCharts(ListChartsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listCharts);
    }

    /**
     * 获取模板列表
     *
     * 获取模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChartsRequest 请求对象
     * @return SyncInvoker<ListChartsRequest, ListChartsResponse>
     */
    public SyncInvoker<ListChartsRequest, ListChartsResponse> listChartsInvoker(ListChartsRequest request) {
        return new SyncInvoker<ListChartsRequest, ListChartsResponse>(request, CceMeta.listCharts, hcClient);
    }

    /**
     * 获取集群备份任务详情列表
     *
     * 获取集群备份任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterMasterSnapshotTasksRequest 请求对象
     * @return ListClusterMasterSnapshotTasksResponse
     */
    public ListClusterMasterSnapshotTasksResponse listClusterMasterSnapshotTasks(
        ListClusterMasterSnapshotTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusterMasterSnapshotTasks);
    }

    /**
     * 获取集群备份任务详情列表
     *
     * 获取集群备份任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterMasterSnapshotTasksRequest 请求对象
     * @return SyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse>
     */
    public SyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> listClusterMasterSnapshotTasksInvoker(
        ListClusterMasterSnapshotTasksRequest request) {
        return new SyncInvoker<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse>(request,
            CceMeta.listClusterMasterSnapshotTasks, hcClient);
    }

    /**
     * 获取集群升级特性开关配置
     *
     * 获取集群升级特性开关配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradeFeatureGatesRequest 请求对象
     * @return ListClusterUpgradeFeatureGatesResponse
     */
    public ListClusterUpgradeFeatureGatesResponse listClusterUpgradeFeatureGates(
        ListClusterUpgradeFeatureGatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusterUpgradeFeatureGates);
    }

    /**
     * 获取集群升级特性开关配置
     *
     * 获取集群升级特性开关配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradeFeatureGatesRequest 请求对象
     * @return SyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse>
     */
    public SyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> listClusterUpgradeFeatureGatesInvoker(
        ListClusterUpgradeFeatureGatesRequest request) {
        return new SyncInvoker<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse>(request,
            CceMeta.listClusterUpgradeFeatureGates, hcClient);
    }

    /**
     * 获取集群升级路径
     *
     * 获取集群升级路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradePathsRequest 请求对象
     * @return ListClusterUpgradePathsResponse
     */
    public ListClusterUpgradePathsResponse listClusterUpgradePaths(ListClusterUpgradePathsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusterUpgradePaths);
    }

    /**
     * 获取集群升级路径
     *
     * 获取集群升级路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClusterUpgradePathsRequest 请求对象
     * @return SyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse>
     */
    public SyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> listClusterUpgradePathsInvoker(
        ListClusterUpgradePathsRequest request) {
        return new SyncInvoker<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse>(request,
            CceMeta.listClusterUpgradePaths, hcClient);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusters);
    }

    /**
     * 获取指定项目下的集群
     *
     * 该API用于获取指定项目下所有集群的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListClustersRequest 请求对象
     * @return SyncInvoker<ListClustersRequest, ListClustersResponse>
     */
    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CceMeta.listClusters, hcClient);
    }

    /**
     * 获取集群下所有节点池
     *
     * 该API用于获取集群下所有节点池。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - nodepool是集群中具有相同配置的节点实例的子集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodePoolsRequest 请求对象
     * @return ListNodePoolsResponse
     */
    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodePools);
    }

    /**
     * 获取集群下所有节点池
     *
     * 该API用于获取集群下所有节点池。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - nodepool是集群中具有相同配置的节点实例的子集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodePoolsRequest 请求对象
     * @return SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>
     */
    public SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsInvoker(ListNodePoolsRequest request) {
        return new SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>(request, CceMeta.listNodePools, hcClient);
    }

    /**
     * 获取集群下所有节点
     *
     * 该API用于通过集群ID获取指定集群下所有节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodes);
    }

    /**
     * 获取集群下所有节点
     *
     * 该API用于通过集群ID获取指定集群下所有节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<ListNodesRequest, ListNodesResponse>(request, CceMeta.listNodes, hcClient);
    }

    /**
     * 获取分区列表
     *
     * 获取分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listPartitions);
    }

    /**
     * 获取分区列表
     *
     * 获取分区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public SyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsInvoker(
        ListPartitionsRequest request) {
        return new SyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request, CceMeta.listPartitions,
            hcClient);
    }

    /**
     * 获取集群升级前检查任务详情列表
     *
     * 获取集群升级前检查任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPreCheckTasksRequest 请求对象
     * @return ListPreCheckTasksResponse
     */
    public ListPreCheckTasksResponse listPreCheckTasks(ListPreCheckTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listPreCheckTasks);
    }

    /**
     * 获取集群升级前检查任务详情列表
     *
     * 获取集群升级前检查任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPreCheckTasksRequest 请求对象
     * @return SyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse>
     */
    public SyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse> listPreCheckTasksInvoker(
        ListPreCheckTasksRequest request) {
        return new SyncInvoker<ListPreCheckTasksRequest, ListPreCheckTasksResponse>(request, CceMeta.listPreCheckTasks,
            hcClient);
    }

    /**
     * 获取模板实例列表
     *
     * 获取模板实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReleasesRequest 请求对象
     * @return ListReleasesResponse
     */
    public ListReleasesResponse listReleases(ListReleasesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listReleases);
    }

    /**
     * 获取模板实例列表
     *
     * 获取模板实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReleasesRequest 请求对象
     * @return SyncInvoker<ListReleasesRequest, ListReleasesResponse>
     */
    public SyncInvoker<ListReleasesRequest, ListReleasesResponse> listReleasesInvoker(ListReleasesRequest request) {
        return new SyncInvoker<ListReleasesRequest, ListReleasesResponse>(request, CceMeta.listReleases, hcClient);
    }

    /**
     * 获取集群升级任务详情列表
     *
     * 获取集群升级任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeClusterTasksRequest 请求对象
     * @return ListUpgradeClusterTasksResponse
     */
    public ListUpgradeClusterTasksResponse listUpgradeClusterTasks(ListUpgradeClusterTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listUpgradeClusterTasks);
    }

    /**
     * 获取集群升级任务详情列表
     *
     * 获取集群升级任务详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeClusterTasksRequest 请求对象
     * @return SyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse>
     */
    public SyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> listUpgradeClusterTasksInvoker(
        ListUpgradeClusterTasksRequest request) {
        return new SyncInvoker<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse>(request,
            CceMeta.listUpgradeClusterTasks, hcClient);
    }

    /**
     * 获取UpgradeWorkFlows列表
     *
     * 获取历史集群升级引导任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeWorkFlowsRequest 请求对象
     * @return ListUpgradeWorkFlowsResponse
     */
    public ListUpgradeWorkFlowsResponse listUpgradeWorkFlows(ListUpgradeWorkFlowsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listUpgradeWorkFlows);
    }

    /**
     * 获取UpgradeWorkFlows列表
     *
     * 获取历史集群升级引导任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUpgradeWorkFlowsRequest 请求对象
     * @return SyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse>
     */
    public SyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> listUpgradeWorkFlowsInvoker(
        ListUpgradeWorkFlowsRequest request) {
        return new SyncInvoker<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse>(request,
            CceMeta.listUpgradeWorkFlows, hcClient);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群。
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return MigrateNodeResponse
     */
    public MigrateNodeResponse migrateNode(MigrateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.migrateNode);
    }

    /**
     * 节点迁移
     *
     * 该API用于在指定集群下迁移节点到另一集群。
     * 
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateNodeRequest 请求对象
     * @return SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>
     */
    public SyncInvoker<MigrateNodeRequest, MigrateNodeResponse> migrateNodeInvoker(MigrateNodeRequest request) {
        return new SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>(request, CceMeta.migrateNode, hcClient);
    }

    /**
     * 暂停集群升级任务
     *
     * 暂停集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseUpgradeClusterTaskRequest 请求对象
     * @return PauseUpgradeClusterTaskResponse
     */
    public PauseUpgradeClusterTaskResponse pauseUpgradeClusterTask(PauseUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.pauseUpgradeClusterTask);
    }

    /**
     * 暂停集群升级任务
     *
     * 暂停集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseUpgradeClusterTaskRequest 请求对象
     * @return SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>
     */
    public SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTaskInvoker(
        PauseUpgradeClusterTaskRequest request) {
        return new SyncInvoker<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse>(request,
            CceMeta.pauseUpgradeClusterTask, hcClient);
    }

    /**
     * 节点移除
     *
     * 该API用于在指定集群下移除节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveNodeRequest 请求对象
     * @return RemoveNodeResponse
     */
    public RemoveNodeResponse removeNode(RemoveNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.removeNode);
    }

    /**
     * 节点移除
     *
     * 该API用于在指定集群下移除节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveNodeRequest 请求对象
     * @return SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>
     */
    public SyncInvoker<RemoveNodeRequest, RemoveNodeResponse> removeNodeInvoker(RemoveNodeRequest request) {
        return new SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>(request, CceMeta.removeNode, hcClient);
    }

    /**
     * 重置节点
     *
     * 该API用于在指定集群下重置节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetNodeRequest 请求对象
     * @return ResetNodeResponse
     */
    public ResetNodeResponse resetNode(ResetNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.resetNode);
    }

    /**
     * 重置节点
     *
     * 该API用于在指定集群下重置节点。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetNodeRequest 请求对象
     * @return SyncInvoker<ResetNodeRequest, ResetNodeResponse>
     */
    public SyncInvoker<ResetNodeRequest, ResetNodeResponse> resetNodeInvoker(ResetNodeRequest request) {
        return new SyncInvoker<ResetNodeRequest, ResetNodeResponse>(request, CceMeta.resetNode, hcClient);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return ResizeClusterResponse
     */
    public ResizeClusterResponse resizeCluster(ResizeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.resizeCluster);
    }

    /**
     * 变更集群规格
     *
     * 该API用于变更一个指定集群的规格。
     * 
     * &gt;   - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/usermanual-cce/cce_10_0403.html)。](tag:hws)
     * &gt;   [- 使用限制请参考[变更集群规格](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0403.html)](tag:hws_hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeClusterRequest 请求对象
     * @return SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>
     */
    public SyncInvoker<ResizeClusterRequest, ResizeClusterResponse> resizeClusterInvoker(ResizeClusterRequest request) {
        return new SyncInvoker<ResizeClusterRequest, ResizeClusterResponse>(request, CceMeta.resizeCluster, hcClient);
    }

    /**
     * 重试集群升级任务
     *
     * 重新执行失败的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryUpgradeClusterTaskRequest 请求对象
     * @return RetryUpgradeClusterTaskResponse
     */
    public RetryUpgradeClusterTaskResponse retryUpgradeClusterTask(RetryUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.retryUpgradeClusterTask);
    }

    /**
     * 重试集群升级任务
     *
     * 重新执行失败的集群升级任务。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryUpgradeClusterTaskRequest 请求对象
     * @return SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>
     */
    public SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTaskInvoker(
        RetryUpgradeClusterTaskRequest request) {
        return new SyncInvoker<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse>(request,
            CceMeta.retryUpgradeClusterTask, hcClient);
    }

    /**
     * 回滚AddonInstance
     *
     * 将插件实例回滚到升级前的版本。只有在当前插件实例版本支持回滚到升级前的版本（status.isRollbackable为true），且插件实例状态为running（运行中）、available（可用）、abnormal（不可用）、upgradeFailed（升级失败）、rollbackFailed（回滚失败）时支持回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackAddonInstanceRequest 请求对象
     * @return RollbackAddonInstanceResponse
     */
    public RollbackAddonInstanceResponse rollbackAddonInstance(RollbackAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.rollbackAddonInstance);
    }

    /**
     * 回滚AddonInstance
     *
     * 将插件实例回滚到升级前的版本。只有在当前插件实例版本支持回滚到升级前的版本（status.isRollbackable为true），且插件实例状态为running（运行中）、available（可用）、abnormal（不可用）、upgradeFailed（升级失败）、rollbackFailed（回滚失败）时支持回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RollbackAddonInstanceRequest 请求对象
     * @return SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>
     */
    public SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> rollbackAddonInstanceInvoker(
        RollbackAddonInstanceRequest request) {
        return new SyncInvoker<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse>(request,
            CceMeta.rollbackAddonInstance, hcClient);
    }

    /**
     * 获取AddonInstance详情
     *
     * 获取插件实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return ShowAddonInstanceResponse
     */
    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    /**
     * 获取AddonInstance详情
     *
     * 获取插件实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAddonInstanceRequest 请求对象
     * @return SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>
     */
    public SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceInvoker(
        ShowAddonInstanceRequest request) {
        return new SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>(request, CceMeta.showAddonInstance,
            hcClient);
    }

    /**
     * 获取模板
     *
     * 获取模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartRequest 请求对象
     * @return ShowChartResponse
     */
    public ShowChartResponse showChart(ShowChartRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showChart);
    }

    /**
     * 获取模板
     *
     * 获取模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartRequest 请求对象
     * @return SyncInvoker<ShowChartRequest, ShowChartResponse>
     */
    public SyncInvoker<ShowChartRequest, ShowChartResponse> showChartInvoker(ShowChartRequest request) {
        return new SyncInvoker<ShowChartRequest, ShowChartResponse>(request, CceMeta.showChart, hcClient);
    }

    /**
     * 获取模板Values
     *
     * 获取模板Values
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartValuesRequest 请求对象
     * @return ShowChartValuesResponse
     */
    public ShowChartValuesResponse showChartValues(ShowChartValuesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showChartValues);
    }

    /**
     * 获取模板Values
     *
     * 获取模板Values
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowChartValuesRequest 请求对象
     * @return SyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse>
     */
    public SyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse> showChartValuesInvoker(
        ShowChartValuesRequest request) {
        return new SyncInvoker<ShowChartValuesRequest, ShowChartValuesResponse>(request, CceMeta.showChartValues,
            hcClient);
    }

    /**
     * 获取指定的集群
     *
     * 该API用于获取指定集群的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return ShowClusterResponse
     */
    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showCluster);
    }

    /**
     * 获取指定的集群
     *
     * 该API用于获取指定集群的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterRequest 请求对象
     * @return SyncInvoker<ShowClusterRequest, ShowClusterResponse>
     */
    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, CceMeta.showCluster, hcClient);
    }

    /**
     * 查询集群日志配置信息
     *
     * 获取集群组件上报的LTS的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigRequest 请求对象
     * @return ShowClusterConfigResponse
     */
    public ShowClusterConfigResponse showClusterConfig(ShowClusterConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showClusterConfig);
    }

    /**
     * 查询集群日志配置信息
     *
     * 获取集群组件上报的LTS的配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigRequest 请求对象
     * @return SyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse>
     */
    public SyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse> showClusterConfigInvoker(
        ShowClusterConfigRequest request) {
        return new SyncInvoker<ShowClusterConfigRequest, ShowClusterConfigResponse>(request, CceMeta.showClusterConfig,
            hcClient);
    }

    /**
     * 查询指定集群支持配置的参数列表
     *
     * 该API用于查询CCE服务下指定集群支持配置的参数列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigurationDetailsRequest 请求对象
     * @return ShowClusterConfigurationDetailsResponse
     */
    public ShowClusterConfigurationDetailsResponse showClusterConfigurationDetails(
        ShowClusterConfigurationDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showClusterConfigurationDetails);
    }

    /**
     * 查询指定集群支持配置的参数列表
     *
     * 该API用于查询CCE服务下指定集群支持配置的参数列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterConfigurationDetailsRequest 请求对象
     * @return SyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse>
     */
    public SyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> showClusterConfigurationDetailsInvoker(
        ShowClusterConfigurationDetailsRequest request) {
        return new SyncInvoker<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse>(request,
            CceMeta.showClusterConfigurationDetails, hcClient);
    }

    /**
     * 获取集群访问的地址
     *
     * 该API用于通过集群ID获取集群访问的地址，包括PrivateIP(HA集群返回VIP)与PublicIP
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterEndpointsRequest 请求对象
     * @return ShowClusterEndpointsResponse
     */
    public ShowClusterEndpointsResponse showClusterEndpoints(ShowClusterEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showClusterEndpoints);
    }

    /**
     * 获取集群访问的地址
     *
     * 该API用于通过集群ID获取集群访问的地址，包括PrivateIP(HA集群返回VIP)与PublicIP
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterEndpointsRequest 请求对象
     * @return SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>
     */
    public SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpointsInvoker(
        ShowClusterEndpointsRequest request) {
        return new SyncInvoker<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse>(request,
            CceMeta.showClusterEndpoints, hcClient);
    }

    /**
     * 获取集群升级相关信息
     *
     * 获取集群升级相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterUpgradeInfoRequest 请求对象
     * @return ShowClusterUpgradeInfoResponse
     */
    public ShowClusterUpgradeInfoResponse showClusterUpgradeInfo(ShowClusterUpgradeInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showClusterUpgradeInfo);
    }

    /**
     * 获取集群升级相关信息
     *
     * 获取集群升级相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowClusterUpgradeInfoRequest 请求对象
     * @return SyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse>
     */
    public SyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> showClusterUpgradeInfoInvoker(
        ShowClusterUpgradeInfoRequest request) {
        return new SyncInvoker<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse>(request,
            CceMeta.showClusterUpgradeInfo, hcClient);
    }

    /**
     * 获取任务信息
     *
     * 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为：
     * &gt;   - 创建、删除集群时，查询相应任务的进度。
     * &gt;   - 创建、删除节点时，查询相应任务的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showJob);
    }

    /**
     * 获取任务信息
     *
     * 该API用于获取任务信息。通过某一任务请求下发后返回的jobID来查询指定任务的进度。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * &gt; - 该接口通常使用场景为：
     * &gt;   - 创建、删除集群时，查询相应任务的进度。
     * &gt;   - 创建、删除节点时，查询相应任务的进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CceMeta.showJob, hcClient);
    }

    /**
     * 获取指定的节点
     *
     * 该API用于通过节点ID获取指定节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNode);
    }

    /**
     * 获取指定的节点
     *
     * 该API用于通过节点ID获取指定节点的详细信息。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, CceMeta.showNode, hcClient);
    }

    /**
     * 获取指定的节点池
     *
     * 该API用于获取指定节点池的详细信息。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolRequest 请求对象
     * @return ShowNodePoolResponse
     */
    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePool);
    }

    /**
     * 获取指定的节点池
     *
     * 该API用于获取指定节点池的详细信息。
     * &gt; 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolRequest 请求对象
     * @return SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>
     */
    public SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolInvoker(ShowNodePoolRequest request) {
        return new SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>(request, CceMeta.showNodePool, hcClient);
    }

    /**
     * 查询指定节点池支持配置的参数内容
     *
     * 该API用于查询指定节点池支持配置的参数内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolConfigurationsRequest 请求对象
     * @return ShowNodePoolConfigurationsResponse
     */
    public ShowNodePoolConfigurationsResponse showNodePoolConfigurations(ShowNodePoolConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePoolConfigurations);
    }

    /**
     * 查询指定节点池支持配置的参数内容
     *
     * 该API用于查询指定节点池支持配置的参数内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowNodePoolConfigurationsRequest 请求对象
     * @return SyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse>
     */
    public SyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> showNodePoolConfigurationsInvoker(
        ShowNodePoolConfigurationsRequest request) {
        return new SyncInvoker<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse>(request,
            CceMeta.showNodePoolConfigurations, hcClient);
    }

    /**
     * 获取分区详情
     *
     * 获取分区详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionRequest 请求对象
     * @return ShowPartitionResponse
     */
    public ShowPartitionResponse showPartition(ShowPartitionRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showPartition);
    }

    /**
     * 获取分区详情
     *
     * 获取分区详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPartitionRequest 请求对象
     * @return SyncInvoker<ShowPartitionRequest, ShowPartitionResponse>
     */
    public SyncInvoker<ShowPartitionRequest, ShowPartitionResponse> showPartitionInvoker(ShowPartitionRequest request) {
        return new SyncInvoker<ShowPartitionRequest, ShowPartitionResponse>(request, CceMeta.showPartition, hcClient);
    }

    /**
     * 获取集群升级前检查任务详情
     *
     * 获取集群升级前检查任务详情，任务ID由调用集群检查API后从响应体中uid字段获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreCheckRequest 请求对象
     * @return ShowPreCheckResponse
     */
    public ShowPreCheckResponse showPreCheck(ShowPreCheckRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showPreCheck);
    }

    /**
     * 获取集群升级前检查任务详情
     *
     * 获取集群升级前检查任务详情，任务ID由调用集群检查API后从响应体中uid字段获取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreCheckRequest 请求对象
     * @return SyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse>
     */
    public SyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse> showPreCheckInvoker(ShowPreCheckRequest request) {
        return new SyncInvoker<ShowPreCheckRequest, ShowPreCheckResponse>(request, CceMeta.showPreCheck, hcClient);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showQuotas);
    }

    /**
     * 查询CCE服务下的资源配额
     *
     * 该API用于查询CCE服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CceMeta.showQuotas, hcClient);
    }

    /**
     * 获取指定模板实例
     *
     * 获取指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseRequest 请求对象
     * @return ShowReleaseResponse
     */
    public ShowReleaseResponse showRelease(ShowReleaseRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showRelease);
    }

    /**
     * 获取指定模板实例
     *
     * 获取指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseRequest 请求对象
     * @return SyncInvoker<ShowReleaseRequest, ShowReleaseResponse>
     */
    public SyncInvoker<ShowReleaseRequest, ShowReleaseResponse> showReleaseInvoker(ShowReleaseRequest request) {
        return new SyncInvoker<ShowReleaseRequest, ShowReleaseResponse>(request, CceMeta.showRelease, hcClient);
    }

    /**
     * 查询指定模板实例历史记录
     *
     * 查询指定模板实例历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseHistoryRequest 请求对象
     * @return ShowReleaseHistoryResponse
     */
    public ShowReleaseHistoryResponse showReleaseHistory(ShowReleaseHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showReleaseHistory);
    }

    /**
     * 查询指定模板实例历史记录
     *
     * 查询指定模板实例历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReleaseHistoryRequest 请求对象
     * @return SyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse>
     */
    public SyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> showReleaseHistoryInvoker(
        ShowReleaseHistoryRequest request) {
        return new SyncInvoker<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse>(request,
            CceMeta.showReleaseHistory, hcClient);
    }

    /**
     * 获取集群升级任务详情
     *
     * 获取集群升级任务详情，任务ID由调用集群升级API后从响应体中uid字段获取。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeClusterTaskRequest 请求对象
     * @return ShowUpgradeClusterTaskResponse
     */
    public ShowUpgradeClusterTaskResponse showUpgradeClusterTask(ShowUpgradeClusterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showUpgradeClusterTask);
    }

    /**
     * 获取集群升级任务详情
     *
     * 获取集群升级任务详情，任务ID由调用集群升级API后从响应体中uid字段获取。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeClusterTaskRequest 请求对象
     * @return SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>
     */
    public SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTaskInvoker(
        ShowUpgradeClusterTaskRequest request) {
        return new SyncInvoker<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse>(request,
            CceMeta.showUpgradeClusterTask, hcClient);
    }

    /**
     * 获取指定集群升级引导任务详情
     *
     * 该API用于通过升级引导任务ID获取任务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeWorkFlowRequest 请求对象
     * @return ShowUpgradeWorkFlowResponse
     */
    public ShowUpgradeWorkFlowResponse showUpgradeWorkFlow(ShowUpgradeWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showUpgradeWorkFlow);
    }

    /**
     * 获取指定集群升级引导任务详情
     *
     * 该API用于通过升级引导任务ID获取任务的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeWorkFlowRequest 请求对象
     * @return SyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse>
     */
    public SyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> showUpgradeWorkFlowInvoker(
        ShowUpgradeWorkFlowRequest request) {
        return new SyncInvoker<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse>(request,
            CceMeta.showUpgradeWorkFlow, hcClient);
    }

    /**
     * 获取用户模板配额
     *
     * 获取用户模板配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserChartsQuotasRequest 请求对象
     * @return ShowUserChartsQuotasResponse
     */
    public ShowUserChartsQuotasResponse showUserChartsQuotas(ShowUserChartsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showUserChartsQuotas);
    }

    /**
     * 获取用户模板配额
     *
     * 获取用户模板配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUserChartsQuotasRequest 请求对象
     * @return SyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse>
     */
    public SyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> showUserChartsQuotasInvoker(
        ShowUserChartsQuotasRequest request) {
        return new SyncInvoker<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse>(request,
            CceMeta.showUserChartsQuotas, hcClient);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return UpdateAddonInstanceResponse
     */
    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    /**
     * 更新AddonInstance
     *
     * 更新插件实例的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddonInstanceRequest 请求对象
     * @return SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>
     */
    public SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceInvoker(
        UpdateAddonInstanceRequest request) {
        return new SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>(request,
            CceMeta.updateAddonInstance, hcClient);
    }

    /**
     * 更新模板
     *
     * 更新模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChartRequest 请求对象
     * @return UpdateChartResponse
     */
    public UpdateChartResponse updateChart(UpdateChartRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateChart);
    }

    /**
     * 更新模板
     *
     * 更新模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChartRequest 请求对象
     * @return SyncInvoker<UpdateChartRequest, UpdateChartResponse>
     */
    public SyncInvoker<UpdateChartRequest, UpdateChartResponse> updateChartInvoker(UpdateChartRequest request) {
        return new SyncInvoker<UpdateChartRequest, UpdateChartResponse>(request, CceMeta.updateChart, hcClient);
    }

    /**
     * 更新指定的集群
     *
     * 该API用于更新指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterRequest 请求对象
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateCluster);
    }

    /**
     * 更新指定的集群
     *
     * 该API用于更新指定的集群。
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterRequest 请求对象
     * @return SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>
     */
    public SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterInvoker(UpdateClusterRequest request) {
        return new SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>(request, CceMeta.updateCluster, hcClient);
    }

    /**
     * 绑定、解绑集群公网apiserver地址
     *
     * 该API用于通过集群ID绑定、解绑集群公网apiserver地址
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterEipRequest 请求对象
     * @return UpdateClusterEipResponse
     */
    public UpdateClusterEipResponse updateClusterEip(UpdateClusterEipRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateClusterEip);
    }

    /**
     * 绑定、解绑集群公网apiserver地址
     *
     * 该API用于通过集群ID绑定、解绑集群公网apiserver地址
     * &gt;集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterEipRequest 请求对象
     * @return SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>
     */
    public SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEipInvoker(
        UpdateClusterEipRequest request) {
        return new SyncInvoker<UpdateClusterEipRequest, UpdateClusterEipResponse>(request, CceMeta.updateClusterEip,
            hcClient);
    }

    /**
     * 配置集群日志
     *
     * 用户可以选择集群管理节点上哪些组件的日志上报LTS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterLogConfigRequest 请求对象
     * @return UpdateClusterLogConfigResponse
     */
    public UpdateClusterLogConfigResponse updateClusterLogConfig(UpdateClusterLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateClusterLogConfig);
    }

    /**
     * 配置集群日志
     *
     * 用户可以选择集群管理节点上哪些组件的日志上报LTS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClusterLogConfigRequest 请求对象
     * @return SyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse>
     */
    public SyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> updateClusterLogConfigInvoker(
        UpdateClusterLogConfigRequest request) {
        return new SyncInvoker<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse>(request,
            CceMeta.updateClusterLogConfig, hcClient);
    }

    /**
     * 更新指定的节点
     *
     * 该API用于更新指定的节点。
     * &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNode);
    }

    /**
     * 更新指定的节点
     *
     * 该API用于更新指定的节点。
     * &gt; - 当前仅支持更新metadata下的name字段，即节点的名字。
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodeRequest 请求对象
     * @return SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>
     */
    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, CceMeta.updateNode, hcClient);
    }

    /**
     * 更新指定节点池
     *
     * 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * &gt; - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags，taints，login，userTags与节点池的扩缩容配置相关字段。若此次更新未设置相关值，默认更新为初始值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return UpdateNodePoolResponse
     */
    public UpdateNodePoolResponse updateNodePool(UpdateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePool);
    }

    /**
     * 更新指定节点池
     *
     * 该API用于更新指定的节点池。仅支持集群在处于可用、扩容、缩容状态时调用。
     * 
     * 
     * &gt; - 集群管理的URL格式为：https://Endpoint/uri。其中uri为资源路径，也即API访问的路径
     * 
     * &gt; - 当前仅支持更新节点池名称，spec下的initialNodeCount，k8sTags，taints，login，userTags与节点池的扩缩容配置相关字段。若此次更新未设置相关值，默认更新为初始值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolRequest 请求对象
     * @return SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>
     */
    public SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePoolInvoker(
        UpdateNodePoolRequest request) {
        return new SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>(request, CceMeta.updateNodePool,
            hcClient);
    }

    /**
     * 修改指定节点池配置参数的值
     *
     * 该API用于修改CCE服务下指定节点池配置参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolConfigurationRequest 请求对象
     * @return UpdateNodePoolConfigurationResponse
     */
    public UpdateNodePoolConfigurationResponse updateNodePoolConfiguration(UpdateNodePoolConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePoolConfiguration);
    }

    /**
     * 修改指定节点池配置参数的值
     *
     * 该API用于修改CCE服务下指定节点池配置参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateNodePoolConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse>
     */
    public SyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> updateNodePoolConfigurationInvoker(
        UpdateNodePoolConfigurationRequest request) {
        return new SyncInvoker<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse>(request,
            CceMeta.updateNodePoolConfiguration, hcClient);
    }

    /**
     * 更新分区
     *
     * 更新分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionRequest 请求对象
     * @return UpdatePartitionResponse
     */
    public UpdatePartitionResponse updatePartition(UpdatePartitionRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updatePartition);
    }

    /**
     * 更新分区
     *
     * 更新分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePartitionRequest 请求对象
     * @return SyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse>
     */
    public SyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse> updatePartitionInvoker(
        UpdatePartitionRequest request) {
        return new SyncInvoker<UpdatePartitionRequest, UpdatePartitionResponse>(request, CceMeta.updatePartition,
            hcClient);
    }

    /**
     * 更新指定模板实例
     *
     * 更新指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReleaseRequest 请求对象
     * @return UpdateReleaseResponse
     */
    public UpdateReleaseResponse updateRelease(UpdateReleaseRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateRelease);
    }

    /**
     * 更新指定模板实例
     *
     * 更新指定模板实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReleaseRequest 请求对象
     * @return SyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse>
     */
    public SyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse> updateReleaseInvoker(UpdateReleaseRequest request) {
        return new SyncInvoker<UpdateReleaseRequest, UpdateReleaseResponse>(request, CceMeta.updateRelease, hcClient);
    }

    /**
     * 集群升级
     *
     * 集群升级。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeClusterRequest 请求对象
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.upgradeCluster);
    }

    /**
     * 集群升级
     *
     * 集群升级。
     * &gt; - 集群升级涉及多维度的组件升级操作，强烈建议统一通过CCE控制台执行交互式升级，降低集群升级过程的业务意外受损风险；
     * &gt; - 当前集群升级相关接口受限开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeClusterRequest 请求对象
     * @return SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>
     */
    public SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse> upgradeClusterInvoker(
        UpgradeClusterRequest request) {
        return new SyncInvoker<UpgradeClusterRequest, UpgradeClusterResponse>(request, CceMeta.upgradeCluster,
            hcClient);
    }

    /**
     * 更新指定集群升级引导任务状态
     *
     * 该API用于更新指定集群升级引导任务状态，当前仅适用于取消升级流程
     * 调用该API时升级流程引导任务状态不能为进行中(running) 已完成(success) 已取消(cancel),升级子任务状态不能为running(进行中) init(已初始化) pause(任务被暂停) queue(队列中)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeWorkFlowUpdateRequest 请求对象
     * @return UpgradeWorkFlowUpdateResponse
     */
    public UpgradeWorkFlowUpdateResponse upgradeWorkFlowUpdate(UpgradeWorkFlowUpdateRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.upgradeWorkFlowUpdate);
    }

    /**
     * 更新指定集群升级引导任务状态
     *
     * 该API用于更新指定集群升级引导任务状态，当前仅适用于取消升级流程
     * 调用该API时升级流程引导任务状态不能为进行中(running) 已完成(success) 已取消(cancel),升级子任务状态不能为running(进行中) init(已初始化) pause(任务被暂停) queue(队列中)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeWorkFlowUpdateRequest 请求对象
     * @return SyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse>
     */
    public SyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> upgradeWorkFlowUpdateInvoker(
        UpgradeWorkFlowUpdateRequest request) {
        return new SyncInvoker<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse>(request,
            CceMeta.upgradeWorkFlowUpdate, hcClient);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadChartRequest 请求对象
     * @return UploadChartResponse
     */
    public UploadChartResponse uploadChart(UploadChartRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.uploadChart);
    }

    /**
     * 上传模板
     *
     * 上传模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadChartRequest 请求对象
     * @return SyncInvoker<UploadChartRequest, UploadChartResponse>
     */
    public SyncInvoker<UploadChartRequest, UploadChartResponse> uploadChartInvoker(UploadChartRequest request) {
        return new SyncInvoker<UploadChartRequest, UploadChartResponse>(request, CceMeta.uploadChart, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showVersion);
    }

    /**
     * 查询API版本信息列表
     *
     * 该API用于查询CCE服务当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, CceMeta.showVersion, hcClient);
    }

}
