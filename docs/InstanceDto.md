

# InstanceDto

Data Transfer Object(DTO) representing a spot instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instanceId** | **String** | Unique id of the instance |  [optional] |
|**functionId** | **UUID** | Function executing on the instance |  [optional] |
|**functionVersionId** | **UUID** | Function version executing on the instance |  [optional] |
|**instanceType** | **String** | GPU instance-type powering the instance |  [optional] |
|**instanceStatus** | [**InstanceStatusEnum**](#InstanceStatusEnum) | Instance status |  [optional] |
|**sisRequestId** | **UUID** | SIS request-id used to launch this instance |  [optional] |
|**ncaId** | **String** | NVIDIA Cloud Account Id that owns the function running on the instance |  [optional] |
|**gpu** | **String** | GPU name powering the instance |  [optional] |
|**backend** | **String** | Backend where the instance is running |  [optional] |
|**location** | **String** | Location such as zone name or region where the instance is running |  [optional] |
|**instanceCreatedAt** | **OffsetDateTime** | Instance creation timestamp |  [optional] |
|**instanceUpdatedAt** | **OffsetDateTime** | Instance&#39;s last updated timestamp |  [optional] |



## Enum: InstanceStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| ERRORED | &quot;ERRORED&quot; |
| PREEMPTED | &quot;PREEMPTED&quot; |
| DELETED | &quot;DELETED&quot; |



