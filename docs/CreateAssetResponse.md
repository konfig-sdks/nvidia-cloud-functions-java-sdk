

# CreateAssetResponse

Response body containing asset-id and the corresponding pre-signed URL to upload an asset of specified content-type to AWS S3 bucket.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Asset description to be used when uploading the asset |  [optional] |
|**assetId** | **UUID** | Unique id of the asset to be uploaded to AWS S3 bucket |  [optional] |
|**uploadUrl** | **String** | Pre-signed upload URL to upload asset |  [optional] |
|**contentType** | **String** | Content type of the asset such image/png, image/jpeg, etc. |  [optional] |



