# CallApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callEndsPost**](CallApi.md#callEndsPost) | **POST** /call/ends | New call starts.
[**callStartsPost**](CallApi.md#callStartsPost) | **POST** /call/starts | New call starts.


<a name="callEndsPost"></a>
# **callEndsPost**
> Message callEndsPost(post, body)

New call starts.

### Example
```java
// Import classes:
//import io.swagger.client.api.CallApi;

CallApi apiInstance = new CallApi();
Boolean post = true; // Boolean | If post is set to true, a call starts that needs to be added to the DB.
Body12 body = new Body12(); // Body12 | 
try {
    Message result = apiInstance.callEndsPost(post, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callEndsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**| If post is set to true, a call starts that needs to be added to the DB. |
 **body** | [**Body12**](Body12.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization), [Socket](../README.md#Socket)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callStartsPost"></a>
# **callStartsPost**
> Message callStartsPost(post, body)

New call starts.

### Example
```java
// Import classes:
//import io.swagger.client.api.CallApi;

CallApi apiInstance = new CallApi();
Boolean post = true; // Boolean | If post is set to true, a call starts that needs to be added to the DB.
Body11 body = new Body11(); // Body11 | 
try {
    Message result = apiInstance.callStartsPost(post, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallApi#callStartsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **Boolean**| If post is set to true, a call starts that needs to be added to the DB. |
 **body** | [**Body11**](Body11.md)|  | [optional]

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization), [Socket](../README.md#Socket)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

