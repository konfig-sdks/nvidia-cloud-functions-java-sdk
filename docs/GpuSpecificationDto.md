

# GpuSpecificationDto

Data Transfer Object(DTO) representing GPU specification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpu** | **String** | GPU name from the cluster |  |
|**backend** | **String** | Backend/CSP where the GPU powered instance will be launched |  |
|**maxInstances** | **Integer** | Maximum number of spot instances for the deployment |  |
|**minInstances** | **Integer** | Minimum number of spot instances for the deployment |  |
|**instanceType** | **String** | Instance type, based on GPU, assigned to a Worker |  [optional] |
|**availabilityZones** | **List&lt;String&gt;** | List of availability-zones(or clusters) in the cluster group |  [optional] |
|**maxRequestConcurrency** | **Integer** | Max request concurrency between 1 (default) and 1024. |  [optional] |
|**_configuration** | **Object** |  |  [optional] |



