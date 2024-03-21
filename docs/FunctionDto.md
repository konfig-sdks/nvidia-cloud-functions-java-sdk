

# FunctionDto

Data Transfer Object(DTO) representing a function

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique function id |  |
|**ncaId** | **String** | NVIDIA Cloud Account Id |  |
|**versionId** | **UUID** | Unique function version id |  |
|**name** | **String** | Function name |  |
|**status** | [**StatusEnum**](#StatusEnum) | Function status |  |
|**inferenceUrl** | **URI** | Entrypoint for invoking the container to process requests |  [optional] |
|**ownedByDifferentAccount** | **Boolean** | Indicates whether the function is owned by another account. If the account  that is being used to lookup functions happens to be authorized to invoke/list  this function which is owned by a different account, then this field is set  to true and ncaId will contain the id of the account that owns the function.  Otherwise, this field is not set as it defaults to false.  |  [optional] |
|**inferencePort** | **Integer** | Optional port number where the inference listener is running - defaults to 8000 for Triton |  [optional] |
|**containerArgs** | **String** | Args used to launch the container |  [optional] |
|**containerEnvironment** | [**List&lt;ContainerEnvironmentEntryDto&gt;**](ContainerEnvironmentEntryDto.md) | Environment settings used to launch the container |  [optional] |
|**models** | [**Set&lt;ArtifactDto&gt;**](ArtifactDto.md) | Optional set of models |  [optional] |
|**containerImage** | **URI** | Optional custom container |  [optional] |
|**apiBodyFormat** | [**ApiBodyFormatEnum**](#ApiBodyFormatEnum) | Invocation request body format |  [optional] |
|**helmChart** | **URI** | Optional Helm Chart |  [optional] |
|**helmChartServiceName** | **String** | Helm Chart Service Name specified only when helmChart property is specified  |  [optional] |
|**healthUri** | **URI** | Health endpoint for the container or helmChart |  |
|**createdAt** | **OffsetDateTime** | Function creation timestamp |  |
|**activeInstances** | [**List&lt;InstanceDto&gt;**](InstanceDto.md) | List of active instances for this function. |  [optional] |
|**resources** | [**Set&lt;ArtifactDto&gt;**](ArtifactDto.md) | Optional set of resources. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DEPLOYING | &quot;DEPLOYING&quot; |
| ERROR | &quot;ERROR&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ApiBodyFormatEnum

| Name | Value |
|---- | -----|
| PREDICT_V2 | &quot;PREDICT_V2&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



