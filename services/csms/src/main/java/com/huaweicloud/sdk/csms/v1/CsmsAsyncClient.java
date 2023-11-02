package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobResponse;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsResponse;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobResponse;

import java.util.concurrent.CompletableFuture;

public class CsmsAsyncClient {

    protected HcClient hcClient;

    public CsmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CsmsAsyncClient> newBuilder() {
        ClientBuilder<CsmsAsyncClient> clientBuilder = new ClientBuilder<>(CsmsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除凭据标签
     *
     * - 功能介绍：批量添加或删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteTagsResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsync(
        BatchCreateOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除凭据标签
     *
     * - 功能介绍：批量添加或删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsyncInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>(request,
            CsmsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 创建凭据
     *
     * 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 
     * 初始版本的状态被标记为SYSCURRENT。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return CompletableFuture<CreateSecretResponse>
     */
    public CompletableFuture<CreateSecretResponse> createSecretAsync(CreateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecret);
    }

    /**
     * 创建凭据
     *
     * 创建新的凭据，并将凭据值存入凭据的初始版本。
     * 
     * 凭据管理服务将凭据值加密后，存储在凭据对象下的版本中。每个版本可与多个凭据版本状态相关联，凭据版本状态用于标识凭据版本处于的阶段，没有版本状态标记的版本视为已弃用，可用凭据管理服务自动删除。
     * 
     * 初始版本的状态被标记为SYSCURRENT。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretRequest 请求对象
     * @return AsyncInvoker<CreateSecretRequest, CreateSecretResponse>
     */
    public AsyncInvoker<CreateSecretRequest, CreateSecretResponse> createSecretAsyncInvoker(
        CreateSecretRequest request) {
        return new AsyncInvoker<CreateSecretRequest, CreateSecretResponse>(request, CsmsMeta.createSecret, hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件，事件可配置在一个或多个凭据对象上。当事件为启用状态且包含的基础事件类型在凭据对象上触发时，云服务会将对应的事件通知发送至事件指定的通知主题上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretEventRequest 请求对象
     * @return CompletableFuture<CreateSecretEventResponse>
     */
    public CompletableFuture<CreateSecretEventResponse> createSecretEventAsync(CreateSecretEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecretEvent);
    }

    /**
     * 创建事件
     *
     * 创建事件，事件可配置在一个或多个凭据对象上。当事件为启用状态且包含的基础事件类型在凭据对象上触发时，云服务会将对应的事件通知发送至事件指定的通知主题上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretEventRequest 请求对象
     * @return AsyncInvoker<CreateSecretEventRequest, CreateSecretEventResponse>
     */
    public AsyncInvoker<CreateSecretEventRequest, CreateSecretEventResponse> createSecretEventAsyncInvoker(
        CreateSecretEventRequest request) {
        return new AsyncInvoker<CreateSecretEventRequest, CreateSecretEventResponse>(request,
            CsmsMeta.createSecretEvent, hcClient);
    }

    /**
     * 添加凭据标签
     *
     * 添加凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretTagRequest 请求对象
     * @return CompletableFuture<CreateSecretTagResponse>
     */
    public CompletableFuture<CreateSecretTagResponse> createSecretTagAsync(CreateSecretTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecretTag);
    }

    /**
     * 添加凭据标签
     *
     * 添加凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretTagRequest 请求对象
     * @return AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse>
     */
    public AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTagAsyncInvoker(
        CreateSecretTagRequest request) {
        return new AsyncInvoker<CreateSecretTagRequest, CreateSecretTagResponse>(request, CsmsMeta.createSecretTag,
            hcClient);
    }

    /**
     * 创建凭据版本
     *
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return CompletableFuture<CreateSecretVersionResponse>
     */
    public CompletableFuture<CreateSecretVersionResponse> createSecretVersionAsync(CreateSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.createSecretVersion);
    }

    /**
     * 创建凭据版本
     *
     * 在指定的凭据中，创建一个新的凭据版本，用于加密保管新的凭据值。默认情况下，新创建的凭据版本被标记为SYSCURRENT状态，而SYSCURRENT标记的前一个凭据版本被标记为SYSPREVIOUS状态。您可以通过指定VersionStage参数来覆盖默认行为。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecretVersionRequest 请求对象
     * @return AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>
     */
    public AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersionAsyncInvoker(
        CreateSecretVersionRequest request) {
        return new AsyncInvoker<CreateSecretVersionRequest, CreateSecretVersionResponse>(request,
            CsmsMeta.createSecretVersion, hcClient);
    }

    /**
     * 立即删除凭据
     *
     * 立即删除指定的凭据，且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretRequest 请求对象
     * @return CompletableFuture<DeleteSecretResponse>
     */
    public CompletableFuture<DeleteSecretResponse> deleteSecretAsync(DeleteSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecret);
    }

    /**
     * 立即删除凭据
     *
     * 立即删除指定的凭据，且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretRequest 请求对象
     * @return AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>
     */
    public AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse> deleteSecretAsyncInvoker(
        DeleteSecretRequest request) {
        return new AsyncInvoker<DeleteSecretRequest, DeleteSecretResponse>(request, CsmsMeta.deleteSecret, hcClient);
    }

    /**
     * 立即删除事件
     *
     * 立即删除指定的事件，且无法恢复。如事件存在凭据引用，则无法删除，请先解除关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretEventRequest 请求对象
     * @return CompletableFuture<DeleteSecretEventResponse>
     */
    public CompletableFuture<DeleteSecretEventResponse> deleteSecretEventAsync(DeleteSecretEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretEvent);
    }

    /**
     * 立即删除事件
     *
     * 立即删除指定的事件，且无法恢复。如事件存在凭据引用，则无法删除，请先解除关联。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretEventRequest 请求对象
     * @return AsyncInvoker<DeleteSecretEventRequest, DeleteSecretEventResponse>
     */
    public AsyncInvoker<DeleteSecretEventRequest, DeleteSecretEventResponse> deleteSecretEventAsyncInvoker(
        DeleteSecretEventRequest request) {
        return new AsyncInvoker<DeleteSecretEventRequest, DeleteSecretEventResponse>(request,
            CsmsMeta.deleteSecretEvent, hcClient);
    }

    /**
     * 创建凭据的定时删除任务
     *
     * 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return CompletableFuture<DeleteSecretForScheduleResponse>
     */
    public CompletableFuture<DeleteSecretForScheduleResponse> deleteSecretForScheduleAsync(
        DeleteSecretForScheduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretForSchedule);
    }

    /**
     * 创建凭据的定时删除任务
     *
     * 指定延迟删除时间，创建删除凭据的定时任务，可设置7~30天的的延迟删除时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretForScheduleRequest 请求对象
     * @return AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>
     */
    public AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForScheduleAsyncInvoker(
        DeleteSecretForScheduleRequest request) {
        return new AsyncInvoker<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse>(request,
            CsmsMeta.deleteSecretForSchedule, hcClient);
    }

    /**
     * 删除凭据的版本状态
     *
     * 删除指定的凭据版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return CompletableFuture<DeleteSecretStageResponse>
     */
    public CompletableFuture<DeleteSecretStageResponse> deleteSecretStageAsync(DeleteSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretStage);
    }

    /**
     * 删除凭据的版本状态
     *
     * 删除指定的凭据版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretStageRequest 请求对象
     * @return AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>
     */
    public AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStageAsyncInvoker(
        DeleteSecretStageRequest request) {
        return new AsyncInvoker<DeleteSecretStageRequest, DeleteSecretStageResponse>(request,
            CsmsMeta.deleteSecretStage, hcClient);
    }

    /**
     * 删除凭据标签
     *
     * 删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return CompletableFuture<DeleteSecretTagResponse>
     */
    public CompletableFuture<DeleteSecretTagResponse> deleteSecretTagAsync(DeleteSecretTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.deleteSecretTag);
    }

    /**
     * 删除凭据标签
     *
     * 删除凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecretTagRequest 请求对象
     * @return AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse>
     */
    public AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTagAsyncInvoker(
        DeleteSecretTagRequest request) {
        return new AsyncInvoker<DeleteSecretTagRequest, DeleteSecretTagResponse>(request, CsmsMeta.deleteSecretTag,
            hcClient);
    }

    /**
     * 下载凭据备份
     *
     * 下载指定凭据的备份文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSecretBlobRequest 请求对象
     * @return CompletableFuture<DownloadSecretBlobResponse>
     */
    public CompletableFuture<DownloadSecretBlobResponse> downloadSecretBlobAsync(DownloadSecretBlobRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.downloadSecretBlob);
    }

    /**
     * 下载凭据备份
     *
     * 下载指定凭据的备份文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSecretBlobRequest 请求对象
     * @return AsyncInvoker<DownloadSecretBlobRequest, DownloadSecretBlobResponse>
     */
    public AsyncInvoker<DownloadSecretBlobRequest, DownloadSecretBlobResponse> downloadSecretBlobAsyncInvoker(
        DownloadSecretBlobRequest request) {
        return new AsyncInvoker<DownloadSecretBlobRequest, DownloadSecretBlobResponse>(request,
            CsmsMeta.downloadSecretBlob, hcClient);
    }

    /**
     * 查询已触发的事件通知记录
     *
     * 查询三个月内所有已触发的事件通知记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationRecordsRequest 请求对象
     * @return CompletableFuture<ListNotificationRecordsResponse>
     */
    public CompletableFuture<ListNotificationRecordsResponse> listNotificationRecordsAsync(
        ListNotificationRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listNotificationRecords);
    }

    /**
     * 查询已触发的事件通知记录
     *
     * 查询三个月内所有已触发的事件通知记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotificationRecordsRequest 请求对象
     * @return AsyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse>
     */
    public AsyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse> listNotificationRecordsAsyncInvoker(
        ListNotificationRecordsRequest request) {
        return new AsyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse>(request,
            CsmsMeta.listNotificationRecords, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询用户在指定项目下的所有凭据标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return CompletableFuture<ListProjectSecretsTagsResponse>
     */
    public CompletableFuture<ListProjectSecretsTagsResponse> listProjectSecretsTagsAsync(
        ListProjectSecretsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listProjectSecretsTags);
    }

    /**
     * 查询项目标签
     *
     * 查询用户在指定项目下的所有凭据标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSecretsTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse>
     */
    public AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTagsAsyncInvoker(
        ListProjectSecretsTagsRequest request) {
        return new AsyncInvoker<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse>(request,
            CsmsMeta.listProjectSecretsTags, hcClient);
    }

    /**
     * 查询凭据实例
     *
     * 查询凭据实例。通过标签过滤，筛选用户凭据，返回凭据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listResourceInstances);
    }

    /**
     * 查询凭据实例
     *
     * 查询凭据实例。通过标签过滤，筛选用户凭据，返回凭据列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            CsmsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询事件列表
     *
     * 查询当前用户在本项目下创建的所有事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretEventsRequest 请求对象
     * @return CompletableFuture<ListSecretEventsResponse>
     */
    public CompletableFuture<ListSecretEventsResponse> listSecretEventsAsync(ListSecretEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecretEvents);
    }

    /**
     * 查询事件列表
     *
     * 查询当前用户在本项目下创建的所有事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretEventsRequest 请求对象
     * @return AsyncInvoker<ListSecretEventsRequest, ListSecretEventsResponse>
     */
    public AsyncInvoker<ListSecretEventsRequest, ListSecretEventsResponse> listSecretEventsAsyncInvoker(
        ListSecretEventsRequest request) {
        return new AsyncInvoker<ListSecretEventsRequest, ListSecretEventsResponse>(request, CsmsMeta.listSecretEvents,
            hcClient);
    }

    /**
     * 查询凭据标签
     *
     * 查询凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretTagsRequest 请求对象
     * @return CompletableFuture<ListSecretTagsResponse>
     */
    public CompletableFuture<ListSecretTagsResponse> listSecretTagsAsync(ListSecretTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecretTags);
    }

    /**
     * 查询凭据标签
     *
     * 查询凭据标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretTagsRequest 请求对象
     * @return AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse>
     */
    public AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTagsAsyncInvoker(
        ListSecretTagsRequest request) {
        return new AsyncInvoker<ListSecretTagsRequest, ListSecretTagsResponse>(request, CsmsMeta.listSecretTags,
            hcClient);
    }

    /**
     * 查询凭据的版本列表
     *
     * 查询指定凭据下的版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return CompletableFuture<ListSecretVersionsResponse>
     */
    public CompletableFuture<ListSecretVersionsResponse> listSecretVersionsAsync(ListSecretVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecretVersions);
    }

    /**
     * 查询凭据的版本列表
     *
     * 查询指定凭据下的版本列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretVersionsRequest 请求对象
     * @return AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>
     */
    public AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersionsAsyncInvoker(
        ListSecretVersionsRequest request) {
        return new AsyncInvoker<ListSecretVersionsRequest, ListSecretVersionsResponse>(request,
            CsmsMeta.listSecretVersions, hcClient);
    }

    /**
     * 查询凭据列表
     *
     * 查询当前用户在本项目下创建的所有凭据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return CompletableFuture<ListSecretsResponse>
     */
    public CompletableFuture<ListSecretsResponse> listSecretsAsync(ListSecretsRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.listSecrets);
    }

    /**
     * 查询凭据列表
     *
     * 查询当前用户在本项目下创建的所有凭据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecretsRequest 请求对象
     * @return AsyncInvoker<ListSecretsRequest, ListSecretsResponse>
     */
    public AsyncInvoker<ListSecretsRequest, ListSecretsResponse> listSecretsAsyncInvoker(ListSecretsRequest request) {
        return new AsyncInvoker<ListSecretsRequest, ListSecretsResponse>(request, CsmsMeta.listSecrets, hcClient);
    }

    /**
     * 取消凭据的定时删除任务
     *
     * 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreSecretRequest 请求对象
     * @return CompletableFuture<RestoreSecretResponse>
     */
    public CompletableFuture<RestoreSecretResponse> restoreSecretAsync(RestoreSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.restoreSecret);
    }

    /**
     * 取消凭据的定时删除任务
     *
     * 取消凭据的定时删除任务，凭据对象恢复可使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreSecretRequest 请求对象
     * @return AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse>
     */
    public AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse> restoreSecretAsyncInvoker(
        RestoreSecretRequest request) {
        return new AsyncInvoker<RestoreSecretRequest, RestoreSecretResponse>(request, CsmsMeta.restoreSecret, hcClient);
    }

    /**
     * 轮转凭据
     *
     * 立即执行轮转凭据。在指定的凭据中，创建一个新的凭据版本，用于加密存储后台随机产生的凭据值。同时将新创建的凭据版本标记为SYSCURRENT状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RotateSecretRequest 请求对象
     * @return CompletableFuture<RotateSecretResponse>
     */
    public CompletableFuture<RotateSecretResponse> rotateSecretAsync(RotateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.rotateSecret);
    }

    /**
     * 轮转凭据
     *
     * 立即执行轮转凭据。在指定的凭据中，创建一个新的凭据版本，用于加密存储后台随机产生的凭据值。同时将新创建的凭据版本标记为SYSCURRENT状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RotateSecretRequest 请求对象
     * @return AsyncInvoker<RotateSecretRequest, RotateSecretResponse>
     */
    public AsyncInvoker<RotateSecretRequest, RotateSecretResponse> rotateSecretAsyncInvoker(
        RotateSecretRequest request) {
        return new AsyncInvoker<RotateSecretRequest, RotateSecretResponse>(request, CsmsMeta.rotateSecret, hcClient);
    }

    /**
     * 查询凭据
     *
     * 查询指定凭据的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return CompletableFuture<ShowSecretResponse>
     */
    public CompletableFuture<ShowSecretResponse> showSecretAsync(ShowSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecret);
    }

    /**
     * 查询凭据
     *
     * 查询指定凭据的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretRequest 请求对象
     * @return AsyncInvoker<ShowSecretRequest, ShowSecretResponse>
     */
    public AsyncInvoker<ShowSecretRequest, ShowSecretResponse> showSecretAsyncInvoker(ShowSecretRequest request) {
        return new AsyncInvoker<ShowSecretRequest, ShowSecretResponse>(request, CsmsMeta.showSecret, hcClient);
    }

    /**
     * 查询事件
     *
     * 查询指定事件的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretEventRequest 请求对象
     * @return CompletableFuture<ShowSecretEventResponse>
     */
    public CompletableFuture<ShowSecretEventResponse> showSecretEventAsync(ShowSecretEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecretEvent);
    }

    /**
     * 查询事件
     *
     * 查询指定事件的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretEventRequest 请求对象
     * @return AsyncInvoker<ShowSecretEventRequest, ShowSecretEventResponse>
     */
    public AsyncInvoker<ShowSecretEventRequest, ShowSecretEventResponse> showSecretEventAsyncInvoker(
        ShowSecretEventRequest request) {
        return new AsyncInvoker<ShowSecretEventRequest, ShowSecretEventResponse>(request, CsmsMeta.showSecretEvent,
            hcClient);
    }

    /**
     * 查询凭据的版本状态
     *
     * 查询指定凭据版本状态标记的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretStageRequest 请求对象
     * @return CompletableFuture<ShowSecretStageResponse>
     */
    public CompletableFuture<ShowSecretStageResponse> showSecretStageAsync(ShowSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecretStage);
    }

    /**
     * 查询凭据的版本状态
     *
     * 查询指定凭据版本状态标记的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretStageRequest 请求对象
     * @return AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse>
     */
    public AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse> showSecretStageAsyncInvoker(
        ShowSecretStageRequest request) {
        return new AsyncInvoker<ShowSecretStageRequest, ShowSecretStageResponse>(request, CsmsMeta.showSecretStage,
            hcClient);
    }

    /**
     * 查询凭据的版本与凭据值
     *
     * 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_name}/versions/latest （即将当前接口URL中的{version_id}赋值为latest）可访问凭据最新版本的凭据值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return CompletableFuture<ShowSecretVersionResponse>
     */
    public CompletableFuture<ShowSecretVersionResponse> showSecretVersionAsync(ShowSecretVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.showSecretVersion);
    }

    /**
     * 查询凭据的版本与凭据值
     *
     * 查询指定凭据版本的信息和版本中的明文凭据值，只能查询ENABLED状态的凭据。
     * 通过/v1/{project_id}/secrets/{secret_name}/versions/latest （即将当前接口URL中的{version_id}赋值为latest）可访问凭据最新版本的凭据值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecretVersionRequest 请求对象
     * @return AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>
     */
    public AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersionAsyncInvoker(
        ShowSecretVersionRequest request) {
        return new AsyncInvoker<ShowSecretVersionRequest, ShowSecretVersionResponse>(request,
            CsmsMeta.showSecretVersion, hcClient);
    }

    /**
     * 更新凭据
     *
     * 更新指定凭据的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return CompletableFuture<UpdateSecretResponse>
     */
    public CompletableFuture<UpdateSecretResponse> updateSecretAsync(UpdateSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateSecret);
    }

    /**
     * 更新凭据
     *
     * 更新指定凭据的元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretRequest 请求对象
     * @return AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>
     */
    public AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse> updateSecretAsyncInvoker(
        UpdateSecretRequest request) {
        return new AsyncInvoker<UpdateSecretRequest, UpdateSecretResponse>(request, CsmsMeta.updateSecret, hcClient);
    }

    /**
     * 更新事件
     *
     * 更新指定事件的元数据信息。支持更新的元数据包含事件启用状态、基础类型列表、通知主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretEventRequest 请求对象
     * @return CompletableFuture<UpdateSecretEventResponse>
     */
    public CompletableFuture<UpdateSecretEventResponse> updateSecretEventAsync(UpdateSecretEventRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateSecretEvent);
    }

    /**
     * 更新事件
     *
     * 更新指定事件的元数据信息。支持更新的元数据包含事件启用状态、基础类型列表、通知主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretEventRequest 请求对象
     * @return AsyncInvoker<UpdateSecretEventRequest, UpdateSecretEventResponse>
     */
    public AsyncInvoker<UpdateSecretEventRequest, UpdateSecretEventResponse> updateSecretEventAsyncInvoker(
        UpdateSecretEventRequest request) {
        return new AsyncInvoker<UpdateSecretEventRequest, UpdateSecretEventResponse>(request,
            CsmsMeta.updateSecretEvent, hcClient);
    }

    /**
     * 更新凭据的版本状态
     *
     * 更新凭据的版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return CompletableFuture<UpdateSecretStageResponse>
     */
    public CompletableFuture<UpdateSecretStageResponse> updateSecretStageAsync(UpdateSecretStageRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateSecretStage);
    }

    /**
     * 更新凭据的版本状态
     *
     * 更新凭据的版本状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecretStageRequest 请求对象
     * @return AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>
     */
    public AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStageAsyncInvoker(
        UpdateSecretStageRequest request) {
        return new AsyncInvoker<UpdateSecretStageRequest, UpdateSecretStageResponse>(request,
            CsmsMeta.updateSecretStage, hcClient);
    }

    /**
     * 更新凭据版本
     *
     * 当前支持更新指定凭据版本的有效期，只能更新ENABLED状态的凭据。在关联订阅的事件包含“版本过期”基础事件类型时，每次更新版本有效期后仅会触发一次事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVersionRequest 请求对象
     * @return CompletableFuture<UpdateVersionResponse>
     */
    public CompletableFuture<UpdateVersionResponse> updateVersionAsync(UpdateVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.updateVersion);
    }

    /**
     * 更新凭据版本
     *
     * 当前支持更新指定凭据版本的有效期，只能更新ENABLED状态的凭据。在关联订阅的事件包含“版本过期”基础事件类型时，每次更新版本有效期后仅会触发一次事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVersionRequest 请求对象
     * @return AsyncInvoker<UpdateVersionRequest, UpdateVersionResponse>
     */
    public AsyncInvoker<UpdateVersionRequest, UpdateVersionResponse> updateVersionAsyncInvoker(
        UpdateVersionRequest request) {
        return new AsyncInvoker<UpdateVersionRequest, UpdateVersionResponse>(request, CsmsMeta.updateVersion, hcClient);
    }

    /**
     * 恢复凭据对象
     *
     * 通过上传凭据备份文件，恢复凭据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSecretBlobRequest 请求对象
     * @return CompletableFuture<UploadSecretBlobResponse>
     */
    public CompletableFuture<UploadSecretBlobResponse> uploadSecretBlobAsync(UploadSecretBlobRequest request) {
        return hcClient.asyncInvokeHttp(request, CsmsMeta.uploadSecretBlob);
    }

    /**
     * 恢复凭据对象
     *
     * 通过上传凭据备份文件，恢复凭据对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSecretBlobRequest 请求对象
     * @return AsyncInvoker<UploadSecretBlobRequest, UploadSecretBlobResponse>
     */
    public AsyncInvoker<UploadSecretBlobRequest, UploadSecretBlobResponse> uploadSecretBlobAsyncInvoker(
        UploadSecretBlobRequest request) {
        return new AsyncInvoker<UploadSecretBlobRequest, UploadSecretBlobResponse>(request, CsmsMeta.uploadSecretBlob,
            hcClient);
    }

}
