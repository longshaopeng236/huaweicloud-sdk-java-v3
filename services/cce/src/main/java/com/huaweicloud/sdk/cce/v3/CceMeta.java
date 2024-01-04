package com.huaweicloud.sdk.cce.v3;

import com.huaweicloud.sdk.cce.v3.model.AddNodeList;
import com.huaweicloud.sdk.cce.v3.model.AddNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.AddNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.AddonInstanceRollbackRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.AwakeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsRequestBody;
import com.huaweicloud.sdk.cce.v3.model.BatchCreateClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequest;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsRequestBody;
import com.huaweicloud.sdk.cce.v3.model.BatchDeleteClusterTagsResponse;
import com.huaweicloud.sdk.cce.v3.model.CertDuration;
import com.huaweicloud.sdk.cce.v3.model.ChartResp;
import com.huaweicloud.sdk.cce.v3.model.Cluster;
import com.huaweicloud.sdk.cce.v3.model.ClusterInformation;
import com.huaweicloud.sdk.cce.v3.model.ClusterLogConfig;
import com.huaweicloud.sdk.cce.v3.model.ClusterNodeInformation;
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
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseReqBody;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequest;
import com.huaweicloud.sdk.cce.v3.model.CreateUpgradeWorkFlowRequestBody;
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
import com.huaweicloud.sdk.cce.v3.model.InstanceRequest;
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
import com.huaweicloud.sdk.cce.v3.model.MasterEIPRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.MigrateNodesTask;
import com.huaweicloud.sdk.cce.v3.model.NodeCreateRequest;
import com.huaweicloud.sdk.cce.v3.model.NodePool;
import com.huaweicloud.sdk.cce.v3.model.NodePoolUpdate;
import com.huaweicloud.sdk.cce.v3.model.PartitionReqBody;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskRequest;
import com.huaweicloud.sdk.cce.v3.model.PauseUpgradeClusterTaskResponse;
import com.huaweicloud.sdk.cce.v3.model.PersistentVolumeClaim;
import com.huaweicloud.sdk.cce.v3.model.PostcheckClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.PrecheckClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.ReleaseResp;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.RemoveNodesTask;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeList;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeRequest;
import com.huaweicloud.sdk.cce.v3.model.ResetNodeResponse;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.ResizeClusterRequestBody;
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
import com.huaweicloud.sdk.cce.v3.model.UpdateChartRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpdateChartResponse;
import com.huaweicloud.sdk.cce.v3.model.UpdateClusterConfigurationsBody;
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
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseReqBody;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseRequest;
import com.huaweicloud.sdk.cce.v3.model.UpdateReleaseResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpgradeClusterResponse;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequest;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UpgradeWorkFlowUpdateResponse;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequest;
import com.huaweicloud.sdk.cce.v3.model.UploadChartRequestBody;
import com.huaweicloud.sdk.cce.v3.model.UploadChartResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CceMeta {

    public static final HttpRequestDef<AddNodeRequest, AddNodeResponse> addNode = genForaddNode();

    private static HttpRequestDef<AddNodeRequest, AddNodeResponse> genForaddNode() {
        // basic
        HttpRequestDef.Builder<AddNodeRequest, AddNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddNodeRequest.class, AddNodeResponse.class)
                .withName("AddNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<AddNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddNodeList.class),
            f -> f.withMarshaller(AddNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> awakeCluster = genForawakeCluster();

    private static HttpRequestDef<AwakeClusterRequest, AwakeClusterResponse> genForawakeCluster() {
        // basic
        HttpRequestDef.Builder<AwakeClusterRequest, AwakeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AwakeClusterRequest.class, AwakeClusterResponse.class)
                .withName("AwakeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/awake")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AwakeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> batchCreateClusterTags =
        genForbatchCreateClusterTags();

    private static HttpRequestDef<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> genForbatchCreateClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateClusterTagsRequest, BatchCreateClusterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateClusterTagsRequest.class, BatchCreateClusterTagsResponse.class)
            .withName("BatchCreateClusterTags")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchCreateClusterTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateClusterTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateClusterTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> batchDeleteClusterTags =
        genForbatchDeleteClusterTags();

    private static HttpRequestDef<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> genForbatchDeleteClusterTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteClusterTagsRequest, BatchDeleteClusterTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteClusterTagsRequest.class, BatchDeleteClusterTagsResponse.class)
            .withName("BatchDeleteClusterTags")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<BatchDeleteClusterTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteClusterTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteClusterTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> continueUpgradeClusterTask =
        genForcontinueUpgradeClusterTask();

    private static HttpRequestDef<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> genForcontinueUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<ContinueUpgradeClusterTaskRequest, ContinueUpgradeClusterTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ContinueUpgradeClusterTaskRequest.class,
                    ContinueUpgradeClusterTaskResponse.class)
                .withName("ContinueUpgradeClusterTask")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/continue")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ContinueUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstance =
        genForcreateAddonInstance();

    private static HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> genForcreateAddonInstance() {
        // basic
        HttpRequestDef.Builder<CreateAddonInstanceRequest, CreateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAddonInstanceRequest.class, CreateAddonInstanceResponse.class)
                .withName("CreateAddonInstance")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(CreateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaims =
        genForcreateCloudPersistentVolumeClaims();

    private static HttpRequestDef<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> genForcreateCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudPersistentVolumeClaimsRequest.class,
                    CreateCloudPersistentVolumeClaimsResponse.class)
                .withName("CreateCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
            }));
        builder.<PersistentVolumeClaim>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PersistentVolumeClaim.class),
            f -> f.withMarshaller(CreateCloudPersistentVolumeClaimsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterRequest, CreateClusterResponse> createCluster =
        genForcreateCluster();

    private static HttpRequestDef<CreateClusterRequest, CreateClusterResponse> genForcreateCluster() {
        // basic
        HttpRequestDef.Builder<CreateClusterRequest, CreateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterRequest.class, CreateClusterResponse.class)
                .withName("CreateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<Cluster>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Cluster.class),
            f -> f.withMarshaller(CreateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> createClusterMasterSnapshot =
        genForcreateClusterMasterSnapshot();

    private static HttpRequestDef<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> genForcreateClusterMasterSnapshot() {
        // basic
        HttpRequestDef.Builder<CreateClusterMasterSnapshotRequest, CreateClusterMasterSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateClusterMasterSnapshotRequest.class,
                    CreateClusterMasterSnapshotResponse.class)
                .withName("CreateClusterMasterSnapshot")
                .withUri("/api/v3.1/projects/{project_id}/clusters/{cluster_id}/operation/snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterMasterSnapshotRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCert =
        genForcreateKubernetesClusterCert();

    private static HttpRequestDef<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> genForcreateKubernetesClusterCert() {
        // basic
        HttpRequestDef.Builder<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateKubernetesClusterCertRequest.class,
                    CreateKubernetesClusterCertResponse.class)
                .withName("CreateKubernetesClusterCert")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/clustercert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CertDuration>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertDuration.class),
            f -> f.withMarshaller(CreateKubernetesClusterCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("Port-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKubernetesClusterCertResponse::getPortID,
                CreateKubernetesClusterCertResponse::setPortID));
        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeRequest, CreateNodeResponse> createNode = genForcreateNode();

    private static HttpRequestDef<CreateNodeRequest, CreateNodeResponse> genForcreateNode() {
        // basic
        HttpRequestDef.Builder<CreateNodeRequest, CreateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodeRequest.class, CreateNodeResponse.class)
                .withName("CreateNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateNodeRequest.NodepoolScaleUpEnum>withRequestField("nodepoolScaleUp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateNodeRequest.NodepoolScaleUpEnum.class),
            f -> f.withMarshaller(CreateNodeRequest::getNodepoolScaleUp, (req, v) -> {
                req.setNodepoolScaleUp(v);
            }));
        builder.<NodeCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeCreateRequest.class),
            f -> f.withMarshaller(CreateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> createNodePool =
        genForcreateNodePool();

    private static HttpRequestDef<CreateNodePoolRequest, CreateNodePoolResponse> genForcreateNodePool() {
        // basic
        HttpRequestDef.Builder<CreateNodePoolRequest, CreateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodePoolRequest.class, CreateNodePoolResponse.class)
                .withName("CreateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<NodePool>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePool.class),
            f -> f.withMarshaller(CreateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> createPartition =
        genForcreatePartition();

    private static HttpRequestDef<CreatePartitionRequest, CreatePartitionResponse> genForcreatePartition() {
        // basic
        HttpRequestDef.Builder<CreatePartitionRequest, CreatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePartitionRequest.class, CreatePartitionResponse.class)
                .withName("CreatePartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePartitionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<PartitionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReqBody.class),
            f -> f.withMarshaller(CreatePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostCheckRequest, CreatePostCheckResponse> createPostCheck =
        genForcreatePostCheck();

    private static HttpRequestDef<CreatePostCheckRequest, CreatePostCheckResponse> genForcreatePostCheck() {
        // basic
        HttpRequestDef.Builder<CreatePostCheckRequest, CreatePostCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostCheckRequest.class, CreatePostCheckResponse.class)
                .withName("CreatePostCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/postcheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostCheckRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<PostcheckClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostcheckClusterRequestBody.class),
            f -> f.withMarshaller(CreatePostCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreCheckRequest, CreatePreCheckResponse> createPreCheck =
        genForcreatePreCheck();

    private static HttpRequestDef<CreatePreCheckRequest, CreatePreCheckResponse> genForcreatePreCheck() {
        // basic
        HttpRequestDef.Builder<CreatePreCheckRequest, CreatePreCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePreCheckRequest.class, CreatePreCheckResponse.class)
                .withName("CreatePreCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreCheckRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<PrecheckClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrecheckClusterRequestBody.class),
            f -> f.withMarshaller(CreatePreCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReleaseRequest, CreateReleaseResponse> createRelease =
        genForcreateRelease();

    private static HttpRequestDef<CreateReleaseRequest, CreateReleaseResponse> genForcreateRelease() {
        // basic
        HttpRequestDef.Builder<CreateReleaseRequest, CreateReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReleaseRequest.class, CreateReleaseResponse.class)
                .withName("CreateRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/releases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReleaseRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateReleaseReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReleaseReqBody.class),
            f -> f.withMarshaller(CreateReleaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> createUpgradeWorkFlow =
        genForcreateUpgradeWorkFlow();

    private static HttpRequestDef<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> genForcreateUpgradeWorkFlow() {
        // basic
        HttpRequestDef.Builder<CreateUpgradeWorkFlowRequest, CreateUpgradeWorkFlowResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateUpgradeWorkFlowRequest.class, CreateUpgradeWorkFlowResponse.class)
            .withName("CreateUpgradeWorkFlow")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUpgradeWorkFlowRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<CreateUpgradeWorkFlowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUpgradeWorkFlowRequestBody.class),
            f -> f.withMarshaller(CreateUpgradeWorkFlowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstance =
        genFordeleteAddonInstance();

    private static HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> genFordeleteAddonInstance() {
        // basic
        HttpRequestDef.Builder<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAddonInstanceRequest.class, DeleteAddonInstanceResponse.class)
            .withName("DeleteAddonInstance")
            .withUri("/api/v3/addons/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChartRequest, DeleteChartResponse> deleteChart = genFordeleteChart();

    private static HttpRequestDef<DeleteChartRequest, DeleteChartResponse> genFordeleteChart() {
        // basic
        HttpRequestDef.Builder<DeleteChartRequest, DeleteChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteChartRequest.class, DeleteChartResponse.class)
                .withName("DeleteChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChartRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteChartResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaims =
        genFordeleteCloudPersistentVolumeClaims();

    private static HttpRequestDef<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> genFordeleteCloudPersistentVolumeClaims() {
        // basic
        HttpRequestDef.Builder<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCloudPersistentVolumeClaimsRequest.class,
                    DeleteCloudPersistentVolumeClaimsResponse.class)
                .withName("DeleteCloudPersistentVolumeClaims")
                .withUri("/api/v1/namespaces/{namespace}/cloudpersistentvolumeclaims/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("deleteVolume",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getDeleteVolume, (req, v) -> {
                req.setDeleteVolume(v);
            }));
        builder.<String>withRequestField("storageType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getStorageType, (req, v) -> {
                req.setStorageType(v);
            }));
        builder.<String>withRequestField("X-Cluster-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudPersistentVolumeClaimsRequest::getXClusterID, (req, v) -> {
                req.setXClusterID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genFordeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genFordeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<DeleteClusterRequest.DeleteEfsEnum>withRequestField("delete_efs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEfs, (req, v) -> {
                req.setDeleteEfs(v);
            }));
        builder.<DeleteClusterRequest.DeleteEniEnum>withRequestField("delete_eni",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEniEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEni, (req, v) -> {
                req.setDeleteEni(v);
            }));
        builder.<DeleteClusterRequest.DeleteEvsEnum>withRequestField("delete_evs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteEvsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteEvs, (req, v) -> {
                req.setDeleteEvs(v);
            }));
        builder.<DeleteClusterRequest.DeleteNetEnum>withRequestField("delete_net",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteNetEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteNet, (req, v) -> {
                req.setDeleteNet(v);
            }));
        builder.<DeleteClusterRequest.DeleteObsEnum>withRequestField("delete_obs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteObsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteObs, (req, v) -> {
                req.setDeleteObs(v);
            }));
        builder.<DeleteClusterRequest.DeleteSfsEnum>withRequestField("delete_sfs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfsEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs, (req, v) -> {
                req.setDeleteSfs(v);
            }));
        builder.<DeleteClusterRequest.DeleteSfs30Enum>withRequestField("delete_sfs30",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.DeleteSfs30Enum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getDeleteSfs30, (req, v) -> {
                req.setDeleteSfs30(v);
            }));
        builder.<DeleteClusterRequest.TobedeletedEnum>withRequestField("tobedeleted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.TobedeletedEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getTobedeleted, (req, v) -> {
                req.setTobedeleted(v);
            }));
        builder.<DeleteClusterRequest.OndemandNodePolicyEnum>withRequestField("ondemand_node_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.OndemandNodePolicyEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getOndemandNodePolicy, (req, v) -> {
                req.setOndemandNodePolicy(v);
            }));
        builder.<DeleteClusterRequest.PeriodicNodePolicyEnum>withRequestField("periodic_node_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteClusterRequest.PeriodicNodePolicyEnum.class),
            f -> f.withMarshaller(DeleteClusterRequest::getPeriodicNodePolicy, (req, v) -> {
                req.setPeriodicNodePolicy(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genFordeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genFordeleteNode() {
        // basic
        HttpRequestDef.Builder<DeleteNodeRequest, DeleteNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodeRequest.class, DeleteNodeResponse.class)
                .withName("DeleteNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<DeleteNodeRequest.NodepoolScaleDownEnum>withRequestField("nodepoolScaleDown",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteNodeRequest.NodepoolScaleDownEnum.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodepoolScaleDown, (req, v) -> {
                req.setNodepoolScaleDown(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePool =
        genFordeleteNodePool();

    private static HttpRequestDef<DeleteNodePoolRequest, DeleteNodePoolResponse> genFordeleteNodePool() {
        // basic
        HttpRequestDef.Builder<DeleteNodePoolRequest, DeleteNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodePoolRequest.class, DeleteNodePoolResponse.class)
                .withName("DeleteNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReleaseRequest, DeleteReleaseResponse> deleteRelease =
        genFordeleteRelease();

    private static HttpRequestDef<DeleteReleaseRequest, DeleteReleaseResponse> genFordeleteRelease() {
        // basic
        HttpRequestDef.Builder<DeleteReleaseRequest, DeleteReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReleaseRequest.class, DeleteReleaseResponse.class)
                .withName("DeleteRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReleaseRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReleaseResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DownloadChartRequest, DownloadChartResponse> downloadChart =
        genFordownloadChart();

    private static HttpRequestDef<DownloadChartRequest, DownloadChartResponse> genFordownloadChart() {
        // basic
        HttpRequestDef.Builder<DownloadChartRequest, DownloadChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadChartRequest.class, DownloadChartResponse.class)
                .withName("DownloadChart")
                .withUri("/v2/charts/{chart_id}/archive")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadChartRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> hibernateCluster =
        genForhibernateCluster();

    private static HttpRequestDef<HibernateClusterRequest, HibernateClusterResponse> genForhibernateCluster() {
        // basic
        HttpRequestDef.Builder<HibernateClusterRequest, HibernateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HibernateClusterRequest.class, HibernateClusterResponse.class)
                .withName("HibernateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/hibernate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HibernateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstances =
        genForlistAddonInstances();

    private static HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> genForlistAddonInstances() {
        // basic
        HttpRequestDef.Builder<ListAddonInstancesRequest, ListAddonInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonInstancesRequest.class, ListAddonInstancesResponse.class)
                .withName("ListAddonInstances")
                .withUri("/api/v3/addons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonInstancesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplates =
        genForlistAddonTemplates();

    private static HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> genForlistAddonTemplates() {
        // basic
        HttpRequestDef.Builder<ListAddonTemplatesRequest, ListAddonTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonTemplatesRequest.class, ListAddonTemplatesResponse.class)
                .withName("ListAddonTemplates")
                .withUri("/api/v3/addontemplates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("addon_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getAddonTemplateName, (req, v) -> {
                req.setAddonTemplateName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChartsRequest, ListChartsResponse> listCharts = genForlistCharts();

    private static HttpRequestDef<ListChartsRequest, ListChartsResponse> genForlistCharts() {
        // basic
        HttpRequestDef.Builder<ListChartsRequest, ListChartsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChartsRequest.class, ListChartsResponse.class)
                .withName("ListCharts")
                .withUri("/v2/charts")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<ChartResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListChartsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ChartResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> listClusterMasterSnapshotTasks =
        genForlistClusterMasterSnapshotTasks();

    private static HttpRequestDef<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> genForlistClusterMasterSnapshotTasks() {
        // basic
        HttpRequestDef.Builder<ListClusterMasterSnapshotTasksRequest, ListClusterMasterSnapshotTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterMasterSnapshotTasksRequest.class,
                    ListClusterMasterSnapshotTasksResponse.class)
                .withName("ListClusterMasterSnapshotTasks")
                .withUri("/api/v3.1/projects/{project_id}/clusters/{cluster_id}/operation/snapshot/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterMasterSnapshotTasksRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> listClusterUpgradeFeatureGates =
        genForlistClusterUpgradeFeatureGates();

    private static HttpRequestDef<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> genForlistClusterUpgradeFeatureGates() {
        // basic
        HttpRequestDef.Builder<ListClusterUpgradeFeatureGatesRequest, ListClusterUpgradeFeatureGatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterUpgradeFeatureGatesRequest.class,
                    ListClusterUpgradeFeatureGatesResponse.class)
                .withName("ListClusterUpgradeFeatureGates")
                .withUri("/api/v3/clusterupgradefeaturegates")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> listClusterUpgradePaths =
        genForlistClusterUpgradePaths();

    private static HttpRequestDef<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> genForlistClusterUpgradePaths() {
        // basic
        HttpRequestDef.Builder<ListClusterUpgradePathsRequest, ListClusterUpgradePathsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterUpgradePathsRequest.class, ListClusterUpgradePathsResponse.class)
            .withName("ListClusterUpgradePaths")
            .withUri("/api/v3/clusterupgradepaths")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClustersRequest, ListClustersResponse> listClusters = genForlistClusters();

    private static HttpRequestDef<ListClustersRequest, ListClustersResponse> genForlistClusters() {
        // basic
        HttpRequestDef.Builder<ListClustersRequest, ListClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClustersRequest.class, ListClustersResponse.class)
                .withName("ListClusters")
                .withUri("/api/v3/projects/{project_id}/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            }));
        builder.<ListClustersRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.StatusEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListClustersRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClustersRequest.TypeEnum.class),
            f -> f.withMarshaller(ListClustersRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClustersRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> listNodePools =
        genForlistNodePools();

    private static HttpRequestDef<ListNodePoolsRequest, ListNodePoolsResponse> genForlistNodePools() {
        // basic
        HttpRequestDef.Builder<ListNodePoolsRequest, ListNodePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodePoolsRequest.class, ListNodePoolsResponse.class)
                .withName("ListNodePools")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("showDefaultNodePool",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodePoolsRequest::getShowDefaultNodePool, (req, v) -> {
                req.setShowDefaultNodePool(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodesRequest, ListNodesResponse> listNodes = genForlistNodes();

    private static HttpRequestDef<ListNodesRequest, ListNodesResponse> genForlistNodes() {
        // basic
        HttpRequestDef.Builder<ListNodesRequest, ListNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNodesRequest.class, ListNodesResponse.class)
                .withName("ListNodes")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> listPartitions =
        genForlistPartitions();

    private static HttpRequestDef<ListPartitionsRequest, ListPartitionsResponse> genForlistPartitions() {
        // basic
        HttpRequestDef.Builder<ListPartitionsRequest, ListPartitionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPartitionsRequest.class, ListPartitionsResponse.class)
                .withName("ListPartitions")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPartitionsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPreCheckTasksRequest, ListPreCheckTasksResponse> listPreCheckTasks =
        genForlistPreCheckTasks();

    private static HttpRequestDef<ListPreCheckTasksRequest, ListPreCheckTasksResponse> genForlistPreCheckTasks() {
        // basic
        HttpRequestDef.Builder<ListPreCheckTasksRequest, ListPreCheckTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPreCheckTasksRequest.class, ListPreCheckTasksResponse.class)
                .withName("ListPreCheckTasks")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPreCheckTasksRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReleasesRequest, ListReleasesResponse> listReleases = genForlistReleases();

    private static HttpRequestDef<ListReleasesRequest, ListReleasesResponse> genForlistReleases() {
        // basic
        HttpRequestDef.Builder<ListReleasesRequest, ListReleasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReleasesRequest.class, ListReleasesResponse.class)
                .withName("ListReleases")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/releases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("chart_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReleasesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));

        // response
        builder.<List<ReleaseResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReleasesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ReleaseResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> listUpgradeClusterTasks =
        genForlistUpgradeClusterTasks();

    private static HttpRequestDef<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> genForlistUpgradeClusterTasks() {
        // basic
        HttpRequestDef.Builder<ListUpgradeClusterTasksRequest, ListUpgradeClusterTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpgradeClusterTasksRequest.class, ListUpgradeClusterTasksResponse.class)
            .withName("ListUpgradeClusterTasks")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeClusterTasksRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> listUpgradeWorkFlows =
        genForlistUpgradeWorkFlows();

    private static HttpRequestDef<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> genForlistUpgradeWorkFlows() {
        // basic
        HttpRequestDef.Builder<ListUpgradeWorkFlowsRequest, ListUpgradeWorkFlowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpgradeWorkFlowsRequest.class, ListUpgradeWorkFlowsResponse.class)
            .withName("ListUpgradeWorkFlows")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeWorkFlowsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> migrateNode = genFormigrateNode();

    private static HttpRequestDef<MigrateNodeRequest, MigrateNodeResponse> genFormigrateNode() {
        // basic
        HttpRequestDef.Builder<MigrateNodeRequest, MigrateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MigrateNodeRequest.class, MigrateNodeResponse.class)
                .withName("MigrateNode")
                .withUri(
                    "/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/operation/migrateto/{target_cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("target_cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateNodeRequest::getTargetClusterId, (req, v) -> {
                req.setTargetClusterId(v);
            }));
        builder.<MigrateNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateNodesTask.class),
            f -> f.withMarshaller(MigrateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> pauseUpgradeClusterTask =
        genForpauseUpgradeClusterTask();

    private static HttpRequestDef<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> genForpauseUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<PauseUpgradeClusterTaskRequest, PauseUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PauseUpgradeClusterTaskRequest.class, PauseUpgradeClusterTaskResponse.class)
            .withName("PauseUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/pause")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> removeNode = genForremoveNode();

    private static HttpRequestDef<RemoveNodeRequest, RemoveNodeResponse> genForremoveNode() {
        // basic
        HttpRequestDef.Builder<RemoveNodeRequest, RemoveNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RemoveNodeRequest.class, RemoveNodeResponse.class)
                .withName("RemoveNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/operation/remove")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<RemoveNodesTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveNodesTask.class),
            f -> f.withMarshaller(RemoveNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetNodeRequest, ResetNodeResponse> resetNode = genForresetNode();

    private static HttpRequestDef<ResetNodeRequest, ResetNodeResponse> genForresetNode() {
        // basic
        HttpRequestDef.Builder<ResetNodeRequest, ResetNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetNodeRequest.class, ResetNodeResponse.class)
                .withName("ResetNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResetNodeList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetNodeList.class),
            f -> f.withMarshaller(ResetNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> resizeCluster =
        genForresizeCluster();

    private static HttpRequestDef<ResizeClusterRequest, ResizeClusterResponse> genForresizeCluster() {
        // basic
        HttpRequestDef.Builder<ResizeClusterRequest, ResizeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeClusterRequest.class, ResizeClusterResponse.class)
                .withName("ResizeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ResizeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeClusterRequestBody.class),
            f -> f.withMarshaller(ResizeClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> retryUpgradeClusterTask =
        genForretryUpgradeClusterTask();

    private static HttpRequestDef<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> genForretryUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<RetryUpgradeClusterTaskRequest, RetryUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RetryUpgradeClusterTaskRequest.class, RetryUpgradeClusterTaskResponse.class)
            .withName("RetryUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/retry")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> rollbackAddonInstance =
        genForrollbackAddonInstance();

    private static HttpRequestDef<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> genForrollbackAddonInstance() {
        // basic
        HttpRequestDef.Builder<RollbackAddonInstanceRequest, RollbackAddonInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RollbackAddonInstanceRequest.class, RollbackAddonInstanceResponse.class)
            .withName("RollbackAddonInstance")
            .withUri("/api/v3/addons/{id}/operation/rollback")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollbackAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<AddonInstanceRollbackRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddonInstanceRollbackRequest.class),
            f -> f.withMarshaller(RollbackAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstance =
        genForshowAddonInstance();

    private static HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> genForshowAddonInstance() {
        // basic
        HttpRequestDef.Builder<ShowAddonInstanceRequest, ShowAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAddonInstanceRequest.class, ShowAddonInstanceResponse.class)
                .withName("ShowAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChartRequest, ShowChartResponse> showChart = genForshowChart();

    private static HttpRequestDef<ShowChartRequest, ShowChartResponse> genForshowChart() {
        // basic
        HttpRequestDef.Builder<ShowChartRequest, ShowChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChartRequest.class, ShowChartResponse.class)
                .withName("ShowChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChartRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChartValuesRequest, ShowChartValuesResponse> showChartValues =
        genForshowChartValues();

    private static HttpRequestDef<ShowChartValuesRequest, ShowChartValuesResponse> genForshowChartValues() {
        // basic
        HttpRequestDef.Builder<ShowChartValuesRequest, ShowChartValuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChartValuesRequest.class, ShowChartValuesResponse.class)
                .withName("ShowChartValues")
                .withUri("/v2/charts/{chart_id}/values")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChartValuesRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForshowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForshowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getDetail, (req, v) -> {
                req.setDetail(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterConfigRequest, ShowClusterConfigResponse> showClusterConfig =
        genForshowClusterConfig();

    private static HttpRequestDef<ShowClusterConfigRequest, ShowClusterConfigResponse> genForshowClusterConfig() {
        // basic
        HttpRequestDef.Builder<ShowClusterConfigRequest, ShowClusterConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterConfigRequest.class, ShowClusterConfigResponse.class)
                .withName("ShowClusterConfig")
                .withUri("/api/v3/projects/{project_id}/cluster/{cluster_id}/log-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterConfigRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ShowClusterConfigRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowClusterConfigRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowClusterConfigRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> showClusterConfigurationDetails =
        genForshowClusterConfigurationDetails();

    private static HttpRequestDef<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> genForshowClusterConfigurationDetails() {
        // basic
        HttpRequestDef.Builder<ShowClusterConfigurationDetailsRequest, ShowClusterConfigurationDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterConfigurationDetailsRequest.class,
                    ShowClusterConfigurationDetailsResponse.class)
                .withName("ShowClusterConfigurationDetails")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/configuration/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterConfigurationDetailsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> showClusterEndpoints =
        genForshowClusterEndpoints();

    private static HttpRequestDef<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> genForshowClusterEndpoints() {
        // basic
        HttpRequestDef.Builder<ShowClusterEndpointsRequest, ShowClusterEndpointsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterEndpointsRequest.class, ShowClusterEndpointsResponse.class)
            .withName("ShowClusterEndpoints")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/openapi")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterEndpointsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> showClusterUpgradeInfo =
        genForshowClusterUpgradeInfo();

    private static HttpRequestDef<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> genForshowClusterUpgradeInfo() {
        // basic
        HttpRequestDef.Builder<ShowClusterUpgradeInfoRequest, ShowClusterUpgradeInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterUpgradeInfoRequest.class, ShowClusterUpgradeInfoResponse.class)
            .withName("ShowClusterUpgradeInfo")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/upgradeinfo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterUpgradeInfoRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForshowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForshowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/api/v3/projects/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForshowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForshowNode() {
        // basic
        HttpRequestDef.Builder<ShowNodeRequest, ShowNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodeRequest.class, ShowNodeResponse.class)
                .withName("ShowNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> showNodePool = genForshowNodePool();

    private static HttpRequestDef<ShowNodePoolRequest, ShowNodePoolResponse> genForshowNodePool() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolRequest, ShowNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodePoolRequest.class, ShowNodePoolResponse.class)
                .withName("ShowNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> showNodePoolConfigurations =
        genForshowNodePoolConfigurations();

    private static HttpRequestDef<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> genForshowNodePoolConfigurations() {
        // basic
        HttpRequestDef.Builder<ShowNodePoolConfigurationsRequest, ShowNodePoolConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNodePoolConfigurationsRequest.class,
                    ShowNodePoolConfigurationsResponse.class)
                .withName("ShowNodePoolConfigurations")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodePoolConfigurationsRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPartitionRequest, ShowPartitionResponse> showPartition =
        genForshowPartition();

    private static HttpRequestDef<ShowPartitionRequest, ShowPartitionResponse> genForshowPartition() {
        // basic
        HttpRequestDef.Builder<ShowPartitionRequest, ShowPartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPartitionRequest.class, ShowPartitionResponse.class)
                .withName("ShowPartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions/{partition_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("partition_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPartitionRequest::getPartitionName, (req, v) -> {
                req.setPartitionName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPreCheckRequest, ShowPreCheckResponse> showPreCheck = genForshowPreCheck();

    private static HttpRequestDef<ShowPreCheckRequest, ShowPreCheckResponse> genForshowPreCheck() {
        // basic
        HttpRequestDef.Builder<ShowPreCheckRequest, ShowPreCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPreCheckRequest.class, ShowPreCheckResponse.class)
                .withName("ShowPreCheck")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/precheck/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreCheckRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPreCheckRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/api/v3/projects/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseRequest, ShowReleaseResponse> showRelease = genForshowRelease();

    private static HttpRequestDef<ShowReleaseRequest, ShowReleaseResponse> genForshowRelease() {
        // basic
        HttpRequestDef.Builder<ShowReleaseRequest, ShowReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReleaseRequest.class, ShowReleaseResponse.class)
                .withName("ShowRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> showReleaseHistory =
        genForshowReleaseHistory();

    private static HttpRequestDef<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> genForshowReleaseHistory() {
        // basic
        HttpRequestDef.Builder<ShowReleaseHistoryRequest, ShowReleaseHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReleaseHistoryRequest.class, ShowReleaseHistoryResponse.class)
                .withName("ShowReleaseHistory")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseHistoryRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));

        // response
        builder.<List<ReleaseResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowReleaseHistoryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ReleaseResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> showUpgradeClusterTask =
        genForshowUpgradeClusterTask();

    private static HttpRequestDef<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> genForshowUpgradeClusterTask() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeClusterTaskRequest, ShowUpgradeClusterTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUpgradeClusterTaskRequest.class, ShowUpgradeClusterTaskResponse.class)
            .withName("ShowUpgradeClusterTask")
            .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeClusterTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> showUpgradeWorkFlow =
        genForshowUpgradeWorkFlow();

    private static HttpRequestDef<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> genForshowUpgradeWorkFlow() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeWorkFlowRequest, ShowUpgradeWorkFlowResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUpgradeWorkFlowRequest.class, ShowUpgradeWorkFlowResponse.class)
            .withName("ShowUpgradeWorkFlow")
            .withUri(
                "/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows/{upgrade_workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeWorkFlowRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("upgrade_workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeWorkFlowRequest::getUpgradeWorkflowId, (req, v) -> {
                req.setUpgradeWorkflowId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> showUserChartsQuotas =
        genForshowUserChartsQuotas();

    private static HttpRequestDef<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> genForshowUserChartsQuotas() {
        // basic
        HttpRequestDef.Builder<ShowUserChartsQuotasRequest, ShowUserChartsQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserChartsQuotasRequest.class, ShowUserChartsQuotasResponse.class)
            .withName("ShowUserChartsQuotas")
            .withUri("/v2/charts/{project_id}/quotas")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstance =
        genForupdateAddonInstance();

    private static HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> genForupdateAddonInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddonInstanceRequest.class, UpdateAddonInstanceResponse.class)
                .withName("UpdateAddonInstance")
                .withUri("/api/v3/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateChartRequest, UpdateChartResponse> updateChart = genForupdateChart();

    private static HttpRequestDef<UpdateChartRequest, UpdateChartResponse> genForupdateChart() {
        // basic
        HttpRequestDef.Builder<UpdateChartRequest, UpdateChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateChartRequest.class, UpdateChartResponse.class)
                .withName("UpdateChart")
                .withUri("/v2/charts/{chart_id}")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("chart_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChartRequest::getChartId, (req, v) -> {
                req.setChartId(v);
            }));
        builder.<UpdateChartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateChartRequestBody.class),
            f -> f.withMarshaller(UpdateChartRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> updateCluster =
        genForupdateCluster();

    private static HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> genForupdateCluster() {
        // basic
        HttpRequestDef.Builder<UpdateClusterRequest, UpdateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterRequest.class, UpdateClusterResponse.class)
                .withName("UpdateCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ClusterInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterInformation.class),
            f -> f.withMarshaller(UpdateClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> updateClusterEip =
        genForupdateClusterEip();

    private static HttpRequestDef<UpdateClusterEipRequest, UpdateClusterEipResponse> genForupdateClusterEip() {
        // basic
        HttpRequestDef.Builder<UpdateClusterEipRequest, UpdateClusterEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterEipRequest.class, UpdateClusterEipResponse.class)
                .withName("UpdateClusterEip")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/mastereip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterEipRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<MasterEIPRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MasterEIPRequest.class),
            f -> f.withMarshaller(UpdateClusterEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> updateClusterLogConfig =
        genForupdateClusterLogConfig();

    private static HttpRequestDef<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> genForupdateClusterLogConfig() {
        // basic
        HttpRequestDef.Builder<UpdateClusterLogConfigRequest, UpdateClusterLogConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateClusterLogConfigRequest.class, UpdateClusterLogConfigResponse.class)
            .withName("UpdateClusterLogConfig")
            .withUri("/api/v3/projects/{project_id}/cluster/{cluster_id}/log-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterLogConfigRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<ClusterLogConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterLogConfig.class),
            f -> f.withMarshaller(UpdateClusterLogConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForupdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForupdateNode() {
        // basic
        HttpRequestDef.Builder<UpdateNodeRequest, UpdateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeRequest.class, UpdateNodeResponse.class)
                .withName("UpdateNode")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ClusterNodeInformation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterNodeInformation.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePool =
        genForupdateNodePool();

    private static HttpRequestDef<UpdateNodePoolRequest, UpdateNodePoolResponse> genForupdateNodePool() {
        // basic
        HttpRequestDef.Builder<UpdateNodePoolRequest, UpdateNodePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodePoolRequest.class, UpdateNodePoolResponse.class)
                .withName("UpdateNodePool")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));
        builder.<NodePoolUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodePoolUpdate.class),
            f -> f.withMarshaller(UpdateNodePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> updateNodePoolConfiguration =
        genForupdateNodePoolConfiguration();

    private static HttpRequestDef<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> genForupdateNodePoolConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateNodePoolConfigurationRequest, UpdateNodePoolConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateNodePoolConfigurationRequest.class,
                    UpdateNodePoolConfigurationResponse.class)
                .withName("UpdateNodePoolConfiguration")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/nodepools/{nodepool_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("nodepool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getNodepoolId, (req, v) -> {
                req.setNodepoolId(v);
            }));
        builder.<UpdateClusterConfigurationsBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterConfigurationsBody.class),
            f -> f.withMarshaller(UpdateNodePoolConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePartitionRequest, UpdatePartitionResponse> updatePartition =
        genForupdatePartition();

    private static HttpRequestDef<UpdatePartitionRequest, UpdatePartitionResponse> genForupdatePartition() {
        // basic
        HttpRequestDef.Builder<UpdatePartitionRequest, UpdatePartitionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePartitionRequest.class, UpdatePartitionResponse.class)
                .withName("UpdatePartition")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/partitions/{partition_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("partition_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getPartitionName, (req, v) -> {
                req.setPartitionName(v);
            }));
        builder.<PartitionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PartitionReqBody.class),
            f -> f.withMarshaller(UpdatePartitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReleaseRequest, UpdateReleaseResponse> updateRelease =
        genForupdateRelease();

    private static HttpRequestDef<UpdateReleaseRequest, UpdateReleaseResponse> genForupdateRelease() {
        // basic
        HttpRequestDef.Builder<UpdateReleaseRequest, UpdateReleaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReleaseRequest.class, UpdateReleaseResponse.class)
                .withName("UpdateRelease")
                .withUri("/cce/cam/v3/clusters/{cluster_id}/namespace/{namespace}/releases/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpdateReleaseReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReleaseReqBody.class),
            f -> f.withMarshaller(UpdateReleaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> upgradeCluster =
        genForupgradeCluster();

    private static HttpRequestDef<UpgradeClusterRequest, UpgradeClusterResponse> genForupgradeCluster() {
        // basic
        HttpRequestDef.Builder<UpgradeClusterRequest, UpgradeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeClusterRequest.class, UpgradeClusterResponse.class)
                .withName("UpgradeCluster")
                .withUri("/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeClusterRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<UpgradeClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeClusterRequestBody.class),
            f -> f.withMarshaller(UpgradeClusterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> upgradeWorkFlowUpdate =
        genForupgradeWorkFlowUpdate();

    private static HttpRequestDef<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> genForupgradeWorkFlowUpdate() {
        // basic
        HttpRequestDef.Builder<UpgradeWorkFlowUpdateRequest, UpgradeWorkFlowUpdateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpgradeWorkFlowUpdateRequest.class, UpgradeWorkFlowUpdateResponse.class)
            .withName("UpgradeWorkFlowUpdate")
            .withUri(
                "/api/v3/projects/{project_id}/clusters/{cluster_id}/operation/upgradeworkflows/{upgrade_workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("upgrade_workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getUpgradeWorkflowId, (req, v) -> {
                req.setUpgradeWorkflowId(v);
            }));
        builder.<UpgradeWorkFlowUpdateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeWorkFlowUpdateRequestBody.class),
            f -> f.withMarshaller(UpgradeWorkFlowUpdateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadChartRequest, UploadChartResponse> uploadChart = genForuploadChart();

    private static HttpRequestDef<UploadChartRequest, UploadChartResponse> genForuploadChart() {
        // basic
        HttpRequestDef.Builder<UploadChartRequest, UploadChartResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadChartRequest.class, UploadChartResponse.class)
                .withName("UploadChart")
                .withUri("/v2/charts")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadChartRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadChartRequestBody.class),
            f -> f.withMarshaller(UploadChartRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForshowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForshowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
