# RelationshipApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationshipsPost**](RelationshipApi.md#relationshipsPost) | **POST** /relationships | Create a relationship (blocked or friends) between two users. Even if a relationship is being updated, use this route
[**relationshipsUserIdPut**](RelationshipApi.md#relationshipsUserIdPut) | **PUT** /relationships/{userId} | Change a relationship from friends to blocked or from blocked back to friends


<a name="relationshipsPost"></a>
# **relationshipsPost**
> Relationship relationshipsPost(body)

Create a relationship (blocked or friends) between two users. Even if a relationship is being updated, use this route

### Example
```java
// Import classes:
//import io.swagger.client.api.RelationshipApi;

RelationshipApi apiInstance = new RelationshipApi();
Body10 body = new Body10(); // Body10 | 
try {
    Relationship result = apiInstance.relationshipsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#relationshipsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body10**](Body10.md)|  | [optional]

### Return type

[**Relationship**](Relationship.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="relationshipsUserIdPut"></a>
# **relationshipsUserIdPut**
> Relationship relationshipsUserIdPut(userId, body)

Change a relationship from friends to blocked or from blocked back to friends

### Example
```java
// Import classes:
//import io.swagger.client.api.RelationshipApi;

RelationshipApi apiInstance = new RelationshipApi();
String userId = "userId_example"; // String | The id of the other user
Relationship body = new Relationship(); // Relationship | Send over the userId's (user_id_1 & user_id_2) and the status
try {
    Relationship result = apiInstance.relationshipsUserIdPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipApi#relationshipsUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the other user |
 **body** | [**Relationship**](Relationship.md)| Send over the userId&#39;s (user_id_1 &amp; user_id_2) and the status | [optional]

### Return type

[**Relationship**](Relationship.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

