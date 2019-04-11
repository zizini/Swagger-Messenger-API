# MessageApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messagesFilePost**](MessageApi.md#messagesFilePost) | **POST** /messages/file | Send a message with a file or files
[**messagesMediaPost**](MessageApi.md#messagesMediaPost) | **POST** /messages/media | Send a message with a file attatched
[**messagesMessageIdPut**](MessageApi.md#messagesMessageIdPut) | **PUT** /messages/{messageId} | Edit (patch) a particular message
[**messagesMessageIdUserUserIdDelete**](MessageApi.md#messagesMessageIdUserUserIdDelete) | **DELETE** /messages/{messageId}/user/{userId} | delete a message
[**messagesStringPost**](MessageApi.md#messagesStringPost) | **POST** /messages/string | Create a message with no image attached to the message


<a name="messagesFilePost"></a>
# **messagesFilePost**
> Message messagesFilePost(file, userId, chatId, message)

Send a message with a file or files

### Example
```java
// Import classes:
//import io.swagger.client.api.MessageApi;

MessageApi apiInstance = new MessageApi();
List<String> file = Arrays.asList("file_example"); // List<String> | Even if only one file is being, must be sent in an array. This format allows the server to easily handle when multiple files are being sent
String userId = "userId_example"; // String | 
String chatId = "chatId_example"; // String | 
String message = "message_example"; // String | 
try {
    Message result = apiInstance.messagesFilePost(file, userId, chatId, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#messagesFilePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**List&lt;String&gt;**](String.md)| Even if only one file is being, must be sent in an array. This format allows the server to easily handle when multiple files are being sent |
 **userId** | **String**|  |
 **chatId** | **String**|  |
 **message** | **String**|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="messagesMediaPost"></a>
# **messagesMediaPost**
> Message messagesMediaPost(file, userId, chatId, message)

Send a message with a file attatched

### Example
```java
// Import classes:
//import io.swagger.client.api.MessageApi;

MessageApi apiInstance = new MessageApi();
List<String> file = Arrays.asList("file_example"); // List<String> |  
String userId = "userId_example"; // String | 
String chatId = "chatId_example"; // String | 
String message = "message_example"; // String | 
try {
    Message result = apiInstance.messagesMediaPost(file, userId, chatId, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#messagesMediaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**List&lt;String&gt;**](String.md)|   |
 **userId** | **String**|  |
 **chatId** | **String**|  |
 **message** | **String**|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="messagesMessageIdPut"></a>
# **messagesMessageIdPut**
> Message messagesMessageIdPut(messageId, body)

Edit (patch) a particular message

### Example
```java
// Import classes:
//import io.swagger.client.api.MessageApi;

MessageApi apiInstance = new MessageApi();
String messageId = "messageId_example"; // String | The ID of the message one wishes to edit (patch)
Body9 body = new Body9(); // Body9 | 
try {
    Message result = apiInstance.messagesMessageIdPut(messageId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#messagesMessageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| The ID of the message one wishes to edit (patch) |
 **body** | [**Body9**](Body9.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="messagesMessageIdUserUserIdDelete"></a>
# **messagesMessageIdUserUserIdDelete**
> InlineResponse20018 messagesMessageIdUserUserIdDelete(messageId, userId)

delete a message

### Example
```java
// Import classes:
//import io.swagger.client.api.MessageApi;

MessageApi apiInstance = new MessageApi();
String messageId = "messageId_example"; // String | The ID of the message one wishes to edit (patch)
String userId = "userId_example"; // String | 
try {
    InlineResponse20018 result = apiInstance.messagesMessageIdUserUserIdDelete(messageId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#messagesMessageIdUserUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| The ID of the message one wishes to edit (patch) |
 **userId** | **String**|  |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="messagesStringPost"></a>
# **messagesStringPost**
> Message messagesStringPost(post, body)

Create a message with no image attached to the message

### Example
```java
// Import classes:
//import io.swagger.client.api.MessageApi;

MessageApi apiInstance = new MessageApi();
Boolean post = true; // Boolean |  
Body8 body = new Body8(); // Body8 | 
try {
    Message result = apiInstance.messagesStringPost(post, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#messagesStringPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**|   | [optional]
 **body** | [**Body8**](Body8.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization), [Socket](../README.md#Socket)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

