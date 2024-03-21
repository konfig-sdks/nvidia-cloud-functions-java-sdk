<div align="left">

[![Visit Nvidia](./header.png)](https://www.nvidia.com&#x2F;en-us&#x2F;ai&#x2F;)

# [Nvidia](https://www.nvidia.com&#x2F;en-us&#x2F;ai&#x2F;)

Since its founding in 1993, NVIDIA (NASDAQ: NVDA) has been a pioneer in accelerated computing. The company's invention of the GPU in 1999 sparked the growth of the PC gaming market, redefined computer graphics, ignited the era of modern AI and is fueling the creation of the metaverse. NVIDIA is now a full-stack computing company with data-center-scale offerings that are reshaping industry.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=NVIDIA&serviceName=CloudFunctions&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>nvidia-cloud-functions-java-sdk</artifactId>
  <version>2.87.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:nvidia-cloud-functions-java-sdk:2.87.3"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/nvidia-cloud-functions-java-sdk-2.87.3.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AssetManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    String description = "description_example"; // Asset description
    String contentType = "contentType_example"; // Content type of the asset such image/png, image/jpeg, etc.
    try {
      CreateAssetResponse result = client
              .assetManagement
              .createAssetAndUrl(description, contentType)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAssetId());
      System.out.println(result.getUploadUrl());
      System.out.println(result.getContentType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#createAssetAndUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateAssetResponse> response = client
              .assetManagement
              .createAssetAndUrl(description, contentType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#createAssetAndUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.nvcf.nvidia.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetManagementApi* | [**createAssetAndUrl**](docs/AssetManagementApi.md#createAssetAndUrl) | **POST** /v2/nvcf/assets | Create Asset
*AssetManagementApi* | [**deleteAssetById**](docs/AssetManagementApi.md#deleteAssetById) | **DELETE** /v2/nvcf/assets/{assetId} | Delete Asset
*AssetManagementApi* | [**listAssets**](docs/AssetManagementApi.md#listAssets) | **GET** /v2/nvcf/assets | List Assets
*AssetManagementApi* | [**showDetails**](docs/AssetManagementApi.md#showDetails) | **GET** /v2/nvcf/assets/{assetId} | Show Asset Details
*AuthorizedAccountsApi* | [**addAccountToFunction**](docs/AuthorizedAccountsApi.md#addAccountToFunction) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/add | Authorize Additional Account To Invoke Function
*AuthorizedAccountsApi* | [**addAccountToFunctionVersion**](docs/AuthorizedAccountsApi.md#addAccountToFunctionVersion) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId}/add | Authorize Additional Account To Invoke Function Version
*AuthorizedAccountsApi* | [**authorizeFunctionAccounts**](docs/AuthorizedAccountsApi.md#authorizeFunctionAccounts) | **POST** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Authorize Accounts To Invoke Function Version
*AuthorizedAccountsApi* | [**authorizeFunctionAccounts_0**](docs/AuthorizedAccountsApi.md#authorizeFunctionAccounts_0) | **POST** /v2/nvcf/authorizations/functions/{functionId} | Authorize Accounts To Invoke Function
*AuthorizedAccountsApi* | [**deleteAllExtraForFunction**](docs/AuthorizedAccountsApi.md#deleteAllExtraForFunction) | **DELETE** /v2/nvcf/authorizations/functions/{functionId} | Delete All Extra Authorizations For Function
*AuthorizedAccountsApi* | [**deleteExtraForFunctionVersion**](docs/AuthorizedAccountsApi.md#deleteExtraForFunctionVersion) | **DELETE** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Delete All Extra Authorizations For Function Version
*AuthorizedAccountsApi* | [**functionVersionAuthorizations**](docs/AuthorizedAccountsApi.md#functionVersionAuthorizations) | **GET** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Get Account Authorizations For Function Version
*AuthorizedAccountsApi* | [**listForFunction**](docs/AuthorizedAccountsApi.md#listForFunction) | **GET** /v2/nvcf/authorizations/functions/{functionId} | List Account Authorizations For Function
*AuthorizedAccountsApi* | [**removeFromFunctionAuthorization**](docs/AuthorizedAccountsApi.md#removeFromFunctionAuthorization) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/remove | Unauthorize Account From Invoking Function
*AuthorizedAccountsApi* | [**removePartyForVersion**](docs/AuthorizedAccountsApi.md#removePartyForVersion) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId}/remove | Unauthorize Account From Invoking Function Version
*ClusterGroupsAndGpusApi* | [**list**](docs/ClusterGroupsAndGpusApi.md#list) | **GET** /v2/nvcf/clusterGroups | List Cluster Groups
*EnvelopeFunctionInvocationApi* | [**callFunction**](docs/EnvelopeFunctionInvocationApi.md#callFunction) | **POST** /v2/nvcf/exec/functions/{functionId} | Call Function
*EnvelopeFunctionInvocationApi* | [**invokeFunction**](docs/EnvelopeFunctionInvocationApi.md#invokeFunction) | **POST** /v2/nvcf/exec/functions/{functionId}/versions/{versionId} | Call Function
*EnvelopeFunctionInvocationApi* | [**pollForResultUsingFunctionInvocationRequest**](docs/EnvelopeFunctionInvocationApi.md#pollForResultUsingFunctionInvocationRequest) | **GET** /v2/nvcf/exec/status/{requestId} | Poll For Result Using Function Invocation Request
*FunctionDeploymentApi* | [**deleteByIdAndVersion**](docs/FunctionDeploymentApi.md#deleteByIdAndVersion) | **DELETE** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Delete Function Deployment
*FunctionDeploymentApi* | [**details**](docs/FunctionDeploymentApi.md#details) | **GET** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Get Function Deployment Details
*FunctionDeploymentApi* | [**initiateDeploymentForVersion**](docs/FunctionDeploymentApi.md#initiateDeploymentForVersion) | **POST** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Deploy Function
*FunctionDeploymentApi* | [**updateSpecs**](docs/FunctionDeploymentApi.md#updateSpecs) | **PUT** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Update Function Deployment
*FunctionInvocationApi* | [**invokeFunction**](docs/FunctionInvocationApi.md#invokeFunction) | **POST** /v2/nvcf/pexec/functions/{functionId} | Call Function
*FunctionInvocationApi* | [**invokeFunction_0**](docs/FunctionInvocationApi.md#invokeFunction_0) | **POST** /v2/nvcf/pexec/functions/{functionId}/versions/{versionId} | Call Function
*FunctionInvocationApi* | [**pollForResultUsingFunctionInvocationRequest**](docs/FunctionInvocationApi.md#pollForResultUsingFunctionInvocationRequest) | **GET** /v2/nvcf/pexec/status/{requestId} | Poll For Result Using Function Invocation Request
*FunctionManagementApi* | [**createFunctionVersion**](docs/FunctionManagementApi.md#createFunctionVersion) | **POST** /v2/nvcf/functions/{functionId}/versions | Create Function Version
*FunctionManagementApi* | [**deleteFunctionVersion**](docs/FunctionManagementApi.md#deleteFunctionVersion) | **DELETE** /v2/nvcf/functions/{functionId}/versions/{functionVersionId} | Delete Function
*FunctionManagementApi* | [**getVersionDetails**](docs/FunctionManagementApi.md#getVersionDetails) | **GET** /v2/nvcf/functions/{functionId}/versions/{functionVersionId} | Get Function Version Details
*FunctionManagementApi* | [**listFunctionIds**](docs/FunctionManagementApi.md#listFunctionIds) | **GET** /v2/nvcf/functions/ids | List Function Ids
*FunctionManagementApi* | [**listFunctionVersions**](docs/FunctionManagementApi.md#listFunctionVersions) | **GET** /v2/nvcf/functions/{functionId}/versions | List Function Versions
*FunctionManagementApi* | [**listFunctions**](docs/FunctionManagementApi.md#listFunctions) | **GET** /v2/nvcf/functions | List Functions
*FunctionManagementApi* | [**registerNewFunction**](docs/FunctionManagementApi.md#registerNewFunction) | **POST** /v2/nvcf/functions | Create Function
*HealthApi* | [**getInfo**](docs/HealthApi.md#getInfo) | **GET** /health/** | Get Health Information
*QueueDetailsApi* | [**functionQueuesDetails**](docs/QueueDetailsApi.md#functionQueuesDetails) | **GET** /v2/nvcf/queues/functions/{functionId} | Queue Details
*QueueDetailsApi* | [**getAllQueuesDetails**](docs/QueueDetailsApi.md#getAllQueuesDetails) | **GET** /v2/nvcf/queues/functions/{functionId}/versions/{versionId} | Queue Details
*QueueDetailsApi* | [**getQueuePositionByRequestId**](docs/QueueDetailsApi.md#getQueuePositionByRequestId) | **GET** /v2/nvcf/queues/{requestId}/position | Queue Position


## Documentation for Models

 - [ArtifactDto](docs/ArtifactDto.md)
 - [AssetDto](docs/AssetDto.md)
 - [AssetResponse](docs/AssetResponse.md)
 - [AuthorizedPartiesByFunctionDto](docs/AuthorizedPartiesByFunctionDto.md)
 - [AuthorizedPartiesRequest](docs/AuthorizedPartiesRequest.md)
 - [AuthorizedPartiesResponse](docs/AuthorizedPartiesResponse.md)
 - [AuthorizedPartyDto](docs/AuthorizedPartyDto.md)
 - [Cluster](docs/Cluster.md)
 - [ClusterGroup](docs/ClusterGroup.md)
 - [ClusterGroupsResponse](docs/ClusterGroupsResponse.md)
 - [ContainerEnvironmentEntryDto](docs/ContainerEnvironmentEntryDto.md)
 - [CreateAssetRequest](docs/CreateAssetRequest.md)
 - [CreateAssetResponse](docs/CreateAssetResponse.md)
 - [CreateFunctionRequest](docs/CreateFunctionRequest.md)
 - [CreateFunctionResponse](docs/CreateFunctionResponse.md)
 - [DeploymentHealthDto](docs/DeploymentHealthDto.md)
 - [DeploymentResponse](docs/DeploymentResponse.md)
 - [FunctionDeploymentDto](docs/FunctionDeploymentDto.md)
 - [FunctionDeploymentRequest](docs/FunctionDeploymentRequest.md)
 - [FunctionDto](docs/FunctionDto.md)
 - [FunctionInvocationInvokeFunction200Response](docs/FunctionInvocationInvokeFunction200Response.md)
 - [FunctionInvocationInvokeFunction202Response](docs/FunctionInvocationInvokeFunction202Response.md)
 - [FunctionInvocationInvokeFunctionResponseInner](docs/FunctionInvocationInvokeFunctionResponseInner.md)
 - [FunctionInvocationPollForResultUsingFunctionInvocationRequest202Response](docs/FunctionInvocationPollForResultUsingFunctionInvocationRequest202Response.md)
 - [FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse](docs/FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse.md)
 - [FunctionResponse](docs/FunctionResponse.md)
 - [GetPositionInQueueResponse](docs/GetPositionInQueueResponse.md)
 - [GetQueuesResponse](docs/GetQueuesResponse.md)
 - [Gpu](docs/Gpu.md)
 - [GpuSpecificationDto](docs/GpuSpecificationDto.md)
 - [HealthComponent](docs/HealthComponent.md)
 - [InstanceDto](docs/InstanceDto.md)
 - [InstanceType](docs/InstanceType.md)
 - [InvokeFunctionRequest](docs/InvokeFunctionRequest.md)
 - [InvokeFunctionResponse](docs/InvokeFunctionResponse.md)
 - [ListAssetsResponse](docs/ListAssetsResponse.md)
 - [ListAuthorizedPartiesResponse](docs/ListAuthorizedPartiesResponse.md)
 - [ListFunctionIdsResponse](docs/ListFunctionIdsResponse.md)
 - [ListFunctionsResponse](docs/ListFunctionsResponse.md)
 - [MeteringDataEntryDto](docs/MeteringDataEntryDto.md)
 - [PatchAuthorizedPartyRequest](docs/PatchAuthorizedPartyRequest.md)
 - [QueueDto](docs/QueueDto.md)
 - [RequestHeaderDto](docs/RequestHeaderDto.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
