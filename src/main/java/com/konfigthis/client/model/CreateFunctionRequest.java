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
import com.konfigthis.client.model.ArtifactDto;
import com.konfigthis.client.model.ContainerEnvironmentEntryDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * Request payload to create function.
 */
@ApiModel(description = "Request payload to create function.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateFunctionRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INFERENCE_URL = "inferenceUrl";
  @SerializedName(SERIALIZED_NAME_INFERENCE_URL)
  private URI inferenceUrl;

  public static final String SERIALIZED_NAME_HEALTH_URI = "healthUri";
  @SerializedName(SERIALIZED_NAME_HEALTH_URI)
  private URI healthUri;

  public static final String SERIALIZED_NAME_INFERENCE_PORT = "inferencePort";
  @SerializedName(SERIALIZED_NAME_INFERENCE_PORT)
  private Integer inferencePort;

  public static final String SERIALIZED_NAME_CONTAINER_ARGS = "containerArgs";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ARGS)
  private String containerArgs;

  public static final String SERIALIZED_NAME_CONTAINER_ENVIRONMENT = "containerEnvironment";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ENVIRONMENT)
  private List<ContainerEnvironmentEntryDto> containerEnvironment = null;

  public static final String SERIALIZED_NAME_MODELS = "models";
  @SerializedName(SERIALIZED_NAME_MODELS)
  private Set<ArtifactDto> models = null;

  public static final String SERIALIZED_NAME_CONTAINER_IMAGE = "containerImage";
  @SerializedName(SERIALIZED_NAME_CONTAINER_IMAGE)
  private URI containerImage;

  public static final String SERIALIZED_NAME_HELM_CHART = "helmChart";
  @SerializedName(SERIALIZED_NAME_HELM_CHART)
  private URI helmChart;

  public static final String SERIALIZED_NAME_HELM_CHART_SERVICE_NAME = "helmChartServiceName";
  @SerializedName(SERIALIZED_NAME_HELM_CHART_SERVICE_NAME)
  private String helmChartServiceName;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Set<ArtifactDto> resources = null;

  /**
   * Invocation request body format
   */
  @JsonAdapter(ApiBodyFormatEnum.Adapter.class)
 public enum ApiBodyFormatEnum {
    PREDICT_V2("PREDICT_V2"),
    
    CUSTOM("CUSTOM");

    private String value;

    ApiBodyFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApiBodyFormatEnum fromValue(String value) {
      for (ApiBodyFormatEnum b : ApiBodyFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApiBodyFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApiBodyFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApiBodyFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApiBodyFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_API_BODY_FORMAT = "apiBodyFormat";
  @SerializedName(SERIALIZED_NAME_API_BODY_FORMAT)
  private ApiBodyFormatEnum apiBodyFormat;

  public CreateFunctionRequest() {
  }

  public CreateFunctionRequest name(String name) {
    
    
    if (name != null && name.length() < 10) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 10.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Function name must start with lowercase/uppercase/digit and can only contain lowercase, uppercase, digit, hyphen, and underscore characters
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Function name must start with lowercase/uppercase/digit and can only contain lowercase, uppercase, digit, hyphen, and underscore characters")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 10) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 10.");
    }
    this.name = name;
  }


  public CreateFunctionRequest inferenceUrl(URI inferenceUrl) {
    
    
    
    
    this.inferenceUrl = inferenceUrl;
    return this;
  }

   /**
   * Entrypoint for invoking the container to process a request
   * @return inferenceUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Entrypoint for invoking the container to process a request")

  public URI getInferenceUrl() {
    return inferenceUrl;
  }


  public void setInferenceUrl(URI inferenceUrl) {
    
    
    
    this.inferenceUrl = inferenceUrl;
  }


  public CreateFunctionRequest healthUri(URI healthUri) {
    
    
    
    
    this.healthUri = healthUri;
    return this;
  }

   /**
   * Health endpoint for the container or the helmChart
   * @return healthUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Health endpoint for the container or the helmChart")

  public URI getHealthUri() {
    return healthUri;
  }


  public void setHealthUri(URI healthUri) {
    
    
    
    this.healthUri = healthUri;
  }


  public CreateFunctionRequest inferencePort(Integer inferencePort) {
    
    
    
    
    this.inferencePort = inferencePort;
    return this;
  }

   /**
   * Optional port number where the inference listener is running. Defaults to 8000  for Triton. 
   * @return inferencePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional port number where the inference listener is running. Defaults to 8000  for Triton. ")

  public Integer getInferencePort() {
    return inferencePort;
  }


  public void setInferencePort(Integer inferencePort) {
    
    
    
    this.inferencePort = inferencePort;
  }


  public CreateFunctionRequest containerArgs(String containerArgs) {
    
    
    
    
    this.containerArgs = containerArgs;
    return this;
  }

   /**
   * Args to be passed when launching the container
   * @return containerArgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Args to be passed when launching the container")

  public String getContainerArgs() {
    return containerArgs;
  }


  public void setContainerArgs(String containerArgs) {
    
    
    
    this.containerArgs = containerArgs;
  }


  public CreateFunctionRequest containerEnvironment(List<ContainerEnvironmentEntryDto> containerEnvironment) {
    
    
    
    
    this.containerEnvironment = containerEnvironment;
    return this;
  }

  public CreateFunctionRequest addContainerEnvironmentItem(ContainerEnvironmentEntryDto containerEnvironmentItem) {
    if (this.containerEnvironment == null) {
      this.containerEnvironment = new ArrayList<>();
    }
    this.containerEnvironment.add(containerEnvironmentItem);
    return this;
  }

   /**
   * Environment settings for launching the container
   * @return containerEnvironment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Environment settings for launching the container")

  public List<ContainerEnvironmentEntryDto> getContainerEnvironment() {
    return containerEnvironment;
  }


  public void setContainerEnvironment(List<ContainerEnvironmentEntryDto> containerEnvironment) {
    
    
    
    this.containerEnvironment = containerEnvironment;
  }


  public CreateFunctionRequest models(Set<ArtifactDto> models) {
    
    
    
    
    this.models = models;
    return this;
  }

  public CreateFunctionRequest addModelsItem(ArtifactDto modelsItem) {
    if (this.models == null) {
      this.models = new LinkedHashSet<>();
    }
    this.models.add(modelsItem);
    return this;
  }

   /**
   * Optional set of models
   * @return models
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional set of models")

  public Set<ArtifactDto> getModels() {
    return models;
  }


  public void setModels(Set<ArtifactDto> models) {
    
    
    
    this.models = models;
  }


  public CreateFunctionRequest containerImage(URI containerImage) {
    
    
    
    
    this.containerImage = containerImage;
    return this;
  }

   /**
   * Optional custom container image
   * @return containerImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional custom container image")

  public URI getContainerImage() {
    return containerImage;
  }


  public void setContainerImage(URI containerImage) {
    
    
    
    this.containerImage = containerImage;
  }


  public CreateFunctionRequest helmChart(URI helmChart) {
    
    
    
    
    this.helmChart = helmChart;
    return this;
  }

   /**
   * Optional Helm Chart
   * @return helmChart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional Helm Chart")

  public URI getHelmChart() {
    return helmChart;
  }


  public void setHelmChart(URI helmChart) {
    
    
    
    this.helmChart = helmChart;
  }


  public CreateFunctionRequest helmChartServiceName(String helmChartServiceName) {
    
    
    
    
    this.helmChartServiceName = helmChartServiceName;
    return this;
  }

   /**
   * Helm Chart Service Name is required when helmChart property is specified 
   * @return helmChartServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Helm Chart Service Name is required when helmChart property is specified ")

  public String getHelmChartServiceName() {
    return helmChartServiceName;
  }


  public void setHelmChartServiceName(String helmChartServiceName) {
    
    
    
    this.helmChartServiceName = helmChartServiceName;
  }


  public CreateFunctionRequest resources(Set<ArtifactDto> resources) {
    
    
    
    
    this.resources = resources;
    return this;
  }

  public CreateFunctionRequest addResourcesItem(ArtifactDto resourcesItem) {
    if (this.resources == null) {
      this.resources = new LinkedHashSet<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Optional set of resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional set of resources")

  public Set<ArtifactDto> getResources() {
    return resources;
  }


  public void setResources(Set<ArtifactDto> resources) {
    
    
    
    this.resources = resources;
  }


  public CreateFunctionRequest apiBodyFormat(ApiBodyFormatEnum apiBodyFormat) {
    
    
    
    
    this.apiBodyFormat = apiBodyFormat;
    return this;
  }

   /**
   * Invocation request body format
   * @return apiBodyFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invocation request body format")

  public ApiBodyFormatEnum getApiBodyFormat() {
    return apiBodyFormat;
  }


  public void setApiBodyFormat(ApiBodyFormatEnum apiBodyFormat) {
    
    
    
    this.apiBodyFormat = apiBodyFormat;
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
   * @return the CreateFunctionRequest instance itself
   */
  public CreateFunctionRequest putAdditionalProperty(String key, Object value) {
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
    CreateFunctionRequest createFunctionRequest = (CreateFunctionRequest) o;
    return Objects.equals(this.name, createFunctionRequest.name) &&
        Objects.equals(this.inferenceUrl, createFunctionRequest.inferenceUrl) &&
        Objects.equals(this.healthUri, createFunctionRequest.healthUri) &&
        Objects.equals(this.inferencePort, createFunctionRequest.inferencePort) &&
        Objects.equals(this.containerArgs, createFunctionRequest.containerArgs) &&
        Objects.equals(this.containerEnvironment, createFunctionRequest.containerEnvironment) &&
        Objects.equals(this.models, createFunctionRequest.models) &&
        Objects.equals(this.containerImage, createFunctionRequest.containerImage) &&
        Objects.equals(this.helmChart, createFunctionRequest.helmChart) &&
        Objects.equals(this.helmChartServiceName, createFunctionRequest.helmChartServiceName) &&
        Objects.equals(this.resources, createFunctionRequest.resources) &&
        Objects.equals(this.apiBodyFormat, createFunctionRequest.apiBodyFormat)&&
        Objects.equals(this.additionalProperties, createFunctionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inferenceUrl, healthUri, inferencePort, containerArgs, containerEnvironment, models, containerImage, helmChart, helmChartServiceName, resources, apiBodyFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFunctionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inferenceUrl: ").append(toIndentedString(inferenceUrl)).append("\n");
    sb.append("    healthUri: ").append(toIndentedString(healthUri)).append("\n");
    sb.append("    inferencePort: ").append(toIndentedString(inferencePort)).append("\n");
    sb.append("    containerArgs: ").append(toIndentedString(containerArgs)).append("\n");
    sb.append("    containerEnvironment: ").append(toIndentedString(containerEnvironment)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    containerImage: ").append(toIndentedString(containerImage)).append("\n");
    sb.append("    helmChart: ").append(toIndentedString(helmChart)).append("\n");
    sb.append("    helmChartServiceName: ").append(toIndentedString(helmChartServiceName)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    apiBodyFormat: ").append(toIndentedString(apiBodyFormat)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("inferenceUrl");
    openapiFields.add("healthUri");
    openapiFields.add("inferencePort");
    openapiFields.add("containerArgs");
    openapiFields.add("containerEnvironment");
    openapiFields.add("models");
    openapiFields.add("containerImage");
    openapiFields.add("helmChart");
    openapiFields.add("helmChartServiceName");
    openapiFields.add("resources");
    openapiFields.add("apiBodyFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("inferenceUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFunctionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateFunctionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFunctionRequest is not found in the empty JSON string", CreateFunctionRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFunctionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("inferenceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inferenceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inferenceUrl").toString()));
      }
      if ((jsonObj.get("healthUri") != null && !jsonObj.get("healthUri").isJsonNull()) && !jsonObj.get("healthUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthUri").toString()));
      }
      if ((jsonObj.get("containerArgs") != null && !jsonObj.get("containerArgs").isJsonNull()) && !jsonObj.get("containerArgs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerArgs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerArgs").toString()));
      }
      if (jsonObj.get("containerEnvironment") != null && !jsonObj.get("containerEnvironment").isJsonNull()) {
        JsonArray jsonArraycontainerEnvironment = jsonObj.getAsJsonArray("containerEnvironment");
        if (jsonArraycontainerEnvironment != null) {
          // ensure the json data is an array
          if (!jsonObj.get("containerEnvironment").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `containerEnvironment` to be an array in the JSON string but got `%s`", jsonObj.get("containerEnvironment").toString()));
          }

          // validate the optional field `containerEnvironment` (array)
          for (int i = 0; i < jsonArraycontainerEnvironment.size(); i++) {
            ContainerEnvironmentEntryDto.validateJsonObject(jsonArraycontainerEnvironment.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("models") != null && !jsonObj.get("models").isJsonNull()) {
        JsonArray jsonArraymodels = jsonObj.getAsJsonArray("models");
        if (jsonArraymodels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("models").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `models` to be an array in the JSON string but got `%s`", jsonObj.get("models").toString()));
          }

          // validate the optional field `models` (array)
          for (int i = 0; i < jsonArraymodels.size(); i++) {
            ArtifactDto.validateJsonObject(jsonArraymodels.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("containerImage") != null && !jsonObj.get("containerImage").isJsonNull()) && !jsonObj.get("containerImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `containerImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("containerImage").toString()));
      }
      if ((jsonObj.get("helmChart") != null && !jsonObj.get("helmChart").isJsonNull()) && !jsonObj.get("helmChart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helmChart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helmChart").toString()));
      }
      if ((jsonObj.get("helmChartServiceName") != null && !jsonObj.get("helmChartServiceName").isJsonNull()) && !jsonObj.get("helmChartServiceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helmChartServiceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helmChartServiceName").toString()));
      }
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
          }

          // validate the optional field `resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            ArtifactDto.validateJsonObject(jsonArrayresources.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("apiBodyFormat") != null && !jsonObj.get("apiBodyFormat").isJsonNull()) && !jsonObj.get("apiBodyFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiBodyFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiBodyFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFunctionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFunctionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFunctionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFunctionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFunctionRequest>() {
           @Override
           public void write(JsonWriter out, CreateFunctionRequest value) throws IOException {
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
           public CreateFunctionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateFunctionRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateFunctionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFunctionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateFunctionRequest
  */
  public static CreateFunctionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFunctionRequest.class);
  }

 /**
  * Convert an instance of CreateFunctionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

