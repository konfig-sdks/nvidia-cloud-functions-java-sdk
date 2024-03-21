# ClusterGroupsAndGpusApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**list**](ClusterGroupsAndGpusApi.md#list) | **GET** /v2/nvcf/clusterGroups | List Cluster Groups |


<a name="list"></a>
# **list**
> ClusterGroupsResponse list().execute();

List Cluster Groups

Lists Cluster Groups for the current account. The response includes cluster  groups defined specifically in the current account and publicly available  cluster groups such as GFN, OCI, etc. Requires a bearer token with &#39;list_cluster_groups&#39; scope in HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClusterGroupsAndGpusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    try {
      ClusterGroupsResponse result = client
              .clusterGroupsAndGpus
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getClusterGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterGroupsAndGpusApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClusterGroupsResponse> response = client
              .clusterGroupsAndGpus
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterGroupsAndGpusApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterGroupsResponse**](ClusterGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

