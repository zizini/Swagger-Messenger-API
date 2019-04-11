'use strict';


/**
 * Delete a private chat
 *
 * chatId String The ID of a specific chat
 * returns Chat
 **/
exports.privateChatsChatIdDELETE = function(chatId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "last_activity" : "last_activity",
  "groupChat" : true,
  "privateChat" : true,
  "id" : 0.80082819046101150206595775671303272247314453125,
  "participantsId" : [ "22", "33" ],
  "last_activity_in_associated_channel_event_or_groupChat" : "last_activity_in_associated_channel_event_or_groupChat"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Favorite a specific private chat
 *
 * chatId String 
 * body Body_5 
 * returns Chat
 **/
exports.privateChatsChatIdFavoritePUT = function(chatId,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "last_activity" : "last_activity",
  "groupChat" : true,
  "privateChat" : true,
  "id" : 0.80082819046101150206595775671303272247314453125,
  "participantsId" : [ "22", "33" ],
  "last_activity_in_associated_channel_event_or_groupChat" : "last_activity_in_associated_channel_event_or_groupChat"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get 40 messages belonging to a private chat.
 *
 * userId String 
 * chatId String 
 * messageId String Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order (optional)
 * returns inline_response_200_14
 **/
exports.privateChatsChatIdUserUserIdMessagesGET = function(userId,chatId,messageId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "messages" : {
    "read" : [ {
      "createdAt" : "createdAt",
      "chatId" : 2.3021358869347654518833223846741020679473876953125,
      "id" : 5.962133916683182377482808078639209270477294921875,
      "message" : "message",
      "type" : "type",
      "userId" : 5.63737665663332876420099637471139430999755859375,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    }, {
      "createdAt" : "createdAt",
      "chatId" : 2.3021358869347654518833223846741020679473876953125,
      "id" : 5.962133916683182377482808078639209270477294921875,
      "message" : "message",
      "type" : "type",
      "userId" : 5.63737665663332876420099637471139430999755859375,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    } ],
    "last_time_user_entered" : "last_time_user_entered",
    "unread" : [ {
      "createdAt" : "createdAt",
      "chatId" : 1.46581298050294517310021547018550336360931396484375,
      "files" : [ {
        "s3_url" : "s3_url",
        "file_string" : "file_string"
      }, {
        "s3_url" : "s3_url",
        "file_string" : "file_string"
      } ],
      "id" : 0.80082819046101150206595775671303272247314453125,
      "message" : "message",
      "type" : "type",
      "userId" : 6.02745618307040320615897144307382404804229736328125,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    }, {
      "createdAt" : "createdAt",
      "chatId" : 1.46581298050294517310021547018550336360931396484375,
      "files" : [ {
        "s3_url" : "s3_url",
        "file_string" : "file_string"
      }, {
        "s3_url" : "s3_url",
        "file_string" : "file_string"
      } ],
      "id" : 0.80082819046101150206595775671303272247314453125,
      "message" : "message",
      "type" : "type",
      "userId" : 6.02745618307040320615897144307382404804229736328125,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    } ],
    "allMessages" : [ {
      "createdAt" : "createdAt",
      "chatId" : 2.3021358869347654518833223846741020679473876953125,
      "id" : 5.962133916683182377482808078639209270477294921875,
      "message" : "message",
      "type" : "type",
      "userId" : 5.63737665663332876420099637471139430999755859375,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    }, {
      "createdAt" : "createdAt",
      "chatId" : 2.3021358869347654518833223846741020679473876953125,
      "id" : 5.962133916683182377482808078639209270477294921875,
      "message" : "message",
      "type" : "type",
      "userId" : 5.63737665663332876420099637471139430999755859375,
      "mediaArray" : [ "mediaArray", "mediaArray" ],
      "user" : {
        "avatar" : "avatar",
        "profile_picture_string" : "profile_picture_string"
      }
    } ]
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create a private chat between two users
 *
 * userIds List Only two userIds can be sent for this endpoint due to the fact that you are creating a private chat (optional)
 * returns Chat
 **/
exports.privateChatsPOST = function(userIds) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "last_activity" : "last_activity",
  "groupChat" : true,
  "privateChat" : true,
  "id" : 0.80082819046101150206595775671303272247314453125,
  "participantsId" : [ "22", "33" ],
  "last_activity_in_associated_channel_event_or_groupChat" : "last_activity_in_associated_channel_event_or_groupChat"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

