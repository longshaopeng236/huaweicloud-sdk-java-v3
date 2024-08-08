package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconResponse;

import java.util.concurrent.CompletableFuture;

public class WorkspaceAppAsyncClient {

    protected HcClient hcClient;

    public WorkspaceAppAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAppAsyncClient> newBuilder() {
        ClientBuilder<WorkspaceAppAsyncClient> clientBuilder = new ClientBuilder<>(WorkspaceAppAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取上传至OBS桶的临时ak/sk
     *
     * 获取上传至OBS桶的临时ak/sk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeObsRequest 请求对象
     * @return CompletableFuture<AuthorizeObsResponse>
     */
    public CompletableFuture<AuthorizeObsResponse> authorizeObsAsync(AuthorizeObsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.authorizeObs);
    }

    /**
     * 获取上传至OBS桶的临时ak/sk
     *
     * 获取上传至OBS桶的临时ak/sk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeObsRequest 请求对象
     * @return AsyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse>
     */
    public AsyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse> authorizeObsAsyncInvoker(
        AuthorizeObsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.authorizeObs, hcClient);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return CompletableFuture<BatchDeleteWarehouseAppResponse>
     */
    public CompletableFuture<BatchDeleteWarehouseAppResponse> batchDeleteWarehouseAppAsync(
        BatchDeleteWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteWarehouseApp);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return AsyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse>
     */
    public AsyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> batchDeleteWarehouseAppAsyncInvoker(
        BatchDeleteWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteWarehouseApp, hcClient);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return CompletableFuture<CreateWarehouseAppResponse>
     */
    public CompletableFuture<CreateWarehouseAppResponse> createWarehouseAppAsync(CreateWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createWarehouseApp);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return AsyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse>
     */
    public AsyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse> createWarehouseAppAsyncInvoker(
        CreateWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createWarehouseApp, hcClient);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return CompletableFuture<ListWarehouseAppsResponse>
     */
    public CompletableFuture<ListWarehouseAppsResponse> listWarehouseAppsAsync(ListWarehouseAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listWarehouseApps);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return AsyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse>
     */
    public AsyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse> listWarehouseAppsAsyncInvoker(
        ListWarehouseAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listWarehouseApps, hcClient);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return CompletableFuture<UpdateWarehouseAppResponse>
     */
    public CompletableFuture<UpdateWarehouseAppResponse> updateWarehouseAppAsync(UpdateWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateWarehouseApp);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return AsyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse>
     */
    public AsyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> updateWarehouseAppAsyncInvoker(
        UpdateWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateWarehouseApp, hcClient);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return CompletableFuture<UploadWarehouseAppIconResponse>
     */
    public CompletableFuture<UploadWarehouseAppIconResponse> uploadWarehouseAppIconAsync(
        UploadWarehouseAppIconRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.uploadWarehouseAppIcon);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return AsyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse>
     */
    public AsyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> uploadWarehouseAppIconAsyncInvoker(
        UploadWarehouseAppIconRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.uploadWarehouseAppIcon, hcClient);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return CompletableFuture<ListPublishedAppResponse>
     */
    public CompletableFuture<ListPublishedAppResponse> listPublishedAppAsync(ListPublishedAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPublishedApp);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return AsyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse>
     */
    public AsyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedAppAsyncInvoker(
        ListPublishedAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPublishedApp, hcClient);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return CompletableFuture<PublishAppResponse>
     */
    public CompletableFuture<PublishAppResponse> publishAppAsync(PublishAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return AsyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public AsyncInvoker<PublishAppRequest, PublishAppResponse> publishAppAsyncInvoker(PublishAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.publishApp, hcClient);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return CompletableFuture<ShowPublishableAppResponse>
     */
    public CompletableFuture<ShowPublishableAppResponse> showPublishableAppAsync(ShowPublishableAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showPublishableApp);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return AsyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse>
     */
    public AsyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableAppAsyncInvoker(
        ShowPublishableAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showPublishableApp, hcClient);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAppRequest 请求对象
     * @return CompletableFuture<UnpublishAppResponse>
     */
    public CompletableFuture<UnpublishAppResponse> unpublishAppAsync(UnpublishAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.unpublishApp);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAppRequest 请求对象
     * @return AsyncInvoker<UnpublishAppRequest, UnpublishAppResponse>
     */
    public AsyncInvoker<UnpublishAppRequest, UnpublishAppResponse> unpublishAppAsyncInvoker(
        UnpublishAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.unpublishApp, hcClient);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateApp);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateApp, hcClient);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return CompletableFuture<UploadAppIconResponse>
     */
    public CompletableFuture<UploadAppIconResponse> uploadAppIconAsync(UploadAppIconRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.uploadAppIcon);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return AsyncInvoker<UploadAppIconRequest, UploadAppIconResponse>
     */
    public AsyncInvoker<UploadAppIconRequest, UploadAppIconResponse> uploadAppIconAsyncInvoker(
        UploadAppIconRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.uploadAppIcon, hcClient);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppGroupResponse>
     */
    public CompletableFuture<BatchDeleteAppGroupResponse> batchDeleteAppGroupAsync(BatchDeleteAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroup);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse>
     */
    public AsyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroupAsyncInvoker(
        BatchDeleteAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroup, hcClient);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupRequest 请求对象
     * @return CompletableFuture<CreateAppGroupResponse>
     */
    public CompletableFuture<CreateAppGroupResponse> createAppGroupAsync(CreateAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createAppGroup);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupRequest 请求对象
     * @return AsyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse>
     */
    public AsyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroupAsyncInvoker(
        CreateAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createAppGroup, hcClient);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return CompletableFuture<ListAppGroupResponse>
     */
    public CompletableFuture<ListAppGroupResponse> listAppGroupAsync(ListAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppGroup);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return AsyncInvoker<ListAppGroupRequest, ListAppGroupResponse>
     */
    public AsyncInvoker<ListAppGroupRequest, ListAppGroupResponse> listAppGroupAsyncInvoker(
        ListAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppGroup, hcClient);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return CompletableFuture<UpdateAppGroupResponse>
     */
    public CompletableFuture<UpdateAppGroupResponse> updateAppGroupAsync(UpdateAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateAppGroup);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse>
     */
    public AsyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroupAsyncInvoker(
        UpdateAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateAppGroup, hcClient);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return CompletableFuture<ListProductResponse>
     */
    public CompletableFuture<ListProductResponse> listProductAsync(ListProductRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listProduct);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return AsyncInvoker<ListProductRequest, ListProductResponse>
     */
    public AsyncInvoker<ListProductRequest, ListProductResponse> listProductAsyncInvoker(ListProductRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listProduct, hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return CompletableFuture<ListSessionTypeResponse>
     */
    public CompletableFuture<ListSessionTypeResponse> listSessionTypeAsync(ListSessionTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessionType);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return AsyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse>
     */
    public AsyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse> listSessionTypeAsyncInvoker(
        ListSessionTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessionType, hcClient);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<AddAppGroupAuthorizationResponse>
     */
    public CompletableFuture<AddAppGroupAuthorizationResponse> addAppGroupAuthorizationAsync(
        AddAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.addAppGroupAuthorization);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorizationAsyncInvoker(
        AddAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.addAppGroupAuthorization, hcClient);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppGroupAuthorizationResponse>
     */
    public CompletableFuture<BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationAsync(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationAsyncInvoker(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization, hcClient);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<ListAppGroupAuthorizationResponse>
     */
    public CompletableFuture<ListAppGroupAuthorizationResponse> listAppGroupAuthorizationAsync(
        ListAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppGroupAuthorization);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorizationAsyncInvoker(
        ListAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppGroupAuthorization, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneResponse>
     */
    public CompletableFuture<ListAvailabilityZoneResponse> listAvailabilityZoneAsync(
        ListAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAvailabilityZone);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneAsyncInvoker(
        ListAvailabilityZoneRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAvailabilityZone, hcClient);
    }

    /**
     * 分发软件信息至镜像实例
     *
     * 分发应用软件信息至镜像实例，管理员可以按需下载并安装应用软件。
     * * 目前只支持来自云应用仓库的软件信息。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例分发软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachImageServerAppRequest 请求对象
     * @return CompletableFuture<AttachImageServerAppResponse>
     */
    public CompletableFuture<AttachImageServerAppResponse> attachImageServerAppAsync(
        AttachImageServerAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.attachImageServerApp);
    }

    /**
     * 分发软件信息至镜像实例
     *
     * 分发应用软件信息至镜像实例，管理员可以按需下载并安装应用软件。
     * * 目前只支持来自云应用仓库的软件信息。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例分发软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachImageServerAppRequest 请求对象
     * @return AsyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse>
     */
    public AsyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse> attachImageServerAppAsyncInvoker(
        AttachImageServerAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.attachImageServerApp, hcClient);
    }

    /**
     * 批量删除镜像实例
     *
     * 批量删除镜像实例。
     * * 忽略不存在的镜像实例，响应正常。
     * * 不允许操作状态为 &#x60;创建中&#x60;、&#x60;镜像创建中&#x60;的实例，响应异常。
     * * 不支持资源关联发生变化后，请求删除镜像实例关联资源，任务响应异常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageServerRequest 请求对象
     * @return CompletableFuture<BatchDeleteImageServerResponse>
     */
    public CompletableFuture<BatchDeleteImageServerResponse> batchDeleteImageServerAsync(
        BatchDeleteImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteImageServer);
    }

    /**
     * 批量删除镜像实例
     *
     * 批量删除镜像实例。
     * * 忽略不存在的镜像实例，响应正常。
     * * 不允许操作状态为 &#x60;创建中&#x60;、&#x60;镜像创建中&#x60;的实例，响应异常。
     * * 不支持资源关联发生变化后，请求删除镜像实例关联资源，任务响应异常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageServerRequest 请求对象
     * @return AsyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse>
     */
    public AsyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> batchDeleteImageServerAsyncInvoker(
        BatchDeleteImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteImageServer, hcClient);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return CompletableFuture<CreateImageServerResponse>
     */
    public CompletableFuture<CreateImageServerResponse> createImageServerAsync(CreateImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createImageServer);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return AsyncInvoker<CreateImageServerRequest, CreateImageServerResponse>
     */
    public AsyncInvoker<CreateImageServerRequest, CreateImageServerResponse> createImageServerAsyncInvoker(
        CreateImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createImageServer, hcClient);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return CompletableFuture<ListImageServersResponse>
     */
    public CompletableFuture<ListImageServersResponse> listImageServersAsync(ListImageServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listImageServers);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return AsyncInvoker<ListImageServersRequest, ListImageServersResponse>
     */
    public AsyncInvoker<ListImageServersRequest, ListImageServersResponse> listImageServersAsyncInvoker(
        ListImageServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listImageServers, hcClient);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return CompletableFuture<ListLatestAttachedServerAppResponse>
     */
    public CompletableFuture<ListLatestAttachedServerAppResponse> listLatestAttachedServerAppAsync(
        ListLatestAttachedServerAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listLatestAttachedServerApp);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return AsyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse>
     */
    public AsyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> listLatestAttachedServerAppAsyncInvoker(
        ListLatestAttachedServerAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listLatestAttachedServerApp, hcClient);
    }

    /**
     * 构建云应用镜像
     *
     * 构建云应用镜像。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例构建云应用镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateServerImageRequest 请求对象
     * @return CompletableFuture<RecreateServerImageResponse>
     */
    public CompletableFuture<RecreateServerImageResponse> recreateServerImageAsync(RecreateServerImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.recreateServerImage);
    }

    /**
     * 构建云应用镜像
     *
     * 构建云应用镜像。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例构建云应用镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateServerImageRequest 请求对象
     * @return AsyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse>
     */
    public AsyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse> recreateServerImageAsyncInvoker(
        RecreateServerImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.recreateServerImage, hcClient);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return CompletableFuture<UpdateImageServerResponse>
     */
    public CompletableFuture<UpdateImageServerResponse> updateImageServerAsync(UpdateImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateImageServer);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return AsyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse>
     */
    public AsyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse> updateImageServerAsyncInvoker(
        UpdateImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateImageServer, hcClient);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return CompletableFuture<ShowImageJobResponse>
     */
    public CompletableFuture<ShowImageJobResponse> showImageJobAsync(ShowImageJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showImageJob);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return AsyncInvoker<ShowImageJobRequest, ShowImageJobResponse>
     */
    public AsyncInvoker<ShowImageJobRequest, ShowImageJobResponse> showImageJobAsyncInvoker(
        ShowImageJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showImageJob, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showJob, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、重建镜像等异步API，下发命令后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showJobDetail);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、重建镜像等异步API，下发命令后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showJobDetail, hcClient);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateStoragePolicyStatementResponse>
     */
    public CompletableFuture<CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementAsync(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse>
     */
    public AsyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementAsyncInvoker(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement, hcClient);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return CompletableFuture<CreatePersistentStorageResponse>
     */
    public CompletableFuture<CreatePersistentStorageResponse> createPersistentStorageAsync(
        CreatePersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPersistentStorage);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return AsyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse>
     */
    public AsyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorageAsyncInvoker(
        CreatePersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPersistentStorage, hcClient);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return CompletableFuture<CreateShareFolderResponse>
     */
    public CompletableFuture<CreateShareFolderResponse> createShareFolderAsync(CreateShareFolderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createShareFolder);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return AsyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse>
     */
    public AsyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolderAsyncInvoker(
        CreateShareFolderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createShareFolder, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return CompletableFuture<DeletePersistentStorageResponse>
     */
    public CompletableFuture<DeletePersistentStorageResponse> deletePersistentStorageAsync(
        DeletePersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return AsyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse>
     */
    public AsyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorageAsyncInvoker(
        DeletePersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePersistentStorage, hcClient);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStorageClaimRequest 请求对象
     * @return CompletableFuture<DeleteStorageClaimResponse>
     */
    public CompletableFuture<DeleteStorageClaimResponse> deleteStorageClaimAsync(DeleteStorageClaimRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteStorageClaim);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStorageClaimRequest 请求对象
     * @return AsyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse>
     */
    public AsyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaimAsyncInvoker(
        DeleteStorageClaimRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteStorageClaim, hcClient);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return CompletableFuture<DeleteUserStorageAttachmentResponse>
     */
    public CompletableFuture<DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentAsync(
        DeleteUserStorageAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteUserStorageAttachment);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return AsyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse>
     */
    public AsyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentAsyncInvoker(
        DeleteUserStorageAttachmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteUserStorageAttachment, hcClient);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return CompletableFuture<ListPersistentStorageResponse>
     */
    public CompletableFuture<ListPersistentStorageResponse> listPersistentStorageAsync(
        ListPersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPersistentStorage);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return AsyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse>
     */
    public AsyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorageAsyncInvoker(
        ListPersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPersistentStorage, hcClient);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return CompletableFuture<ListShareFolderResponse>
     */
    public CompletableFuture<ListShareFolderResponse> listShareFolderAsync(ListShareFolderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listShareFolder);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return AsyncInvoker<ListShareFolderRequest, ListShareFolderResponse>
     */
    public AsyncInvoker<ListShareFolderRequest, ListShareFolderResponse> listShareFolderAsyncInvoker(
        ListShareFolderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listShareFolder, hcClient);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return CompletableFuture<ListStorageAssignmentResponse>
     */
    public CompletableFuture<ListStorageAssignmentResponse> listStorageAssignmentAsync(
        ListStorageAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listStorageAssignment);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return AsyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse>
     */
    public AsyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignmentAsyncInvoker(
        ListStorageAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listStorageAssignment, hcClient);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return CompletableFuture<ListStoragePolicyStatementResponse>
     */
    public CompletableFuture<ListStoragePolicyStatementResponse> listStoragePolicyStatementAsync(
        ListStoragePolicyStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listStoragePolicyStatement);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return AsyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse>
     */
    public AsyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatementAsyncInvoker(
        ListStoragePolicyStatementRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listStoragePolicyStatement, hcClient);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return CompletableFuture<UpdateShareFolderAssignmentResponse>
     */
    public CompletableFuture<UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentAsync(
        UpdateShareFolderAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateShareFolderAssignment);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse>
     */
    public AsyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentAsyncInvoker(
        UpdateShareFolderAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateShareFolderAssignment, hcClient);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return CompletableFuture<UpdateUserFolderAssignmentResponse>
     */
    public CompletableFuture<UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentAsync(
        UpdateUserFolderAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateUserFolderAssignment);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse>
     */
    public AsyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentAsyncInvoker(
        UpdateUserFolderAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateUserFolderAssignment, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return CompletableFuture<CreatePolicyGroupResponse>
     */
    public CompletableFuture<CreatePolicyGroupResponse> createPolicyGroupAsync(CreatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupAsyncInvoker(
        CreatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPolicyGroup, hcClient);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return CompletableFuture<CreatePolicyTemplateResponse>
     */
    public CompletableFuture<CreatePolicyTemplateResponse> createPolicyTemplateAsync(
        CreatePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPolicyTemplate);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateAsyncInvoker(
        CreatePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPolicyTemplate, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return CompletableFuture<DeletePolicyGroupResponse>
     */
    public CompletableFuture<DeletePolicyGroupResponse> deletePolicyGroupAsync(DeletePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupAsyncInvoker(
        DeletePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return CompletableFuture<DeletePolicyTemplateResponse>
     */
    public CompletableFuture<DeletePolicyTemplateResponse> deletePolicyTemplateAsync(
        DeletePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePolicyTemplate);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse>
     */
    public AsyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplateAsyncInvoker(
        DeletePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePolicyTemplate, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyGroupResponse> listPolicyGroupAsync(ListPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupAsyncInvoker(
        ListPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return CompletableFuture<ListPolicyTemplateResponse>
     */
    public CompletableFuture<ListPolicyTemplateResponse> listPolicyTemplateAsync(ListPolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyTemplate);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return AsyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse>
     */
    public AsyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplateAsyncInvoker(
        ListPolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyTemplate, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListTargetsOfPolicyGroupResponse>
     */
    public CompletableFuture<ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupAsync(
        ListTargetsOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTargetsOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse>
     */
    public AsyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupAsyncInvoker(
        ListTargetsOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTargetsOfPolicyGroup, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return CompletableFuture<ShowOriginalPolicyInfoResponse>
     */
    public CompletableFuture<ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoAsync(
        ShowOriginalPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse>
     */
    public AsyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoAsyncInvoker(
        ShowOriginalPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showOriginalPolicyInfo, hcClient);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return CompletableFuture<UpdatePolicyGroupResponse>
     */
    public CompletableFuture<UpdatePolicyGroupResponse> updatePolicyGroupAsync(UpdatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updatePolicyGroup);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse>
     */
    public AsyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroupAsyncInvoker(
        UpdatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return CompletableFuture<UpdatePolicyTemplateResponse>
     */
    public CompletableFuture<UpdatePolicyTemplateResponse> updatePolicyTemplateAsync(
        UpdatePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updatePolicyTemplate);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse>
     */
    public AsyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplateAsyncInvoker(
        UpdatePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updatePolicyTemplate, hcClient);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return CompletableFuture<CheckQuotaResponse>
     */
    public CompletableFuture<CheckQuotaResponse> checkQuotaAsync(CheckQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.checkQuota);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return AsyncInvoker<CheckQuotaRequest, CheckQuotaResponse>
     */
    public AsyncInvoker<CheckQuotaRequest, CheckQuotaResponse> checkQuotaAsyncInvoker(CheckQuotaRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.checkQuota, hcClient);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器。
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerRequest 请求对象
     * @return CompletableFuture<BatchDeleteServerResponse>
     */
    public CompletableFuture<BatchDeleteServerResponse> batchDeleteServerAsync(BatchDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServer);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器。
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse>
     */
    public AsyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServerAsyncInvoker(
        BatchDeleteServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteServer, hcClient);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return CompletableFuture<BatchMigrateHostsServerResponse>
     */
    public CompletableFuture<BatchMigrateHostsServerResponse> batchMigrateHostsServerAsync(
        BatchMigrateHostsServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchMigrateHostsServer);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return AsyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse>
     */
    public AsyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServerAsyncInvoker(
        BatchMigrateHostsServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchMigrateHostsServer, hcClient);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return CompletableFuture<BatchRebootServerResponse>
     */
    public CompletableFuture<BatchRebootServerResponse> batchRebootServerAsync(BatchRebootServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchRebootServer);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return AsyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse>
     */
    public AsyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServerAsyncInvoker(
        BatchRebootServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchRebootServer, hcClient);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return CompletableFuture<BatchRejoinDomainResponse>
     */
    public CompletableFuture<BatchRejoinDomainResponse> batchRejoinDomainAsync(BatchRejoinDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchRejoinDomain);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return AsyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse>
     */
    public AsyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomainAsyncInvoker(
        BatchRejoinDomainRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchRejoinDomain, hcClient);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return CompletableFuture<BatchStartServerResponse>
     */
    public CompletableFuture<BatchStartServerResponse> batchStartServerAsync(BatchStartServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchStartServer);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return AsyncInvoker<BatchStartServerRequest, BatchStartServerResponse>
     */
    public AsyncInvoker<BatchStartServerRequest, BatchStartServerResponse> batchStartServerAsyncInvoker(
        BatchStartServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchStartServer, hcClient);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return CompletableFuture<BatchStopServerResponse>
     */
    public CompletableFuture<BatchStopServerResponse> batchStopServerAsync(BatchStopServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchStopServer);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return AsyncInvoker<BatchStopServerRequest, BatchStopServerResponse>
     */
    public AsyncInvoker<BatchStopServerRequest, BatchStopServerResponse> batchStopServerAsyncInvoker(
        BatchStopServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchStopServer, hcClient);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return CompletableFuture<BatchUpdateTsviResponse>
     */
    public CompletableFuture<BatchUpdateTsviResponse> batchUpdateTsviAsync(BatchUpdateTsviRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchUpdateTsvi);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return AsyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse>
     */
    public AsyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsviAsyncInvoker(
        BatchUpdateTsviRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchUpdateTsvi, hcClient);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerImageRequest 请求对象
     * @return CompletableFuture<ChangeServerImageResponse>
     */
    public CompletableFuture<ChangeServerImageResponse> changeServerImageAsync(ChangeServerImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.changeServerImage);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerImageRequest 请求对象
     * @return AsyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse>
     */
    public AsyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImageAsyncInvoker(
        ChangeServerImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.changeServerImage, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return CompletableFuture<CreateAppServersResponse>
     */
    public CompletableFuture<CreateAppServersResponse> createAppServersAsync(CreateAppServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createAppServers);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return AsyncInvoker<CreateAppServersRequest, CreateAppServersResponse>
     */
    public AsyncInvoker<CreateAppServersRequest, CreateAppServersResponse> createAppServersAsyncInvoker(
        CreateAppServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createAppServers, hcClient);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return CompletableFuture<ListServerMetricDataResponse>
     */
    public CompletableFuture<ListServerMetricDataResponse> listServerMetricDataAsync(
        ListServerMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerMetricData);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return AsyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse>
     */
    public AsyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse> listServerMetricDataAsyncInvoker(
        ListServerMetricDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerMetricData, hcClient);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return CompletableFuture<ListServersResponse>
     */
    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServers);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return AsyncInvoker<ListServersRequest, ListServersResponse>
     */
    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServers, hcClient);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerRequest 请求对象
     * @return CompletableFuture<ReinstallServerResponse>
     */
    public CompletableFuture<ReinstallServerResponse> reinstallServerAsync(ReinstallServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.reinstallServer);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerRequest 请求对象
     * @return AsyncInvoker<ReinstallServerRequest, ReinstallServerResponse>
     */
    public AsyncInvoker<ReinstallServerRequest, ReinstallServerResponse> reinstallServerAsyncInvoker(
        ReinstallServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.reinstallServer, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return CompletableFuture<ShowServerVncResponse>
     */
    public CompletableFuture<ShowServerVncResponse> showServerVncAsync(ShowServerVncRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerVnc);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return AsyncInvoker<ShowServerVncRequest, ShowServerVncResponse>
     */
    public AsyncInvoker<ShowServerVncRequest, ShowServerVncResponse> showServerVncAsyncInvoker(
        ShowServerVncRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerVnc, hcClient);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return CompletableFuture<UpdateServerResponse>
     */
    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateServer);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return AsyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(
        UpdateServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateServer, hcClient);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return CompletableFuture<CreateServerGroupResponse>
     */
    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createServerGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(
        CreateServerGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createServerGroup, hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupsRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupsResponse>
     */
    public CompletableFuture<DeleteServerGroupsResponse> deleteServerGroupsAsync(DeleteServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroups);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupsRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse>
     */
    public AsyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroupsAsyncInvoker(
        DeleteServerGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteServerGroups, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return CompletableFuture<ListServerGroupsResponse>
     */
    public CompletableFuture<ListServerGroupsResponse> listServerGroupsAsync(ListServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsAsyncInvoker(
        ListServerGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerGroups, hcClient);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerGroupRequest 请求对象
     * @return CompletableFuture<UpdateServerGroupResponse>
     */
    public CompletableFuture<UpdateServerGroupResponse> updateServerGroupAsync(UpdateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateServerGroup);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerGroupRequest 请求对象
     * @return AsyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse>
     */
    public AsyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroupAsyncInvoker(
        UpdateServerGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateServerGroup, hcClient);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return CompletableFuture<ListAppConnectionResponse>
     */
    public CompletableFuture<ListAppConnectionResponse> listAppConnectionAsync(ListAppConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppConnection);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return AsyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse>
     */
    public AsyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnectionAsyncInvoker(
        ListAppConnectionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppConnection, hcClient);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return CompletableFuture<ListSessionByUserNameResponse>
     */
    public CompletableFuture<ListSessionByUserNameResponse> listSessionByUserNameAsync(
        ListSessionByUserNameRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessionByUserName);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return AsyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse>
     */
    public AsyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserNameAsyncInvoker(
        ListSessionByUserNameRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessionByUserName, hcClient);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return CompletableFuture<ListSessionsResponse>
     */
    public CompletableFuture<ListSessionsResponse> listSessionsAsync(ListSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessions);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return AsyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public AsyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsAsyncInvoker(
        ListSessionsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessions, hcClient);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return CompletableFuture<ListUserConnectionResponse>
     */
    public CompletableFuture<ListUserConnectionResponse> listUserConnectionAsync(ListUserConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listUserConnection);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return AsyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse>
     */
    public AsyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnectionAsyncInvoker(
        ListUserConnectionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listUserConnection, hcClient);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return CompletableFuture<LogoffUserSessionResponse>
     */
    public CompletableFuture<LogoffUserSessionResponse> logoffUserSessionAsync(LogoffUserSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.logoffUserSession);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return AsyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse>
     */
    public AsyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSessionAsyncInvoker(
        LogoffUserSessionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.logoffUserSession, hcClient);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return CompletableFuture<ListVolumeTypeResponse>
     */
    public CompletableFuture<ListVolumeTypeResponse> listVolumeTypeAsync(ListVolumeTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listVolumeType);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return AsyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse>
     */
    public AsyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeTypeAsyncInvoker(
        ListVolumeTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listVolumeType, hcClient);
    }

}
