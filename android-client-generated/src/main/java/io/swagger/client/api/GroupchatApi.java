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

import io.swagger.client.model.Body6;
import io.swagger.client.model.Body7;
import io.swagger.client.model.Chat;
import io.swagger.client.model.InlineResponse20015;
import io.swagger.client.model.InlineResponse20016;
import io.swagger.client.model.InlineResponse20017;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GroupchatApi {
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
  * Favorite a specific group chat
  * 
   * @param chatId 
   * @param body 
   * @return Chat
  */
  public Chat groupChatsChatIdFavoritePut (String chatId, Body7 body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdFavoritePut",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdFavoritePut"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling groupChatsChatIdFavoritePut",
        new ApiException(400, "Missing the required parameter 'body' when calling groupChatsChatIdFavoritePut"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/favorite".replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString()));

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
         return (Chat) ApiInvoker.deserialize(localVarResponse, "", Chat.class);
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
   * Favorite a specific group chat
   * 
   * @param chatId    * @param body 
  */
  public void groupChatsChatIdFavoritePut (String chatId, Body7 body, final Response.Listener<Chat> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdFavoritePut",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdFavoritePut"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling groupChatsChatIdFavoritePut",
        new ApiException(400, "Missing the required parameter 'body' when calling groupChatsChatIdFavoritePut"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/favorite".replaceAll("\\{format\\}","json").replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString()));

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
              responseListener.onResponse((Chat) ApiInvoker.deserialize(localVarResponse,  "", Chat.class));
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
  * Add user(s) to a groupChat
  * 
   * @param userIds An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
   * @param chatId 
   * @return Chat
  */
  public Chat groupChatsChatIdJoinPut (List<String> userIds, String chatId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userIds' when calling groupChatsChatIdJoinPut",
        new ApiException(400, "Missing the required parameter 'userIds' when calling groupChatsChatIdJoinPut"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdJoinPut",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdJoinPut"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/join".replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString()));

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
      if (userIds != null) {
        localVarBuilder.addTextBody("userIds", ApiInvoker.parameterToString(userIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("userIds", ApiInvoker.parameterToString(userIds));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Chat) ApiInvoker.deserialize(localVarResponse, "", Chat.class);
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
   * Add user(s) to a groupChat
   * 
   * @param userIds An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created   * @param chatId 
  */
  public void groupChatsChatIdJoinPut (List<String> userIds, String chatId, final Response.Listener<Chat> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userIds' when calling groupChatsChatIdJoinPut",
        new ApiException(400, "Missing the required parameter 'userIds' when calling groupChatsChatIdJoinPut"));
    }
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdJoinPut",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdJoinPut"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/join".replaceAll("\\{format\\}","json").replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString()));

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
      
      if (userIds != null) {
        localVarBuilder.addTextBody("userIds", ApiInvoker.parameterToString(userIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("userIds", ApiInvoker.parameterToString(userIds));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Chat) ApiInvoker.deserialize(localVarResponse,  "", Chat.class));
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
  * Get 40 messages belonging to a group chat
  * 
   * @param chatId 
   * @param userId 
   * @param messageId Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order
   * @return InlineResponse20017
  */
  public InlineResponse20017 groupChatsChatIdUserUserIdMessagesGet (String chatId, String userId, String messageId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdUserUserIdMessagesGet",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdUserUserIdMessagesGet"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling groupChatsChatIdUserUserIdMessagesGet",
        new ApiException(400, "Missing the required parameter 'userId' when calling groupChatsChatIdUserUserIdMessagesGet"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/user/{userId}/messages".replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "messageId", messageId));
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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (InlineResponse20017) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20017.class);
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
   * Get 40 messages belonging to a group chat
   * 
   * @param chatId    * @param userId    * @param messageId Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order
  */
  public void groupChatsChatIdUserUserIdMessagesGet (String chatId, String userId, String messageId, final Response.Listener<InlineResponse20017> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'chatId' is set
    if (chatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'chatId' when calling groupChatsChatIdUserUserIdMessagesGet",
        new ApiException(400, "Missing the required parameter 'chatId' when calling groupChatsChatIdUserUserIdMessagesGet"));
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling groupChatsChatIdUserUserIdMessagesGet",
        new ApiException(400, "Missing the required parameter 'userId' when calling groupChatsChatIdUserUserIdMessagesGet"));
    }

    // create path and map variables
    String path = "/groupChats/{chatId}/user/{userId}/messages".replaceAll("\\{format\\}","json").replaceAll("\\{" + "chatId" + "\\}", apiInvoker.escapeString(chatId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "messageId", messageId));


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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((InlineResponse20017) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse20017.class));
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
  * Edit the details of a groupChat
  * 
   * @param groupChatId 
   * @param body 
   * @return InlineResponse20016
  */
  public InlineResponse20016 groupChatsGroupChatIdPut (String groupChatId, Body6 body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'groupChatId' is set
    if (groupChatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupChatId' when calling groupChatsGroupChatIdPut",
        new ApiException(400, "Missing the required parameter 'groupChatId' when calling groupChatsGroupChatIdPut"));
    }

    // create path and map variables
    String path = "/groupChats/{groupChatId}".replaceAll("\\{" + "groupChatId" + "\\}", apiInvoker.escapeString(groupChatId.toString()));

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
         return (InlineResponse20016) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20016.class);
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
   * Edit the details of a groupChat
   * 
   * @param groupChatId    * @param body 
  */
  public void groupChatsGroupChatIdPut (String groupChatId, Body6 body, final Response.Listener<InlineResponse20016> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'groupChatId' is set
    if (groupChatId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupChatId' when calling groupChatsGroupChatIdPut",
        new ApiException(400, "Missing the required parameter 'groupChatId' when calling groupChatsGroupChatIdPut"));
    }

    // create path and map variables
    String path = "/groupChats/{groupChatId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "groupChatId" + "\\}", apiInvoker.escapeString(groupChatId.toString()));

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
              responseListener.onResponse((InlineResponse20016) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse20016.class));
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
  * Create a groupChat
  * 
   * @param userIds An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
   * @param adminId The ID of the user who is creating the group chat
   * @param name The name of the group chat
   * @param mediaId If the groupChat has an image assoicated with it, the media Id can be used to create that image
   * @return InlineResponse20015
  */
  public InlineResponse20015 groupChatsPost (List<String> userIds, String adminId, String name, String mediaId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userIds' when calling groupChatsPost",
        new ApiException(400, "Missing the required parameter 'userIds' when calling groupChatsPost"));
    }
    // verify the required parameter 'adminId' is set
    if (adminId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'adminId' when calling groupChatsPost",
        new ApiException(400, "Missing the required parameter 'adminId' when calling groupChatsPost"));
    }

    // create path and map variables
    String path = "/groupChats";

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
      if (userIds != null) {
        localVarBuilder.addTextBody("userIds", ApiInvoker.parameterToString(userIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (name != null) {
        localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (adminId != null) {
        localVarBuilder.addTextBody("adminId", ApiInvoker.parameterToString(adminId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (mediaId != null) {
        localVarBuilder.addTextBody("mediaId", ApiInvoker.parameterToString(mediaId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("userIds", ApiInvoker.parameterToString(userIds));
      formParams.put("name", ApiInvoker.parameterToString(name));
      formParams.put("adminId", ApiInvoker.parameterToString(adminId));
      formParams.put("mediaId", ApiInvoker.parameterToString(mediaId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (InlineResponse20015) ApiInvoker.deserialize(localVarResponse, "", InlineResponse20015.class);
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
   * Create a groupChat
   * 
   * @param userIds An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created   * @param adminId The ID of the user who is creating the group chat   * @param name The name of the group chat   * @param mediaId If the groupChat has an image assoicated with it, the media Id can be used to create that image
  */
  public void groupChatsPost (List<String> userIds, String adminId, String name, String mediaId, final Response.Listener<InlineResponse20015> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'userIds' is set
    if (userIds == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userIds' when calling groupChatsPost",
        new ApiException(400, "Missing the required parameter 'userIds' when calling groupChatsPost"));
    }
    // verify the required parameter 'adminId' is set
    if (adminId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'adminId' when calling groupChatsPost",
        new ApiException(400, "Missing the required parameter 'adminId' when calling groupChatsPost"));
    }

    // create path and map variables
    String path = "/groupChats".replaceAll("\\{format\\}","json");

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
      
      if (userIds != null) {
        localVarBuilder.addTextBody("userIds", ApiInvoker.parameterToString(userIds), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (name != null) {
        localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (adminId != null) {
        localVarBuilder.addTextBody("adminId", ApiInvoker.parameterToString(adminId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (mediaId != null) {
        localVarBuilder.addTextBody("mediaId", ApiInvoker.parameterToString(mediaId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("userIds", ApiInvoker.parameterToString(userIds));
formParams.put("name", ApiInvoker.parameterToString(name));
formParams.put("adminId", ApiInvoker.parameterToString(adminId));
formParams.put("mediaId", ApiInvoker.parameterToString(mediaId));
    }

    String[] authNames = new String[] { "Authorization" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((InlineResponse20015) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse20015.class));
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
