

# CreateFunctionRequest

Request payload to create function.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Function name must start with lowercase/uppercase/digit and can only contain lowercase, uppercase, digit, hyphen, and underscore characters |  |
|**inferenceUrl** | **URI** | Entrypoint for invoking the container to process a request |  |
|**healthUri** | **URI** | Health endpoint for the container or the helmChart |  [optional] |
|**inferencePort** | **Integer** | Optional port number where the inference listener is running. Defaults to 8000  for Triton.  |  [optional] |
|**containerArgs** | **String** | Args to be passed when launching the container |  [optional] |
|**containerEnvironment** | [**List&lt;ContainerEnvironmentEntryDto&gt;**](ContainerEnvironmentEntryDto.md) | Environment settings for launching the container |  [optional] |
|**models** | [**Set&lt;ArtifactDto&gt;**](ArtifactDto.md) | Optional set of models |  [optional] |
|**containerImage** | **URI** | Optional custom container image |  [optional] |
|**helmChart** | **URI** | Optional Helm Chart |  [optional] |
|**helmChartServiceName** | **String** | Helm Chart Service Name is required when helmChart property is specified  |  [optional] |
|**resources** | [**Set&lt;ArtifactDto&gt;**](ArtifactDto.md) | Optional set of resources |  [optional] |
|**apiBodyFormat** | [**ApiBodyFormatEnum**](#ApiBodyFormatEnum) | Invocation request body format |  [optional] |



## Enum: ApiBodyFormatEnum

| Name | Value |
|---- | -----|
| PREDICT_V2 | &quot;PREDICT_V2&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



