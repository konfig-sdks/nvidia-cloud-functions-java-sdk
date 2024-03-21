package com.konfigthis.client;

import com.konfigthis.client.api.AssetManagementApi;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import com.konfigthis.client.api.ClusterGroupsAndGpusApi;
import com.konfigthis.client.api.EnvelopeFunctionInvocationApi;
import com.konfigthis.client.api.FunctionDeploymentApi;
import com.konfigthis.client.api.FunctionInvocationApi;
import com.konfigthis.client.api.FunctionManagementApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.QueueDetailsApi;

public class NvidiaCloudFunctions {
    private ApiClient apiClient;
    public final AssetManagementApi assetManagement;
    public final AuthorizedAccountsApi authorizedAccounts;
    public final ClusterGroupsAndGpusApi clusterGroupsAndGpus;
    public final EnvelopeFunctionInvocationApi envelopeFunctionInvocation;
    public final FunctionDeploymentApi functionDeployment;
    public final FunctionInvocationApi functionInvocation;
    public final FunctionManagementApi functionManagement;
    public final HealthApi health;
    public final QueueDetailsApi queueDetails;

    public NvidiaCloudFunctions() {
        this(null);
    }

    public NvidiaCloudFunctions(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.assetManagement = new AssetManagementApi(this.apiClient);
        this.authorizedAccounts = new AuthorizedAccountsApi(this.apiClient);
        this.clusterGroupsAndGpus = new ClusterGroupsAndGpusApi(this.apiClient);
        this.envelopeFunctionInvocation = new EnvelopeFunctionInvocationApi(this.apiClient);
        this.functionDeployment = new FunctionDeploymentApi(this.apiClient);
        this.functionInvocation = new FunctionInvocationApi(this.apiClient);
        this.functionManagement = new FunctionManagementApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.queueDetails = new QueueDetailsApi(this.apiClient);
    }

}
