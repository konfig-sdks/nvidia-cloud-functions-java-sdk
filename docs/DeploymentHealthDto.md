

# DeploymentHealthDto

Data Transfer Object(DTO) representing deployment error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sisRequestId** | **UUID** | SIS Request ID |  [optional] |
|**gpu** | **String** | GPU Type as per SDD |  |
|**backend** | **String** | Backend/CSP where the GPU powered instance will be launched |  |
|**instanceType** | **String** | Instance type |  [optional] |
|**error** | **String** | Deployment error |  |



