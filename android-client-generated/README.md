# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AuthApi;

public class AuthApiExample {

    public static void main(String[] args) {
        AuthApi apiInstance = new AuthApi();
        Body4 body = new Body4(); // Body4 | Send another verication code
        try {
            InlineResponse20011 result = apiInstance.authResendPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#authResendPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/asterakia/WhatsApp/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**authResendPost**](docs/AuthApi.md#authResendPost) | **POST** /auth/resend | Resend another verifcation code to the user
*AuthApi* | [**authVerifyPost**](docs/AuthApi.md#authVerifyPost) | **POST** /auth/verify | The user will input verifaction code and if it is the correct code, a JSON web token will be returned
*CallApi* | [**callEndsPost**](docs/CallApi.md#callEndsPost) | **POST** /call/ends | New call starts.
*CallApi* | [**callStartsPost**](docs/CallApi.md#callStartsPost) | **POST** /call/starts | New call starts.
*ChatApi* | [**chatChatIdFileGet**](docs/ChatApi.md#chatChatIdFileGet) | **GET** /chat/{chatId}/file | Get all files belonging to a specific chat
*ChatApi* | [**chatChatIdGet**](docs/ChatApi.md#chatChatIdGet) | **GET** /chat/{chatId} | Get a chat by ID
*ChatApi* | [**chatChatIdMediaGet**](docs/ChatApi.md#chatChatIdMediaGet) | **GET** /chat/{chatId}/media | Returns all the media files shared in a chat
*ChatApi* | [**chatChatIdUserUserIdNotificationsPut**](docs/ChatApi.md#chatChatIdUserUserIdNotificationsPut) | **PUT** /chat/{chatId}/user/{userId}/notifications | Edit the notifications a user can receive from a chat
*GroupchatApi* | [**groupChatsChatIdFavoritePut**](docs/GroupchatApi.md#groupChatsChatIdFavoritePut) | **PUT** /groupChats/{chatId}/favorite | Favorite a specific group chat
*GroupchatApi* | [**groupChatsChatIdJoinPut**](docs/GroupchatApi.md#groupChatsChatIdJoinPut) | **PUT** /groupChats/{chatId}/join | Add user(s) to a groupChat
*GroupchatApi* | [**groupChatsChatIdUserUserIdMessagesGet**](docs/GroupchatApi.md#groupChatsChatIdUserUserIdMessagesGet) | **GET** /groupChats/{chatId}/user/{userId}/messages | Get 40 messages belonging to a group chat
*GroupchatApi* | [**groupChatsGroupChatIdPut**](docs/GroupchatApi.md#groupChatsGroupChatIdPut) | **PUT** /groupChats/{groupChatId} | Edit the details of a groupChat
*GroupchatApi* | [**groupChatsPost**](docs/GroupchatApi.md#groupChatsPost) | **POST** /groupChats | Create a groupChat
*MediaApi* | [**mediaMediaIdDelete**](docs/MediaApi.md#mediaMediaIdDelete) | **DELETE** /media/{mediaId} | Delete a media object.
*MediaApi* | [**mediaPost**](docs/MediaApi.md#mediaPost) | **POST** /media | Upload a file
*MediaApi* | [**mediaSharedUserId1UserId2Get**](docs/MediaApi.md#mediaSharedUserId1UserId2Get) | **GET** /media/shared/{userId1}/{userId2} | Get all media which two user&#39;s have shared between each other
*MessageApi* | [**messagesFilePost**](docs/MessageApi.md#messagesFilePost) | **POST** /messages/file | Send a message with a file or files
*MessageApi* | [**messagesMediaPost**](docs/MessageApi.md#messagesMediaPost) | **POST** /messages/media | Send a message with a file attatched
*MessageApi* | [**messagesMessageIdPut**](docs/MessageApi.md#messagesMessageIdPut) | **PUT** /messages/{messageId} | Edit (patch) a particular message
*MessageApi* | [**messagesMessageIdUserUserIdDelete**](docs/MessageApi.md#messagesMessageIdUserUserIdDelete) | **DELETE** /messages/{messageId}/user/{userId} | delete a message
*MessageApi* | [**messagesStringPost**](docs/MessageApi.md#messagesStringPost) | **POST** /messages/string | Create a message with no image attached to the message
*PrivatechatApi* | [**privateChatsChatIdDelete**](docs/PrivatechatApi.md#privateChatsChatIdDelete) | **DELETE** /privateChats/{chatId} | Delete a private chat
*PrivatechatApi* | [**privateChatsChatIdFavoritePut**](docs/PrivatechatApi.md#privateChatsChatIdFavoritePut) | **PUT** /privateChats/{chatId}/favorite | Favorite a specific private chat
*PrivatechatApi* | [**privateChatsChatIdUserUserIdMessagesGet**](docs/PrivatechatApi.md#privateChatsChatIdUserUserIdMessagesGet) | **GET** /privateChats/{chatId}/user/{userId}/messages | Get 40 messages belonging to a private chat.
*PrivatechatApi* | [**privateChatsPost**](docs/PrivatechatApi.md#privateChatsPost) | **POST** /privateChats | Create a private chat between two users
*RelationshipApi* | [**relationshipsPost**](docs/RelationshipApi.md#relationshipsPost) | **POST** /relationships | Create a relationship (blocked or friends) between two users. Even if a relationship is being updated, use this route
*RelationshipApi* | [**relationshipsUserIdPut**](docs/RelationshipApi.md#relationshipsUserIdPut) | **PUT** /relationships/{userId} | Change a relationship from friends to blocked or from blocked back to friends
*SocketApi* | [**socketUserEnteredWhatsAppPost**](docs/SocketApi.md#socketUserEnteredWhatsAppPost) | **POST** /socket/user-entered-WhatsApp | When a user enters WhatsApp, emit the socket function &#39;user-entered-WhatsApp&#39;. The server will then emit new-and-updated-data
*UserApi* | [**usersPost**](docs/UserApi.md#usersPost) | **POST** /users | Create a user object using a phone number.
*UserApi* | [**usersUserIdBlockedGet**](docs/UserApi.md#usersUserIdBlockedGet) | **GET** /users/{userId}/blocked | Get all the blocked users belonging to a specifc user.
*UserApi* | [**usersUserIdCallsAnsweredGet**](docs/UserApi.md#usersUserIdCallsAnsweredGet) | **GET** /users/{userId}/calls/answered | Get all answered calls.
*UserApi* | [**usersUserIdCallsGet**](docs/UserApi.md#usersUserIdCallsGet) | **GET** /users/{userId}/calls | Get all calls made by a specific user.
*UserApi* | [**usersUserIdCallsNonansweredGet**](docs/UserApi.md#usersUserIdCallsNonansweredGet) | **GET** /users/{userId}/calls/nonanswered | Get all non answered calls belonging to a user.
*UserApi* | [**usersUserIdCheckContactsUseWhatsAppPost**](docs/UserApi.md#usersUserIdCheckContactsUseWhatsAppPost) | **POST** /users/{userId}/check_contacts_use_whatsApp | Check if contacts are WhatApp&#39;s users
*UserApi* | [**usersUserIdDelete**](docs/UserApi.md#usersUserIdDelete) | **DELETE** /users/{userId} | Delete a user.
*UserApi* | [**usersUserIdFriendsGet**](docs/UserApi.md#usersUserIdFriendsGet) | **GET** /users/{userId}/friends | Get all the friend&#39;s belonging to this user.
*UserApi* | [**usersUserIdGet**](docs/UserApi.md#usersUserIdGet) | **GET** /users/{userId} | Get info on one specific user.
*UserApi* | [**usersUserIdInviteToWhatsAppPost**](docs/UserApi.md#usersUserIdInviteToWhatsAppPost) | **POST** /users/{userId}/invite_to_WhatsApp | Invite a contact to download WhatsApp via SMS
*UserApi* | [**usersUserIdLeaveChatIdPut**](docs/UserApi.md#usersUserIdLeaveChatIdPut) | **PUT** /users/{userId}/leave/{chatId} | This route is envoked when a user leaves a chat chat
*UserApi* | [**usersUserIdMessagesDeliveredGet**](docs/UserApi.md#usersUserIdMessagesDeliveredGet) | **GET** /users/{userId}/messages/delivered | Get all delivered messages.
*UserApi* | [**usersUserIdMessagesFavoriteGet**](docs/UserApi.md#usersUserIdMessagesFavoriteGet) | **GET** /users/{userId}/messages/favorite | Get all favorite messages belonging to a user.
*UserApi* | [**usersUserIdMessagesGet**](docs/UserApi.md#usersUserIdMessagesGet) | **GET** /users/{userId}/messages | Get all messages belonging to a specific user.
*UserApi* | [**usersUserIdMessagesSeenGet**](docs/UserApi.md#usersUserIdMessagesSeenGet) | **GET** /users/{userId}/messages/seen | Get all messages belonging to a user that have been seen by another user/ other users.
*UserApi* | [**usersUserIdMessagesUnreadGet**](docs/UserApi.md#usersUserIdMessagesUnreadGet) | **GET** /users/{userId}/messages/unread | Get all unread messages belonging to a user.
*UserApi* | [**usersUserIdNotificationsGlobalPatch**](docs/UserApi.md#usersUserIdNotificationsGlobalPatch) | **PATCH** /users/{userId}/notifications/global | Edit the global settings for notifications
*UserApi* | [**usersUserIdPrivategroupChatsGet**](docs/UserApi.md#usersUserIdPrivategroupChatsGet) | **GET** /users/{userId}/private&amp;group_chats | Get both private and group chats and calls the user is a participant of
*UserApi* | [**usersUserIdPut**](docs/UserApi.md#usersUserIdPut) | **PUT** /users/{userId} | Update a user


## Documentation for Models

 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body12](docs/Body12.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [Chat](docs/Chat.md)
 - [GroupChat](docs/GroupChat.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20012MediaArray](docs/InlineResponse20012MediaArray.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20013SharedMedia](docs/InlineResponse20013SharedMedia.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20014Messages](docs/InlineResponse20014Messages.md)
 - [InlineResponse20014MessagesFiles](docs/InlineResponse20014MessagesFiles.md)
 - [InlineResponse20014MessagesRead](docs/InlineResponse20014MessagesRead.md)
 - [InlineResponse20014MessagesUnread](docs/InlineResponse20014MessagesUnread.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20015Chat](docs/InlineResponse20015Chat.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20017Messages](docs/InlineResponse20017Messages.md)
 - [InlineResponse20017MessagesFiles](docs/InlineResponse20017MessagesFiles.md)
 - [InlineResponse20017MessagesUnread](docs/InlineResponse20017MessagesUnread.md)
 - [InlineResponse20018](docs/InlineResponse20018.md)
 - [InlineResponse20019](docs/InlineResponse20019.md)
 - [InlineResponse2001UnreadMessages](docs/InlineResponse2001UnreadMessages.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse20020](docs/InlineResponse20020.md)
 - [InlineResponse20020MediaArray](docs/InlineResponse20020MediaArray.md)
 - [InlineResponse20021](docs/InlineResponse20021.md)
 - [InlineResponse20022](docs/InlineResponse20022.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005NonAnsweredCalls](docs/InlineResponse2005NonAnsweredCalls.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2007Chats](docs/InlineResponse2007Chats.md)
 - [InlineResponse2007GroupChatInfo](docs/InlineResponse2007GroupChatInfo.md)
 - [InlineResponse2007Message](docs/InlineResponse2007Message.md)
 - [InlineResponse2007MessageFiles](docs/InlineResponse2007MessageFiles.md)
 - [InlineResponse2007MessageMediaArray](docs/InlineResponse2007MessageMediaArray.md)
 - [InlineResponse2007MessageUser](docs/InlineResponse2007MessageUser.md)
 - [InlineResponse2007User](docs/InlineResponse2007User.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse200User](docs/InlineResponse200User.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [InlineResponse500Messages](docs/InlineResponse500Messages.md)
 - [Media](docs/Media.md)
 - [Message](docs/Message.md)
 - [MessageFiles](docs/MessageFiles.md)
 - [MessageGroupChat](docs/MessageGroupChat.md)
 - [Relationship](docs/Relationship.md)
 - [User](docs/User.md)
 - [UserChats](docs/UserChats.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### Socket

- **Type**: API key
- **API key parameter name**: socket
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

irma.tabakis@gmail.com

