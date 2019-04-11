# ChatApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatChatIdFileGet**](ChatApi.md#chatChatIdFileGet) | **GET** /chat/{chatId}/file | Get all files belonging to a specific chat
[**chatChatIdGet**](ChatApi.md#chatChatIdGet) | **GET** /chat/{chatId} | Get a chat by ID
[**chatChatIdMediaGet**](ChatApi.md#chatChatIdMediaGet) | **GET** /chat/{chatId}/media | Returns all the media files shared in a chat
[**chatChatIdUserUserIdNotificationsPut**](ChatApi.md#chatChatIdUserUserIdNotificationsPut) | **PUT** /chat/{chatId}/user/{userId}/notifications | Edit the notifications a user can receive from a chat


<a name="chatChatIdFileGet"></a>
# **chatChatIdFileGet**
> InlineResponse20019 chatChatIdFileGet(chatId)

Get all files belonging to a specific chat

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String chatId = "chatId_example"; // String | 
try {
    InlineResponse20019 result = apiInstance.chatChatIdFileGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatChatIdFileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chatChatIdGet"></a>
# **chatChatIdGet**
> Chat chatChatIdGet(chatId)

Get a chat by ID

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String chatId = "chatId_example"; // String | 
try {
    Chat result = apiInstance.chatChatIdGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatChatIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chatChatIdMediaGet"></a>
# **chatChatIdMediaGet**
> InlineResponse20020 chatChatIdMediaGet(chatId)

Returns all the media files shared in a chat

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String chatId = "chatId_example"; // String | 
try {
    InlineResponse20020 result = apiInstance.chatChatIdMediaGet(chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatChatIdMediaGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="chatChatIdUserUserIdNotificationsPut"></a>
# **chatChatIdUserUserIdNotificationsPut**
> InlineResponse20021 chatChatIdUserUserIdNotificationsPut(chatId, userId, userAddedNotifications, messageNotifications)

Edit the notifications a user can receive from a chat

### Example
```java
// Import classes:
//import io.swagger.client.api.ChatApi;

ChatApi apiInstance = new ChatApi();
String chatId = "chatId_example"; // String | 
String userId = "userId_example"; // String | 
Boolean userAddedNotifications = true; // Boolean | 
Boolean messageNotifications = true; // Boolean | 
try {
    InlineResponse20021 result = apiInstance.chatChatIdUserUserIdNotificationsPut(chatId, userId, userAddedNotifications, messageNotifications);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#chatChatIdUserUserIdNotificationsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |
 **userId** | **String**|  |
 **userAddedNotifications** | **Boolean**|  | [optional]
 **messageNotifications** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

