'use strict';


/**
 * Create a relationship (blocked or friends) between two users. Even if a relationship is being updated, use this route
 *
 * body Body_10  (optional)
 * returns Relationship
 **/
exports.relationshipsPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "request_sender" : "request_sender",
  "request_receiver" : "request_receiver",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Change a relationship from friends to blocked or from blocked back to friends
 *
 * userId String The id of the other user
 * body Relationship Send over the userId's (user_id_1 & user_id_2) and the status (optional)
 * returns Relationship
 **/
exports.relationshipsUserIdPUT = function(userId,body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "request_sender" : "request_sender",
  "request_receiver" : "request_receiver",
  "status" : "status"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

