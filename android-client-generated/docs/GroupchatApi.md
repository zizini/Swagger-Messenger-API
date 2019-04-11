# GroupchatApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupChatsChatIdFavoritePut**](GroupchatApi.md#groupChatsChatIdFavoritePut) | **PUT** /groupChats/{chatId}/favorite | Favorite a specific group chat
[**groupChatsChatIdJoinPut**](GroupchatApi.md#groupChatsChatIdJoinPut) | **PUT** /groupChats/{chatId}/join | Add user(s) to a groupChat
[**groupChatsChatIdUserUserIdMessagesGet**](GroupchatApi.md#groupChatsChatIdUserUserIdMessagesGet) | **GET** /groupChats/{chatId}/user/{userId}/messages | Get 40 messages belonging to a group chat
[**groupChatsGroupChatIdPut**](GroupchatApi.md#groupChatsGroupChatIdPut) | **PUT** /groupChats/{groupChatId} | Edit the details of a groupChat
[**groupChatsPost**](GroupchatApi.md#groupChatsPost) | **POST** /groupChats | Create a groupChat


<a name="groupChatsChatIdFavoritePut"></a>
# **groupChatsChatIdFavoritePut**
> Chat groupChatsChatIdFavoritePut(chatId, body)

Favorite a specific group chat

### Example
```java
// Import classes:
//import io.swagger.client.api.GroupchatApi;

GroupchatApi apiInstance = new GroupchatApi();
String chatId = "chatId_example"; // String | 
Body7 body = new Body7(); // Body7 | 
try {
    Chat result = apiInstance.groupChatsChatIdFavoritePut(chatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupchatApi#groupChatsChatIdFavoritePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |
 **body** | [**Body7**](Body7.md)|  |

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupChatsChatIdJoinPut"></a>
# **groupChatsChatIdJoinPut**
> Chat groupChatsChatIdJoinPut(userIds, chatId)

Add user(s) to a groupChat

### Example
```java
// Import classes:
//import io.swagger.client.api.GroupchatApi;

GroupchatApi apiInstance = new GroupchatApi();
List<String> userIds = Arrays.asList("userIds_example"); // List<String> | An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
String chatId = "chatId_example"; // String | 
try {
    Chat result = apiInstance.groupChatsChatIdJoinPut(userIds, chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupchatApi#groupChatsChatIdJoinPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**List&lt;String&gt;**](String.md)| An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created |
 **chatId** | **String**|  |

### Return type

[**Chat**](Chat.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="groupChatsChatIdUserUserIdMessagesGet"></a>
# **groupChatsChatIdUserUserIdMessagesGet**
> InlineResponse20017 groupChatsChatIdUserUserIdMessagesGet(chatId, userId, messageId)

Get 40 messages belonging to a group chat

### Example
```java
// Import classes:
//import io.swagger.client.api.GroupchatApi;

GroupchatApi apiInstance = new GroupchatApi();
String chatId = "chatId_example"; // String | 
String userId = "userId_example"; // String | 
String messageId = "messageId_example"; // String | Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order
try {
    InlineResponse20017 result = apiInstance.groupChatsChatIdUserUserIdMessagesGet(chatId, userId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupchatApi#groupChatsChatIdUserUserIdMessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  |
 **userId** | **String**|  |
 **messageId** | **String**| Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupChatsGroupChatIdPut"></a>
# **groupChatsGroupChatIdPut**
> InlineResponse20016 groupChatsGroupChatIdPut(groupChatId, body)

Edit the details of a groupChat

### Example
```java
// Import classes:
//import io.swagger.client.api.GroupchatApi;

GroupchatApi apiInstance = new GroupchatApi();
String groupChatId = "groupChatId_example"; // String | 
Body6 body = new Body6(); // Body6 | 
try {
    InlineResponse20016 result = apiInstance.groupChatsGroupChatIdPut(groupChatId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupchatApi#groupChatsGroupChatIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupChatId** | **String**|  |
 **body** | [**Body6**](Body6.md)|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="groupChatsPost"></a>
# **groupChatsPost**
> InlineResponse20015 groupChatsPost(userIds, adminId, name, mediaId)

Create a groupChat

### Example
```java
// Import classes:
//import io.swagger.client.api.GroupchatApi;

GroupchatApi apiInstance = new GroupchatApi();
List<String> userIds = Arrays.asList("userIds_example"); // List<String> | An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
String adminId = "adminId_example"; // String | The ID of the user who is creating the group chat
String name = "name_example"; // String | The name of the group chat
String mediaId = "mediaId_example"; // String | If the groupChat has an image assoicated with it, the media Id can be used to create that image
try {
    InlineResponse20015 result = apiInstance.groupChatsPost(userIds, adminId, name, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupchatApi#groupChatsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**List&lt;String&gt;**](String.md)| An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created |
 **adminId** | **String**| The ID of the user who is creating the group chat |
 **name** | **String**| The name of the group chat | [optional]
 **mediaId** | **String**| If the groupChat has an image assoicated with it, the media Id can be used to create that image | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

