

# InvokeFunctionResponse

Response body with result from a request for executing a job/task as a cloud function using a GPU powered spot/on-demand instance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reqId** | **UUID** | Request id |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the task/job executing cloud function. |  [optional] |
|**responseReference** | **String** | For large results, responseReference will be a pre-signeddownload URL. |  [optional] |
|**percentComplete** | **Integer** | Progress indicator for the task/job executing cloud function. |  [optional] |
|**errorCode** | **Integer** | Error code from the container while executing cloud function. |  [optional] |
|**response** | **String** | Response/result of size &lt; 5MB size for the task/job executing cloud function. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERRORED | &quot;errored&quot; |
| IN_PROGRESS | &quot;in-progress&quot; |
| FULFILLED | &quot;fulfilled&quot; |
| PENDING_EVALUATION | &quot;pending-evaluation&quot; |
| REJECTED | &quot;rejected&quot; |



