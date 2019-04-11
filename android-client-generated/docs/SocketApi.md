# SocketApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**socketUserEnteredWhatsAppPost**](SocketApi.md#socketUserEnteredWhatsAppPost) | **POST** /socket/user-entered-WhatsApp | When a user enters WhatsApp, emit the socket function &#39;user-entered-WhatsApp&#39;. The server will then emit new-and-updated-data


<a name="socketUserEnteredWhatsAppPost"></a>
# **socketUserEnteredWhatsAppPost**
> InlineResponse20022 socketUserEnteredWhatsAppPost()

When a user enters WhatsApp, emit the socket function &#39;user-entered-WhatsApp&#39;. The server will then emit new-and-updated-data

### Example
```java
// Import classes:
//import io.swagger.client.api.SocketApi;

SocketApi apiInstance = new SocketApi();
try {
    InlineResponse20022 result = apiInstance.socketUserEnteredWhatsAppPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocketApi#socketUserEnteredWhatsAppPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

