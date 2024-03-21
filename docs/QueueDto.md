

# QueueDto

Data Transfer Object(DTO) representing a request queue for function version

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionVersionId** | **UUID** | Function version id |  |
|**functionName** | **String** | Function name |  |
|**functionStatus** | [**FunctionStatusEnum**](#FunctionStatusEnum) | Function status |  |
|**queueDepth** | **Integer** | Approximate number of messages in the request queue |  [optional] |



## Enum: FunctionStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DEPLOYING | &quot;DEPLOYING&quot; |
| ERROR | &quot;ERROR&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



