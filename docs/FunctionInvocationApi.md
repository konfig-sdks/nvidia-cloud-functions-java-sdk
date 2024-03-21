# FunctionInvocationApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**invokeFunction**](FunctionInvocationApi.md#invokeFunction) | **POST** /v2/nvcf/pexec/functions/{functionId} | Call Function |
| [**invokeFunction_0**](FunctionInvocationApi.md#invokeFunction_0) | **POST** /v2/nvcf/pexec/functions/{functionId}/versions/{versionId} | Call Function |
| [**pollForResultUsingFunctionInvocationRequest**](FunctionInvocationApi.md#pollForResultUsingFunctionInvocationRequest) | **GET** /v2/nvcf/pexec/status/{requestId} | Poll For Result Using Function Invocation Request |


<a name="invokeFunction"></a>
# **invokeFunction**
> FunctionInvocationInvokeFunction200Response invokeFunction(functionId, body).NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES).NVCF_POLL_SECONDS(NVCF_POLL_SECONDS).execute();

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
import com.konfigthis.client.api.FunctionInvocationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID();
    List<String> NVCF_INPUT_ASSET_REFERENCES = Arrays.asList();
    Integer NVCF_POLL_SECONDS = 56;
    try {
      FunctionInvocationInvokeFunction200Response result = client
              .functionInvocation
              .invokeFunction(functionId)
              .NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .execute();
      System.out.println(result);
      System.out.println(result.getShort());
      System.out.println(result.getChar());
      System.out.println(result.getInt());
      System.out.println(result.getLong());
      System.out.println(result.getFloat());
      System.out.println(result.getDouble());
      System.out.println(result.getDirect());
      System.out.println(result.getReadOnly());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#invokeFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FunctionInvocationInvokeFunction200Response> response = client
              .functionInvocation
              .invokeFunction(functionId)
              .NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#invokeFunction");
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
| **body** | **Object**|  | |
| **NVCF_INPUT_ASSET_REFERENCES** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **NVCF_POLL_SECONDS** | **Integer**|  | [optional] |

### Return type

[**FunctionInvocationInvokeFunction200Response**](FunctionInvocationInvokeFunction200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/event-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |
| **202** | Result is pending. Client should poll using the requestId. |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |

<a name="invokeFunction_0"></a>
# **invokeFunction_0**
> FunctionInvocationInvokeFunction200Response invokeFunction_0(functionId, versionId, body).NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES).NVCF_POLL_SECONDS(NVCF_POLL_SECONDS).execute();

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
import com.konfigthis.client.api.FunctionInvocationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID();
    UUID versionId = UUID.randomUUID();
    List<String> NVCF_INPUT_ASSET_REFERENCES = Arrays.asList();
    Integer NVCF_POLL_SECONDS = 56;
    try {
      FunctionInvocationInvokeFunction200Response result = client
              .functionInvocation
              .invokeFunction_0(functionId, versionId)
              .NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .execute();
      System.out.println(result);
      System.out.println(result.getShort());
      System.out.println(result.getChar());
      System.out.println(result.getInt());
      System.out.println(result.getLong());
      System.out.println(result.getFloat());
      System.out.println(result.getDouble());
      System.out.println(result.getDirect());
      System.out.println(result.getReadOnly());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#invokeFunction_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FunctionInvocationInvokeFunction200Response> response = client
              .functionInvocation
              .invokeFunction_0(functionId, versionId)
              .NVCF_INPUT_ASSET_REFERENCES(NVCF_INPUT_ASSET_REFERENCES)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#invokeFunction_0");
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
| **body** | **Object**|  | |
| **NVCF_INPUT_ASSET_REFERENCES** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **NVCF_POLL_SECONDS** | **Integer**|  | [optional] |

### Return type

[**FunctionInvocationInvokeFunction200Response**](FunctionInvocationInvokeFunction200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/event-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |
| **202** | Result is pending. Client should poll using the requestId. |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |

<a name="pollForResultUsingFunctionInvocationRequest"></a>
# **pollForResultUsingFunctionInvocationRequest**
> FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse pollForResultUsingFunctionInvocationRequest(requestId).NVCF_POLL_SECONDS(NVCF_POLL_SECONDS).execute();

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
import com.konfigthis.client.api.FunctionInvocationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID requestId = UUID.randomUUID(); // Function invocation request id
    Integer NVCF_POLL_SECONDS = 56;
    try {
      FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse result = client
              .functionInvocation
              .pollForResultUsingFunctionInvocationRequest(requestId)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .execute();
      System.out.println(result);
      System.out.println(result.getShort());
      System.out.println(result.getChar());
      System.out.println(result.getInt());
      System.out.println(result.getLong());
      System.out.println(result.getFloat());
      System.out.println(result.getDouble());
      System.out.println(result.getDirect());
      System.out.println(result.getReadOnly());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#pollForResultUsingFunctionInvocationRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse> response = client
              .functionInvocation
              .pollForResultUsingFunctionInvocationRequest(requestId)
              .NVCF_POLL_SECONDS(NVCF_POLL_SECONDS)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionInvocationApi#pollForResultUsingFunctionInvocationRequest");
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
| **NVCF_POLL_SECONDS** | **Integer**|  | [optional] |

### Return type

[**FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse**](FunctionInvocationPollForResultUsingFunctionInvocationRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invocation is fulfilled |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |
| **202** | Result is pending. Client should poll using the requestId. |  * NVCF-REQID - Invocation Request Id <br>  * NVCF-PERCENT-COMPLETE - Percentage complete <br>  * NVCF-STATUS - Invocation status <br>  |

