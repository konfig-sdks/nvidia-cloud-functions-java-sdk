# AssetManagementApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetAndUrl**](AssetManagementApi.md#createAssetAndUrl) | **POST** /v2/nvcf/assets | Create Asset |
| [**deleteAssetById**](AssetManagementApi.md#deleteAssetById) | **DELETE** /v2/nvcf/assets/{assetId} | Delete Asset |
| [**listAssets**](AssetManagementApi.md#listAssets) | **GET** /v2/nvcf/assets | List Assets |
| [**showDetails**](AssetManagementApi.md#showDetails) | **GET** /v2/nvcf/assets/{assetId} | Show Asset Details |


<a name="createAssetAndUrl"></a>
# **createAssetAndUrl**
> CreateAssetResponse createAssetAndUrl(createAssetRequest).execute();

Create Asset

Creates a unique id representing an asset and a pre-signed URL to upload the  asset artifact to AWS S3 bucket for the NVIDIA Cloud Account. Requires either  a bearer token or an api-key with &#39;invoke_function&#39; scope in the HTTP  Authorization header.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAssetRequest** | [**CreateAssetRequest**](CreateAssetRequest.md)|  | |

### Return type

[**CreateAssetResponse**](CreateAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAssetById"></a>
# **deleteAssetById**
> deleteAssetById(assetId).execute();

Delete Asset

Deletes asset belonging to the current NVIDIA Cloud Account. Requires either  a bearer token or an api-key with &#39;invoke_function&#39; scope in the HTTP  Authorization header.

### Example
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
    UUID assetId = UUID.randomUUID(); // Id of the asset to be deleted
    try {
      client
              .assetManagement
              .deleteAssetById(assetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#deleteAssetById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .assetManagement
              .deleteAssetById(assetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#deleteAssetById");
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
| **assetId** | **UUID**| Id of the asset to be deleted | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="listAssets"></a>
# **listAssets**
> ListAssetsResponse listAssets().execute();

List Assets

List assets owned by the current NVIDIA Cloud Account. Requires either a  bearer token or an api-key with invoke_function scope in the HTTP Authorization  header. 

### Example
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
    try {
      ListAssetsResponse result = client
              .assetManagement
              .listAssets()
              .execute();
      System.out.println(result);
      System.out.println(result.getAssets());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#listAssets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListAssetsResponse> response = client
              .assetManagement
              .listAssets()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#listAssets");
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

[**ListAssetsResponse**](ListAssetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="showDetails"></a>
# **showDetails**
> AssetResponse showDetails(assetId).execute();

Show Asset Details

Returns details for the specified asset-id belonging to the current NVIDIA  Cloud Account. Requires either a bearer token or an api-key with  &#39;invoke_function&#39; scope in the HTTP Authorization header. 

### Example
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
    UUID assetId = UUID.randomUUID(); // Asset id
    try {
      AssetResponse result = client
              .assetManagement
              .showDetails(assetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAsset());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssetResponse> response = client
              .assetManagement
              .showDetails(assetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetManagementApi#showDetails");
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
| **assetId** | **UUID**| Asset id | |

### Return type

[**AssetResponse**](AssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

