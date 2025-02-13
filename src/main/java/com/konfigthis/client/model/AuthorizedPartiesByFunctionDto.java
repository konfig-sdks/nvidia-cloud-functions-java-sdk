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
import com.konfigthis.client.model.AuthorizedPartyDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Data Transfer Object(DTO) representing a function with authorized accounts
 */
@ApiModel(description = "Data Transfer Object(DTO) representing a function with authorized accounts")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthorizedPartiesByFunctionDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NCA_ID = "ncaId";
  @SerializedName(SERIALIZED_NAME_NCA_ID)
  private String ncaId;

  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private UUID versionId;

  public static final String SERIALIZED_NAME_AUTHORIZED_PARTIES = "authorizedParties";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_PARTIES)
  private List<AuthorizedPartyDto> authorizedParties = null;

  public AuthorizedPartiesByFunctionDto() {
  }

  public AuthorizedPartiesByFunctionDto id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Function id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Function id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public AuthorizedPartiesByFunctionDto ncaId(String ncaId) {
    
    
    
    
    this.ncaId = ncaId;
    return this;
  }

   /**
   * NVIDIA Cloud Account Id
   * @return ncaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "NVIDIA Cloud Account Id")

  public String getNcaId() {
    return ncaId;
  }


  public void setNcaId(String ncaId) {
    
    
    
    this.ncaId = ncaId;
  }


  public AuthorizedPartiesByFunctionDto versionId(UUID versionId) {
    
    
    
    
    this.versionId = versionId;
    return this;
  }

   /**
   * Function version id
   * @return versionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Function version id")

  public UUID getVersionId() {
    return versionId;
  }


  public void setVersionId(UUID versionId) {
    
    
    
    this.versionId = versionId;
  }


  public AuthorizedPartiesByFunctionDto authorizedParties(List<AuthorizedPartyDto> authorizedParties) {
    
    
    
    
    this.authorizedParties = authorizedParties;
    return this;
  }

  public AuthorizedPartiesByFunctionDto addAuthorizedPartiesItem(AuthorizedPartyDto authorizedPartiesItem) {
    if (this.authorizedParties == null) {
      this.authorizedParties = new ArrayList<>();
    }
    this.authorizedParties.add(authorizedPartiesItem);
    return this;
  }

   /**
   * Authorized parties allowed to invoke the function
   * @return authorizedParties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authorized parties allowed to invoke the function")

  public List<AuthorizedPartyDto> getAuthorizedParties() {
    return authorizedParties;
  }


  public void setAuthorizedParties(List<AuthorizedPartyDto> authorizedParties) {
    
    
    
    this.authorizedParties = authorizedParties;
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
   * @return the AuthorizedPartiesByFunctionDto instance itself
   */
  public AuthorizedPartiesByFunctionDto putAdditionalProperty(String key, Object value) {
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
    AuthorizedPartiesByFunctionDto authorizedPartiesByFunctionDto = (AuthorizedPartiesByFunctionDto) o;
    return Objects.equals(this.id, authorizedPartiesByFunctionDto.id) &&
        Objects.equals(this.ncaId, authorizedPartiesByFunctionDto.ncaId) &&
        Objects.equals(this.versionId, authorizedPartiesByFunctionDto.versionId) &&
        Objects.equals(this.authorizedParties, authorizedPartiesByFunctionDto.authorizedParties)&&
        Objects.equals(this.additionalProperties, authorizedPartiesByFunctionDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ncaId, versionId, authorizedParties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedPartiesByFunctionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ncaId: ").append(toIndentedString(ncaId)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    authorizedParties: ").append(toIndentedString(authorizedParties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ncaId");
    openapiFields.add("versionId");
    openapiFields.add("authorizedParties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("ncaId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizedPartiesByFunctionDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizedPartiesByFunctionDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizedPartiesByFunctionDto is not found in the empty JSON string", AuthorizedPartiesByFunctionDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthorizedPartiesByFunctionDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("ncaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ncaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ncaId").toString()));
      }
      if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull()) && !jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if (jsonObj.get("authorizedParties") != null && !jsonObj.get("authorizedParties").isJsonNull()) {
        JsonArray jsonArrayauthorizedParties = jsonObj.getAsJsonArray("authorizedParties");
        if (jsonArrayauthorizedParties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authorizedParties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authorizedParties` to be an array in the JSON string but got `%s`", jsonObj.get("authorizedParties").toString()));
          }

          // validate the optional field `authorizedParties` (array)
          for (int i = 0; i < jsonArrayauthorizedParties.size(); i++) {
            AuthorizedPartyDto.validateJsonObject(jsonArrayauthorizedParties.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizedPartiesByFunctionDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizedPartiesByFunctionDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizedPartiesByFunctionDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizedPartiesByFunctionDto.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizedPartiesByFunctionDto>() {
           @Override
           public void write(JsonWriter out, AuthorizedPartiesByFunctionDto value) throws IOException {
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
           public AuthorizedPartiesByFunctionDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizedPartiesByFunctionDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizedPartiesByFunctionDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizedPartiesByFunctionDto
  * @throws IOException if the JSON string is invalid with respect to AuthorizedPartiesByFunctionDto
  */
  public static AuthorizedPartiesByFunctionDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizedPartiesByFunctionDto.class);
  }

 /**
  * Convert an instance of AuthorizedPartiesByFunctionDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

