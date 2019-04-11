'use strict';


/**
 * New call starts.
 *
 * post Boolean If post is set to true, a call starts that needs to be added to the DB.
 * body Body_12  (optional)
 * returns Message
 **/
exports.callEndsPOST = function(post,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * New call starts.
 *
 * post Boolean If post is set to true, a call starts that needs to be added to the DB.
 * body Body_11  (optional)
 * returns Message
 **/
exports.callStartsPOST = function(post,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

