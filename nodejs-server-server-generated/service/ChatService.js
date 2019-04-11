'use strict';


/**
 * Get all files belonging to a specific chat
 *
 * chatId String 
 * returns inline_response_200_19
 **/
exports.chatChatIdFileGET = function(chatId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "files" : [ {
    "file_string" : "file_string",
    "url" : "url"
  }, {
    "file_string" : "file_string",
    "url" : "url"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get a chat by ID
 *
 * chatId String 
 * returns Chat
 **/
exports.chatChatIdGET = function(chatId) {
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
 * Returns all the media files shared in a chat
 *
 * chatId String 
 * returns inline_response_200_20
 **/
exports.chatChatIdMediaGET = function(chatId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "mediaArray" : [ {
    "media_file_string" : "media_file_string",
    "media_file" : "media_file"
  }, {
    "media_file_string" : "media_file_string",
    "media_file" : "media_file"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Edit the notifications a user can receive from a chat
 *
 * chatId String 
 * userId String 
 * user_added_notifications Boolean  (optional)
 * message_notifications Boolean  (optional)
 * returns inline_response_200_21
 **/
exports.chatChatIdUserUserIdNotificationsPUT = function(chatId,userId,user_added_notifications,message_notifications) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "userChat" : {
    "last_time_in_chat" : "last_time_in_chat",
    "chatId" : "chatId",
    "entered_chat_quantity" : 0.80082819046101150206595775671303272247314453125,
    "current_chat" : true,
    "messages_not_to_display" : [ 50, 100, 150 ],
    "unread_messages" : true,
    "user_added_notifications" : true,
    "userId" : "userId",
    "favorite" : true,
    "message_notifications" : true
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

