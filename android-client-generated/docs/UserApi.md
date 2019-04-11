# UserApi

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UserApi.md#usersPost) | **POST** /users | Create a user object using a phone number.
[**usersUserIdBlockedGet**](UserApi.md#usersUserIdBlockedGet) | **GET** /users/{userId}/blocked | Get all the blocked users belonging to a specifc user.
[**usersUserIdCallsAnsweredGet**](UserApi.md#usersUserIdCallsAnsweredGet) | **GET** /users/{userId}/calls/answered | Get all answered calls.
[**usersUserIdCallsGet**](UserApi.md#usersUserIdCallsGet) | **GET** /users/{userId}/calls | Get all calls made by a specific user.
[**usersUserIdCallsNonansweredGet**](UserApi.md#usersUserIdCallsNonansweredGet) | **GET** /users/{userId}/calls/nonanswered | Get all non answered calls belonging to a user.
[**usersUserIdCheckContactsUseWhatsAppPost**](UserApi.md#usersUserIdCheckContactsUseWhatsAppPost) | **POST** /users/{userId}/check_contacts_use_whatsApp | Check if contacts are WhatApp&#39;s users
[**usersUserIdDelete**](UserApi.md#usersUserIdDelete) | **DELETE** /users/{userId} | Delete a user.
[**usersUserIdFriendsGet**](UserApi.md#usersUserIdFriendsGet) | **GET** /users/{userId}/friends | Get all the friend&#39;s belonging to this user.
[**usersUserIdGet**](UserApi.md#usersUserIdGet) | **GET** /users/{userId} | Get info on one specific user.
[**usersUserIdInviteToWhatsAppPost**](UserApi.md#usersUserIdInviteToWhatsAppPost) | **POST** /users/{userId}/invite_to_WhatsApp | Invite a contact to download WhatsApp via SMS
[**usersUserIdLeaveChatIdPut**](UserApi.md#usersUserIdLeaveChatIdPut) | **PUT** /users/{userId}/leave/{chatId} | This route is envoked when a user leaves a chat chat
[**usersUserIdMessagesDeliveredGet**](UserApi.md#usersUserIdMessagesDeliveredGet) | **GET** /users/{userId}/messages/delivered | Get all delivered messages.
[**usersUserIdMessagesFavoriteGet**](UserApi.md#usersUserIdMessagesFavoriteGet) | **GET** /users/{userId}/messages/favorite | Get all favorite messages belonging to a user.
[**usersUserIdMessagesGet**](UserApi.md#usersUserIdMessagesGet) | **GET** /users/{userId}/messages | Get all messages belonging to a specific user.
[**usersUserIdMessagesSeenGet**](UserApi.md#usersUserIdMessagesSeenGet) | **GET** /users/{userId}/messages/seen | Get all messages belonging to a user that have been seen by another user/ other users.
[**usersUserIdMessagesUnreadGet**](UserApi.md#usersUserIdMessagesUnreadGet) | **GET** /users/{userId}/messages/unread | Get all unread messages belonging to a user.
[**usersUserIdNotificationsGlobalPatch**](UserApi.md#usersUserIdNotificationsGlobalPatch) | **PATCH** /users/{userId}/notifications/global | Edit the global settings for notifications
[**usersUserIdPrivategroupChatsGet**](UserApi.md#usersUserIdPrivategroupChatsGet) | **GET** /users/{userId}/private&amp;group_chats | Get both private and group chats and calls the user is a participant of
[**usersUserIdPut**](UserApi.md#usersUserIdPut) | **PUT** /users/{userId} | Update a user


<a name="usersPost"></a>
# **usersPost**
> User usersPost(body)

Create a user object using a phone number.

 

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
User body = new User(); // User | Create a user object. Must have the parameter of phone umber in order to send the verifcation code.
try {
    User result = apiInstance.usersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| Create a user object. Must have the parameter of phone umber in order to send the verifcation code. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUserIdBlockedGet"></a>
# **usersUserIdBlockedGet**
> User usersUserIdBlockedGet(userId)

Get all the blocked users belonging to a specifc user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | The id of the user is needed to query the blocked user's of this specifc individual.
try {
    User result = apiInstance.usersUserIdBlockedGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdBlockedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user is needed to query the blocked user&#39;s of this specifc individual. |

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdCallsAnsweredGet"></a>
# **usersUserIdCallsAnsweredGet**
> InlineResponse2006 usersUserIdCallsAnsweredGet(userId)

Get all answered calls.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.usersUserIdCallsAnsweredGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdCallsAnsweredGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdCallsGet"></a>
# **usersUserIdCallsGet**
> usersUserIdCallsGet(userId)

Get all calls made by a specific user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    apiInstance.usersUserIdCallsGet(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdCallsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdCallsNonansweredGet"></a>
# **usersUserIdCallsNonansweredGet**
> InlineResponse2005 usersUserIdCallsNonansweredGet(userId)

Get all non answered calls belonging to a user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2005 result = apiInstance.usersUserIdCallsNonansweredGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdCallsNonansweredGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdCheckContactsUseWhatsAppPost"></a>
# **usersUserIdCheckContactsUseWhatsAppPost**
> InlineResponse2008 usersUserIdCheckContactsUseWhatsAppPost(userId, returnUserInfo, body)

Check if contacts are WhatApp&#39;s users

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
String returnUserInfo = "returnUserInfo_example"; // String | if returnUserInfo is set to true, all the info about the user will be sent back.
List<Body1> body = Arrays.asList(new Body1()); // List<Body1> | 
try {
    InlineResponse2008 result = apiInstance.usersUserIdCheckContactsUseWhatsAppPost(userId, returnUserInfo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdCheckContactsUseWhatsAppPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **returnUserInfo** | **String**| if returnUserInfo is set to true, all the info about the user will be sent back. | [optional]
 **body** | [**List&lt;Body1&gt;**](Body1.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdDelete"></a>
# **usersUserIdDelete**
> String usersUserIdDelete(userId)

Delete a user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | Delete a user. Place the ID of the user you wish to delete in the path.
try {
    String result = apiInstance.usersUserIdDelete(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Delete a user. Place the ID of the user you wish to delete in the path. |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdFriendsGet"></a>
# **usersUserIdFriendsGet**
> User usersUserIdFriendsGet(userId)

Get all the friend&#39;s belonging to this user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | Get all the friend's belonging to this user.
try {
    User result = apiInstance.usersUserIdFriendsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdFriendsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| Get all the friend&#39;s belonging to this user. |

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdGet"></a>
# **usersUserIdGet**
> InlineResponse200 usersUserIdGet(userId, currentUserId)

Get info on one specific user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | The userId of a specific user.
String currentUserId = "currentUserId_example"; // String | When querying for a specific user to display user info.
try {
    InlineResponse200 result = apiInstance.usersUserIdGet(userId, currentUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The userId of a specific user. |
 **currentUserId** | **String**| When querying for a specific user to display user info. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdInviteToWhatsAppPost"></a>
# **usersUserIdInviteToWhatsAppPost**
> InlineResponse2009 usersUserIdInviteToWhatsAppPost(userId, body)

Invite a contact to download WhatsApp via SMS

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
List<Body2> body = Arrays.asList(new Body2()); // List<Body2> | 
try {
    InlineResponse2009 result = apiInstance.usersUserIdInviteToWhatsAppPost(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdInviteToWhatsAppPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**List&lt;Body2&gt;**](Body2.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdLeaveChatIdPut"></a>
# **usersUserIdLeaveChatIdPut**
> UserChats usersUserIdLeaveChatIdPut(userId, chatId)

This route is envoked when a user leaves a chat chat

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
String chatId = "chatId_example"; // String | 
try {
    UserChats result = apiInstance.usersUserIdLeaveChatIdPut(userId, chatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdLeaveChatIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **chatId** | **String**|  |

### Return type

[**UserChats**](UserChats.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdMessagesDeliveredGet"></a>
# **usersUserIdMessagesDeliveredGet**
> InlineResponse2002 usersUserIdMessagesDeliveredGet(userId)

Get all delivered messages.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.usersUserIdMessagesDeliveredGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdMessagesDeliveredGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdMessagesFavoriteGet"></a>
# **usersUserIdMessagesFavoriteGet**
> InlineResponse2004 usersUserIdMessagesFavoriteGet(userId)

Get all favorite messages belonging to a user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.usersUserIdMessagesFavoriteGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdMessagesFavoriteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdMessagesGet"></a>
# **usersUserIdMessagesGet**
> Message usersUserIdMessagesGet(userId)

Get all messages belonging to a specific user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    Message result = apiInstance.usersUserIdMessagesGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdMessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**Message**](Message.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdMessagesSeenGet"></a>
# **usersUserIdMessagesSeenGet**
> InlineResponse2003 usersUserIdMessagesSeenGet(userId)

Get all messages belonging to a user that have been seen by another user/ other users.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.usersUserIdMessagesSeenGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdMessagesSeenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdMessagesUnreadGet"></a>
# **usersUserIdMessagesUnreadGet**
> InlineResponse2001 usersUserIdMessagesUnreadGet(userId)

Get all unread messages belonging to a user.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.usersUserIdMessagesUnreadGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdMessagesUnreadGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdNotificationsGlobalPatch"></a>
# **usersUserIdNotificationsGlobalPatch**
> User usersUserIdNotificationsGlobalPatch(userId, unread, delivered, seen, nonanswered)

Edit the global settings for notifications

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
String unread = "unread_example"; // String | This query parameter can either be set to true or false
String delivered = "delivered_example"; // String | This query parameter can either be set to true or false
String seen = "seen_example"; // String | This query parameter can either be set to true or false
String nonanswered = "nonanswered_example"; // String | This query parameter can either be set to true or false
try {
    User result = apiInstance.usersUserIdNotificationsGlobalPatch(userId, unread, delivered, seen, nonanswered);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdNotificationsGlobalPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **unread** | **String**| This query parameter can either be set to true or false | [optional]
 **delivered** | **String**| This query parameter can either be set to true or false | [optional]
 **seen** | **String**| This query parameter can either be set to true or false | [optional]
 **nonanswered** | **String**| This query parameter can either be set to true or false | [optional]

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdPrivategroupChatsGet"></a>
# **usersUserIdPrivategroupChatsGet**
> InlineResponse2007 usersUserIdPrivategroupChatsGet(userId)

Get both private and group chats and calls the user is a participant of

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.usersUserIdPrivategroupChatsGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdPrivategroupChatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usersUserIdPut"></a>
# **usersUserIdPut**
> User usersUserIdPut(userId, body)

Update a user

Add the mediaId in the body for the user&#39;s avatar to be updated

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | The id of the user is used to target the specific user the developer wishes to edit. The variable name of the response is users.
Body body = new Body(); // Body | Edit the user with values found in the request body.
try {
    User result = apiInstance.usersUserIdPut(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#usersUserIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| The id of the user is used to target the specific user the developer wishes to edit. The variable name of the response is users. |
 **body** | [**Body**](Body.md)| Edit the user with values found in the request body. | [optional]

### Return type

[**User**](User.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

