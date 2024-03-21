# AuthorizedAccountsApi

All URIs are relative to *https://api.nvcf.nvidia.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAccountToFunction**](AuthorizedAccountsApi.md#addAccountToFunction) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/add | Authorize Additional Account To Invoke Function |
| [**addAccountToFunctionVersion**](AuthorizedAccountsApi.md#addAccountToFunctionVersion) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId}/add | Authorize Additional Account To Invoke Function Version |
| [**authorizeFunctionAccounts**](AuthorizedAccountsApi.md#authorizeFunctionAccounts) | **POST** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Authorize Accounts To Invoke Function Version |
| [**authorizeFunctionAccounts_0**](AuthorizedAccountsApi.md#authorizeFunctionAccounts_0) | **POST** /v2/nvcf/authorizations/functions/{functionId} | Authorize Accounts To Invoke Function |
| [**deleteAllExtraForFunction**](AuthorizedAccountsApi.md#deleteAllExtraForFunction) | **DELETE** /v2/nvcf/authorizations/functions/{functionId} | Delete All Extra Authorizations For Function |
| [**deleteExtraForFunctionVersion**](AuthorizedAccountsApi.md#deleteExtraForFunctionVersion) | **DELETE** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Delete All Extra Authorizations For Function Version |
| [**functionVersionAuthorizations**](AuthorizedAccountsApi.md#functionVersionAuthorizations) | **GET** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId} | Get Account Authorizations For Function Version |
| [**listForFunction**](AuthorizedAccountsApi.md#listForFunction) | **GET** /v2/nvcf/authorizations/functions/{functionId} | List Account Authorizations For Function |
| [**removeFromFunctionAuthorization**](AuthorizedAccountsApi.md#removeFromFunctionAuthorization) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/remove | Unauthorize Account From Invoking Function |
| [**removePartyForVersion**](AuthorizedAccountsApi.md#removePartyForVersion) | **PATCH** /v2/nvcf/authorizations/functions/{functionId}/versions/{functionVersionId}/remove | Unauthorize Account From Invoking Function Version |


<a name="addAccountToFunction"></a>
# **addAccountToFunction**
> AuthorizedPartiesResponse addAccountToFunction(functionId, patchAuthorizedPartyRequest).execute();

Authorize Additional Account To Invoke Function

Adds the specified NVIDIA Cloud Account to the set of authorized accounts that  are can invoke all the versions of the specified function. If the specified  function does not have any existing inheritable authorized accounts, it results  in a response with status 404. If the specified account is already in the set  of existing inheritable authorized accounts, it results in a response with  status code 409. If a function is public, then Account Admin cannot perform  this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    AuthorizedPartyDto authorizedParty = new AuthorizedPartyDto();
    UUID functionId = UUID.randomUUID(); // Function id
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .addAccountToFunction(authorizedParty, functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#addAccountToFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .addAccountToFunction(authorizedParty, functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#addAccountToFunction");
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
| **patchAuthorizedPartyRequest** | [**PatchAuthorizedPartyRequest**](PatchAuthorizedPartyRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addAccountToFunctionVersion"></a>
# **addAccountToFunctionVersion**
> AuthorizedPartiesResponse addAccountToFunctionVersion(functionId, functionVersionId, patchAuthorizedPartyRequest).execute();

Authorize Additional Account To Invoke Function Version

Adds the specified NVIDIA Cloud Account to the set of authorized accounts that  can invoke the specified function version. If the specified function version  does not have any existing inheritable authorized accounts, it results in a  response with status 404. If the specified account is already in the set of  existing authorized accounts that are directly associated with the function  version, it results in a response wit status code 409. If a function is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    AuthorizedPartyDto authorizedParty = new AuthorizedPartyDto();
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .addAccountToFunctionVersion(authorizedParty, functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#addAccountToFunctionVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .addAccountToFunctionVersion(authorizedParty, functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#addAccountToFunctionVersion");
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
| **functionVersionId** | **UUID**| Function version | |
| **patchAuthorizedPartyRequest** | [**PatchAuthorizedPartyRequest**](PatchAuthorizedPartyRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="authorizeFunctionAccounts"></a>
# **authorizeFunctionAccounts**
> AuthorizedPartiesResponse authorizeFunctionAccounts(functionId, functionVersionId, authorizedPartiesRequest).execute();

Authorize Accounts To Invoke Function Version

Authorizes additional NVIDIA Cloud Accounts to invoke a specific function  version. By default, a function belongs to the NVIDIA Cloud Account that  created it, and the credentials used for function invocation must reference  the same NVIDIA Cloud Account. Upon invocation of this endpoint, any existing  authorized accounts will be overwritten by the newly specified authorized  accounts. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    List<AuthorizedPartyDto> authorizedParties = Arrays.asList(); // Parties authorized to invoke function
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version id
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .authorizeFunctionAccounts(authorizedParties, functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#authorizeFunctionAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .authorizeFunctionAccounts(authorizedParties, functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#authorizeFunctionAccounts");
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
| **authorizedPartiesRequest** | [**AuthorizedPartiesRequest**](AuthorizedPartiesRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="authorizeFunctionAccounts_0"></a>
# **authorizeFunctionAccounts_0**
> AuthorizedPartiesResponse authorizeFunctionAccounts_0(functionId, authorizedPartiesRequest).execute();

Authorize Accounts To Invoke Function

Authorizes additional NVIDIA Cloud Accounts to invoke any version of the  specified function. By default, a function belongs to the NVIDIA Cloud Account  that created it, and the credentials used for function invocation must  reference the same NVIDIA Cloud Account. Upon invocation of this endpoint, any  existing authorized accounts will be overwritten by the newly specified  authorized accounts. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    List<AuthorizedPartyDto> authorizedParties = Arrays.asList(); // Parties authorized to invoke function
    UUID functionId = UUID.randomUUID(); // Function id
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .authorizeFunctionAccounts_0(authorizedParties, functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#authorizeFunctionAccounts_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .authorizeFunctionAccounts_0(authorizedParties, functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#authorizeFunctionAccounts_0");
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
| **authorizedPartiesRequest** | [**AuthorizedPartiesRequest**](AuthorizedPartiesRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAllExtraForFunction"></a>
# **deleteAllExtraForFunction**
> AuthorizedPartiesResponse deleteAllExtraForFunction(functionId).execute();

Delete All Extra Authorizations For Function

Deletes all the extra NVIDIA Cloud Accounts that were authorized to invoke the  function and all its versions. If a function version has its own set of  authorized accounts, those are not deleted. If the specified function is  public, then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
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
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .deleteAllExtraForFunction(functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#deleteAllExtraForFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .deleteAllExtraForFunction(functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#deleteAllExtraForFunction");
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

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteExtraForFunctionVersion"></a>
# **deleteExtraForFunctionVersion**
> AuthorizedPartiesResponse deleteExtraForFunctionVersion(functionId, functionVersionId).execute();

Delete All Extra Authorizations For Function Version

Deletes all the authorized accounts that are directly associated with the  specified function version. Authorized parties that are inherited by the  function version are not deleted. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .deleteExtraForFunctionVersion(functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#deleteExtraForFunctionVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .deleteExtraForFunctionVersion(functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#deleteExtraForFunctionVersion");
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
| **functionVersionId** | **UUID**| Function version | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="functionVersionAuthorizations"></a>
# **functionVersionAuthorizations**
> AuthorizedPartiesResponse functionVersionAuthorizations(functionId, functionVersionId).execute();

Get Account Authorizations For Function Version

Gets NVIDIA Cloud Account IDs that are authorized to invoke specified function  version. Response includes authorized accounts that were added specifically  to the function version and the inherited authorized accounts that were  added at the function level. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .functionVersionAuthorizations(functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#functionVersionAuthorizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .functionVersionAuthorizations(functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#functionVersionAuthorizations");
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
| **functionVersionId** | **UUID**| Function version | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listForFunction"></a>
# **listForFunction**
> ListAuthorizedPartiesResponse listForFunction(functionId).execute();

List Account Authorizations For Function

Lists NVIDIA Cloud Account IDs that are authorized to invoke any version of the  specified function. The response includes an array showing authorized accounts  for each version. Individual versions of a function can have their own  authorized accounts. So, each object in the array can have different  authorized accounts listed. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
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
      ListAuthorizedPartiesResponse result = client
              .authorizedAccounts
              .listForFunction(functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunctions());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#listForFunction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListAuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .listForFunction(functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#listForFunction");
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

[**ListAuthorizedPartiesResponse**](ListAuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeFromFunctionAuthorization"></a>
# **removeFromFunctionAuthorization**
> AuthorizedPartiesResponse removeFromFunctionAuthorization(functionId, patchAuthorizedPartyRequest).execute();

Unauthorize Account From Invoking Function

Removes the specified NVIDIA Cloud Account from the set of authorized accounts  that can invoke all the versions of the specified function. If the specified  function does not have any existing inheritable authorized parties, it results  in a response with status 404. Also, if the specified account is not in the  existing set of inheritable authorized accounts, it results in a response with  status 400. If the specified function is public, then Account Admin cannot  perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    AuthorizedPartyDto authorizedParty = new AuthorizedPartyDto();
    UUID functionId = UUID.randomUUID(); // Function id
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .removeFromFunctionAuthorization(authorizedParty, functionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#removeFromFunctionAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .removeFromFunctionAuthorization(authorizedParty, functionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#removeFromFunctionAuthorization");
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
| **patchAuthorizedPartyRequest** | [**PatchAuthorizedPartyRequest**](PatchAuthorizedPartyRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removePartyForVersion"></a>
# **removePartyForVersion**
> AuthorizedPartiesResponse removePartyForVersion(functionId, functionVersionId, patchAuthorizedPartyRequest).execute();

Unauthorize Account From Invoking Function Version

Removes the specified NVIDIA Cloud Account from the set of authorized accounts  that are directly associated with specified function version. If the specified  function version does not have any of its own(not inherited) authorized  accounts, it results in a response with status 404. Also, if the specified  authorized account is not in the set of existing authorized parties that are  directly associated with the specified function version, it results in a  response with status code 400. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NvidiaCloudFunctions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizedAccountsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.nvcf.nvidia.com";
    NvidiaCloudFunctions client = new NvidiaCloudFunctions(configuration);
    AuthorizedPartyDto authorizedParty = new AuthorizedPartyDto();
    UUID functionId = UUID.randomUUID(); // Function id
    UUID functionVersionId = UUID.randomUUID(); // Function version
    try {
      AuthorizedPartiesResponse result = client
              .authorizedAccounts
              .removePartyForVersion(authorizedParty, functionId, functionVersionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFunction());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#removePartyForVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthorizedPartiesResponse> response = client
              .authorizedAccounts
              .removePartyForVersion(authorizedParty, functionId, functionVersionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizedAccountsApi#removePartyForVersion");
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
| **functionVersionId** | **UUID**| Function version | |
| **patchAuthorizedPartyRequest** | [**PatchAuthorizedPartyRequest**](PatchAuthorizedPartyRequest.md)|  | |

### Return type

[**AuthorizedPartiesResponse**](AuthorizedPartiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

