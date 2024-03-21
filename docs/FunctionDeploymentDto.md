

# FunctionDeploymentDto

Function deployment response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionId** | **UUID** | Function id |  |
|**functionVersionId** | **UUID** | Function version id |  |
|**ncaId** | **String** | NVIDIA Cloud Account Id |  |
|**functionStatus** | [**FunctionStatusEnum**](#FunctionStatusEnum) | Function status |  |
|**requestQueueUrl** | **String** | SQS Request Queue URL |  |
|**healthInfo** | [**List&lt;DeploymentHealthDto&gt;**](DeploymentHealthDto.md) | Health info for a deployment specification is included only if there are any  issues/errors.  |  [optional] |
|**deploymentSpecifications** | [**List&lt;GpuSpecificationDto&gt;**](GpuSpecificationDto.md) | Function deployment details |  |



## Enum: FunctionStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DEPLOYING | &quot;DEPLOYING&quot; |
| ERROR | &quot;ERROR&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



