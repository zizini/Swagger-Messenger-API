# PrivatechatApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**privateChatsChatIdDelete**](PrivatechatApi.md#privateChatsChatIdDelete) | **DELETE** /privateChats/{chatId} | Delete a private chat
[**privateChatsChatIdFavoritePut**](PrivatechatApi.md#privateChatsChatIdFavoritePut) | **PUT** /privateChats/{chatId}/favorite | Favorite a specific private chat
[**privateChatsChatIdUserUserIdMessagesGet**](PrivatechatApi.md#privateChatsChatIdUserUserIdMessagesGet) | **GET** /privateChats/{chatId}/user/{userId}/messages | Get 40 messages belonging to a private chat.
[**privateChatsPost**](PrivatechatApi.md#privateChatsPost) | **POST** /privateChats | Create a private chat between two users


<a name="privateChatsChatIdDelete"></a>
# **privateChatsChatIdDelete**
> Chat privateChatsChatIdDelete(chatId)

Delete a private chat

### Example
```java
// Import classes:
//import io.swagger.client.api.PrivatechatApi;

PrivatechatApi apiInstance = new PrivatechatApi();
String chatId = "chatId_example"; // String | The ID of a specific chat
try {
    Chat result = apiInstance.privateChatsChatIdDelete(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivatechatApi#privateChatsChatIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**| The ID of a specific chat |

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="privateChatsChatIdFavoritePut"></a>
# **privateChatsChatIdFavoritePut**
> Chat privateChatsChatIdFavoritePut(chatId, body)

Favorite a specific private chat

### Example
```java
// Import classes:
//import io.swagger.client.api.PrivatechatApi;

PrivatechatApi apiInstance = new PrivatechatApi();
String chatId = "chatId_example"; // String | 
Body5 body = new Body5(); // Body5 | 
try {
    Chat result = apiInstance.privateChatsChatIdFavoritePut(chatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivatechatApi#privateChatsChatIdFavoritePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |
 **body** | [**Body5**](Body5.md)|  |

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="privateChatsChatIdUserUserIdMessagesGet"></a>
# **privateChatsChatIdUserUserIdMessagesGet**
> InlineResponse20014 privateChatsChatIdUserUserIdMessagesGet(userId, chatId, messageId)

Get 40 messages belonging to a private chat.

### Example
```java
// Import classes:
//import io.swagger.client.api.PrivatechatApi;

PrivatechatApi apiInstance = new PrivatechatApi();
String userId = "userId_example"; // String | 
String chatId = "chatId_example"; // String | 
String messageId = "messageId_example"; // String | Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order
try {
    InlineResponse20014 result = apiInstance.privateChatsChatIdUserUserIdMessagesGet(userId, chatId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivatechatApi#privateChatsChatIdUserUserIdMessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **chatId** | **String**|  |
 **messageId** | **String**| Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="privateChatsPost"></a>
# **privateChatsPost**
> Chat privateChatsPost(userIds)

Create a private chat between two users

### Example
```java
// Import classes:
//import io.swagger.client.api.PrivatechatApi;

PrivatechatApi apiInstance = new PrivatechatApi();
List<String> userIds = Arrays.asList("userIds_example"); // List<String> | Only two userIds can be sent for this endpoint due to the fact that you are creating a private chat
try {
    Chat result = apiInstance.privateChatsPost(userIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivatechatApi#privateChatsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**List&lt;String&gt;**](String.md)| Only two userIds can be sent for this endpoint due to the fact that you are creating a private chat | [optional]

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization), [Socket](../README.md#Socket)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

