'use strict';


/**
 * When a user enters WhatsApp, emit the socket function 'user-entered-WhatsApp'. The server will then emit new-and-updated-data
 *
 * returns inline_response_200_22
 **/
exports.socketUser_entered_WhatsAppPOST = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "calls" : [ {
    "country_code" : "country_code",
    "socket_id" : "socket_id",
    "passcode_expiration" : "passcode_expiration",
    "phone" : "phone",
    "verified" : true,
    "last_name" : "last_name",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "avatar" : "avatar",
    "first_name" : "first_name",
    "email" : "email",
    "profile_picture_string" : "profile_picture_string",
    "passcode" : "passcode"
  }, {
    "country_code" : "country_code",
    "socket_id" : "socket_id",
    "passcode_expiration" : "passcode_expiration",
    "phone" : "phone",
    "verified" : true,
    "last_name" : "last_name",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "avatar" : "avatar",
    "first_name" : "first_name",
    "email" : "email",
    "profile_picture_string" : "profile_picture_string",
    "passcode" : "passcode"
  } ],
  "chat" : [ {
    "last_activity" : "last_activity",
    "groupChat" : true,
    "privateChat" : true,
    "id" : 0.80082819046101150206595775671303272247314453125,
    "participantsId" : [ "22", "33" ],
    "last_activity_in_associated_channel_event_or_groupChat" : "last_activity_in_associated_channel_event_or_groupChat"
  }, {
    "last_activity" : "last_activity",
    "groupChat" : true,
    "privateChat" : true,
    "id" : 0.80082819046101150206595775671303272247314453125,
    "participantsId" : [ "22", "33" ],
    "last_activity_in_associated_channel_event_or_groupChat" : "last_activity_in_associated_channel_event_or_groupChat"
  } ],
  "messages" : [ {
    "createdAt" : "createdAt",
    "GroupChat" : {
      "socket_id" : "socket_id",
      "verified" : true,
      "last_name" : "last_name",
      "avatar" : "avatar",
      "profile_picture_string" : "profile_picture_string",
      "country_code" : "country_code",
      "passcode_expiration" : "passcode_expiration",
      "phone" : "phone",
      "id" : 6.02745618307040320615897144307382404804229736328125,
      "position" : "{}",
      "first_name" : "first_name",
      "email" : "email",
      "passcode" : "passcode"
    },
    "chatId" : "chatId",
    "post" : true,
    "name" : "name",
    "files" : [ {
      "s3_url" : "s3_url",
      "file_string" : "file_string"
    }, {
      "s3_url" : "s3_url",
      "file_string" : "file_string"
    } ],
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "media, string",
    "userId" : "userId",
    "user" : {
      "avatar" : "avatar",
      "profile_picture_string" : "profile_picture_string"
    },
    "mediaArray" : [ {
      "media_file_string" : "media_file_string",
      "media_file" : "media_file"
    }, {
      "media_file_string" : "media_file_string",
      "media_file" : "media_file"
    } ]
  }, {
    "createdAt" : "createdAt",
    "GroupChat" : {
      "socket_id" : "socket_id",
      "verified" : true,
      "last_name" : "last_name",
      "avatar" : "avatar",
      "profile_picture_string" : "profile_picture_string",
      "country_code" : "country_code",
      "passcode_expiration" : "passcode_expiration",
      "phone" : "phone",
      "id" : 6.02745618307040320615897144307382404804229736328125,
      "position" : "{}",
      "first_name" : "first_name",
      "email" : "email",
      "passcode" : "passcode"
    },
    "chatId" : "chatId",
    "post" : true,
    "name" : "name",
    "files" : [ {
      "s3_url" : "s3_url",
      "file_string" : "file_string"
    }, {
      "s3_url" : "s3_url",
      "file_string" : "file_string"
    } ],
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "media, string",
    "userId" : "userId",
    "user" : {
      "avatar" : "avatar",
      "profile_picture_string" : "profile_picture_string"
    },
    "mediaArray" : [ {
      "media_file_string" : "media_file_string",
      "media_file" : "media_file"
    }, {
      "media_file_string" : "media_file_string",
      "media_file" : "media_file"
    } ]
  } ],
  "groupChats" : [ {
    "createdAt" : "createdAt",
    "chatId" : 6,
    "name" : "name",
    "adminId" : "adminId",
    "id" : 0,
    "avatar" : "avatar",
    "profile_picture_string" : "profile_picture_string"
  }, {
    "createdAt" : "createdAt",
    "chatId" : 6,
    "name" : "name",
    "adminId" : "adminId",
    "id" : 0,
    "avatar" : "avatar",
    "profile_picture_string" : "profile_picture_string"
  } ],
  "users" : [ {
    "country_code" : "country_code",
    "socket_id" : "socket_id",
    "passcode_expiration" : "passcode_expiration",
    "phone" : "phone",
    "verified" : true,
    "last_name" : "last_name",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "avatar" : "avatar",
    "first_name" : "first_name",
    "email" : "email",
    "profile_picture_string" : "profile_picture_string",
    "passcode" : "passcode"
  }, {
    "country_code" : "country_code",
    "socket_id" : "socket_id",
    "passcode_expiration" : "passcode_expiration",
    "phone" : "phone",
    "verified" : true,
    "last_name" : "last_name",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "avatar" : "avatar",
    "first_name" : "first_name",
    "email" : "email",
    "profile_picture_string" : "profile_picture_string",
    "passcode" : "passcode"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

