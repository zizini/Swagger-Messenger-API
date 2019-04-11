'use strict';


/**
 * Create a user object using a phone number.
 *  
 *
 * body User Create a user object. Must have the parameter of phone umber in order to send the verifcation code. (optional)
 * returns User
 **/
exports.usersPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all the blocked users belonging to a specifc user.
 *
 * userId String The id of the user is needed to query the blocked user's of this specifc individual.
 * returns User
 **/
exports.usersUserIdBlockedGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all answered calls.
 *
 * userId String 
 * returns inline_response_200_6
 **/
exports.usersUserIdCallsAnsweredGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "answeredCalls" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "userId" : 6.02745618307040320615897144307382404804229736328125
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "userId" : 6.02745618307040320615897144307382404804229736328125
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
 * Get all calls made by a specific user.
 *
 * userId String 
 * no response value expected for this operation
 **/
exports.usersUserIdCallsGET = function(userId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Get all non answered calls belonging to a user.
 *
 * userId String 
 * returns inline_response_200_5
 **/
exports.usersUserIdCallsNonansweredGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "nonAnsweredCalls" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "userId" : 6.02745618307040320615897144307382404804229736328125
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "userId" : 6.02745618307040320615897144307382404804229736328125
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
 * Check if contacts are WhatApp's users
 *
 * userId String 
 * returnUserInfo String if returnUserInfo is set to true, all the info about the user will be sent back. (optional)
 * body List  (optional)
 * returns inline_response_200_8
 **/
exports.usersUserIdCheck_contacts_use_whatsAppPOST = function(userId,returnUserInfo,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "undeterminedPhoneNumbers" : [ "3024270222", "3024270222" ],
  "userContactsWithWhatApp" : [ "306979660998", "306979660998" ],
  "eightUsers" : [ {
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


/**
 * Delete a user.
 *
 * userId String Delete a user. Place the ID of the user you wish to delete in the path.
 * returns String
 **/
exports.usersUserIdDELETE = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "User 'ID number' was deleted";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all the friend's belonging to this user.
 *
 * userId String Get all the friend's belonging to this user.
 * returns User
 **/
exports.usersUserIdFriendsGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get info on one specific user.
 *
 * userId String The userId of a specific user.
 * currentUserId String When querying for a specific user to display user info. (optional)
 * returns inline_response_200
 **/
exports.usersUserIdGET = function(userId,currentUserId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "number_of_favorited_messages" : 0.80082819046101150206595775671303272247314453125,
  "user" : {
    "socket_id" : "socket_id",
    "verified" : true,
    "last_name" : "last_name",
    "avatar" : "avatar",
    "profile_picture_string" : "profile_picture_string",
    "country_code" : "country_code",
    "passcode_expiration" : "passcode_expiration",
    "relationship_status" : "no_relationship, blocked, friends",
    "phone" : "phone",
    "id" : 6.02745618307040320615897144307382404804229736328125,
    "first_name" : "first_name",
    "email" : "email",
    "passcode" : "passcode"
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
 * Invite a contact to download WhatsApp via SMS
 *
 * userId String 
 * body List  (optional)
 * returns inline_response_200_9
 **/
exports.usersUserIdInvite_to_WhatsAppPOST = function(userId,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "unsuccessfullySentSMS" : [ "3104445566", "3104445566" ],
  "successfullySentSMS" : [ "306979660998", "306979660998" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * This route is envoked when a user leaves a chat chat
 *
 * userId String 
 * chatId String 
 * returns UserChats
 **/
exports.usersUserIdLeaveChatIdPUT = function(userId,chatId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get all delivered messages.
 *
 * userId String 
 * returns inline_response_200_2
 **/
exports.usersUserIdMessagesDeliveredGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "deliveredMessages" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
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
 * Get all favorite messages belonging to a user.
 *
 * userId String 
 * returns inline_response_200_4
 **/
exports.usersUserIdMessagesFavoriteGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "favoriteMessages" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
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
 * Get all messages belonging to a specific user.
 *
 * userId String 
 * returns Message
 **/
exports.usersUserIdMessagesGET = function(userId) {
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
 * Get all messages belonging to a user that have been seen by another user/ other users.
 *
 * userId String 
 * returns inline_response_200_3
 **/
exports.usersUserIdMessagesSeenGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "seenMessages" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
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
 * Get all unread messages belonging to a user.
 *
 * userId String 
 * returns inline_response_200_1
 **/
exports.usersUserIdMessagesUnreadGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "unreadMessages" : [ {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
  }, {
    "createdAt" : "createdAt",
    "chatId" : 1.46581298050294517310021547018550336360931396484375,
    "userAvatar" : "userAvatar",
    "id" : 0.80082819046101150206595775671303272247314453125,
    "message" : "message",
    "type" : "type",
    "userId" : 6.02745618307040320615897144307382404804229736328125,
    "mediaArray" : [ "mediaArray", "mediaArray" ]
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
 * Edit the global settings for notifications
 *
 * userId String 
 * unread String This query parameter can either be set to true or false (optional)
 * delivered String This query parameter can either be set to true or false (optional)
 * seen String This query parameter can either be set to true or false (optional)
 * nonanswered String This query parameter can either be set to true or false (optional)
 * returns User
 **/
exports.usersUserIdNotificationsGlobalPATCH = function(userId,unread,delivered,seen,nonanswered) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Update a user
 * Add the mediaId in the body for the user's avatar to be updated
 *
 * userId String The id of the user is used to target the specific user the developer wishes to edit. The variable name of the response is users.
 * body Body Edit the user with values found in the request body. (optional)
 * returns User
 **/
exports.usersUserIdPUT = function(userId,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
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
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Get both private and group chats and calls the user is a participant of
 *
 * userId String 
 * returns inline_response_200_7
 **/
exports.usersUserIdPrivategroup_chatsGET = function(userId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "success" : true,
  "chats" : [ {
    "createdAt" : "createdAt",
    "last_activity" : "last_activity",
    "groupChatInfo" : {
      "chatId" : 5.962133916683182377482808078639209270477294921875,
      "name" : "name",
      "adminId" : 1.46581298050294517310021547018550336360931396484375,
      "avatar" : "avatar",
      "id" : 6.02745618307040320615897144307382404804229736328125,
      "profile_picture_string" : "profile_picture_string"
    },
    "participantIds" : [ 0.80082819046101150206595775671303272247314453125, 0.80082819046101150206595775671303272247314453125 ],
    "type" : "unreadAndFavorite, unread, favorite, readandNonfavorite, delivered,          deliveredAndseen, answered, nonanswered",
    "message" : {
      "call" : "call",
      "createdAt" : "createdAt",
      "chatId" : "chatId",
      "name" : "name",
      "files" : [ {
        "file_string" : "file_string",
        "url" : "url"
      }, {
        "file_string" : "file_string",
        "url" : "url"
      } ],
      "id" : 5.63737665663332876420099637471139430999755859375,
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
    "user" : {
      "last_name" : "last_name",
      "avatar" : "avatar",
      "first_name" : "first_name",
      "profile_picture_string" : "profile_picture_string"
    },
    "chatType" : "group or private"
  }, {
    "createdAt" : "createdAt",
    "last_activity" : "last_activity",
    "groupChatInfo" : {
      "chatId" : 5.962133916683182377482808078639209270477294921875,
      "name" : "name",
      "adminId" : 1.46581298050294517310021547018550336360931396484375,
      "avatar" : "avatar",
      "id" : 6.02745618307040320615897144307382404804229736328125,
      "profile_picture_string" : "profile_picture_string"
    },
    "participantIds" : [ 0.80082819046101150206595775671303272247314453125, 0.80082819046101150206595775671303272247314453125 ],
    "type" : "unreadAndFavorite, unread, favorite, readandNonfavorite, delivered,          deliveredAndseen, answered, nonanswered",
    "message" : {
      "call" : "call",
      "createdAt" : "createdAt",
      "chatId" : "chatId",
      "name" : "name",
      "files" : [ {
        "file_string" : "file_string",
        "url" : "url"
      }, {
        "file_string" : "file_string",
        "url" : "url"
      } ],
      "id" : 5.63737665663332876420099637471139430999755859375,
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
    "user" : {
      "last_name" : "last_name",
      "avatar" : "avatar",
      "first_name" : "first_name",
      "profile_picture_string" : "profile_picture_string"
    },
    "chatType" : "group or private"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

