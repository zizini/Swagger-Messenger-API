'use strict';


/**
 * Delete a media object.
 *
 * mediaId String The ID of the specific media object the developer wishes to delete
 * returns Media
 **/
exports.mediaMediaIdDELETE = function(mediaId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "media_file_string" : "media_file_string",
  "groupChatId" : 1.46581298050294517310021547018550336360931396484375,
  "user_id" : 6.02745618307040320615897144307382404804229736328125,
  "id" : 0.80082819046101150206595775671303272247314453125,
  "media_file" : "media_file"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Upload a file
 *
 * file String The file which is being uploaded
 * returns inline_response_200_12
 **/
exports.mediaPOST = function(file) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "mediaArray" : [ {
    "media_file_string" : "media_file_string",
    "groupChatId" : 1.46581298050294517310021547018550336360931396484375,
    "user_id" : 6.02745618307040320615897144307382404804229736328125,
    "id" : 0.80082819046101150206595775671303272247314453125,
    "media_file" : "media_file"
  }, {
    "media_file_string" : "media_file_string",
    "groupChatId" : 1.46581298050294517310021547018550336360931396484375,
    "user_id" : 6.02745618307040320615897144307382404804229736328125,
    "id" : 0.80082819046101150206595775671303272247314453125,
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
 * Get all media which two user's have shared between each other
 *
 * userId1 String 
 * userId2 String 
 * returns inline_response_200_13
 **/
exports.mediaSharedUserId1UserId2GET = function(userId1,userId2) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "sharedMedia" : [ {
    "media_file_string" : "media_file_string",
    "groupChatId" : 1.46581298050294517310021547018550336360931396484375,
    "user_id" : 6.02745618307040320615897144307382404804229736328125,
    "id" : 0.80082819046101150206595775671303272247314453125,
    "media_file" : "media_file"
  }, {
    "media_file_string" : "media_file_string",
    "groupChatId" : 1.46581298050294517310021547018550336360931396484375,
    "user_id" : 6.02745618307040320615897144307382404804229736328125,
    "id" : 0.80082819046101150206595775671303272247314453125,
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

