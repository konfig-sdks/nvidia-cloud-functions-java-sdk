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
import com.konfigthis.client.model.DeploymentResponse;
import com.konfigthis.client.model.FunctionDeploymentRequest;
import com.konfigthis.client.model.FunctionResponse;
import com.konfigthis.client.model.GpuSpecificationDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FunctionDeploymentApi
 */
@Disabled
public class FunctionDeploymentApiTest {

    private static FunctionDeploymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FunctionDeploymentApi(apiClient);
    }

    /**
     * Delete Function Deployment
     *
     * Deletes the deployment associated with the specified function. Upon  deletion, any active instances will be terminated, and the function&#39;s status  will transition to &#39;INACTIVE&#39;. To undeploy a function version gracefully,  specify &#39;graceful&#x3D;true&#39; query parameter, allowing current tasks to complete  before terminating the instances. If the specified function version is public,  then Account Admin cannot perform this operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdAndVersionTest() throws ApiException {
        UUID functionId = null;
        UUID functionVersionId = null;
        Boolean graceful = null;
        FunctionResponse response = api.deleteByIdAndVersion(functionId, functionVersionId)
                .graceful(graceful)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Function Deployment Details
     *
     * Allows Account Admins to retrieve the deployment details of the specified  function version. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detailsTest() throws ApiException {
        UUID functionId = null;
        UUID functionVersionId = null;
        DeploymentResponse response = api.details(functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Deploy Function
     *
     * Initiates deployment for the specified function version. Upon invocation of  this endpoint, the function&#39;s status transitions to &#39;DEPLOYING&#39;. If the  specified function version is public, then Account Admin cannot perform this  operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initiateDeploymentForVersionTest() throws ApiException {
        List<GpuSpecificationDto> deploymentSpecifications = null;
        UUID functionId = null;
        UUID functionVersionId = null;
        DeploymentResponse response = api.initiateDeploymentForVersion(deploymentSpecifications, functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Function Deployment
     *
     * Updates the deployment specs of the specified function version. It&#39;s important  to note that GPU type and backend configurations cannot be modified through  this endpoint. If the specified function is public, then Account Admin cannot  perform this operation. Access to this endpoint mandates a bearer token with &#39;deploy_function&#39; scope in the  HTTP Authorization header. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSpecsTest() throws ApiException {
        List<GpuSpecificationDto> deploymentSpecifications = null;
        UUID functionId = null;
        UUID functionVersionId = null;
        DeploymentResponse response = api.updateSpecs(deploymentSpecifications, functionId, functionVersionId)
                .execute();
        // TODO: test validations
    }

}
