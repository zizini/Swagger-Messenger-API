/**
 * Whats App API
 * Whats App API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: irma.tabakis@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Body8;
import io.swagger.client.model.Body9;
import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.Message;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class MessageApi {
  String basePath = "https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Send a message with a file or files
  * 
   * @param file Even if only one file is being, must be sent in an array. This format allows the server to easily handle when multiple files are being sent
   * @param userId 
   * @param chatId 
   * @param message 
   * @return Message
  */
  public Message messagesFilePost (List<String> file, String userId, String chatId, String message) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'file' when calling messagesFilePost"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesFilePost"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'chatId' when calling messagesFilePost"));
    }

    // create path and map variables
    String path = "/messages/file";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (file != null) {
        localVarBuilder.addTextBody("file", ApiInvoker.parameterToString(file), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (message != null) {
        localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (userId != null) {
        localVarBuilder.addTextBody("userId", ApiInvoker.parameterToString(userId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (chatId != null) {
        localVarBuilder.addTextBody("chatId", ApiInvoker.parameterToString(chatId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("file", ApiInvoker.parameterToString(file));
      formParams.put("message", ApiInvoker.parameterToString(message));
      formParams.put("userId", ApiInvoker.parameterToString(userId));
      formParams.put("chatId", ApiInvoker.parameterToString(chatId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Message) ApiInvoker.deserialize(localVarResponse, "", Message.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Send a message with a file or files
   * 
   * @param file Even if only one file is being, must be sent in an array. This format allows the server to easily handle when multiple files are being sent   * @param userId    * @param chatId    * @param message 
  */
  public void messagesFilePost (List<String> file, String userId, String chatId, String message, final Response.Listener<Message> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'file' when calling messagesFilePost"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesFilePost"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling messagesFilePost",
        new ApiException(400, "Missing the required parameter 'chatId' when calling messagesFilePost"));
    }

    // create path and map variables
    String path = "/messages/file".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (file != null) {
        localVarBuilder.addTextBody("file", ApiInvoker.parameterToString(file), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (message != null) {
        localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (userId != null) {
        localVarBuilder.addTextBody("userId", ApiInvoker.parameterToString(userId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (chatId != null) {
        localVarBuilder.addTextBody("chatId", ApiInvoker.parameterToString(chatId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("file", ApiInvoker.parameterToString(file));
formParams.put("message", ApiInvoker.parameterToString(message));
formParams.put("userId", ApiInvoker.parameterToString(userId));
formParams.put("chatId", ApiInvoker.parameterToString(chatId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Message) ApiInvoker.deserialize(localVarResponse,  "", Message.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Send a message with a file attatched
  * 
   * @param file  
   * @param userId 
   * @param chatId 
   * @param message 
   * @return Message
  */
  public Message messagesMediaPost (List<String> file, String userId, String chatId, String message) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'file' when calling messagesMediaPost"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesMediaPost"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'chatId' when calling messagesMediaPost"));
    }

    // create path and map variables
    String path = "/messages/media";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (file != null) {
        localVarBuilder.addTextBody("file", ApiInvoker.parameterToString(file), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (message != null) {
        localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (userId != null) {
        localVarBuilder.addTextBody("userId", ApiInvoker.parameterToString(userId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (chatId != null) {
        localVarBuilder.addTextBody("chatId", ApiInvoker.parameterToString(chatId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("file", ApiInvoker.parameterToString(file));
      formParams.put("message", ApiInvoker.parameterToString(message));
      formParams.put("userId", ApiInvoker.parameterToString(userId));
      formParams.put("chatId", ApiInvoker.parameterToString(chatId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Message) ApiInvoker.deserialize(localVarResponse, "", Message.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Send a message with a file attatched
   * 
   * @param file     * @param userId    * @param chatId    * @param message 
  */
  public void messagesMediaPost (List<String> file, String userId, String chatId, String message, final Response.Listener<Message> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'file' is set
    if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'file' when calling messagesMediaPost"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesMediaPost"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling messagesMediaPost",
        new ApiException(400, "Missing the required parameter 'chatId' when calling messagesMediaPost"));
    }

    // create path and map variables
    String path = "/messages/media".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (file != null) {
        localVarBuilder.addTextBody("file", ApiInvoker.parameterToString(file), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (message != null) {
        localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (userId != null) {
        localVarBuilder.addTextBody("userId", ApiInvoker.parameterToString(userId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (chatId != null) {
        localVarBuilder.addTextBody("chatId", ApiInvoker.parameterToString(chatId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("file", ApiInvoker.parameterToString(file));
formParams.put("message", ApiInvoker.parameterToString(message));
formParams.put("userId", ApiInvoker.parameterToString(userId));
formParams.put("chatId", ApiInvoker.parameterToString(chatId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Message) ApiInvoker.deserialize(localVarResponse,  "", Message.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Edit (patch) a particular message
  * 
   * @param messageId The ID of the message one wishes to edit (patch)
   * @param body 
   * @return Message
  */
  public Message messagesMessageIdPut (String messageId, Body9 body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'messageId' when calling messagesMessageIdPut",
        new ApiException(400, "Missing the required parameter 'messageId' when calling messagesMessageIdPut"));
    }

    // create path and map variables
    String path = "/messages/{messageId}".replaceAll("\\{" + "messageId" + "\\}", apiInvoker.escapeString(messageId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Message) ApiInvoker.deserialize(localVarResponse, "", Message.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Edit (patch) a particular message
   * 
   * @param messageId The ID of the message one wishes to edit (patch)   * @param body 
  */
  public void messagesMessageIdPut (String messageId, Body9 body, final Response.Listener<Message> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'messageId' when calling messagesMessageIdPut",
        new ApiException(400, "Missing the required parameter 'messageId' when calling messagesMessageIdPut"));
    }

    // create path and map variables
    String path = "/messages/{messageId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "messageId" + "\\}", apiInvoker.escapeString(messageId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Message) ApiInvoker.deserialize(localVarResponse,  "", Message.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * delete a message
  * 
   * @param messageId The ID of the message one wishes to edit (patch)
   * @param userId 
   * @return InlineResponse20018
  */
  public InlineResponse20018 messagesMessageIdUserUserIdDelete (String messageId, String userId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'messageId' when calling messagesMessageIdUserUserIdDelete",
        new ApiException(400, "Missing the required parameter 'messageId' when calling messagesMessageIdUserUserIdDelete"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesMessageIdUserUserIdDelete",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesMessageIdUserUserIdDelete"));
    }

    // create path and map variables
    String path = "/messages/{messageId}/user/{userId}".replaceAll("\\{" + "messageId" + "\\}", apiInvoker.escapeString(messageId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (InlineResponse20018) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20018.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * delete a message
   * 
   * @param messageId The ID of the message one wishes to edit (patch)   * @param userId 
  */
  public void messagesMessageIdUserUserIdDelete (String messageId, String userId, final Response.Listener<InlineResponse20018> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'messageId' when calling messagesMessageIdUserUserIdDelete",
        new ApiException(400, "Missing the required parameter 'messageId' when calling messagesMessageIdUserUserIdDelete"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling messagesMessageIdUserUserIdDelete",
        new ApiException(400, "Missing the required parameter 'userId' when calling messagesMessageIdUserUserIdDelete"));
    }

    // create path and map variables
    String path = "/messages/{messageId}/user/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "messageId" + "\\}", apiInvoker.escapeString(messageId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((InlineResponse20018) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse20018.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create a message with no image attached to the message
  * 
   * @param post  
   * @param body 
   * @return Message
  */
  public Message messagesStringPost (Boolean post, Body8 body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;

    // create path and map variables
    String path = "/messages/string";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "post", post));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Authorization", "Socket" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Message) ApiInvoker.deserialize(localVarResponse, "", Message.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create a message with no image attached to the message
   * 
   * @param post     * @param body 
  */
  public void messagesStringPost (Boolean post, Body8 body, final Response.Listener<Message> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;


    // create path and map variables
    String path = "/messages/string".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "post", post));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Authorization", "Socket" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Message) ApiInvoker.deserialize(localVarResponse,  "", Message.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
