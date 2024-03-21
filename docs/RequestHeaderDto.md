

# RequestHeaderDto

Data Transfer Object(DTO) representing header/address for Cloud Functions processing. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputAssetReferences** | **List&lt;UUID&gt;** | List of UUIDs corresponding to the uploaded assets to be used as input for executing the task. |  [optional] |
|**meteringData** | [**List&lt;MeteringDataEntryDto&gt;**](MeteringDataEntryDto.md) | Metadata used for billing/metering purposes. |  [optional] |
|**pollDurationSeconds** | **Integer** | Polling timeout duration. |  [optional] |



