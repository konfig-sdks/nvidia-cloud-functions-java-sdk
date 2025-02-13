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
 * Data Transfer Object(DTO) representing deployment error
 */
@ApiModel(description = "Data Transfer Object(DTO) representing deployment error")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeploymentHealthDto {
  public static final String SERIALIZED_NAME_SIS_REQUEST_ID = "sisRequestId";
  @SerializedName(SERIALIZED_NAME_SIS_REQUEST_ID)
  private UUID sisRequestId;

  public static final String SERIALIZED_NAME_GPU = "gpu";
  @SerializedName(SERIALIZED_NAME_GPU)
  private String gpu;

  public static final String SERIALIZED_NAME_BACKEND = "backend";
  @SerializedName(SERIALIZED_NAME_BACKEND)
  private String backend;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "instanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public DeploymentHealthDto() {
  }

  public DeploymentHealthDto sisRequestId(UUID sisRequestId) {
    
    
    
    
    this.sisRequestId = sisRequestId;
    return this;
  }

   /**
   * SIS Request ID
   * @return sisRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SIS Request ID")

  public UUID getSisRequestId() {
    return sisRequestId;
  }


  public void setSisRequestId(UUID sisRequestId) {
    
    
    
    this.sisRequestId = sisRequestId;
  }


  public DeploymentHealthDto gpu(String gpu) {
    
    
    
    
    this.gpu = gpu;
    return this;
  }

   /**
   * GPU Type as per SDD
   * @return gpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "GPU Type as per SDD")

  public String getGpu() {
    return gpu;
  }


  public void setGpu(String gpu) {
    
    
    
    this.gpu = gpu;
  }


  public DeploymentHealthDto backend(String backend) {
    
    
    
    
    this.backend = backend;
    return this;
  }

   /**
   * Backend/CSP where the GPU powered instance will be launched
   * @return backend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Backend/CSP where the GPU powered instance will be launched")

  public String getBackend() {
    return backend;
  }


  public void setBackend(String backend) {
    
    
    
    this.backend = backend;
  }


  public DeploymentHealthDto instanceType(String instanceType) {
    
    
    
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Instance type
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instance type")

  public String getInstanceType() {
    return instanceType;
  }


  public void setInstanceType(String instanceType) {
    
    
    
    this.instanceType = instanceType;
  }


  public DeploymentHealthDto error(String error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Deployment error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Deployment error")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    
    
    
    this.error = error;
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
   * @return the DeploymentHealthDto instance itself
   */
  public DeploymentHealthDto putAdditionalProperty(String key, Object value) {
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
    DeploymentHealthDto deploymentHealthDto = (DeploymentHealthDto) o;
    return Objects.equals(this.sisRequestId, deploymentHealthDto.sisRequestId) &&
        Objects.equals(this.gpu, deploymentHealthDto.gpu) &&
        Objects.equals(this.backend, deploymentHealthDto.backend) &&
        Objects.equals(this.instanceType, deploymentHealthDto.instanceType) &&
        Objects.equals(this.error, deploymentHealthDto.error)&&
        Objects.equals(this.additionalProperties, deploymentHealthDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sisRequestId, gpu, backend, instanceType, error, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentHealthDto {\n");
    sb.append("    sisRequestId: ").append(toIndentedString(sisRequestId)).append("\n");
    sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("sisRequestId");
    openapiFields.add("gpu");
    openapiFields.add("backend");
    openapiFields.add("instanceType");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gpu");
    openapiRequiredFields.add("backend");
    openapiRequiredFields.add("error");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentHealthDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentHealthDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentHealthDto is not found in the empty JSON string", DeploymentHealthDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentHealthDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("sisRequestId") != null && !jsonObj.get("sisRequestId").isJsonNull()) && !jsonObj.get("sisRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sisRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sisRequestId").toString()));
      }
      if (!jsonObj.get("gpu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpu").toString()));
      }
      if (!jsonObj.get("backend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backend").toString()));
      }
      if ((jsonObj.get("instanceType") != null && !jsonObj.get("instanceType").isJsonNull()) && !jsonObj.get("instanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceType").toString()));
      }
      if (!jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentHealthDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentHealthDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentHealthDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentHealthDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentHealthDto>() {
           @Override
           public void write(JsonWriter out, DeploymentHealthDto value) throws IOException {
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
           public DeploymentHealthDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeploymentHealthDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DeploymentHealthDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentHealthDto
  * @throws IOException if the JSON string is invalid with respect to DeploymentHealthDto
  */
  public static DeploymentHealthDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentHealthDto.class);
  }

 /**
  * Convert an instance of DeploymentHealthDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

