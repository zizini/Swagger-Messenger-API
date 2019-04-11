'use strict';


/**
 * Send a message with a file or files
 *
 * file List Even if only one file is being, must be sent in an array. This format allows the server to easily handle when multiple files are being sent
 * userId String 
 * chatId String 
 * message String  (optional)
 * returns Message
 **/
exports.messagesFilePOST = function(file,userId,chatId,message) {
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
 * Send a message with a file attatched
 *
 * file List  
 * userId String 
 * chatId String 
 * message String  (optional)
 * returns Message
 **/
exports.messagesMediaPOST = function(file,userId,chatId,message) {
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
 * Edit (patch) a particular message
 *
 * messageId String The ID of the message one wishes to edit (patch)
 * body Body_9  (optional)
 * returns Message
 **/
exports.messagesMessageIdPUT = function(messageId,body) {
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
 * delete a message
 *
 * messageId String The ID of the message one wishes to edit (patch)
 * userId String 
 * returns inline_response_200_18
 **/
exports.messagesMessageIdUserUserIdDELETE = function(messageId,userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "message" : {
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
  },
  "responseMsg" : "responseMsg"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Create a message with no image attached to the message
 *
 * post Boolean   (optional)
 * body Body_8  (optional)
 * returns Message
 **/
exports.messagesStringPOST = function(post,body) {
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

