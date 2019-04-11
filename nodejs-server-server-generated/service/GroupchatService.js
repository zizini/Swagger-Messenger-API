'use strict';


/**
 * Favorite a specific group chat
 *
 * chatId String 
 * body Body_7 
 * returns Chat
 **/
exports.groupChatsChatIdFavoritePUT = function(chatId,body) {
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
 * Add user(s) to a groupChat
 *
 * userIds List An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
 * chatId String 
 * returns Chat
 **/
exports.groupChatsChatIdJoinPUT = function(userIds,chatId) {
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
 * Get 40 messages belonging to a group chat
 *
 * chatId String 
 * userId String 
 * messageId String Include this query parameter when you would like to get the next 40 messages following a specific message. If this query parameter is not included, you will get the 40 newest messages in order (optional)
 * returns inline_response_200_17
 **/
exports.groupChatsChatIdUserUserIdMessagesGET = function(chatId,userId,messageId) {
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
        "file_string" : "file_string",
        "url" : "url"
      }, {
        "file_string" : "file_string",
        "url" : "url"
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
        "file_string" : "file_string",
        "url" : "url"
      }, {
        "file_string" : "file_string",
        "url" : "url"
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
 * Edit the details of a groupChat
 *
 * groupChatId String 
 * body Body_6  (optional)
 * returns inline_response_200_16
 **/
exports.groupChatsGroupChatIdPUT = function(groupChatId,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "groupChat" : {
    "createdAt" : "createdAt",
    "chatId" : 6,
    "name" : "name",
    "adminId" : "adminId",
    "id" : 0,
    "avatar" : "avatar",
    "profile_picture_string" : "profile_picture_string"
  },
  "success" : true
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create a groupChat
 *
 * userIds List An array of userIds. Can also be just one userId (in an array with the name userIds) if only the admin (creator) is the only user in the group when it is created
 * adminId String The ID of the user who is creating the group chat
 * name String The name of the group chat (optional)
 * mediaId String If the groupChat has an image assoicated with it, the media Id can be used to create that image (optional)
 * returns inline_response_200_15
 **/
exports.groupChatsPOST = function(userIds,adminId,name,mediaId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "chat" : {
    "groupChat" : true,
    "privateChat" : true,
    "id" : 0.80082819046101150206595775671303272247314453125,
    "participantsId" : [ "22", "33" ]
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

