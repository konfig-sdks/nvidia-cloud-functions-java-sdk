# EnvelopeFunctionInvocationApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callFunction**](EnvelopeFunctionInvocationApi.md#callFunction) | **POST** /v2/nvcf/exec/functions/{functionId} | Call Function |
| [**invokeFunction**](EnvelopeFunctionInvocationApi.md#invokeFunction) | **POST** /v2/nvcf/exec/functions/{functionId}/versions/{versionId} | Call Function |
| [**pollForResultUsingFunctionInvocationRequest**](EnvelopeFunctionInvocationApi.md#pollForResultUsingFunctionInvocationRequest) | **GET** /v2/nvcf/exec/status/{requestId} | Poll For Result Using Function Invocation Request |


<a name="callFunction"></a>
# **callFunction**
> InvokeFunctionResponse callFunction(functionId, invokeFunctionRequest).execute();

Call Function

Invokes the specified function that was successfully deployed. If the version  is not specified, any active function versions will handle the request. If  the version is specified in the URI, then the request is exclusively processed  by the designated version of the function. By default, this endpoint will block  for 5 seconds. If the request is not fulfilled before the timeout, it&#39;s status  is considered in-progress or pending and the response includes HTTP status code  202 with an invocation request ID, indicating that the client should commence  polling for the result using the invocation request ID. Access to this endpoint  mandates inclusion of either a bearer token or an api-key with &#39;invoke_function&#39;  scope in the HTTP Authorization header. Additionally, this endpoint has the  capability to provide updates on the progress of the request, contingent  upon the workload&#39;s provision of such information. In-progress responses are returned in order. If no in-progress response is received  during polling you will receive the most recent in-progress response. Only the first  256 unread in-progress messages are kept. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnvelopeFunctionInvocationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    Object requestBody = null;
    UUID functionId = UUID.randomUUID();
    RequestHeaderDto requestHeader = new RequestHeaderDto();
    try {
      InvokeFunctionResponse result = client
              .envelopeFunctionInvocation
              .callFunction(requestBody, functionId)
              .requestHeader(requestHeader)
              .execute();
      System.out.println(result);
      System.out.println(result.getReqId());
      System.out.println(result.getStatus());
      System.out.println(result.getResponseReference());
      System.out.println(result.getPercentComplete());
      System.out.println(result.getErrorCode());
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#callFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvokeFunctionResponse> response = client
              .envelopeFunctionInvocation
              .callFunction(requestBody, functionId)
              .requestHeader(requestHeader)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#callFunction");
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
| **functionId** | **UUID**|  | |
| **invokeFunctionRequest** | [**InvokeFunctionRequest**](InvokeFunctionRequest.md)|  | |

### Return type

[**InvokeFunctionResponse**](InvokeFunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  -  |
| **202** | Result is pending. Client should poll using the requestId. |  -  |

<a name="invokeFunction"></a>
# **invokeFunction**
> InvokeFunctionResponse invokeFunction(functionId, versionId, invokeFunctionRequest).execute();

Call Function

Invokes the specified function that was successfully deployed. If the version  is not specified, any active function versions will handle the request. If  the version is specified in the URI, then the request is exclusively processed  by the designated version of the function. By default, this endpoint will block  for 5 seconds. If the request is not fulfilled before the timeout, it&#39;s status  is considered in-progress or pending and the response includes HTTP status code  202 with an invocation request ID, indicating that the client should commence  polling for the result using the invocation request ID. Access to this endpoint  mandates inclusion of either a bearer token or an api-key with &#39;invoke_function&#39;  scope in the HTTP Authorization header. Additionally, this endpoint has the  capability to provide updates on the progress of the request, contingent  upon the workload&#39;s provision of such information. In-progress responses are returned in order. If no in-progress response is received  during polling you will receive the most recent in-progress response. Only the first  256 unread in-progress messages are kept. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnvelopeFunctionInvocationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    Object requestBody = null;
    UUID functionId = UUID.randomUUID();
    UUID versionId = UUID.randomUUID();
    RequestHeaderDto requestHeader = new RequestHeaderDto();
    try {
      InvokeFunctionResponse result = client
              .envelopeFunctionInvocation
              .invokeFunction(requestBody, functionId, versionId)
              .requestHeader(requestHeader)
              .execute();
      System.out.println(result);
      System.out.println(result.getReqId());
      System.out.println(result.getStatus());
      System.out.println(result.getResponseReference());
      System.out.println(result.getPercentComplete());
      System.out.println(result.getErrorCode());
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#invokeFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvokeFunctionResponse> response = client
              .envelopeFunctionInvocation
              .invokeFunction(requestBody, functionId, versionId)
              .requestHeader(requestHeader)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#invokeFunction");
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
| **functionId** | **UUID**|  | |
| **versionId** | **UUID**|  | |
| **invokeFunctionRequest** | [**InvokeFunctionRequest**](InvokeFunctionRequest.md)|  | |

### Return type

[**InvokeFunctionResponse**](InvokeFunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  -  |
| **202** | Result is pending. Client should poll using the requestId. |  -  |

<a name="pollForResultUsingFunctionInvocationRequest"></a>
# **pollForResultUsingFunctionInvocationRequest**
> InvokeFunctionResponse pollForResultUsingFunctionInvocationRequest(requestId).execute();

Poll For Result Using Function Invocation Request

Retrieves the status of an in-progress or pending request using its unique  invocation request ID. If the result is available, it will be included in  the response, marking the request as fulfilled. Conversely, if the result is  not yet available, the request is deemed pending. Access to this endpoint  mandates inclusion of either a bearer token or an api-key with  &#39;invoke_function&#39; scope in the HTTP Authorization header. In-progress responses are returned in order. If no in-progress response is received  during polling you will receive the most recent in-progress response. Only the first  256 unread in-progress messages are kept. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EnvelopeFunctionInvocationApi;
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
      InvokeFunctionResponse result = client
              .envelopeFunctionInvocation
              .pollForResultUsingFunctionInvocationRequest(requestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getReqId());
      System.out.println(result.getStatus());
      System.out.println(result.getResponseReference());
      System.out.println(result.getPercentComplete());
      System.out.println(result.getErrorCode());
      System.out.println(result.getResponse());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#pollForResultUsingFunctionInvocationRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvokeFunctionResponse> response = client
              .envelopeFunctionInvocation
              .pollForResultUsingFunctionInvocationRequest(requestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvelopeFunctionInvocationApi#pollForResultUsingFunctionInvocationRequest");
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

[**InvokeFunctionResponse**](InvokeFunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  -  |
| **202** | Result is pending. Client should poll using the requestId. |  -  |

