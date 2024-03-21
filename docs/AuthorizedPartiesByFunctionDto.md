

# AuthorizedPartiesByFunctionDto

Data Transfer Object(DTO) representing a function with authorized accounts

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Function id |  |
|**ncaId** | **String** | NVIDIA Cloud Account Id |  |
|**versionId** | **UUID** | Function version id |  [optional] |
|**authorizedParties** | [**List&lt;AuthorizedPartyDto&gt;**](AuthorizedPartyDto.md) | Authorized parties allowed to invoke the function |  [optional] |



