# AuthApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authResendPost**](AuthApi.md#authResendPost) | **POST** /auth/resend | Resend another verifcation code to the user
[**authVerifyPost**](AuthApi.md#authVerifyPost) | **POST** /auth/verify | The user will input verifaction code and if it is the correct code, a JSON web token will be returned


<a name="authResendPost"></a>
# **authResendPost**
> InlineResponse20011 authResendPost(body)

Resend another verifcation code to the user

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthApi;

AuthApi apiInstance = new AuthApi();
Body4 body = new Body4(); // Body4 | Send another verication code
try {
    InlineResponse20011 result = apiInstance.authResendPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authResendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body4**](Body4.md)| Send another verication code | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authVerifyPost"></a>
# **authVerifyPost**
> InlineResponse20010 authVerifyPost(body)

The user will input verifaction code and if it is the correct code, a JSON web token will be returned

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthApi;

AuthApi apiInstance = new AuthApi();
Body3 body = new Body3(); // Body3 | Verify the passcode the user was sent.
try {
    InlineResponse20010 result = apiInstance.authVerifyPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authVerifyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body3**](Body3.md)| Verify the passcode the user was sent. | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

