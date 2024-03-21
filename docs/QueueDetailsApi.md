# QueueDetailsApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**functionQueuesDetails**](QueueDetailsApi.md#functionQueuesDetails) | **GET** /v2/nvcf/queues/functions/{functionId} | Queue Details |
| [**getAllQueuesDetails**](QueueDetailsApi.md#getAllQueuesDetails) | **GET** /v2/nvcf/queues/functions/{functionId}/versions/{versionId} | Queue Details |
| [**getQueuePositionByRequestId**](QueueDetailsApi.md#getQueuePositionByRequestId) | **GET** /v2/nvcf/queues/{requestId}/position | Queue Position |


<a name="functionQueuesDetails"></a>
# **functionQueuesDetails**
> GetQueuesResponse functionQueuesDetails(functionId).execute();

Queue Details

Provides details of all the queues associated with the specified function.  If a function has multiple versions and they are all deployed, then the  response includes details of all the queues. If the specified function  is public, then Account Admin cannot perform this operation. Requires a bearer token or an api-key with &#39;queue_details&#39; scope in the HTTP  Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueueDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    try {
      GetQueuesResponse result = client
              .queueDetails
              .functionQueuesDetails(functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctionId());
      System.out.println(result.getQueues());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#functionQueuesDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetQueuesResponse> response = client
              .queueDetails
              .functionQueuesDetails(functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#functionQueuesDetails");
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

### Return type

[**GetQueuesResponse**](GetQueuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAllQueuesDetails"></a>
# **getAllQueuesDetails**
> GetQueuesResponse getAllQueuesDetails(functionId, versionId).execute();

Queue Details

Provides details of all the queues associated with the specified function.  If a function has multiple versions and they are all deployed, then the  response includes details of all the queues. If the specified function  is public, then Account Admin cannot perform this operation. Requires a bearer token or an api-key with &#39;queue_details&#39; scope in the HTTP  Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueueDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID versionId = UUID.randomUUID(); // Function version id
    try {
      GetQueuesResponse result = client
              .queueDetails
              .getAllQueuesDetails(functionId, versionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctionId());
      System.out.println(result.getQueues());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#getAllQueuesDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetQueuesResponse> response = client
              .queueDetails
              .getAllQueuesDetails(functionId, versionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#getAllQueuesDetails");
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
| **versionId** | **UUID**| Function version id | |

### Return type

[**GetQueuesResponse**](GetQueuesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getQueuePositionByRequestId"></a>
# **getQueuePositionByRequestId**
> GetPositionInQueueResponse getQueuePositionByRequestId(requestId).execute();

Queue Position

Using the specified function invocation request id, returns the estimated  position of the corresponding message up to 1000 in the queue. Requires a bearer token or an api-key with &#39;queue_details&#39; scope in the HTTP  Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueueDetailsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID requestId = UUID.randomUUID(); // Function invocation request id
    try {
      GetPositionInQueueResponse result = client
              .queueDetails
              .getQueuePositionByRequestId(requestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctionVersionId());
      System.out.println(result.getFunctionId());
      System.out.println(result.getPositionInQueue());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#getQueuePositionByRequestId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPositionInQueueResponse> response = client
              .queueDetails
              .getQueuePositionByRequestId(requestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueDetailsApi#getQueuePositionByRequestId");
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
| **requestId** | **UUID**| Function invocation request id | |

### Return type

[**GetPositionInQueueResponse**](GetPositionInQueueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

