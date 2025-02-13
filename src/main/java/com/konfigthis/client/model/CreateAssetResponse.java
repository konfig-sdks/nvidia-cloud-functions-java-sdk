/*
 * Cloud Functions
 * Since its founding in 1993, NVIDIA (NASDAQ: NVDA) has been a pioneer in accelerated computing. The company's invention of the GPU in 1999 sparked the growth of the PC gaming market, redefined computer graphics, ignited the era of modern AI and is fueling the creation of the metaverse. NVIDIA is now a full-stack computing company with data-center-scale offerings that are reshaping industry.
 *
 * The version of the OpenAPI document: 2.87.3
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Response body containing asset-id and the corresponding pre-signed URL to upload an asset of specified content-type to AWS S3 bucket.
 */
@ApiModel(description = "Response body containing asset-id and the corresponding pre-signed URL to upload an asset of specified content-type to AWS S3 bucket.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateAssetResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private UUID assetId;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "uploadUrl";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public CreateAssetResponse() {
  }

  public CreateAssetResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Asset description to be used when uploading the asset
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Asset description to be used when uploading the asset")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CreateAssetResponse assetId(UUID assetId) {
    
    
    
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique id of the asset to be uploaded to AWS S3 bucket
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique id of the asset to be uploaded to AWS S3 bucket")

  public UUID getAssetId() {
    return assetId;
  }


  public void setAssetId(UUID assetId) {
    
    
    
    this.assetId = assetId;
  }


  public CreateAssetResponse uploadUrl(String uploadUrl) {
    
    
    
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Pre-signed upload URL to upload asset
   * @return uploadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pre-signed upload URL to upload asset")

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    
    
    
    this.uploadUrl = uploadUrl;
  }


  public CreateAssetResponse contentType(String contentType) {
    
    
    
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type of the asset such image/png, image/jpeg, etc.
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content type of the asset such image/png, image/jpeg, etc.")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    
    
    
    this.contentType = contentType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateAssetResponse instance itself
   */
  public CreateAssetResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetResponse createAssetResponse = (CreateAssetResponse) o;
    return Objects.equals(this.description, createAssetResponse.description) &&
        Objects.equals(this.assetId, createAssetResponse.assetId) &&
        Objects.equals(this.uploadUrl, createAssetResponse.uploadUrl) &&
        Objects.equals(this.contentType, createAssetResponse.contentType)&&
        Objects.equals(this.additionalProperties, createAssetResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, assetId, uploadUrl, contentType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("assetId");
    openapiFields.add("uploadUrl");
    openapiFields.add("contentType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAssetResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateAssetResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAssetResponse is not found in the empty JSON string", CreateAssetResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonNull()) && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if ((jsonObj.get("uploadUrl") != null && !jsonObj.get("uploadUrl").isJsonNull()) && !jsonObj.get("uploadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadUrl").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAssetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAssetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAssetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAssetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAssetResponse>() {
           @Override
           public void write(JsonWriter out, CreateAssetResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAssetResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateAssetResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAssetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAssetResponse
  * @throws IOException if the JSON string is invalid with respect to CreateAssetResponse
  */
  public static CreateAssetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAssetResponse.class);
  }

 /**
  * Convert an instance of CreateAssetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

