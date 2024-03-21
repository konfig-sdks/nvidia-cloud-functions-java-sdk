/*
 * Cloud Functions
 * Since its founding in 1993, NVIDIA (NASDAQ: NVDA) has been a pioneer in accelerated computing. The company's invention of the GPU in 1999 sparked the growth of the PC gaming market, redefined computer graphics, ignited the era of modern AI and is fueling the creation of the metaverse. NVIDIA is now a full-stack computing company with data-center-scale offerings that are reshaping industry.
 *
 * The version of the OpenAPI document: 2.87.3
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AuthorizedPartiesRequest;
import com.konfigthis.client.model.AuthorizedPartiesResponse;
import com.konfigthis.client.model.AuthorizedPartyDto;
import com.konfigthis.client.model.ListAuthorizedPartiesResponse;
import com.konfigthis.client.model.PatchAuthorizedPartyRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizedAccountsApi
 */
@Disabled
public class AuthorizedAccountsApiTest {

    private static AuthorizedAccountsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthorizedAccountsApi(apiClient);
    }

    /**
     * Authorize Additional Account To Invoke Function
     *
     * Adds the specified NVIDIA Cloud Account to the set of authorized accounts that  are can invoke all the versions of the specified function. If the specified  function does not have any existing inheritable authorized accounts, it results  in a response with status 404. If the specified account is already in the set  of existing inheritable authorized accounts, it results in a response with  status code 409. If a function is public, then Account Admin cannot perform  this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccountToFunctionTest() throws ApiException {
        AuthorizedPartyDto authorizedParty = null;
        UUID functionId = null;
        AuthorizedPartiesResponse response = api.addAccountToFunction(authorizedParty, functionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Authorize Additional Account To Invoke Function Version
     *
     * Adds the specified NVIDIA Cloud Account to the set of authorized accounts that  can invoke the specified function version. If the specified function version  does not have any existing inheritable authorized accounts, it results in a  response with status 404. If the specified account is already in the set of  existing authorized accounts that are directly associated with the function  version, it results in a response wit status code 409. If a function is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAccountToFunctionVersionTest() throws ApiException {
        AuthorizedPartyDto authorizedParty = null;
        UUID functionId = null;
        UUID functionVersionId = null;
        AuthorizedPartiesResponse response = api.addAccountToFunctionVersion(authorizedParty, functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Authorize Accounts To Invoke Function Version
     *
     * Authorizes additional NVIDIA Cloud Accounts to invoke a specific function  version. By default, a function belongs to the NVIDIA Cloud Account that  created it, and the credentials used for function invocation must reference  the same NVIDIA Cloud Account. Upon invocation of this endpoint, any existing  authorized accounts will be overwritten by the newly specified authorized  accounts. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authorizeFunctionAccountsTest() throws ApiException {
        List<AuthorizedPartyDto> authorizedParties = null;
        UUID functionId = null;
        UUID functionVersionId = null;
        AuthorizedPartiesResponse response = api.authorizeFunctionAccounts(authorizedParties, functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Authorize Accounts To Invoke Function
     *
     * Authorizes additional NVIDIA Cloud Accounts to invoke any version of the  specified function. By default, a function belongs to the NVIDIA Cloud Account  that created it, and the credentials used for function invocation must  reference the same NVIDIA Cloud Account. Upon invocation of this endpoint, any  existing authorized accounts will be overwritten by the newly specified  authorized accounts. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void authorizeFunctionAccounts_0Test() throws ApiException {
        List<AuthorizedPartyDto> authorizedParties = null;
        UUID functionId = null;
        AuthorizedPartiesResponse response = api.authorizeFunctionAccounts_0(authorizedParties, functionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete All Extra Authorizations For Function
     *
     * Deletes all the extra NVIDIA Cloud Accounts that were authorized to invoke the  function and all its versions. If a function version has its own set of  authorized accounts, those are not deleted. If the specified function is  public, then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAllExtraForFunctionTest() throws ApiException {
        UUID functionId = null;
        AuthorizedPartiesResponse response = api.deleteAllExtraForFunction(functionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete All Extra Authorizations For Function Version
     *
     * Deletes all the authorized accounts that are directly associated with the  specified function version. Authorized parties that are inherited by the  function version are not deleted. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteExtraForFunctionVersionTest() throws ApiException {
        UUID functionId = null;
        UUID functionVersionId = null;
        AuthorizedPartiesResponse response = api.deleteExtraForFunctionVersion(functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Account Authorizations For Function Version
     *
     * Gets NVIDIA Cloud Account IDs that are authorized to invoke specified function  version. Response includes authorized accounts that were added specifically  to the function version and the inherited authorized accounts that were  added at the function level. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void functionVersionAuthorizationsTest() throws ApiException {
        UUID functionId = null;
        UUID functionVersionId = null;
        AuthorizedPartiesResponse response = api.functionVersionAuthorizations(functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Account Authorizations For Function
     *
     * Lists NVIDIA Cloud Account IDs that are authorized to invoke any version of the  specified function. The response includes an array showing authorized accounts  for each version. Individual versions of a function can have their own  authorized accounts. So, each object in the array can have different  authorized accounts listed. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listForFunctionTest() throws ApiException {
        UUID functionId = null;
        ListAuthorizedPartiesResponse response = api.listForFunction(functionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unauthorize Account From Invoking Function
     *
     * Removes the specified NVIDIA Cloud Account from the set of authorized accounts  that can invoke all the versions of the specified function. If the specified  function does not have any existing inheritable authorized parties, it results  in a response with status 404. Also, if the specified account is not in the  existing set of inheritable authorized accounts, it results in a response with  status 400. If the specified function is public, then Account Admin cannot  perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromFunctionAuthorizationTest() throws ApiException {
        AuthorizedPartyDto authorizedParty = null;
        UUID functionId = null;
        AuthorizedPartiesResponse response = api.removeFromFunctionAuthorization(authorizedParty, functionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unauthorize Account From Invoking Function Version
     *
     * Removes the specified NVIDIA Cloud Account from the set of authorized accounts  that are directly associated with specified function version. If the specified  function version does not have any of its own(not inherited) authorized  accounts, it results in a response with status 404. Also, if the specified  authorized account is not in the set of existing authorized parties that are  directly associated with the specified function version, it results in a  response with status code 400. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this functionality mandates the inclusion of a bearer token with the  &#39;authorize_clients&#39; scope in the HTTP Authorization header 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removePartyForVersionTest() throws ApiException {
        AuthorizedPartyDto authorizedParty = null;
        UUID functionId = null;
        UUID functionVersionId = null;
        AuthorizedPartiesResponse response = api.removePartyForVersion(authorizedParty, functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

}
