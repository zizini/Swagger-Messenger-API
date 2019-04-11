# MediaApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaMediaIdDelete**](MediaApi.md#mediaMediaIdDelete) | **DELETE** /media/{mediaId} | Delete a media object.
[**mediaPost**](MediaApi.md#mediaPost) | **POST** /media | Upload a file
[**mediaSharedUserId1UserId2Get**](MediaApi.md#mediaSharedUserId1UserId2Get) | **GET** /media/shared/{userId1}/{userId2} | Get all media which two user&#39;s have shared between each other


<a name="mediaMediaIdDelete"></a>
# **mediaMediaIdDelete**
> Media mediaMediaIdDelete(mediaId)

Delete a media object.

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | The ID of the specific media object the developer wishes to delete
try {
    Media result = apiInstance.mediaMediaIdDelete(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaMediaIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| The ID of the specific media object the developer wishes to delete |

### Return type

[**Media**](Media.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="mediaPost"></a>
# **mediaPost**
> InlineResponse20012 mediaPost(file)

Upload a file

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String file = "file_example"; // String | The file which is being uploaded
try {
    InlineResponse20012 result = apiInstance.mediaPost(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**| The file which is being uploaded |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="mediaSharedUserId1UserId2Get"></a>
# **mediaSharedUserId1UserId2Get**
> InlineResponse20013 mediaSharedUserId1UserId2Get(userId1, userId2)

Get all media which two user&#39;s have shared between each other

### Example
```java
// Import classes:
//import io.swagger.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String userId1 = "userId1_example"; // String | 
String userId2 = "userId2_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.mediaSharedUserId1UserId2Get(userId1, userId2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaSharedUserId1UserId2Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId1** | **String**|  |
 **userId2** | **String**|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

