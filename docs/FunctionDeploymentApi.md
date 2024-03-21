# FunctionDeploymentApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteByIdAndVersion**](FunctionDeploymentApi.md#deleteByIdAndVersion) | **DELETE** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Delete Function Deployment |
| [**details**](FunctionDeploymentApi.md#details) | **GET** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Get Function Deployment Details |
| [**initiateDeploymentForVersion**](FunctionDeploymentApi.md#initiateDeploymentForVersion) | **POST** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Deploy Function |
| [**updateSpecs**](FunctionDeploymentApi.md#updateSpecs) | **PUT** /v2/nvcf/deployments/functions/{functionId}/versions/{functionVersionId} | Update Function Deployment |


<a name="deleteByIdAndVersion"></a>
# **deleteByIdAndVersion**
> FunctionResponse deleteByIdAndVersion(functionId, functionVersionId).graceful(graceful).execute();

Delete Function Deployment

Deletes the deployment associated with the specified function. Upon  deletion, any active instances will be terminated, and the function&#39;s status  will transition to &#39;INACTIVE&#39;. To undeploy a function version gracefully,  specify &#39;graceful&#x3D;true&#39; query parameter, allowing current tasks to complete  before terminating the instances. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionDeploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version id
    Boolean graceful = false; // Query param to deactivate function for graceful shutdown
    try {
      FunctionResponse result = client
              .functionDeployment
              .deleteByIdAndVersion(functionId, functionVersionId)
              .graceful(graceful)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#deleteByIdAndVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FunctionResponse> response = client
              .functionDeployment
              .deleteByIdAndVersion(functionId, functionVersionId)
              .graceful(graceful)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#deleteByIdAndVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **UUID**| Function id | |
| **functionVersionId** | **UUID**| Function version id | |
| **graceful** | **Boolean**| Query param to deactivate function for graceful shutdown | [optional] [default to false] |

### Return type

[**FunctionResponse**](FunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="details"></a>
# **details**
> DeploymentResponse details(functionId, functionVersionId).execute();

Get Function Deployment Details

Allows Account Admins to retrieve the deployment details of the specified  function version. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionDeploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version id
    try {
      DeploymentResponse result = client
              .functionDeployment
              .details(functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeployment());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentResponse> response = client
              .functionDeployment
              .details(functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#details");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **UUID**| Function id | |
| **functionVersionId** | **UUID**| Function version id | |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="initiateDeploymentForVersion"></a>
# **initiateDeploymentForVersion**
> DeploymentResponse initiateDeploymentForVersion(functionId, functionVersionId, functionDeploymentRequest).execute();

Deploy Function

Initiates deployment for the specified function version. Upon invocation of  this endpoint, the function&#39;s status transitions to &#39;DEPLOYING&#39;. If the  specified function version is public, then Account Admin cannot perform this  operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionDeploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    List<GpuSpecificationDto> deploymentSpecifications = Arrays.asList(); // Deployment specs with Backend, GPU, instance-type, etc. details
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version id
    try {
      DeploymentResponse result = client
              .functionDeployment
              .initiateDeploymentForVersion(deploymentSpecifications, functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeployment());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#initiateDeploymentForVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentResponse> response = client
              .functionDeployment
              .initiateDeploymentForVersion(deploymentSpecifications, functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#initiateDeploymentForVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **UUID**| Function id | |
| **functionVersionId** | **UUID**| Function version id | |
| **functionDeploymentRequest** | [**FunctionDeploymentRequest**](FunctionDeploymentRequest.md)|  | |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSpecs"></a>
# **updateSpecs**
> DeploymentResponse updateSpecs(functionId, functionVersionId, functionDeploymentRequest).execute();

Update Function Deployment

Updates the deployment specs of the specified function version. It&#39;s important  to note that GPU type and backend configurations cannot be modified through  this endpoint. If the specified function is public, then Account Admin cannot  perform this operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionDeploymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    List<GpuSpecificationDto> deploymentSpecifications = Arrays.asList(); // Deployment specs with Backend, GPU, instance-type, etc. details
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version id
    try {
      DeploymentResponse result = client
              .functionDeployment
              .updateSpecs(deploymentSpecifications, functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDeployment());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#updateSpecs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeploymentResponse> response = client
              .functionDeployment
              .updateSpecs(deploymentSpecifications, functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionDeploymentApi#updateSpecs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **UUID**| Function id | |
| **functionVersionId** | **UUID**| Function version id | |
| **functionDeploymentRequest** | [**FunctionDeploymentRequest**](FunctionDeploymentRequest.md)|  | |

### Return type

[**DeploymentResponse**](DeploymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

