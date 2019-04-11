'use strict';


/**
 * Resend another verifcation code to the user
 *
 * body Body_4 Send another verication code (optional)
 * returns inline_response_200_11
 **/
exports.authResendPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "passcode_expiration" : "passcode_expiration",
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
 * The user will input verifaction code and if it is the correct code, a JSON web token will be returned
 *
 * body Body_3 Verify the passcode the user was sent. (optional)
 * returns inline_response_200_10
 **/
exports.authVerifyPOST = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "token" : "token"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

