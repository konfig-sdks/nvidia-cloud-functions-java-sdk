# FunctionManagementApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFunctionVersion**](FunctionManagementApi.md#createFunctionVersion) | **POST** /v2/nvcf/functions/{functionId}/versions | Create Function Version |
| [**deleteFunctionVersion**](FunctionManagementApi.md#deleteFunctionVersion) | **DELETE** /v2/nvcf/functions/{functionId}/versions/{functionVersionId} | Delete Function |
| [**getVersionDetails**](FunctionManagementApi.md#getVersionDetails) | **GET** /v2/nvcf/functions/{functionId}/versions/{functionVersionId} | Get Function Version Details |
| [**listFunctionIds**](FunctionManagementApi.md#listFunctionIds) | **GET** /v2/nvcf/functions/ids | List Function Ids |
| [**listFunctionVersions**](FunctionManagementApi.md#listFunctionVersions) | **GET** /v2/nvcf/functions/{functionId}/versions | List Function Versions |
| [**listFunctions**](FunctionManagementApi.md#listFunctions) | **GET** /v2/nvcf/functions | List Functions |
| [**registerNewFunction**](FunctionManagementApi.md#registerNewFunction) | **POST** /v2/nvcf/functions | Create Function |


<a name="createFunctionVersion"></a>
# **createFunctionVersion**
> CreateFunctionResponse createFunctionVersion(functionId, createFunctionRequest).execute();

Create Function Version

Creates a version of the specified function within the authenticated NVIDIA  Cloud Account. Requires a bearer token with &#39;register_function&#39; scope in the  HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    String name = "name_example"; // Function name must start with lowercase/uppercase/digit and can only contain lowercase, uppercase, digit, hyphen, and underscore characters
    URI inferenceUrl = new URI(); // Entrypoint for invoking the container to process a request
    UUID functionId = UUID.randomUUID(); // Function id
    URI healthUri = new URI(); // Health endpoint for the container or the helmChart
    Integer inferencePort = 56; // Optional port number where the inference listener is running. Defaults to 8000  for Triton. 
    String containerArgs = "containerArgs_example"; // Args to be passed when launching the container
    List<ContainerEnvironmentEntryDto> containerEnvironment = Arrays.asList(); // Environment settings for launching the container
    Set<ArtifactDto> models = Arrays.asList(); // Optional set of models
    URI containerImage = new URI(); // Optional custom container image
    URI helmChart = new URI(); // Optional Helm Chart
    String helmChartServiceName = "helmChartServiceName_example"; // Helm Chart Service Name is required when helmChart property is specified 
    Set<ArtifactDto> resources = Arrays.asList(); // Optional set of resources
    String apiBodyFormat = "PREDICT_V2"; // Invocation request body format
    try {
      CreateFunctionResponse result = client
              .functionManagement
              .createFunctionVersion(name, inferenceUrl, functionId)
              .healthUri(healthUri)
              .inferencePort(inferencePort)
              .containerArgs(containerArgs)
              .containerEnvironment(containerEnvironment)
              .models(models)
              .containerImage(containerImage)
              .helmChart(helmChart)
              .helmChartServiceName(helmChartServiceName)
              .resources(resources)
              .apiBodyFormat(apiBodyFormat)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#createFunctionVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateFunctionResponse> response = client
              .functionManagement
              .createFunctionVersion(name, inferenceUrl, functionId)
              .healthUri(healthUri)
              .inferencePort(inferencePort)
              .containerArgs(containerArgs)
              .containerEnvironment(containerEnvironment)
              .models(models)
              .containerImage(containerImage)
              .helmChart(helmChart)
              .helmChartServiceName(helmChartServiceName)
              .resources(resources)
              .apiBodyFormat(apiBodyFormat)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#createFunctionVersion");
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
| **createFunctionRequest** | [**CreateFunctionRequest**](CreateFunctionRequest.md)|  | |

### Return type

[**CreateFunctionResponse**](CreateFunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteFunctionVersion"></a>
# **deleteFunctionVersion**
> deleteFunctionVersion(functionId, functionVersionId).execute();

Delete Function

Deletes the specified function version in the authenticated NVIDIA Cloud  Account. Requires a bearer token with &#39;delete_function&#39; scope in the HTTP  Authorization header. If the function version is public, then Account Admin  cannot delete the function. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Version id
    try {
      client
              .functionManagement
              .deleteFunctionVersion(functionId, functionVersionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#deleteFunctionVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .functionManagement
              .deleteFunctionVersion(functionId, functionVersionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#deleteFunctionVersion");
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
| **functionVersionId** | **UUID**| Version id | |

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

<a name="getVersionDetails"></a>
# **getVersionDetails**
> FunctionResponse getVersionDetails(functionId, functionVersionId).execute();

Get Function Version Details

Retrieves detailed information of the specified function version in the  authenticated NVIDIA Cloud Account. Requires either a bearer token or an  api-key with &#39;list_functions&#39; or &#39;list_functions_details&#39; scopes in the HTTP  Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Version id 
    try {
      FunctionResponse result = client
              .functionManagement
              .getVersionDetails(functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#getVersionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FunctionResponse> response = client
              .functionManagement
              .getVersionDetails(functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#getVersionDetails");
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
| **functionVersionId** | **UUID**| Version id  | |

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

<a name="listFunctionIds"></a>
# **listFunctionIds**
> ListFunctionIdsResponse listFunctionIds().visibility(visibility).execute();

List Function Ids

Lists ids of all the functions in the authenticated NVIDIA Cloud Account.  Requires either a bearer token or an api-key with &#39;list_functions&#39; or  &#39;list_functions_details&#39; scopes in the HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    Set<String> visibility = Arrays.asList(); // Query param 'visibility' indicates the kind of functions to be included  in the response. 
    try {
      ListFunctionIdsResponse result = client
              .functionManagement
              .listFunctionIds()
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctionIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctionIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListFunctionIdsResponse> response = client
              .functionManagement
              .listFunctionIds()
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctionIds");
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
| **visibility** | [**Set&lt;String&gt;**](String.md)| Query param &#39;visibility&#39; indicates the kind of functions to be included  in the response.  | [optional] [enum: authorized, private, public] |

### Return type

[**ListFunctionIdsResponse**](ListFunctionIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listFunctionVersions"></a>
# **listFunctionVersions**
> ListFunctionsResponse listFunctionVersions(functionId).execute();

List Function Versions

Lists details of all the versions of the specified function in the authenticated  NVIDIA Cloud Account. Requires either a bearer token or an api-key with  &#39;list_functions&#39; or &#39;list_functions_details&#39; scopes in the HTTP Authorization  header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
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
      ListFunctionsResponse result = client
              .functionManagement
              .listFunctionVersions(functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctionVersions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListFunctionsResponse> response = client
              .functionManagement
              .listFunctionVersions(functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctionVersions");
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

[**ListFunctionsResponse**](ListFunctionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listFunctions"></a>
# **listFunctions**
> ListFunctionsResponse listFunctions().visibility(visibility).execute();

List Functions

Lists all the functions associated with the authenticated NVIDIA Cloud Account.  Requires either a bearer token or an api-key with &#39;list_functions&#39; or  &#39;list_functions_details&#39; scopes in the HTTP Authorization header.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    Set<String> visibility = Arrays.asList(); // Query param 'visibility' indicates the kind of functions to be included  in the response. 
    try {
      ListFunctionsResponse result = client
              .functionManagement
              .listFunctions()
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctions());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListFunctionsResponse> response = client
              .functionManagement
              .listFunctions()
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#listFunctions");
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
| **visibility** | [**Set&lt;String&gt;**](String.md)| Query param &#39;visibility&#39; indicates the kind of functions to be included  in the response.  | [optional] [enum: authorized, private, public] |

### Return type

[**ListFunctionsResponse**](ListFunctionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="registerNewFunction"></a>
# **registerNewFunction**
> CreateFunctionResponse registerNewFunction(createFunctionRequest).execute();

Create Function

Creates a new function within the authenticated NVIDIA Cloud Account. Requires a  bearer token with &#39;register_function&#39; scope in the HTTP Authorization header. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FunctionManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    String name = "name_example"; // Function name must start with lowercase/uppercase/digit and can only contain lowercase, uppercase, digit, hyphen, and underscore characters
    URI inferenceUrl = new URI(); // Entrypoint for invoking the container to process a request
    URI healthUri = new URI(); // Health endpoint for the container or the helmChart
    Integer inferencePort = 56; // Optional port number where the inference listener is running. Defaults to 8000  for Triton. 
    String containerArgs = "containerArgs_example"; // Args to be passed when launching the container
    List<ContainerEnvironmentEntryDto> containerEnvironment = Arrays.asList(); // Environment settings for launching the container
    Set<ArtifactDto> models = Arrays.asList(); // Optional set of models
    URI containerImage = new URI(); // Optional custom container image
    URI helmChart = new URI(); // Optional Helm Chart
    String helmChartServiceName = "helmChartServiceName_example"; // Helm Chart Service Name is required when helmChart property is specified 
    Set<ArtifactDto> resources = Arrays.asList(); // Optional set of resources
    String apiBodyFormat = "PREDICT_V2"; // Invocation request body format
    try {
      CreateFunctionResponse result = client
              .functionManagement
              .registerNewFunction(name, inferenceUrl)
              .healthUri(healthUri)
              .inferencePort(inferencePort)
              .containerArgs(containerArgs)
              .containerEnvironment(containerEnvironment)
              .models(models)
              .containerImage(containerImage)
              .helmChart(helmChart)
              .helmChartServiceName(helmChartServiceName)
              .resources(resources)
              .apiBodyFormat(apiBodyFormat)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#registerNewFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateFunctionResponse> response = client
              .functionManagement
              .registerNewFunction(name, inferenceUrl)
              .healthUri(healthUri)
              .inferencePort(inferencePort)
              .containerArgs(containerArgs)
              .containerEnvironment(containerEnvironment)
              .models(models)
              .containerImage(containerImage)
              .helmChart(helmChart)
              .helmChartServiceName(helmChartServiceName)
              .resources(resources)
              .apiBodyFormat(apiBodyFormat)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionManagementApi#registerNewFunction");
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
| **createFunctionRequest** | [**CreateFunctionRequest**](CreateFunctionRequest.md)|  | |

### Return type

[**CreateFunctionResponse**](CreateFunctionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

